package com.example.api.bancotech.api.Repository;

import com.example.api.bancotech.api.entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
