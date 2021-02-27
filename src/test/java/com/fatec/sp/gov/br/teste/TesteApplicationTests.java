package com.fatec.sp.gov.br.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.HashSet;
import java.util.List;

import com.fatec.sp.gov.br.teste.entities.Autorizacao;
import com.fatec.sp.gov.br.teste.entities.Usuario;
import com.fatec.sp.gov.br.teste.repositories.AutorizacaoRepository;
import com.fatec.sp.gov.br.teste.repositories.UsuarioRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@Rollback
class TesteApplicationTests {
    
    @Autowired
    private UsuarioRepository usuarioRepo;

    @Autowired
    private AutorizacaoRepository autRepo;

	@Test
	void contextLoads() {
	}

    @Test
    void testaInsercao(){
        Usuario usuario = new Usuario();
        usuario.setNome("Joao");
        usuario.setSenha("1234");
        usuario.setAutorizacoes(new HashSet<Autorizacao>());
        Autorizacao aut = new Autorizacao();
        aut.setNome("ROLE_USER2");
        autRepo.save(aut);
        usuario.getAutorizacoes().add(aut);
        usuarioRepo.save(usuario);
        assertNotNull(usuario.getAutorizacoes().iterator().next().getNome());
    }

    @Test
    void testaAutorizacao(){
        Usuario usuario = usuarioRepo.findById(1L).get();
        assertEquals("ADM",usuario.getAutorizacoes().iterator().next().getNome());
    }

    @Test
    void testaUsuario(){
        Autorizacao autorizacao = autRepo.findById(1L).get();
        assertEquals("Felipe", autorizacao.getUsuarios().iterator().next().getNome());
    }

    @Test
    void testaFindByNomeContains(){
        List<Usuario> usuarios = usuarioRepo.findByNomeContainsIgnoreCase("e");
        assertNotNull(usuarios.isEmpty());
    }

    @Test
    void testeFindByNome(){
        Usuario usuario = usuarioRepo.findByNome("Felipe");
        assertNotNull(usuario);
    }

    @Test
    void testeFindByNomeAndSenha(){
        Usuario usuario = usuarioRepo.findByNomeAndSenha("Gabriel", "1234");
        assertNotNull(usuario);
    }

    @Test
    void testeFindByAutorizacoesNome(){
        List<Usuario> usuarios = usuarioRepo.findByAutorizacoesNome("ADM");
        assertNotNull(usuarios.isEmpty());
    }


}
