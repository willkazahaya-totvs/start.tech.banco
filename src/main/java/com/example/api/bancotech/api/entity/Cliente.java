package com.example.api.bancotech.api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestMapping;
@Table(name = "Cliente")
@Entity
@Getter
@Setter

public class Cliente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    private String cpf;

    private String rg;

}
