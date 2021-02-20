package com.fatec.sp.gov.br.teste;

import static org.junit.jupiter.api.Assertions.assertNotNull;

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
        usuario.setNome("Gabriel");
        usuario.setSenha("1234");
        usuarioRepo.save(usuario);
        assertNotNull(usuario.getId());
    }

    @Test
    void testaAutorizacao(){
        Autorizacao autorizacao = new Autorizacao();
        autorizacao.setNome("ADMIN");
        autRepo.save(autorizacao);
        assertNotNull(autorizacao.getId());
    }
}
