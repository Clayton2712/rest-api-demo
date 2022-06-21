package com.springboot.restapidemo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    //Creating relationship with Item
    @OneToMany(
            //deleting the cart deletes all items in the cart
            cascade = CascadeType.ALL
    )

    //specify the join column from Item
    @JoinColumn(name = "cart_id")
    private List<Item> items = new ArrayList<>();




}
