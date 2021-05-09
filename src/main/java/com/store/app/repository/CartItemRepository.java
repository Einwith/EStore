package com.store.app.repository;

import com.store.app.model.CartItems;
import org.springframework.data.repository.CrudRepository;

public interface CartItemRepository extends CrudRepository<CartItems, Integer> {
}
