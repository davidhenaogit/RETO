package com.reto.almacen.retoalmacen.controller;

import com.reto.almacen.retoalmacen.service.IAuditoria;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auditoria")
public class AuditoriaController {

    private final IAuditoria iAuditoria;

    public AuditoriaController(IAuditoria iAuditoria) {
        this.iAuditoria = iAuditoria;
    }

    @GetMapping
    public ResponseEntity getAuditoria() {
        return iAuditoria.getAuditoria();
    }
}
