package com.store.app.model;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@Table(name = "OneUser")
@Data
@NoArgsConstructor
public class User {

    @Id
    private Long id;
    private String username;
    private String password;
    private String first_name;
    private String last_name;
    private String telephone;
    @OneToOne(mappedBy = "user")
    private CartItems cartitems;
    @Basic
    private LocalDateTime create_at;
    @Basic
    private LocalDateTime modified_at;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserAddress> userAddresses;
}
