-- MySQL Workbench Forward Engineering Optimized

-- Desactivar verificaciones de integridad referencial y restricciones únicas
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- Crear esquema mydb si no existe y usarlo
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8;
USE `mydb`;

-- Crear tabla Profesor
CREATE TABLE IF NOT EXISTS `Profesor` (
  `idProfesor` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(33) NOT NULL,
  `apellidos` VARCHAR(45) NOT NULL,
  `DNI` VARCHAR(9) NOT NULL,
  `perfilAcceso` ENUM('SUPERUSUARIO','ADMINISTRADOR','EQUIPO_DIRECTIVO','PROFESOR') NOT NULL,
  `fk_departamento` VARCHAR(30) NOT NULL,
  `correo` VARCHAR(45) NOT NULL,
  `activo` TINYINT NOT NULL,
  `contraseña` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`idProfesor`),
  UNIQUE INDEX `DNI_UNIQUE` (`DNI`),
  UNIQUE INDEX `correo_UNIQUE` (`correo`)
) ENGINE=InnoDB;

-- Crear tabla departamento
CREATE TABLE IF NOT EXISTS `departamento` (
  `iddepartamento` INT NOT NULL AUTO_INCREMENT,
  `codDepartamento` VARCHAR(45) NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `idJefe` INT NOT NULL,
  PRIMARY KEY (`iddepartamento`),
  UNIQUE INDEX `codDepartamento_UNIQUE` (`codDepartamento`),
  UNIQUE INDEX `idJefe_UNIQUE` (`idJefe`),
  CONSTRAINT `fk_departamento_jefe`
    FOREIGN KEY (`idJefe`)
    REFERENCES `Profesor` (`idProfesor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
) ENGINE=InnoDB;

-- Añadir la clave foránea en la tabla Profesor
ALTER TABLE `Profesor`
  ADD CONSTRAINT `fk_profesor_departamento`
  FOREIGN KEY (`fk_departamento`)
  REFERENCES `departamento` (`codDepartamento`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

-- Crear tabla curso
CREATE TABLE IF NOT EXISTS `curso` (
  `idcurso` INT NOT NULL AUTO_INCREMENT,
  `codcurso` VARCHAR(10) NOT NULL,
  `descripcion` VARCHAR(60) NOT NULL,
  `etapa` ENUM('ESO','BACHILLERATO','FPGS','FPGM','FPB','FPCE') NOT NULL,
  `activo` TINYINT NOT NULL,
  PRIMARY KEY (`idcurso`),
  UNIQUE INDEX `codcurso_UNIQUE` (`codcurso`)
) ENGINE=InnoDB;

-- Crear tabla grupoAlumnos
CREATE TABLE IF NOT EXISTS `grupoAlumnos` (
  `codGrupo` VARCHAR(10) NOT NULL,
  `fk_curso` INT(10) NOT NULL,
  `numAlumnos` VARCHAR(45) NOT NULL,
  `activo` TINYINT NOT NULL,
  `idGrupo` INT NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`idGrupo`),
  CONSTRAINT `fk_grupo_curso`
    FOREIGN KEY (`fk_curso`)
    REFERENCES `curso` (`idcurso`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
) ENGINE=InnoDB;

-- Crear tabla Solicitud
CREATE TABLE IF NOT EXISTS `Solicitud` (
  `idActividad` INT NOT NULL AUTO_INCREMENT,
  `horaInicio` TIME NOT NULL,
  `horaFin` TIME NOT NULL,
  `comentarios` VARCHAR(50) NULL,
  `prevista` TINYINT NOT NULL,
  `Departamento` INT NOT NULL,
  `titulo` VARCHAR(45) NOT NULL,
  `tipo` ENUM('EXTRAESCOLAR','COMPLEMENTARIA') NOT NULL,
  `medioTransporte` TINYINT NOT NULL,
  `profesor` INT NOT NULL,
  `alojamiento` TINYINT NOT NULL,
  `fechaInicio` DATE NOT NULL,
  `fechaFinal` DATE NOT NULL,
  `totalParticipantes` INT NOT NULL,
  `comenAlojamiento` VARCHAR(45) NULL,
  `estado` ENUM('SOLICITADA','APROBADA','DENEGADA','REALIZADA') NOT NULL,
  PRIMARY KEY (`idActividad`),
  UNIQUE INDEX `profesor_UNIQUE` (`profesor`),
  UNIQUE INDEX `Departamento_UNIQUE` (`Departamento`)
) ENGINE=InnoDB;

-- Crear tabla ActividadProgramada
CREATE TABLE IF NOT EXISTS `ActividadProgramada` (
  `idActividadProgramada` INT NOT NULL,
  `estado` ENUM('SOLICITADA','APROBADA','DENEGADA','REALIZADA') NOT NULL,
  `comentario` VARCHAR(45) NULL,
  `horaInicio` TIME NOT NULL,
  `horaFin` TIME NOT NULL,
  `prevista` TINYINT NOT NULL,
  `Departamento` INT NOT NULL,
  `titulo` VARCHAR(45) NOT NULL,
  `tipo` ENUM('EXTRAESCOLAR','COMPLEMENTARIA') NOT NULL,
  `medioTransporte` TINYINT NOT NULL,
  `profesor` INT NOT NULL,
  `alojamiento` TINYINT NOT NULL,
  `fechaInicio` DATE NOT NULL,
  `fechaFinal` DATE NOT NULL,
  `comenAlojamiento` VARCHAR(45) NULL,
  `totalParticipantes` VARCHAR(45) NOT NULL,
  `comenRealizada` VARCHAR(45) NULL,
  PRIMARY KEY (`idActividadProgramada`),
  UNIQUE INDEX `fk_Departamento_UNIQUE` (`Departamento`),
  UNIQUE INDEX `profesor_UNIQUE` (`profesor`),
  CONSTRAINT `fk_actividad_solicitud`
    FOREIGN KEY (`idActividadProgramada`)
    REFERENCES `Solicitud` (`idActividad`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
) ENGINE=InnoDB;

-- Crear tabla FotoActividad
CREATE TABLE IF NOT EXISTS `FotoActividad` (
  `url` VARCHAR(45) NOT NULL,
  `descripcion` VARCHAR(45) NOT NULL,
  `idFoto` INT NOT NULL,
  `fk_idActividad` INT NOT NULL,
  PRIMARY KEY (`idFoto`),
  UNIQUE INDEX `fk_idActividad_UNIQUE` (`fk_idActividad`),
  CONSTRAINT `fk_foto_actividad`
    FOREIGN KEY (`fk_idActividad`)
    REFERENCES `ActividadProgramada` (`idActividadProgramada`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
) ENGINE=InnoDB;

-- Crear tabla MedioTransporte
CREATE TABLE IF NOT EXISTS `MedioTransporte` (
  `idTransporte` INT NOT NULL,
  `tipo` ENUM('ANDANDO','BICI','BUS','TAXI','TREN','BARCO','AVION') NOT NULL,
  PRIMARY KEY (`idTransporte`)
) ENGINE=InnoDB;

-- Crear tabla CursoParticipa
CREATE TABLE IF NOT EXISTS `CursoParticipa` (
  `fk_idCurso` INT NOT NULL,
  `fk_idActividad` INT NOT NULL,
  `Numparticipantes` INT NOT NULL,
  UNIQUE INDEX `fk_idActividad_UNIQUE` (`fk_idActividad`),
  UNIQUE INDEX `fk_idCurso_UNIQUE` (`fk_idCurso`),
  PRIMARY KEY (`fk_idCurso`, `fk_idActividad`),
  CONSTRAINT `fk_curso_actividad`
    FOREIGN KEY (`fk_idActividad`)
    REFERENCES `Solicitud` (`idActividad`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_curso_participa`
    FOREIGN KEY (`fk_idCurso`)
    REFERENCES `curso` (`idcurso`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
) ENGINE=InnoDB;

-- Crear tabla GrupoParticipa
CREATE TABLE IF NOT EXISTS `GrupoParticipa` (
  `fk_idGrupo` INT NOT NULL,
  `fk_idActividad` INT NOT NULL,
  `Numparticipantes` INT NOT NULL,
  UNIQUE INDEX `fk_idGrupo_UNIQUE` (`fk_idGrupo`),
  UNIQUE INDEX `fk_idActividad_UNIQUE` (`fk_idActividad`),
  PRIMARY KEY (`fk_idGrupo`, `fk_idActividad`),
  CONSTRAINT `fk_grupo_actividad`
    FOREIGN KEY (`fk_idGrupo`)
    REFERENCES `grupoAlumnos` (`idGrupo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_actividad_grupo`
    FOREIGN KEY (`fk_idActividad`)
    REFERENCES `Solicitud` (`idActividad`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
) ENGINE=InnoDB;

-- Crear tabla ProfesorSolicita
CREATE TABLE IF NOT EXISTS `ProfesorSolicita` (
  `fk_idProfesor` INT NOT NULL,
  `fk_idActividad` INT NOT NULL,
  UNIQUE INDEX `fk_idProfesor_UNIQUE` (`fk_idProfesor`),
  UNIQUE INDEX `fk_idActividad_UNIQUE` (`fk_idActividad`),
  PRIMARY KEY (`fk_idProfesor`, `fk_idActividad`),
  CONSTRAINT `fk_profesor_solicitud`
    FOREIGN KEY (`fk_idProfesor`)
    REFERENCES `Profesor` (`idProfesor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_solicitud_profesor`
    FOREIGN KEY (`fk_idActividad`)
    REFERENCES `Solicitud` (`idActividad`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
) ENGINE=InnoDB;

-- Crear tabla MedioTransporteUtiliza
CREATE TABLE IF NOT EXISTS `MedioTransporteUtiliza` (
  `idTransporte` INT NOT NULL,
  `idActividad` INT NOT NULL,
  `horaInicio` TIME NOT NULL,
  PRIMARY KEY (`idTransporte`, `idActividad`),
  CONSTRAINT `fk_transporte_actividad`
    FOREIGN KEY (`idTransporte`)
    REFERENCES `MedioTransporte` (`idTransporte`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_actividad_transporte`
    FOREIGN KEY (`idActividad`)
    REFERENCES `Solicitud` (`idActividad`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
) ENGINE=InnoDB;

-- Restaurar configuraciones originales
SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
