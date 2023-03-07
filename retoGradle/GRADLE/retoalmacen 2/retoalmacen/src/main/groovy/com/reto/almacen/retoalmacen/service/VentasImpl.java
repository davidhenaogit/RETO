package com.reto.almacen.retoalmacen.service;

import com.reto.almacen.retoalmacen.entity.AuditoriaEntity;
import com.reto.almacen.retoalmacen.repository.VentasRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class VentasImpl implements IVentas {

    private final VentasRepository ventasRepository;

    private final IAuditoria iAuditoria;

    public VentasImpl(VentasRepository ventasRepository, IAuditoria iAuditoria) {
        this.ventasRepository = ventasRepository;
        this.iAuditoria = iAuditoria;
    }

    @Override
    public ResponseEntity listarVentas() {
        var listado = ventasRepository.findAll();
        return ResponseEntity.ok(listado);
    }

    @Override
    public ResponseEntity ventasPorDia(int dia, int mes, int anio, String nombre) throws ParseException {

        AuditoriaEntity auditoriaEntity = new AuditoriaEntity();
        String dateStr = anio + "/" + mes + "/" + dia;
        Date date1 = new SimpleDateFormat("yyyy/MM/dd").parse(dateStr);

        var listado = ventasRepository.findByFechaVenta(date1);
        double totalVentas = listado.stream().mapToDouble(venta -> venta.getCantidadVendida()).sum();

        auditoriaEntity.setDatosEntrada(dateStr);
        auditoriaEntity.setDatosSalida("" + totalVentas);
        auditoriaEntity.setTipoPeticion("GET");
        auditoriaEntity.setFecha(new Date());
        auditoriaEntity.setNombreConsultante(nombre);

        iAuditoria.guardarAuditoria(auditoriaEntity);

        return ResponseEntity.ok(totalVentas);

    }


}
