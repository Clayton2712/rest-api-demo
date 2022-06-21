package com.springboot.restapidemo.repository;

import com.springboot.restapidemo.model.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
//crud repo is of generic type
//specifying for which entity & type we are creating this repo for
public interface CartRepository extends CrudRepository<Cart, Long> {
}
