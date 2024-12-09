package com.dowell.ERPSystem.AuthoritySystem.Object;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "staff")
public class Staff {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer staff_id;

    @Column(name = "staff_name",nullable = false)
    private String username;
    @Column(name = "hash_pwd",nullable = false)
    private String password;
    @Column(name = "authorities")
    private String authorities;

    // Getter 和 Setter 方法
}
