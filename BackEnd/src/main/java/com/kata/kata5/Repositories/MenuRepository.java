package com.kata.kata5.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kata.kata5.models.Menu;


public interface MenuRepository extends JpaRepository<Menu, Long> {
    Menu save(Menu menu);
}