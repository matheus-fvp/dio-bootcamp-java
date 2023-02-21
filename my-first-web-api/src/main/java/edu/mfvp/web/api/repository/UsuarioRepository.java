package edu.mfvp.web.api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import edu.mfvp.web.api.model.Usuario;

@Repository
public class UsuarioRepository {
	
	public void save(Usuario usuario) {
		if(usuario.getId() == null) {
			System.out.println("SAVE - Recebendo o usuário na camada de repositório");
		}else {
			System.out.println("UPDATE - Recebendo o usuário na camada de repositório");	
		}
		System.out.println(usuario);
	}
	
	public void deletById(Integer id) {
		System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
		System.out.println(id);
	}
	
	public List<Usuario> findAll() {
		System.out.println("List - Listando os usuários do sistema");
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Matheus", "1234"));
		usuarios.add(new Usuario("Paloma", "1234"));
		return usuarios;
	}
	
	public Usuario findById(Integer id) {
		System.out.println(String.format("FIND/id - Recebendo o id: %d para localiza o usuario", id));
		return new Usuario("Pedro", "123456");
	}
	
	public Usuario findByUserName(String username) {
		System.out.println(String.format("FIND/username - Recebendo o username: %s para buscar o usuario", username));
		return new Usuario("Joana", "123");
	}
	
}
