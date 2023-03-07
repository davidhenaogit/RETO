package com.reto.almacen.retoalmacen.service;

import org.springframework.http.ResponseEntity;

import java.text.ParseException;

public interface IVentas {

    ResponseEntity listarVentas();

    ResponseEntity ventasPorDia(int dia, int mes, int anio, String nombre) throws ParseException;

}
