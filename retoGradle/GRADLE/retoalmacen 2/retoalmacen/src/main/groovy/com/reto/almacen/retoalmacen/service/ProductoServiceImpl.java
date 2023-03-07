package com.reto.almacen.retoalmacen.service;

import com.reto.almacen.retoalmacen.repository.ProductoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl implements IProducto {

    private final ProductoRepository productoRepository;

    public ProductoServiceImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public ResponseEntity listarProducto() {
        return ResponseEntity.ok(productoRepository.findAll());
    }


}
