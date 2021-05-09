package com.store.app.model;

import lombok.*;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class UserAddress {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String address_line1;
    private String address_line2;
    private String city;
    private String postal_code;
    private String country;
}
