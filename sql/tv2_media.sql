-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Vært: 127.0.0.1:33067
-- Genereringstid: 18. 12 2018 kl. 11:14:44
-- Serverversion: 5.6.40-log
-- PHP-version: 5.5.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tv2 media`
--

-- --------------------------------------------------------

--
-- Struktur-dump for tabellen `artikel`
--

CREATE TABLE IF NOT EXISTS `artikel` (
  `author` varchar(255) NOT NULL,
  `articleText` mediumtext NOT NULL,
  `picture` longblob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur-dump for tabellen `billede`
--

CREATE TABLE IF NOT EXISTS `billede` (
  `fileType` varchar(255) NOT NULL,
  `width` int(255) NOT NULL,
  `height` int(255) NOT NULL,
  `photographer` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur-dump for tabellen `video`
--

CREATE TABLE IF NOT EXISTS `video` (
  `fileType` varchar(255) NOT NULL,
  `videoLenght` varchar(255) NOT NULL,
  `resolution` varchar(255) NOT NULL,
  `photographer` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
