package com.dowell.ERPSystem.AuthoritySystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dowell.ERPSystem.AuthoritySystem.Object.Staff;
import com.dowell.ERPSystem.AuthoritySystem.UserImplement.StaffRepository;
import com.dowell.ERPSystem.AuthoritySystem.UserImplement.MyUserDetails;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@RestController
public class AuthorityController {
	@Autowired
    private StaffRepository memberRepository;

    //用來加密密碼    
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    //用來看現在的session(有權限的人都可查看)
    @GetMapping("/current")
    public String getCurrentSession(HttpServletRequest request) {
        HttpSession session = request.getSession(false); // 不創建新 Session
        if (session != null) {
            return "Session ID: " + session.getId();
        } else {
            return "No active session";
        }
    }
    
    
    //註冊Staff(所有人皆可註冊)    
    @PostMapping("/staff")
    public Staff createStaff(@RequestBody Staff staff) {
    	// 加密密碼
        var encodedPwd = passwordEncoder.encode(staff.getPassword());
        staff.setPassword(encodedPwd);
    	staff.setAuthorities("USER");
        staff.setStaff_id(null);
        memberRepository.save(staff);
        return staff;
    }

    
    //看現在所有的staff(只允許ADMIN查看)   
    @GetMapping("/members")
    public List<Staff> getMembers() {
        return memberRepository.findAll();
    }
    
    //測試用(所有人都可查看)
    @RequestMapping("/guest")
    public String guest() {
        return "所有人都可進";
    }

    //看現在是誰在用(有權限的人皆可查看)
    @RequestMapping("/getUsername")
    public String getUsername() {
    	Authentication authentication = 
                SecurityContextHolder.getContext().getAuthentication();
    	MyUserDetails myUser = (MyUserDetails) authentication.getPrincipal();
        return myUser.getUsername();
    }

    @RequestMapping("/user")
    public String user() {
        return "只有USER可進";
    }
    @RequestMapping("/admin")
    public String admin() {
        return "只有Admin可進";
    }
    
}
