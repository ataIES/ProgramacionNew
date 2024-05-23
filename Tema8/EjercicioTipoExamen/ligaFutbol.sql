
create database if not exists laliga;
use laliga;


create table equipos(
idequipo int primary key,
nombre_equipo varchar(50),
categoria varchar(50),
ciudad varchar(35),
estadio varchar(50),
aforo int);


create table jugadores(
idjugador int not null primary key,
nombre_jugador varchar(40),
apellidos varchar(50),
goles int,
idequipo int,
foreign key (idequipo) references equipos(idequipo)
);





INSERT INTO `equipos` (`idequipo`, `nombre_equipo`, `categoria`, `ciudad`, `estadio`, `aforo`) VALUES
(1, 'Unionistas Salamanca', '1 RFEF', 'Salamanca', 'Reina Sofía', 4895),
(2, 'Lugo', '1 RFEF', 'Lugo', 'Anxo Carro', 7114),
(3, 'Alcoyano', '1 RFEF', 'Alcoy', 'El Collao', 4850),
(4, 'Recreativo', '1 RFEF', 'Huelva', 'Nuevo Colombino', 21670);

INSERT INTO `jugadores` (`idjugador`, `nombre_jugador`, `apellidos`, `goles`, `idequipo`) VALUES
(1, 'Gorka', 'Iturraspe', 0, 4),
(2, 'Pablo', 'Caballero', 13, 4),
(3, 'Mikel', 'Pradera', 3, 3),
(4, 'Willy', 'Ledesma', 4, 2),
(5, 'Mario', 'da Costa', 2, 2);