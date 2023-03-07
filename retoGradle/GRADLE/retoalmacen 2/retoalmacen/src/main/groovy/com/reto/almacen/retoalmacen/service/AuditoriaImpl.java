package com.reto.almacen.retoalmacen.service;

import com.reto.almacen.retoalmacen.entity.AuditoriaEntity;
import com.reto.almacen.retoalmacen.repository.AuditoriaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AuditoriaImpl implements IAuditoria {

    private final AuditoriaRepository auditoriaRepository;

    public AuditoriaImpl(AuditoriaRepository auditoriaRepository) {
        this.auditoriaRepository = auditoriaRepository;
    }

    @Override
    public ResponseEntity getAuditoria() {
        return ResponseEntity.ok(auditoriaRepository.findAll());
    }

    @Override
    public void guardarAuditoria(AuditoriaEntity auditoriaEntity) {
        auditoriaRepository.save(auditoriaEntity);
    }


}
