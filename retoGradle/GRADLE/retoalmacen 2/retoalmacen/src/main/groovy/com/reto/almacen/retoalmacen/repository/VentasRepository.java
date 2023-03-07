package com.reto.almacen.retoalmacen.repository;

import com.reto.almacen.retoalmacen.entity.VentasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;


public interface VentasRepository extends JpaRepository<VentasEntity, Long> {

    List<VentasEntity> findByFechaVenta(Date date);

}
