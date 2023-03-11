package com.example.shoppingcartv2.model;

import com.example.shoppingcartv2.constants.UserGender;
import lombok.*;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.math.BigInteger;
import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "userv2")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "UserName")
    private String name;
@Column(unique = true)
    private String email;
    private String password;
    private String address;
    @Column(unique = true)

    private BigInteger phoneNumber;

    private Date dob;
@Size(min = 18,message = "User 18+ only Allowed")
    private Integer age;
@Enumerated(EnumType.STRING)
    private UserGender userGender;
    private  String accountStatus;
    @Temporal(TemporalType.TIMESTAMP)
    private Date accountCreationDetails;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLoginDate;
    private String role;


}
