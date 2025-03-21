package com.kata.kata5.models;

import jakarta.persistence.*;

@Entity
@Table(name = "menuorders")
public class MenuOrders {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "id_menu", nullable = false)
    private Menu menu;
    
    @ManyToOne
    @JoinColumn(name = "id_order", nullable = false)
    private Orders order;
    
    @Column(name = "quantity", nullable = false)
    private int quantity;
    
    // Constructeur par défaut nécessaire pour JPA
    public MenuOrders() {
    }
    
    // Constructeur pratique
    public MenuOrders(Orders order, Menu menu, int quantity) {
        this.order = order;
        this.menu = menu;
        this.quantity = quantity;
    }
    
    // Getters and Setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Menu getMenu() {
        return menu;
    }
    
    public void setMenu(Menu menu) {
        this.menu = menu;
    }
    
    public Orders getOrder() {
        return order;
    }
    
    public void setOrder(Orders order) {
        this.order = order;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
