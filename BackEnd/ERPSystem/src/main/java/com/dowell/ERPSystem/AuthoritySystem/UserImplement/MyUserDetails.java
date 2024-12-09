package com.dowell.ERPSystem.AuthoritySystem.UserImplement;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.dowell.ERPSystem.AuthoritySystem.Object.Staff;

//實作UserDetails
public class MyUserDetails implements UserDetails {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Staff staff;
	
	public MyUserDetails(Staff staff) {
		this.staff = staff;
	}
	
	@Override
	public List<SimpleGrantedAuthority> getAuthorities(){
		List<SimpleGrantedAuthority> authorities = 
				Arrays.stream(staff.getAuthorities().split(",")).map(SimpleGrantedAuthority::new).collect(Collectors.toList());
		System.out.println(authorities);
		return authorities;
	}
	
	@Override
	public String getPassword() {
		return staff.getPassword();
	}
	
	@Override
	public String getUsername() {
		return staff.getUsername();
	}
	
	public Integer getStaff_id() {
		return staff.getStaff_id();
	}
	
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	
	@Override
	public boolean isEnabled() {
		return true;
	}
	
}