package com.springboot.restapidemo.controller;

import com.springboot.restapidemo.model.Item;
import com.springboot.restapidemo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items") //art or endpoints
public class ItemController {

    private final ItemService itemService; //dependency injection
    @Autowired
    public ItemController(ItemService itemService) {this.itemService = itemService;}

    @PostMapping //post request to create new item
    public ResponseEntity<Item> addItem(){
        return null;
    }

    @GetMapping
    public ResponseEntity<Item> getItems(){
        return null;
    }
}
