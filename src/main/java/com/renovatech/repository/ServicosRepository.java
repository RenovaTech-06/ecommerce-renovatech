package com.renovatech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.renovatech.model.Servicos;

public interface ServicosRepository extends JpaRepository<Servicos, Long>{
	
	public List <Servicos> findAllByRazaoSocialContainingIgnoreCase(@Param("razaoSocial") String razaoSocial);

}
