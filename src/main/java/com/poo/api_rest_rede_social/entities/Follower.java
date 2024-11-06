package com.poo.api_rest_rede_social.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "followers", schema = "apiredesocial")
public class Follower {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "followers_id")
    private User follower;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private User user;
}
