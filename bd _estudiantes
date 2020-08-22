CREATE DATABASE  IF NOT EXISTS `estudiantes` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `estudiantes`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: estudiantes
-- ------------------------------------------------------
-- Server version	5.5.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `estudiante`
--

DROP TABLE IF EXISTS `estudiante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estudiante` (
  `id_carnet` varchar(12) NOT NULL,
  `documento` varchar(15) NOT NULL,
  `Tipo_doc` varchar(10) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `sexo` varchar(2) NOT NULL,
  PRIMARY KEY (`id_carnet`),
  KEY `cod_tipodoc_idx` (`Tipo_doc`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estudiante`
--

LOCK TABLES `estudiante` WRITE;
/*!40000 ALTER TABLE `estudiante` DISABLE KEYS */;
INSERT INTO `estudiante` VALUES ('121020','12102356','CC','carlos','martinez','M'),('12102012','32658974','TI','carlos martin','sanches torrez','M'),('12102018','103018251','CC','andres eduardo','damian florez','M'),('12102023','103256985','CC','carlos ','martines','M');
/*!40000 ALTER TABLE `estudiante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `materia`
--

DROP TABLE IF EXISTS `materia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `materia` (
  `id_materia` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_materia` varchar(20) NOT NULL,
  `intensidad_horaria` int(11) NOT NULL,
  PRIMARY KEY (`id_materia`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materia`
--

LOCK TABLES `materia` WRITE;
/*!40000 ALTER TABLE `materia` DISABLE KEYS */;
INSERT INTO `materia` VALUES (1,'matematicas',4),(2,'español',1),(3,'quimica',1),(4,'historia',1),(5,'geografia',5);
/*!40000 ALTER TABLE `materia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `materiaxestudiante`
--

DROP TABLE IF EXISTS `materiaxestudiante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `materiaxestudiante` (
  `cod_carnet` varchar(12) NOT NULL,
  `cod_materia` int(11) NOT NULL,
  PRIMARY KEY (`cod_carnet`,`cod_materia`),
  KEY `ctr_carnet_idx` (`cod_carnet`),
  KEY `ctr_mat_idx` (`cod_materia`),
  KEY `ctr_est_idx` (`cod_carnet`),
  CONSTRAINT `ctr_est` FOREIGN KEY (`cod_carnet`) REFERENCES `estudiante` (`id_carnet`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ctr_mat` FOREIGN KEY (`cod_materia`) REFERENCES `materia` (`id_materia`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materiaxestudiante`
--

LOCK TABLES `materiaxestudiante` WRITE;
/*!40000 ALTER TABLE `materiaxestudiante` DISABLE KEYS */;
INSERT INTO `materiaxestudiante` VALUES ('12102018',1),('12102018',2),('12102023',2),('121020',3),('12102012',3),('12102018',3),('12102023',3),('12102018',4),('121020',5),('12102012',5),('12102018',5);
/*!40000 ALTER TABLE `materiaxestudiante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nota`
--

DROP TABLE IF EXISTS `nota`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nota` (
  `cod_carnetnota` varchar(12) NOT NULL,
  `cod_materianota` int(11) NOT NULL,
  `nota` float NOT NULL,
  PRIMARY KEY (`cod_carnetnota`,`cod_materianota`),
  KEY `ctr_codmatxest_idx` (`cod_materianota`),
  KEY `cod_mates_idx` (`cod_materianota`),
  KEY `codestrt_idx` (`cod_materianota`,`cod_carnetnota`),
  CONSTRAINT `codestrt` FOREIGN KEY (`cod_materianota`, `cod_carnetnota`) REFERENCES `materiaxestudiante` (`cod_materia`, `cod_carnet`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `cod_mates` FOREIGN KEY (`cod_materianota`) REFERENCES `materiaxestudiante` (`cod_materia`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nota`
--

LOCK TABLES `nota` WRITE;
/*!40000 ALTER TABLE `nota` DISABLE KEYS */;
INSERT INTO `nota` VALUES ('121020',3,3.5),('121020',5,4),('12102012',3,2.5),('12102012',5,2.5),('12102018',1,3.5),('12102018',2,3);
/*!40000 ALTER TABLE `nota` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-02-02 22:45:11
