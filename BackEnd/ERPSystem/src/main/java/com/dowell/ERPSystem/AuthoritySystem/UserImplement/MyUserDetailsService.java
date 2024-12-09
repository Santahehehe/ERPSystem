package com.dowell.ERPSystem.AuthoritySystem.UserImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dowell.ERPSystem.AuthoritySystem.Object.Staff;


@Service
//實作UserDetailsService
public class MyUserDetailsService implements UserDetailsService{
	@Autowired
	private StaffRepository staffRepo;
	
	@Override
	public MyUserDetails loadUserByUsername(String username)
								throws UsernameNotFoundException {
		Staff staff = staffRepo.findByUsername(username);
		return new MyUserDetails(staff);
	}
}
