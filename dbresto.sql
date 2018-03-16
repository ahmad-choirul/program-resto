-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 16 Mar 2018 pada 15.35
-- Versi Server: 10.1.19-MariaDB
-- PHP Version: 7.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
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
-- Struktur dari tabel `menu`
--

CREATE TABLE `menu` (
  `id_menu` int(11) NOT NULL,
  `nama_menu` varchar(30) NOT NULL,
  `harga_menu` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `menu`
--

INSERT INTO `menu` (`id_menu`, `nama_menu`, `harga_menu`) VALUES
(1, 'seblak original leutik', '7000'),
(2, 'Seblak original gede', '10000'),
(3, 'Mi gondah monah', '10000'),
(4, 'mie kroyok', '25000'),
(5, 'omlet seblak', '9000'),
(6, 'rujak cireng', '10000'),
(7, 'nasi gila', '10000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `minuman`
--

CREATE TABLE `minuman` (
  `id_minuman` smallint(6) NOT NULL,
  `nama_minuman` varchar(30) NOT NULL,
  `harga` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `minuman`
--

INSERT INTO `minuman` (`id_minuman`, `nama_minuman`, `harga`) VALUES
(1, 'es teh', '3000'),
(2, 'es teh jumbo', '5000'),
(3, 'es jeruk', '4000'),
(4, 'es jeruk jumbo', '6000'),
(5, 'es teh tarik', '6000'),
(6, 'es susu putih', '5000'),
(7, 'es susu coklat', '5000'),
(8, 'es capucino', '6000'),
(9, 'choco ice', '5000'),
(10, 'susu jeruk', '6000'),
(11, 'jabon beer / jamu', '5000'),
(12, 'ice lemon tea', '6000'),
(13, 'susu soda', '6000'),
(14, 'susu strawberry', '8000'),
(15, 'susu melon', '8000'),
(16, 'strawberry squash', '10000'),
(17, 'melon squash', '10000'),
(18, 'kopi hitam', '4000'),
(19, 'air mineral', '4000'),
(20, 'air es', '1000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pesanan`
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
-- Dumping data untuk tabel `pesanan`
--

INSERT INTO `pesanan` (`id_daftar_pesanan`, `id_pesanan`, `id_menu`, `id_pesan_toping`, `id_minuman`, `level`, `harga_bayar`) VALUES
(1, 1, 1, 1, 1, 2, '12000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pesan_toping`
--

CREATE TABLE `pesan_toping` (
  `id_table_toping` int(11) NOT NULL,
  `id_pesan_toping` int(11) NOT NULL,
  `id_toping` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pesan_toping`
--

INSERT INTO `pesan_toping` (`id_table_toping`, `id_pesan_toping`, `id_toping`) VALUES
(1, 1, 1);

-- --------------------------------------------------------

--
-- Struktur dari tabel `toping`
--

CREATE TABLE `toping` (
  `id_toping` int(11) NOT NULL,
  `nama_toping` varchar(30) NOT NULL,
  `harga_toping` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `toping`
--

INSERT INTO `toping` (`id_toping`, `nama_toping`, `harga_toping`) VALUES
(1, 'sosis', '2000'),
(2, 'baso', '2000'),
(3, 'kikil', '2000'),
(4, 'ceker', '2000'),
(5, 'mie', '2000'),
(6, 'kwetiau', '2000'),
(7, 'makaroni', '2000'),
(8, 'tulangan', '3000'),
(9, 'siomay', '3000'),
(10, 'batagor', '3000'),
(11, 'cuanki', '3000'),
(12, 'scallop', '3000'),
(13, 'salmon ball', '4000'),
(14, 'telur', '4000'),
(15, 'sayap', '4000'),
(16, 'crabstik', '4000'),
(17, 'fish cheese', '4000'),
(18, 'cigor', '4000'),
(19, 'jamur kuping', '3000'),
(20, 'otak2 singapur', '4000');

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
  MODIFY `id_daftar_pesanan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `pesan_toping`
--
ALTER TABLE `pesan_toping`
  MODIFY `id_table_toping` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `pesan_toping`
--
ALTER TABLE `pesan_toping`
  ADD CONSTRAINT `pesan_toping_ibfk_1` FOREIGN KEY (`id_toping`) REFERENCES `toping` (`id_toping`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
