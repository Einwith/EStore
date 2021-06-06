package com.store.app.model;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    private String id;
    @OneToOne(mappedBy = "product")
    private CartItems cartitems;
    private String name;
    private String desc;
    private int price;


}

