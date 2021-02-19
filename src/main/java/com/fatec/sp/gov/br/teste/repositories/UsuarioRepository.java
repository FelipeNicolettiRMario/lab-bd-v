package com.fatec.sp.gov.br.teste.repositories;

import com.fatec.sp.gov.br.teste.entities.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{
    
}