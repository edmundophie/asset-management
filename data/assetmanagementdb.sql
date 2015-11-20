-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 20, 2015 at 08:26 PM
-- Server version: 10.1.8-MariaDB
-- PHP Version: 5.6.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `assetmanagementdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `asset`
--

CREATE TABLE `asset` (
  `ID` int(255) NOT NULL,
  `Kategori` varchar(200) NOT NULL,
  `Tanggal_Masuk` date NOT NULL,
  `Kondisi` varchar(200) NOT NULL DEFAULT 'Baik',
  `Institusi` varchar(200) NOT NULL,
  `Jenis` varchar(200) NOT NULL,
  `IDVendor` int(255) NOT NULL,
  `Harga` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `asset`
--

INSERT INTO `asset` (`ID`, `Kategori`, `Tanggal_Masuk`, `Kondisi`, `Institusi`, `Jenis`, `IDVendor`, `Harga`) VALUES
(1, 'Peralatan', '2015-11-20', 'Baik', 'Peminjaman', 'Kursi Jati', 1, 200000),
(2, 'Peralatan', '2015-11-20', 'Baik', 'lalalala', 'Komputer PC', 2, 5000000),
(3, 'Fixed Asset', '2015-11-21', 'Baik', 'Perijinan', 'Bangunan', 2, 1000000000);

-- --------------------------------------------------------

--
-- Table structure for table `maintenance`
--

CREATE TABLE `maintenance` (
  `ID` int(255) NOT NULL,
  `IDVendor` int(255) NOT NULL,
  `IDAsset` int(255) NOT NULL,
  `Jadwal` int(10) NOT NULL,
  `Catatan` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `vendor`
--

CREATE TABLE `vendor` (
  `ID` int(255) NOT NULL,
  `Nama` varchar(200) NOT NULL,
  `Alamat` varchar(400) NOT NULL,
  `Kontak` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
  ADD PRIMARY KEY (`ID`);

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
  MODIFY `ID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `maintenance`
--
ALTER TABLE `maintenance`
  MODIFY `ID` int(255) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `vendor`
--
ALTER TABLE `vendor`
  MODIFY `ID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
