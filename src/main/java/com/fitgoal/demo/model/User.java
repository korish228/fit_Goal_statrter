package com.fitgoal.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Getter
@Setter
public class User extends BaseEntity{

    @NotNull
    @Column(name = "user_name")
    private String name;
    @NotNull
    @Email
    @Column(unique = true)
    private String email;
    private String password;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

    @Column(columnDefinition = "TEXT")
    private String linkToPhoto;

    @NotNull
    @Column(unique = true)
    private String verificationLink;

    @NotNull
    private LocalDate createdOn;

    @NotNull
    private LocalDate lastLoggedIn;


}
