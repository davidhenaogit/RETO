package com.reto.almacen.retoalmacen.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "ventas")
@AllArgsConstructor
@NoArgsConstructor

public class VentasEntity {

    @Id
    @Column(name = "id_venta")
    private Long idVenta;

    // @Temporal(TemporalType.DATE)
    @Column(name = "fecha_venta")
    private Date fechaVenta;

    @Column(name = "cantidad_vendida")
    private int cantidadVendida;


    @ManyToOne
    @JoinColumn(name = "id_vendedor")
    private VendedoresEntity vendedoresEntity;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private ProductoEntity productoEntity;


}
