package com.kata.kata5.Controllers;

import com.kata.kata5.Services.MenuService;
import com.kata.kata5.dtos.MenuCreateDTO;
import com.kata.kata5.models.Menu;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(
    origins = "http://localhost:4200",
    allowedHeaders = "*",
    methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH, RequestMethod.DELETE, RequestMethod.OPTIONS}
)
@RequestMapping("/menus")
public class MenuController {

    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    // Récupérer tous les menus
    @GetMapping
    public List<Menu> getAllMenus() {
        return menuService.getAllMenu();
    }

    // Récupérer un menu par ID
    @GetMapping("/{id}")
    public ResponseEntity<Menu> getMenuById(@PathVariable long id) {
        Optional<Menu> menu = menuService.getMenuById(id);
        return menu.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Créer un menu
    @PostMapping
    public ResponseEntity<Menu> createMenu(@RequestBody MenuCreateDTO dto) {
        Menu createdMenu = menuService.createMenu(dto);
        return ResponseEntity.ok(createdMenu);
    }
}
