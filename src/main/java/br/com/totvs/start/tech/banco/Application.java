package br.com.totvs.start.tech.banco;

import br.com.totvs.start.tech.banco.entity.Cliente;
import br.com.totvs.start.tech.banco.entity.ContaBancaria;
import br.com.totvs.start.tech.banco.service.ClienteServiceImpl;
import br.com.totvs.start.tech.banco.service.ContaBancariaServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		List<Cliente> listCliente = new ArrayList<Cliente>();
		List<ContaBancaria> listContaBancaria = new ArrayList<ContaBancaria>();

		SpringApplication.run(Application.class, args);

		

		ClienteServiceImpl clienteService = new ClienteServiceImpl();
		ContaBancariaServiceImpl contaBancariaService = new ContaBancariaServiceImpl();


		System.out.println(contaBancariaService.verficarSaldod(200));
	}

}
