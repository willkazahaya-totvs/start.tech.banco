package com.example.api.bancotech.api.Repository;

import com.example.api.bancotech.api.entity.ContaBancaria;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface ContaRepository extends CrudRepository<ContaBancaria, Long> {
}
