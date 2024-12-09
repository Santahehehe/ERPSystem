package com.dowell.ERPSystem.AuthoritySystem.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.dowell.ERPSystem.AuthoritySystem.UserImplement.StaffRepository;
import com.dowell.ERPSystem.AuthoritySystem.Object.Staff;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private StaffRepository staffRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        // 檢查是否已經有該帳號，避免重複插入
        if (staffRepository.findByUsername("admin") == null) {
            Staff admin = new Staff();
            admin.setUsername("admin");
            admin.setPassword(passwordEncoder.encode("password")); // 加密密碼
            admin.setAuthorities("ADMIN,USER");   // 設定角色
            staffRepository.save(admin);
            System.out.println("Admin account created: username=admin, password=password");
        }
    }
}