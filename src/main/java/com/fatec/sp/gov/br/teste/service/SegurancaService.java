package com.fatec.sp.gov.br.teste.service;

import com.fatec.sp.gov.br.teste.entities.Usuario;

public interface SegurancaService {
    
    public Usuario criarUsuario(String nome,String senha,String autorizacao);
    
}