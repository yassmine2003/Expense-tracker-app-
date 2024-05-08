-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: spendsmart
-- ------------------------------------------------------
-- Server version	8.0.36

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `charge`
--

DROP TABLE IF EXISTS `charge`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `charge` (
  `chargeID` int NOT NULL AUTO_INCREMENT,
  `budgetMensuel` double DEFAULT NULL,
  `mois` text,
  `montantCharge` double DEFAULT NULL,
  `expenseID` int DEFAULT NULL,
  `userID` int DEFAULT NULL,
  PRIMARY KEY (`chargeID`),
  KEY `fk_expenseID` (`expenseID`),
  CONSTRAINT `fk_expenseID` FOREIGN KEY (`expenseID`) REFERENCES `depense` (`expenseID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `charge`
--

LOCK TABLES `charge` WRITE;
/*!40000 ALTER TABLE `charge` DISABLE KEYS */;
INSERT INTO `charge` VALUES (1,23,'23',34,NULL,NULL),(2,12,'4',23,NULL,NULL),(3,34,'4',23,NULL,NULL),(4,34,'3',234,NULL,NULL),(5,120,'4.0',12,NULL,1),(6,120,'4.0',12,NULL,1),(7,120,'4.0',12,NULL,1);
/*!40000 ALTER TABLE `charge` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `depense`
--

DROP TABLE IF EXISTS `depense`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `depense` (
  `expenseID` int NOT NULL AUTO_INCREMENT,
  `montant` double DEFAULT NULL,
  `date` date DEFAULT NULL,
  `description` text,
  `typeExpense` text,
  `userID` int DEFAULT NULL,
  `chargeID` int DEFAULT NULL,
  PRIMARY KEY (`expenseID`),
  KEY `fk_userID` (`userID`),
  KEY `fk_chargeID` (`chargeID`),
  CONSTRAINT `fk_chargeID` FOREIGN KEY (`chargeID`) REFERENCES `charge` (`chargeID`),
  CONSTRAINT `fk_userID` FOREIGN KEY (`userID`) REFERENCES `utilisateur` (`userID`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `depense`
--

LOCK TABLES `depense` WRITE;
/*!40000 ALTER TABLE `depense` DISABLE KEYS */;
INSERT INTO `depense` VALUES (1,123,'2024-05-04','we','Utilities ',NULL,NULL),(2,123,'2024-05-04','we','Utilities ',NULL,NULL),(3,123,'2024-05-03','e','Utilities ',NULL,NULL),(4,1233,'2024-05-08','1e','Transportation ',NULL,NULL),(5,123,'2024-05-10','fdd','Insurance ',NULL,NULL),(6,12,'2024-05-02','ed','Insurance ',NULL,NULL),(7,123,'2024-05-02','ed','Transportation ',NULL,NULL),(8,12,'2024-05-10','34r','Transportation ',NULL,NULL),(9,123,'2024-05-01','xyz','Insurance ',NULL,NULL),(10,123,'2024-05-02','df','Utilities ',NULL,NULL),(11,123,'2024-05-01','et','Insurance ',NULL,NULL),(12,123,'2024-05-02','df','Utilities ',NULL,NULL),(13,123,'2024-05-02','fggf','Insurance ',NULL,NULL),(14,123,'2024-05-07','gshs','Utilities ',NULL,NULL),(15,123,'2024-05-01','sx','Rent',NULL,NULL),(16,12,'2024-05-05','sjjxn','Rent',NULL,NULL),(17,123,'2024-05-02','fgg','Rent',NULL,NULL),(18,123,'2024-05-02','fgg','Rent',NULL,NULL),(19,1235,'2024-05-17','ftd','Rent',NULL,NULL),(20,1235,'2024-05-17','ftd','Rent',NULL,NULL),(21,1235,'2024-05-17','ftd','Rent',NULL,NULL),(22,1235,'2024-05-17','fuck','Rent',NULL,NULL),(23,123,'2024-05-01','imane','Rent',NULL,NULL),(24,456,'2024-05-04','salma','Utilities ',NULL,NULL),(25,123,'2024-05-04','hahshs','Rent',NULL,NULL),(26,123,'2024-05-23','wahs','Travel expenses',NULL,NULL),(27,123,'2024-05-23','wff','Travel expenses',NULL,NULL),(28,123,'2024-05-05','wsss','Utilities ',NULL,NULL),(29,1256,'2024-05-08','dyeha','Utilities ',NULL,NULL),(30,877,'2024-05-08','teag','Rent',NULL,NULL),(32,1234,'2024-05-03','heyksks','Insurance ',NULL,NULL),(34,123,'2024-05-10','dlak','Insurance ',NULL,NULL),(35,123,'2024-05-10','jh','Grocery expenses',NULL,NULL),(36,123,'2024-05-10','hs','Grocery expenses',NULL,NULL),(37,1234,'2024-05-02','jhope','Insurance ',NULL,NULL),(38,1234,'2024-05-02','salma','Insurance ',NULL,NULL),(39,12,'2024-05-02','candy','Home ',NULL,NULL),(40,150,'2024-05-03','coke','Utilities ',NULL,NULL),(41,123,'2024-05-03','sa','Home ',1,NULL),(42,278,'2024-05-18','hya','Insurance ',1,NULL),(43,123,'2024-05-04','sa','Home ',1,NULL),(44,123,'2024-05-04','bruhh','Home ',1,NULL),(45,23,'2024-05-04','bruhh','Home ',1,NULL),(46,23,'2024-05-16','bruhh','Transportation ',1,NULL),(49,123,'2024-05-02','sa','Home ',1,NULL),(50,1233,'2024-05-10','sdzsd','Grocery expenses',3,NULL);
/*!40000 ALTER TABLE `depense` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `utilisateur`
--

DROP TABLE IF EXISTS `utilisateur`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `utilisateur` (
  `userID` int NOT NULL AUTO_INCREMENT,
  `prenom` text,
  `nom` text,
  `username` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `password` text,
  `chargeID` int DEFAULT NULL,
  `expenseID` int DEFAULT NULL,
  PRIMARY KEY (`userID`),
  UNIQUE KEY `username` (`username`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `utilisateur`
--

LOCK TABLES `utilisateur` WRITE;
/*!40000 ALTER TABLE `utilisateur` DISABLE KEYS */;
INSERT INTO `utilisateur` VALUES (1,'zine','salma','karma','salmazine2021@gmail.com','123',NULL,NULL),(3,'las','imane','imane','dsjc','123',NULL,NULL),(4,'salma','salma','xyz','skxzn','123',NULL,NULL);
/*!40000 ALTER TABLE `utilisateur` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-08  3:34:51
