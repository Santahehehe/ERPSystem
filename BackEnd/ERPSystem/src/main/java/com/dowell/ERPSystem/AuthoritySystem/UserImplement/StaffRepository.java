package com.dowell.ERPSystem.AuthoritySystem.UserImplement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dowell.ERPSystem.AuthoritySystem.Object.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, String> {
	Staff findByUsername(String username);
}
