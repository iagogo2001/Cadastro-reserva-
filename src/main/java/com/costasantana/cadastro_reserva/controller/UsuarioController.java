package com.costasantana.cadastro_reserva.controller;

import com.costasantana.cadastro_reserva.business.Usuarioservice;
import com.costasantana.cadastro_reserva.infrastruture.entitys.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {

    private final Usuarioservice usuarioService;

    @PostMapping
    public ResponseEntity<Void> salvarUsuario(@RequestBody Usuario usuario){
        usuarioService.salvarUsuario(usuario);
        return  ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Usuario> buscarUsuarioPorEmail(@RequestParam String email){
        return ResponseEntity.ok(usuarioService.buscarUsuarioPorEmail(email));
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarUsuarioPorEmail(@RequestParam String email){
        usuarioService.deletarUsuarioPorEmail(email);
        return  ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> atualizarusuarioporId(@RequestParam Integer id,
                                                      @RequestBody Usuario usuario){
        usuarioService.atualizarUsuarioPorId(id, usuario);
        return  ResponseEntity.ok().build();
    }
}

