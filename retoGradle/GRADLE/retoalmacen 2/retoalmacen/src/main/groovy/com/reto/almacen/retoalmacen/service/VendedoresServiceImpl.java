package com.reto.almacen.retoalmacen.service;

import com.reto.almacen.retoalmacen.repository.VendedoresRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class VendedoresServiceImpl implements IVendedores {
    private final VendedoresRepository vendedoresRepository;

    public VendedoresServiceImpl(VendedoresRepository vendedoresRepository) {
        this.vendedoresRepository = vendedoresRepository;

    }

    @Override
    public ResponseEntity listarVendedores() {

        return ResponseEntity.ok(vendedoresRepository.findAll());
    }

}
