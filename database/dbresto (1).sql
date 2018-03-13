-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 13, 2018 at 07:05 PM
-- Server version: 10.1.30-MariaDB
-- PHP Version: 7.2.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbresto`
--

-- --------------------------------------------------------

--
-- Table structure for table `menu`
--

CREATE TABLE `menu` (
  `id_menu` int(11) NOT NULL,
  `nama_menu` varchar(30) NOT NULL,
  `harga_menu` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `menu`
--

INSERT INTO `menu` (`id_menu`, `nama_menu`, `harga_menu`) VALUES
(1, 'Seblak original', '7000'),
(2, 'Seblak mi', '10000'),
(3, 'Mi goreng', '12000'),
(4, 'Seblak bakso ', '20000');

-- --------------------------------------------------------

--
-- Table structure for table `minuman`
--

CREATE TABLE `minuman` (
  `id_minuman` smallint(6) NOT NULL,
  `nama_minuman` varchar(30) NOT NULL,
  `harga` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `minuman`
--

INSERT INTO `minuman` (`id_minuman`, `nama_minuman`, `harga`) VALUES
(1, 'susu coklat', '10000'),
(2, 'es coklat', '5000');

-- --------------------------------------------------------

--
-- Table structure for table `pesanan`
--

CREATE TABLE `pesanan` (
  `id_daftar_pesanan` int(11) NOT NULL,
  `id_pesanan` int(11) NOT NULL,
  `id_menu` int(11) DEFAULT NULL,
  `id_pesan_toping` int(11) DEFAULT NULL,
  `id_minuman` smallint(6) DEFAULT NULL,
  `level` tinyint(4) DEFAULT NULL,
  `harga_bayar` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pesanan`
--

INSERT INTO `pesanan` (`id_daftar_pesanan`, `id_pesanan`, `id_menu`, `id_pesan_toping`, `id_minuman`, `level`, `harga_bayar`) VALUES
(3, 2, NULL, NULL, 1, NULL, '10000'),
(4, 2, NULL, NULL, 1, NULL, '10000'),
(5, 2, NULL, NULL, 1, NULL, '10000'),
(6, 2, NULL, NULL, 1, NULL, '10000'),
(7, 3, NULL, NULL, 1, NULL, '10000'),
(8, 3, NULL, NULL, 1, NULL, '10000'),
(9, 3, NULL, NULL, 1, NULL, '10000'),
(10, 3, NULL, NULL, 1, NULL, '10000'),
(11, 3, NULL, NULL, 1, NULL, '10000'),
(12, 3, NULL, NULL, 1, NULL, '10000'),
(13, 3, NULL, NULL, 1, NULL, '10000'),
(14, 3, NULL, NULL, 1, NULL, '10000'),
(15, 3, NULL, NULL, 1, NULL, '10000'),
(16, 3, NULL, NULL, 1, NULL, '10000'),
(17, 3, NULL, NULL, 1, NULL, '10000'),
(18, 3, NULL, NULL, 1, NULL, '10000'),
(19, 3, NULL, NULL, 1, NULL, '10000'),
(20, 3, NULL, NULL, 1, NULL, '10000'),
(21, 3, NULL, NULL, 1, NULL, '10000'),
(22, 3, NULL, NULL, 1, NULL, '10000'),
(23, 3, NULL, NULL, 1, NULL, '10000'),
(24, 3, NULL, NULL, 1, NULL, '10000'),
(32, 3, NULL, NULL, 1, NULL, '10000'),
(33, 3, NULL, NULL, 1, NULL, '10000'),
(34, 3, NULL, NULL, 1, NULL, '10000'),
(35, 3, NULL, NULL, 1, NULL, '10000'),
(36, 4, 1, NULL, NULL, 3, '7000'),
(37, 5, 2, 2, NULL, 1, '10000.0'),
(38, 5, NULL, NULL, 1, NULL, '10000'),
(39, 6, 1, 7, NULL, 1, '12000.0'),
(40, 6, 1, 8, NULL, 1, '12000.0'),
(41, 7, 0, 8, NULL, 3, '9000.0'),
(42, 7, NULL, NULL, 1, NULL, '10000'),
(43, 7, NULL, NULL, 1, NULL, '10000'),
(44, 7, NULL, NULL, 1, NULL, '10000'),
(45, 7, NULL, NULL, 1, NULL, '10000'),
(46, 7, NULL, NULL, 1, NULL, '10000'),
(47, 7, 1, 8, NULL, 1, '10000.0'),
(48, 7, 3, 8, NULL, 1, '22000.0'),
(49, 8, 0, 9, NULL, 1, '9000.0'),
(50, 8, NULL, NULL, 1, NULL, '10000'),
(51, 8, 2, 9, NULL, 1, '14000.0');

-- --------------------------------------------------------

--
-- Table structure for table `pesan_toping`
--

CREATE TABLE `pesan_toping` (
  `id_table_toping` int(11) NOT NULL,
  `id_pesan_toping` int(11) NOT NULL,
  `id_toping` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pesan_toping`
--

INSERT INTO `pesan_toping` (`id_table_toping`, `id_pesan_toping`, `id_toping`) VALUES
(3, 1, 15),
(4, 7, 2),
(7, 7, 2),
(8, 8, 2),
(9, 8, 3);

-- --------------------------------------------------------

--
-- Table structure for table `toping`
--

CREATE TABLE `toping` (
  `id_toping` int(11) NOT NULL,
  `nama_toping` varchar(30) NOT NULL,
  `harga_toping` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `toping`
--

INSERT INTO `toping` (`id_toping`, `nama_toping`, `harga_toping`) VALUES
(1, 'susu', '2000'),
(2, 'bakso', '2000'),
(3, 'makaroni', '2000'),
(4, 'spageti', '2000'),
(5, 'mi', '2000'),
(6, 'cilot', '2000'),
(7, 'krupuk', '2000'),
(8, 'ceker', '2000'),
(9, 'tulang', '2000'),
(10, 'daging', '2000'),
(11, 'ikan', '2000'),
(12, 'cumi', '2000'),
(13, 'somay', '2000'),
(14, 'jeroan', '2000'),
(15, 'kerang', '2000'),
(16, 'gurita', '2000');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`id_menu`);

--
-- Indexes for table `minuman`
--
ALTER TABLE `minuman`
  ADD PRIMARY KEY (`id_minuman`);

--
-- Indexes for table `pesanan`
--
ALTER TABLE `pesanan`
  ADD PRIMARY KEY (`id_daftar_pesanan`),
  ADD KEY `id_minuman` (`id_minuman`),
  ADD KEY `id_menu` (`id_menu`);

--
-- Indexes for table `pesan_toping`
--
ALTER TABLE `pesan_toping`
  ADD PRIMARY KEY (`id_table_toping`),
  ADD KEY `id_toping` (`id_toping`);

--
-- Indexes for table `toping`
--
ALTER TABLE `toping`
  ADD PRIMARY KEY (`id_toping`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pesanan`
--
ALTER TABLE `pesanan`
  MODIFY `id_daftar_pesanan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=52;

--
-- AUTO_INCREMENT for table `pesan_toping`
--
ALTER TABLE `pesan_toping`
  MODIFY `id_table_toping` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `pesan_toping`
--
ALTER TABLE `pesan_toping`
  ADD CONSTRAINT `pesan_toping_ibfk_1` FOREIGN KEY (`id_toping`) REFERENCES `toping` (`id_toping`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
