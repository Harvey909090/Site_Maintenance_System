-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 12, 2022 at 01:53 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `site_maintenance`
--

-- --------------------------------------------------------

--
-- Table structure for table `sites`
--

CREATE TABLE `sites` (
  `sr` int(11) NOT NULL,
  `attndnc` varchar(45) DEFAULT NULL,
  `work` varchar(45) DEFAULT NULL,
  `assignTime` varchar(45) DEFAULT NULL,
  `assignStatus` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `sites`
--

INSERT INTO `sites` (`sr`, `attndnc`, `work`, `assignTime`, `assignStatus`) VALUES
(2, 'zain', 'xsankl', 'Tue Jan 17 10:17:45 PST 2017', 'Not Available'),
(2, 'presenT', 'ghr n jana', 'Wed Jan 18 22:34:36 PST 2017', 'Not Available');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `srno` int(11) NOT NULL,
  `id` varchar(45) DEFAULT NULL,
  `pass` varchar(45) DEFAULT NULL,
  `question` varchar(45) DEFAULT NULL,
  `answer` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `date_time` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`srno`, `id`, `pass`, `question`, `answer`, `name`, `status`, `date_time`) VALUES
(1, 'hamza', '6789', 'What is your dream?', 'Being a successfull Programmer', 'Hamza Yasin', 'Admin', 'Wed Jan 18 21:08:40 PST 2017');

-- --------------------------------------------------------

--
-- Table structure for table `engineers`
--

CREATE TABLE `engineers` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `emrgnc_name` varchar(45) DEFAULT NULL,
  `emrgnc_phone` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `dob` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `emp_pic` longblob DEFAULT NULL,
  `post` varchar(45) DEFAULT NULL,
  `salary` double DEFAULT NULL,
  `timing` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `engineers`
--

INSERT INTO `engineers` (`id`, `name`, `phone`, `emrgnc_name`, `emrgnc_phone`, `address`, `dob`, `email`, `emp_pic`, `post`, `salary`, `timing`) VALUES
(2, 'hamza ', '232323', 'zain', '2232', 'lahore', '6 / Jul / Year', 'hamxayaxin@gmail.com', 'designer', 21222, 'Day / Month / Year');
INSERT INTO `engineers` (`id`, `name`, `phone`, `emrgnc_name`, `emrgnc_phone`, `address`, `dob`, `email`, `emp_pic`, `post`, `salary`, `timing`) VALUES
(3, 'zain', '232', 'Mustafa', '789', 'qwew', '17 / Jan / 2017', 'zain', 'Manager', 100000, 'Day / Month / Year');

-- --------------------------------------------------------

--
-- Table structure for table `salary`
--

CREATE TABLE `salary` (
  `sr` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `post` varchar(45) DEFAULT NULL,
  `month` varchar(45) DEFAULT NULL,
  `days` int(11) DEFAULT NULL,
  `advance` double DEFAULT NULL,
  `deduction` double DEFAULT NULL,
  `net_salary` double DEFAULT NULL,
  `date` varchar(45) DEFAULT NULL,
  `gross_salary` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `salary`
--

INSERT INTO `salary` (`sr`, `name`, `post`, `month`, `days`, `advance`, `deduction`, `net_salary`, `date`, `gross_salary`) VALUES
(2, 'hamza ', 'designer', 'Jan', 1, 2, 2, 21222, 'Tue Jan 17 11:28:15 PST 2017', 21218),
(2, 'hamza ', 'designer', 'Jan', 8, 2, 2, 21222, 'Tue Jan 17 11:29:08 PST 2017', 21218),
(3, 'zain', 'Manager', 'Jan', 4, 21, 32, 100000, 'Tue Jan 17 11:30:16 PST 2017', 99947),
(3, 'zain', 'Manager', 'Jun', 8, 10, 10, 100000, 'Tue Jan 17 11:32:16 PST 2017', 99980),
(3, 'zain', 'Manager', 'Jan', 1, 3, 3, 100000, 'Tue Jan 17 11:33:52 PST 2017', 99994),
(3, 'zain', 'Manager', 'Jan', 1, 3, 3, 100000, 'Tue Jan 17 11:34:13 PST 2017', 99994),
(3, 'zain', 'Manager', 'Jan', 1, 3, 3, 100000, 'Tue Jan 17 11:34:38 PST 2017', 99994),
(3, 'zain', 'Manager', 'Jan', 1, 3, 3, 100000, 'Tue Jan 17 11:34:40 PST 2017', 99994),
(3, 'zain', 'Manager', 'Jan', 1, 3, 3, 100000, 'Tue Jan 17 11:34:43 PST 2017', 99994),
(3, 'zain', 'Manager', 'Jan', 1, 3, 3, 100000, 'Tue Jan 17 11:34:46 PST 2017', 99994),
(3, 'zain', 'Manager', 'Jan', 1, 3, 3, 100000, 'Tue Jan 17 11:34:52 PST 2017', 99994),
(2, 'hamza ', 'designer', 'Jan', 1, 100, 105, 21222, 'Wed Jan 18 22:35:22 PST 2017', 21017),
(2, 'hamza ', 'designer', 'Jan', 30, 100, 105, 21222, 'Wed Jan 18 22:35:58 PST 2017', 21017),
(2, 'hamza ', 'designer', 'Jan', 1, 1, 1, 21222, 'Wed Jan 18 23:11:43 PST 2017', 21220);

-- --------------------------------------------------------

--
-- Table structure for table `upload_Engineer_Details`
--

CREATE TABLE `upload_Engineer_Details` (
  `id` int(11) NOT NULL,
  `description` varchar(45) DEFAULT NULL,
  `upload_date` varchar(45) DEFAULT NULL,
  `developer_name` varchar(45) DEFAULT NULL,
  `designer_name` varchar(45) DEFAULT NULL,
  `game_link` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `sites`
--
ALTER TABLE `sites`
  ADD KEY `id_idx` (`sr`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`srno`);

--
-- Indexes for table `engineers`
--
ALTER TABLE `engineers`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `salary`
--
ALTER TABLE `salary`
  ADD KEY `id_idx` (`sr`),
  ADD KEY `sr_idx` (`sr`),
  ADD KEY `post_idx` (`post`);

--
-- Indexes for table `upload_Engineer_Details`
--
ALTER TABLE `upload_Engineer_Details`
  ADD PRIMARY KEY (`id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `sites`
--
ALTER TABLE `sites`
  ADD CONSTRAINT `sr` FOREIGN KEY (`sr`) REFERENCES `engineers` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;