package com.reto.almacen.retoalmacen.repository;


import com.reto.almacen.retoalmacen.entity.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<ProductoEntity, Long> {

    ProductoEntity findByIdProducto(String idProducto);


}
