package com.example.api.bancotech.api.Repository;

import com.example.api.bancotech.api.entity.Cliente;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
