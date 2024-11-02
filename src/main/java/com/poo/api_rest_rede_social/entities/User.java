package com.poo.api_rest_rede_social.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Entity
@Table(name = "users", schema = "POO")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_sq")
    @SequenceGenerator(schema = "POO", name = "users_sq", sequenceName = "users_sq", initialValue = 1, allocationSize = 1)
    private Long id;
    private String name;
    private String email;
    @Column(unique = true)
    private String username;
    private String bio;
    private String password;
    private Boolean active;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;


}
