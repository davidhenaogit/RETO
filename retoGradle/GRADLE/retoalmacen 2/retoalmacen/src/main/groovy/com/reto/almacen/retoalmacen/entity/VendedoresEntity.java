package com.reto.almacen.retoalmacen.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "vendedores")
@AllArgsConstructor
@NoArgsConstructor
public class VendedoresEntity {

    @Id
    @Column(name = "id_vendedor")
    private Long idVendedor;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "tipo_doc")
    private String tipoDoc;

    @Column(name = "num_doc")
    private int numDoc;


}
