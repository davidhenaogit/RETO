package com.reto.almacen.retoalmacen.controller;

import com.reto.almacen.retoalmacen.service.IVentas;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequestMapping("/ventas")
public class VentasController {

    private final IVentas iVentas;

    public VentasController(IVentas iVentas) {
        this.iVentas = iVentas;
    }

    @GetMapping
    public ResponseEntity getAllVentas() {
        return iVentas.listarVentas();
    }


    @GetMapping("/ventas-por-dia")
    public ResponseEntity getVentasPorDia(
            @RequestParam(name = "dia") int dia,
            @RequestParam(name = "mes") int mes,
            @RequestParam(name = "anio") int anio,
            @RequestParam(name = "nombre") String nombre
    ) throws ParseException {
        return iVentas.ventasPorDia(dia, mes, anio, nombre);
    }

}
