package com.fatec.sp.gov.br.teste;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.fatec.sp.gov.br.teste.entities.Usuario;
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
}
