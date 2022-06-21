package com.springboot.restapidemo.repository;

import com.springboot.restapidemo.model.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
//crud repo is of generic type
//specifying for which entity & type we are creating this repo for
public interface ItemRepository extends CrudRepository<Item, Long> {
}
