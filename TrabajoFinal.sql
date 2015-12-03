create database TrabajoFinal;
use TrabajoFinal;

create table Vehiculo
(
	Patente varchar(10),
    Marca varchar(30),
    Modelo varchar(30),
    Color varchar(30),
    Ano int,
    Precio int,
    
    primary key (Patente)
);

use mysql;
create user 'admin_TrabajoFinal'@'localhost' identified by '';
grant all privileges on TrabajoFinal.* to 'admin_TrabajoFinal'@'localhost';
flush privileges
