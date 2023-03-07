package com.reto.almacen.retoalmacen.controller;

import com.reto.almacen.retoalmacen.service.IVendedores;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vendedores")
public class VendedoresController {

    private final IVendedores iVendedores;

    public VendedoresController(IVendedores iVendedores) {
        this.iVendedores = iVendedores;
    }

    @GetMapping
    public ResponseEntity getAllVendedores() {
        return iVendedores.listarVendedores();
    }


}
