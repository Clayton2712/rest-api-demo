package com.springboot.restapidemo.model.dto;

import com.springboot.restapidemo.model.Item;
import lombok.Data;

import java.util.Objects;

@Data
public class ItemDTO {
    private Long id;
    private String serialNumber;
    private PlainCartDTO plainCartDTO;

    public static ItemDTO from(Item item){ //is static because no object using it, translating Item into ItemDTO obj
        ItemDTO itemDTO = new ItemDTO(); //create empty obj, def constructor from @Data, (lombok)
        itemDTO.setId(item.getId());
        itemDTO.setSerialNumber(item.getSerialNumber());
        if(Objects.nonNull((item.getCart()))) {
            itemDTO.setPlainCartDTO(PlainCartDTO.from(item.getCart()));
        }
        return itemDTO;
    }
}

//1. transform the item to itemDTO
//2. we also need to transform itemDTO to item (in the entity)
