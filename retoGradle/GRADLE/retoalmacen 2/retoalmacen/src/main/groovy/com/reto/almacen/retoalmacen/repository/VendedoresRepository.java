package com.reto.almacen.retoalmacen.repository;

import com.reto.almacen.retoalmacen.entity.VendedoresEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendedoresRepository extends JpaRepository<VendedoresEntity, Long> {


    VendedoresEntity findByIdVendedor(String idVendedor);


}

