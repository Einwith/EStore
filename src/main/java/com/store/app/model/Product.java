package com.store.app.model;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class Product {

    @Id
    private Long id;
    @OneToOne(mappedBy = "product")
    private CartItems cartitems;
    private String name;
    private String desc;
    private int price;
    @Basic
    private LocalDateTime create_at;
    @Basic
    private LocalDateTime modified_at;

}

