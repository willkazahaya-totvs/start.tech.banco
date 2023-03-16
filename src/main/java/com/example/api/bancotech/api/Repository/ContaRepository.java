package com.example.api.bancotech.api.Repository;

import com.example.api.bancotech.api.entity.ContaBancaria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContaRepository extends CrudRepository<ContaBancaria, Long> {
}
