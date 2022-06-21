package com.springboot.restapidemo.model.dto;

import com.springboot.restapidemo.model.Cart;
import lombok.Data;

@Data
public class PlainCartDTO {
    private Long id;
    private String name;
    public static PlainCartDTO from(Cart cart) {
        PlainCartDTO plainCartDTO = new PlainCartDTO();
        plainCartDTO.setId(cart.getId());
        plainCartDTO.setName(cart.getName());
        return plainCartDTO;
    }
}
