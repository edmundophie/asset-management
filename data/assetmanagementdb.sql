-- phpMyAdmin SQL Dump
-- version 4.4.3
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 02, 2015 at 06:52 AM
-- Server version: 5.6.24
-- PHP Version: 5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `assetmanagementdb`
--
CREATE DATABASE IF NOT EXISTS `assetmanagementdb` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `assetmanagementdb`;

-- --------------------------------------------------------

--
-- Table structure for table `asset`
--

CREATE TABLE IF NOT EXISTS `asset` (
  `id` int(255) NOT NULL,
  `nama` varchar(200) NOT NULL,
  `kategori` varchar(200) NOT NULL,
  `jenis` varchar(200) NOT NULL,
  `tanggal_masuk` date NOT NULL,
  `kondisi` enum('BAIK','RUSAK','BUTUH PERBAIKAN') NOT NULL DEFAULT 'BAIK',
  `pemilik` varchar(200) NOT NULL,
  `id_vendor` int(255) NOT NULL,
  `harga` varchar(200) NOT NULL,
  `is_public` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `fasilitas_aset`
--

CREATE TABLE IF NOT EXISTS `fasilitas_aset` (
  `id_aset` int(11) NOT NULL,
  `id_fasilitas` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `kebutuhan_logistik_maintenance`
--

CREATE TABLE IF NOT EXISTS `kebutuhan_logistik_maintenance` (
  `id_aset` int(11) NOT NULL,
  `id_logistik` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `maintenance`
--

CREATE TABLE IF NOT EXISTS `maintenance` (
  `id_aset` int(255) NOT NULL,
  `siklus` int(10) NOT NULL,
  `satuan_waktu_siklus` enum('SECONDS','HOURS','MINUTES','DAYS','MONTHS','YEARS') NOT NULL,
  `keterangan` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `vendor`
--

CREATE TABLE IF NOT EXISTS `vendor` (
  `id` int(255) NOT NULL,
  `nama` varchar(200) NOT NULL,
  `alamat` text NOT NULL,
  `telepon` varchar(200) NOT NULL,
  `email` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `asset`
--
ALTER TABLE `asset`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `fasilitas_aset`
--
ALTER TABLE `fasilitas_aset`
  ADD PRIMARY KEY (`id_aset`,`id_fasilitas`),
  ADD KEY `id_fasilitas` (`id_fasilitas`);

--
-- Indexes for table `kebutuhan_logistik_maintenance`
--
ALTER TABLE `kebutuhan_logistik_maintenance`
  ADD PRIMARY KEY (`id_aset`,`id_logistik`);

--
-- Indexes for table `maintenance`
--
ALTER TABLE `maintenance`
  ADD PRIMARY KEY (`id_aset`);

--
-- Indexes for table `vendor`
--
ALTER TABLE `vendor`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `asset`
--
ALTER TABLE `asset`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `vendor`
--
ALTER TABLE `vendor`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `fasilitas_aset`
--
ALTER TABLE `fasilitas_aset`
  ADD CONSTRAINT `fasilitas_aset_ibfk_1` FOREIGN KEY (`id_aset`) REFERENCES `asset` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fasilitas_aset_ibfk_2` FOREIGN KEY (`id_fasilitas`) REFERENCES `asset` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `kebutuhan_logistik_maintenance`
--
ALTER TABLE `kebutuhan_logistik_maintenance`
  ADD CONSTRAINT `kebutuhan_logistik_maintenance_ibfk_1` FOREIGN KEY (`id_aset`) REFERENCES `asset` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `maintenance`
--
ALTER TABLE `maintenance`
  ADD CONSTRAINT `maintenance_ibfk_2` FOREIGN KEY (`id_aset`) REFERENCES `asset` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
