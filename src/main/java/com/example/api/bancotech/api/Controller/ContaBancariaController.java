package com.example.api.bancotech.api.Controller;

import com.example.api.bancotech.api.Repository.ContaRepository;
import com.example.api.bancotech.api.entity.ContaBancaria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/CriaConta")
public class ContaBancariaController {

    @Autowired
    private ContaRepository contaRepository;

    @GetMapping
    public List<ContaBancaria> list() {

        return (List<ContaBancaria>) contaRepository.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<ContaBancaria> buscar(@PathVariable Long id) {
        Optional<ContaBancaria> contaBancaria = contaRepository.findById(id);

        if (contaBancaria.isPresent()) {
            return ResponseEntity.ok(contaBancaria.get());
        }

        return ResponseEntity.notFound().build();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ContaBancaria adicionarConta(@RequestBody ContaBancaria contaBancaria) {
        return contaRepository.save(contaBancaria);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        Optional<ContaBancaria> contaDeletar = contaRepository.findById(id);

        if (contaDeletar.isPresent()) {
            contaRepository.delete(contaDeletar.get());
        }
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<ContaBancaria> atualizar(@PathVariable Long id , @RequestBody ContaBancaria contaBancaria) {

        if (!contaRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        contaBancaria.setId(id);
        ContaBancaria atualizacaoConta = contaRepository.save(contaBancaria);
        return ResponseEntity.ok(atualizacaoConta);
    }
}