package com.springboot.restapidemo.service;

import com.springboot.restapidemo.model.Item;
import com.springboot.restapidemo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service

public class ItemService {

    //Spring is injecting ItemRepository into the ItemService
    //to allow use ItemRepository methods in our service
    //ItemRepository will create a bean for this service/class
    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) { //constructor
        this.itemRepository = itemRepository;
    }

    //methods for CRUD operations
    public Item addItem(Item item) { //persist the item into DB and return persisted object
        return itemRepository.save(item);
    }

    public List<Item> getItems() { //method returns all items in DB

        //the DB returns an Iterable, need to use StreamSupport class
        return StreamSupport.stream(itemRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    public Item getItem(Long id) {
        return itemRepository.findById(id).orElse(null);
    }

    public Item deleteItem(Long id) {
        //check if item exists
        Item item = getItem(id);
        itemRepository.delete(item);
        return item;
    }

}
