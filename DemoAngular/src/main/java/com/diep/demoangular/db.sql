-- Dumping database structure for concretepage
CREATE DATABASE IF NOT EXISTS `concretepage`;
USE `concretepage`;
-- Dumping structure for table concretepage.articles
CREATE TABLE IF NOT EXISTS `articles` (
  `article_id` int(5) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) NOT NULL,
  `category` varchar(100) NOT NULL,
  PRIMARY KEY (`article_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
-- Dumping data for table concretepage.articles: ~4 rows (approximately)
/*!40000 ALTER TABLE `articles` DISABLE KEYS */;
INSERT INTO `articles` (`article_id`, `title`, `category`) VALUES
	(1, 'Angular 2 Tutorial using CLI', 'Angular'),
	(2, 'Spring Boot Getting Started', 'Spring Boot'),
	(3, 'Lambda Expressions Java 8 Example', 'Java 8'),
	(4, 'Android AsyncTask Example', 'Android'); 