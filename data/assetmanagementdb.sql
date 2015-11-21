-- phpMyAdmin SQL Dump
-- version 4.4.3
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Nov 21, 2015 at 03:34 AM
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
  `ID` int(255) NOT NULL,
  `Kategori` varchar(200) NOT NULL,
  `Tanggal_Masuk` date NOT NULL,
  `Kondisi` enum('BAIK','RUSAK','BUTUH PERBAIKAN') NOT NULL DEFAULT 'BAIK',
  `Institusi` varchar(200) NOT NULL,
  `Jenis` varchar(200) NOT NULL,
  `IDVendor` int(255) NOT NULL,
  `Harga` int(100) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `asset`
--

INSERT INTO `asset` (`ID`, `Kategori`, `Tanggal_Masuk`, `Kondisi`, `Institusi`, `Jenis`, `IDVendor`, `Harga`) VALUES
(1, 'Peralatan', '2015-11-20', 'BAIK', 'Peminjaman', 'Kursi Jati', 1, 200000),
(2, 'Peralatan', '2015-11-20', 'BAIK', 'lalalala', 'Komputer PC', 2, 5000000),
(3, 'Fixed Asset', '2015-11-21', 'BAIK', 'Perijinan', 'Bangunan', 2, 1000000000);

-- --------------------------------------------------------

--
-- Table structure for table `maintenance`
--

CREATE TABLE IF NOT EXISTS `maintenance` (
  `IDVendor` int(255) NOT NULL,
  `IDAsset` int(255) NOT NULL,
  `Jadwal` int(10) NOT NULL,
  `Catatan` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `vendor`
--

CREATE TABLE IF NOT EXISTS `vendor` (
  `ID` int(255) NOT NULL,
  `Nama` varchar(200) NOT NULL,
  `Alamat` varchar(400) NOT NULL,
  `Kontak` varchar(200) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vendor`
--

INSERT INTO `vendor` (`ID`, `Nama`, `Alamat`, `Kontak`) VALUES
(1, 'Kayu Mebel Sejati', 'Bandung', '08123456789'),
(2, 'Komputerindo', 'Bandung', '08123456780');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `asset`
--
ALTER TABLE `asset`
  ADD PRIMARY KEY (`ID`,`Institusi`);

--
-- Indexes for table `maintenance`
--
ALTER TABLE `maintenance`
  ADD PRIMARY KEY (`IDVendor`,`IDAsset`),
  ADD KEY `IDAsset` (`IDAsset`);

--
-- Indexes for table `vendor`
--
ALTER TABLE `vendor`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `asset`
--
ALTER TABLE `asset`
  MODIFY `ID` int(255) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `vendor`
--
ALTER TABLE `vendor`
  MODIFY `ID` int(255) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `maintenance`
--
ALTER TABLE `maintenance`
  ADD CONSTRAINT `maintenance_ibfk_1` FOREIGN KEY (`IDVendor`) REFERENCES `vendor` (`ID`),
  ADD CONSTRAINT `maintenance_ibfk_2` FOREIGN KEY (`IDAsset`) REFERENCES `asset` (`ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
