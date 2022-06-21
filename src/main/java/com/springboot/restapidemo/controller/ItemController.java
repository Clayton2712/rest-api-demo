package com.springboot.restapidemo.controller;

import com.springboot.restapidemo.model.Item;
import com.springboot.restapidemo.model.dto.ItemDTO;
import com.springboot.restapidemo.service.ItemService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items") //art or endpoints
public class ItemController {

    private final ItemService itemService; //dependency injection
    @Autowired
    public ItemController(ItemService itemService) {this.itemService = itemService;}

    @PostMapping //post request to create new item
    public ResponseEntity<ItemDTO> addItem(@RequestBody final ItemDTO itemDTO){
        Item item = itemService.addItem(Item.from(itemDTO));
        return new ResponseEntity<>(ItemDTO.from(item), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Item> getItems(){
        return null;
    }
}
