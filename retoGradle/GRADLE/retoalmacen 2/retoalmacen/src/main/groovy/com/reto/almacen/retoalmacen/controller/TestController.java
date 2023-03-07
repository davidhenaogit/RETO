package com.reto.almacen.retoalmacen.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/")
    public ResponseEntity getMensajeFuncionamiento() {
        return ResponseEntity.ok("Estado del servicio OK");
    }
}
