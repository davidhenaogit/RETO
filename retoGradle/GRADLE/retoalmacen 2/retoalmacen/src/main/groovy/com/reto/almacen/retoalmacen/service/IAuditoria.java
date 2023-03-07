package com.reto.almacen.retoalmacen.service;


import com.reto.almacen.retoalmacen.entity.AuditoriaEntity;
import org.springframework.http.ResponseEntity;

public interface IAuditoria {

    ResponseEntity getAuditoria();

    void guardarAuditoria(AuditoriaEntity auditoriaEntity);

}
