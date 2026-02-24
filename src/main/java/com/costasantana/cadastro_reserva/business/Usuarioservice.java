package com.costasantana.cadastro_reserva.business;

import com.costasantana.cadastro_reserva.infrastruture.entitys.Usuario;
import com.costasantana.cadastro_reserva.infrastruture.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class Usuarioservice {

    private final UsuarioRepository repository;

    public Usuarioservice(UsuarioRepository repository) {
        this.repository = repository;
    }

    public void salvarUsuario(Usuario usuario){
        repository.saveAndFlush(usuario);
    }

    public Usuario buscarUsuarioPorEmail(String email){

        return repository.findbyEmail(email).orElseThrow(
                () -> new RuntimeException("Email não encontrado")
        );
    }

    public void deletarUsuarioPorEmail(String email){
        repository.deleteByEmail(email);
    }

    public void atualizarUsuarioPorId(Integer id, Usuario usuario){
        Usuario usuarioEntity = repository.findById(id).orElseThrow(() ->
                new RuntimeException("Usuario não encontrado"));
        Usuario usuarioAtualizado = Usuario.builder()
                .email(usuario.getEmail() != null ? usuario.getEmail() :
                        usuarioEntity.getEmail())
                .name(usuario.getName() != null ? usuario.getName() :
                        usuarioEntity.getName())
                .phone(usuario.getPhone() != null ? usuario.getPhone() :
                        usuarioEntity.getPhone())
                .age(usuario.getAge() != null ? usuario.getAge() :
                        usuarioEntity.getAge())
                .observation(usuario.getObservation() != null ? usuario.getObservation() :
                        usuarioEntity.getObservation())
                .id(usuarioEntity.getId())
                .build();

        repository.saveAndFlush(usuarioAtualizado);
    }
}
