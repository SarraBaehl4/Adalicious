package com.kata.kata5.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.kata.kata5.models.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Long>{
    
}
