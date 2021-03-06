package com.springboot.restapidemo.model;

import com.springboot.restapidemo.model.dto.ItemDTO;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String serialNumber;
    @ManyToOne
    private Cart cart;

    public static Item from(ItemDTO itemDTO) {
        Item item = new Item();
        item.setSerialNumber(item.getSerialNumber());
        return item;
    }
}
