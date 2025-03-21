package com.kata.kata5.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import com.kata.kata5.models.MenuOrders;

public interface MenuOrdersRepository extends JpaRepository<MenuOrders, Long> {
    
}
