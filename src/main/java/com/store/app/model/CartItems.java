package com.store.app.model;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class CartItems {
    private Long id;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;
    private int quantity;
    @Basic
    private LocalDateTime create_at;
    @Basic
    private LocalDateTime modified_at;
}
