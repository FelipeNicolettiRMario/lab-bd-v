package com.fatec.sp.gov.br.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistance.Id;

//TODO: Terminar a entidade
@Entity
@Table(name = "usr_usuario")
public class Usuario{

    @Id
    private Long id;

    private String nome;

    private String senha;

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSenha(){
        return this.senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }
}