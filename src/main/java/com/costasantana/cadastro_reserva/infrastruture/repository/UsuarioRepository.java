package com.costasantana.cadastro_reserva.infrastruture.repository;

import com.costasantana.cadastro_reserva.infrastruture.entitys.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findbyEmail(String email);

    void deleteByEmail(String email);


}
