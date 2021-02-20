package com.fatec.sp.gov.br.teste.repositories;

import com.fatec.sp.gov.br.teste.entities.Autorizacao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorizacaoRepository extends JpaRepository<Autorizacao,Long>{
    
}