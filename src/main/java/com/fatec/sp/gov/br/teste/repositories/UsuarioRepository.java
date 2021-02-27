package com.fatec.sp.gov.br.teste.repositories;

import com.fatec.sp.gov.br.teste.entities.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{

    public List<Usuario> findByNomeContainsIgnoreCase(String nome);

    public Usuario findByNome(String nome);

    public Usuario findByNomeAndSenha(String nome,String senha);

    public List<Usuario> findByAutorizacoesNome(String autorizacao);
}