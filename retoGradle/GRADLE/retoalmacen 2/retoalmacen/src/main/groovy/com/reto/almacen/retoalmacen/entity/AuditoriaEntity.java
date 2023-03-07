package com.reto.almacen.retoalmacen.entity;

import com.fasterxml.jackson.databind.DatabindException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "auditoria")
@AllArgsConstructor
@NoArgsConstructor

public class AuditoriaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idAuditoria;

    @Column(name = "tipo_peticion")
    private String tipoPeticion;

    @Column(name = "datos_entrada")
    private String datosEntrada;

    @Column(name = "datos_salida")
    private String datosSalida;

    @Column(name = "nombre_consultante")
    private String nombreConsultante;

    @Column(name = "fecha")
    private Date fecha;

}
