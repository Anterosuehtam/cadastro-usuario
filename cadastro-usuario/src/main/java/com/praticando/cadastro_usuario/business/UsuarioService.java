package com.praticando.cadastro_usuario.business;

import com.praticando.cadastro_usuario.infrastructure.entitys.Usuario;
import com.praticando.cadastro_usuario.infrastructure.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    //Metodo para SALVAR o usuário no BD
    public void salvarUsuario(Usuario usuario) {
        repository.saveAndFlush(usuario);
    }

    //Metodo para BUSCAR o usuario pelo email no BD
    public Usuario buscarUsuarioPorEmail(String email) {
        return repository.findByEmail(email).orElseThrow(
                () -> new RuntimeException("Email não encontrado")
        );
    }

    //Metodo para DELETAR o usuario pelo email no BD
    public void deletarUsuarioPorEmail(String email){
        repository.deleteByEmail(email);
    }

    //Metodo para ATUALIZAR o usuário no BD
    public void atualizarUsuarioPorId(Integer id, Usuario usuario){
        Usuario usuarioEntity = repository.findById(id).orElseThrow( () -> new RuntimeException("Usuário não encontrado"));
        Usuario usuarioAtualizado = Usuario.builder()
                .email(usuario.getEmail() != null ?
                        usuario.getEmail() : usuarioEntity.getEmail())
                .nome(usuario.getNome() != null ?
                        usuario.getNome() : usuarioEntity.getNome())
                .id(usuarioEntity.getId())
                .build();

        repository.saveAndFlush(usuarioAtualizado);
    }
}
