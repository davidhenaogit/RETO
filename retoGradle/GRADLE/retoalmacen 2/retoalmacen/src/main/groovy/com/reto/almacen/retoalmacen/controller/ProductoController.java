package com.reto.almacen.retoalmacen.controller;

import com.reto.almacen.retoalmacen.service.IProducto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/producto")

public class ProductoController {

    private final IProducto iProducto;

    public ProductoController(IProducto iProducto) {
        this.iProducto = iProducto;
    }

    @GetMapping
    public ResponseEntity getAllProducto() {
        return iProducto.listarProducto();
    }

}
