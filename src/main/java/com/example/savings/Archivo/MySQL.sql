#DROP DATABASE nuevo;
CREATE DATABASE nuevo;

USE nuevo;

CREATE TABLE usuario(
	id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR (50),
    apellido VARCHAR (50),
    email VARCHAR (50),
    telefono VARCHAR(20),
    nombre_usuario VARCHAR(20),
    password VARCHAR(50)
    
     );
    

 CREATE TABLE cuenta(
 id_cuenta INT AUTO_INCREMENT PRIMARY KEY,
 ahorro INT AUTO_INCREMENT (100),
 ingresos INT AUTO_INCREMENT (100),
 gastos INT AUTO_INCREMENT (100)
 
	);
 
 CREATE TABLE meta(
	id_meta INT AUTO_INCREMENT PRIMARY KEY,
    plazo DOUBLE (100),
    monto DOUBLE (100),
    limite DOUBLE (100),
    objetivo DOUBLE (100)
 
	);
    