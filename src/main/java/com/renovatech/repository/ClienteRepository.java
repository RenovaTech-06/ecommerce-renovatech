package com.renovatech.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renovatech.model.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	    public Optional<Cliente> findByEmail(String email);
	    public Optional<Cliente> findByCnpj(String cnpj);

}
