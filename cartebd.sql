-- phpMyAdmin SQL Dump
-- version 3.5.7
-- http://www.phpmyadmin.net
--
-- Client: localhost
-- Généré le: Mer 29 Janvier 2014 à 22:51
-- Version du serveur: 5.5.29
-- Version de PHP: 5.4.10

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Base de données: `cakestore`
--

-- --------------------------------------------------------

--
-- Structure de la table `card`
--

CREATE TABLE `card` (
  `num_carte` int(11) NOT NULL,
  `type_carte` varchar(20) NOT NULL,
  `date_exp` date NOT NULL,
  `nom_carte` varchar(40) NOT NULL,
  `CVV` int(11) NOT NULL,
  `solde` float NOT NULL,
  PRIMARY KEY (`num_carte`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
