package com.example.api.bancotech.api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Table(name = "ContaBancaria")
@Getter
@Setter
@Entity
public class ContaBancaria {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private double saldo;

    private int agencia;

    private int numero;

    @ManyToOne
    private Cliente cliente;
}
