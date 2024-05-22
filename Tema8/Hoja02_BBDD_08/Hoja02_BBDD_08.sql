CREATE DATABASE  IF NOT EXISTS 'java_02_clinica' 
USE 'java_02_clinica';


--
-- Table structure for table `pacientes`-> normalmente quitar las comillas simples que salen
-- También quito los charset, dejandosólo InnoDB
--

DROP TABLE IF EXISTS 'pacientes';
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE 'pacientes' (
  dni varchar(10) NOT NULL,
  nombre varchar(30) NOT NULL,
  telefono varchar(10) NOT NULL,
  PRIMARY KEY (dni)
) ENGINE=InnoDB;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `visitas`
--

DROP TABLE IF EXISTS 'visitas';
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE 'visitas' (
  id smallint NOT NULL AUTO_INCREMENT,
  dni varchar(10) NOT NULL,
  fecha date NOT NULL,
  tratamiento varchar(20) NOT NULL,
  observaciones varchar(300) NOT NULL,
  PRIMARY KEY (id),
  KEY fk_pacienteVisitas (dni),
  CONSTRAINT fk_pacientesvisitas FOREIGN KEY (dni) REFERENCES pacientes (dni)
) ENGINE=InnoDB;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `visitas`
--

LOCK TABLES visitas WRITE;
/*!40000 ALTER TABLE `visitas` DISABLE KEYS */;
/*!40000 ALTER TABLE `visitas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;


