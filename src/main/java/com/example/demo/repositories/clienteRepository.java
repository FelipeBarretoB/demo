package com.example.demo.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.clienteModel;

@Repository
public interface clienteRepository extends CrudRepository<clienteModel,Long> {
    
}
