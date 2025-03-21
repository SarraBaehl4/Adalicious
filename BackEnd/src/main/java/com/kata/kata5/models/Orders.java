package com.kata.kata5.models;
import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="orders")

public class Orders {

    public enum Status {
        en_preparation, prete
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "INT UNSIGNED")
    private Long id;

    @Column (nullable = false, length = 255)
    private String customer_name;

    @Enumerated(EnumType.STRING)
    @Column(name = "order_status", nullable = false)
    private Status orderStatus;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<MenuOrders> menuOrders = new HashSet<>();
    // Getters and Setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getCustomerName() {
        return customer_name;
    }
    
    public void setCustomerName(String customerName) {
        this.customer_name = customerName;
    }
    
    public Status getOrderStatus() {
        return orderStatus;
    }
    
    public void setOrderStatus(Status orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Set<MenuOrders> getMenuOrders() {
        return menuOrders;
    }
    
    public void setMenuOrders(Set<MenuOrders> menuOrders) {
        this.menuOrders = menuOrders;
    }
}
