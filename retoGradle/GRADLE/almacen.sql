SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

CREATE DATABASE IF NOT EXISTS almacen DEFAULT CHARACTER SET utf8mb4 COLLATE utf8_general_ci;
USE almacen;

CREATE TABLE auditoria (
  id INT         NOT NULL AUTO_INCREMENT,
  tipo_peticion varchar(65) NOT NULL,
  datos_entrada varchar(100) NOT NULL,
  datos_salida varchar(100) NOT NULL,
  nombre_consultante  varchar(100) NOT NULL,
  fecha date,
   primary key (id)
) ;

CREATE TABLE producto (
  id_producto int(5) NOT NULL,
  nombre_producto varchar(50) CHARACTER SET utf8 NOT NULL,
  precio_unidad int(5) NOT NULL,
  cantidad_bodega int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO producto (id_producto, nombre_producto, precio_unidad, cantidad_bodega) VALUES
(36, 'Huevos unidad', 600, 120),
(96, 'Gatorade', 3600, 30),
(114, 'Jabón Neko ', 6069, 20),
(456, 'Servilletas paquete', 1200, 2),
(512, 'Queso tajado 250g ', 7500, 3),
(566, 'Aceite de oliva', 12500, 5);

CREATE TABLE vendedores (
  id_vendedor int(3) NOT NULL,
  nombres varchar(50) CHARACTER SET utf8 NOT NULL,
  apellidos varchar(50) CHARACTER SET utf8 NOT NULL,
  tipo_doc varchar(50) CHARACTER SET utf8 NOT NULL,
  num_doc int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO vendedores (id_vendedor, nombres, apellidos, tipo_doc, num_doc) VALUES
(10, 'José Fabián', 'Galindo', 'CC', 979416),
(13, 'María', 'Vélez', 'CE', 597964),
(21, 'Laura', 'Guzmán', 'CC', 235697),
(23, 'Carlos ', 'Ortega', 'CC', 987566);

CREATE TABLE ventas (
  id_venta int(10) NOT NULL,
  fecha_venta date NOT NULL,
  id_vendedor int(3) NOT NULL,
  id_producto int(5) NOT NULL,
  cantidad_vendida int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO ventas (id_venta, fecha_venta, id_vendedor, id_producto, cantidad_vendida) VALUES
(101, '2023-01-12', 21, 512, 2),
(102, '2023-02-21', 21, 566, 4),
(104, '2023-01-21', 23, 456, 5),
(156, '2022-12-12', 13, 36, 1),
(203, '2023-02-21', 10, 114, 1);


ALTER TABLE producto
  ADD PRIMARY KEY (id_producto);

ALTER TABLE vendedores
  ADD PRIMARY KEY (id_vendedor);

ALTER TABLE ventas
  ADD PRIMARY KEY (id_venta),
  ADD KEY id_vendedor (id_vendedor),
  ADD KEY id_producto (id_producto);


ALTER TABLE ventas
  ADD CONSTRAINT ventas_ibfk_1 FOREIGN KEY (id_vendedor) REFERENCES vendedores (id_vendedor),
  ADD CONSTRAINT ventas_ibfk_2 FOREIGN KEY (id_producto) REFERENCES producto (id_producto);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
