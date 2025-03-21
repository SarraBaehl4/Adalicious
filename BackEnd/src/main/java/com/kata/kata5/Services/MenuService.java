package com.kata.kata5.Services;

import com.kata.kata5.models.*;
import com.kata.kata5.Repositories.*;
import com.kata.kata5.dtos.*;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuService {

    private final MenuRepository menuRepository;


    public MenuService(MenuRepository menuRepository, OrdersRepository ordersRepository, MenuOrdersRepository menuOrdersRepository) {
        this.menuRepository = menuRepository;
    }

    public List<Menu> getAllMenu() {
        return menuRepository.findAll();
    }

    public Optional<Menu> getMenuById(long id) {
        return menuRepository.findById(id);
    }

    public Menu createMenu(MenuCreateDTO dto) {
    Menu menu = new Menu();
    menu.setPlate(dto.getPlate());
    menu.setDescription(dto.getDescription());
    menu.setImage(dto.getImage());
    menu.setPrice(dto.getPrice());

    return menuRepository.save(menu);
}

}
