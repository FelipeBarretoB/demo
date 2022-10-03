package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.productoModel;

@Repository
public interface productoRepository extends CrudRepository<productoModel,Integer> {
    
}
