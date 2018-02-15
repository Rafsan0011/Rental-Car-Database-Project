-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1:3307
-- Generation Time: Sep 01, 2017 at 11:48 PM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 5.5.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rent_a_car`
--

-- --------------------------------------------------------

--
-- Table structure for table `charges`
--

CREATE TABLE `charges` (
  `charges_id` int(10) NOT NULL,
  `fuel_charges` int(20) NOT NULL,
  `milage_charges` int(20) NOT NULL,
  `dropoff_charges` int(20) NOT NULL,
  `insurance_charges` int(20) NOT NULL,
  `other_charges` int(20) NOT NULL,
  `discount_percentage` int(10) NOT NULL,
  `reserv_id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `charges`
--

INSERT INTO `charges` (`charges_id`, `fuel_charges`, `milage_charges`, `dropoff_charges`, `insurance_charges`, `other_charges`, `discount_percentage`, `reserv_id`) VALUES
(1, 330, 16, 74, 35, 17, 30, 1),
(2, 253, 10, 88, 158, 153, 62, 2),
(3, 218, 30, 14, 220, 152, 58, 3),
(4, 436, 46, 63, 152, 40, 1, 4),
(5, 468, 18, 75, 297, 175, 77, 5),
(6, 451, 36, 58, 406, 189, 5, 6),
(7, 145, 13, 86, 277, 51, 5, 7),
(8, 6, 50, 38, 113, 57, 13, 8),
(9, 268, 18, 36, 299, 162, 5, 9),
(10, 358, 10, 58, 144, 116, 18, 10),
(11, 380, 25, 50, 51, 18, 66, 11),
(12, 306, 24, 77, 373, 182, 42, 12),
(13, 59, 26, 85, 341, 9, 11, 13),
(14, 78, 32, 59, 292, 72, 60, 14),
(15, 386, 10, 96, 229, 127, 6, 15),
(16, 354, 44, 32, 166, 75, 54, 16),
(17, 332, 46, 38, 408, 175, 40, 17),
(18, 93, 30, 75, 65, 150, 79, 18),
(19, 490, 6, 18, 56, 112, 30, 19),
(20, 224, 30, 12, 415, 66, 10, 20),
(21, 188, 25, 68, 478, 169, 40, 21),
(22, 397, 34, 21, 345, 150, 41, 22),
(23, 57, 20, 46, 376, 65, 44, 23),
(24, 281, 36, 11, 492, 1, 75, 24),
(25, 372, 24, 28, 434, 48, 33, 25),
(26, 272, 13, 58, 303, 161, 49, 26),
(27, 289, 38, 25, 195, 3, 54, 27),
(28, 150, 5, 83, 464, 110, 61, 28),
(29, 310, 9, 95, 397, 8, 56, 29),
(30, 430, 22, 43, 489, 197, 42, 30),
(31, 404, 25, 1, 414, 176, 31, 31),
(32, 265, 40, 13, 147, 101, 62, 32),
(33, 151, 43, 94, 194, 196, 31, 33),
(34, 315, 8, 89, 342, 143, 52, 34),
(35, 444, 32, 33, 28, 69, 1, 35),
(36, 244, 36, 80, 483, 98, 39, 36),
(37, 220, 50, 0, 308, 58, 74, 37),
(38, 241, 39, 22, 415, 91, 29, 38),
(39, 492, 41, 91, 424, 127, 49, 39),
(40, 136, 48, 90, 189, 139, 14, 40),
(41, 310, 25, 93, 76, 165, 35, 41),
(42, 213, 34, 29, 465, 124, 52, 42),
(43, 8, 6, 98, 74, 22, 43, 43),
(44, 41, 32, 17, 397, 53, 9, 44),
(45, 211, 33, 43, 292, 161, 49, 45),
(46, 88, 47, 42, 267, 62, 12, 46),
(47, 366, 22, 8, 45, 74, 10, 47),
(48, 26, 39, 15, 285, 77, 11, 48),
(49, 235, 34, 57, 215, 123, 37, 49),
(50, 112, 46, 96, 141, 67, 72, 50),
(51, 484, 14, 71, 487, 146, 23, 51),
(52, 467, 27, 76, 205, 188, 38, 52),
(53, 195, 18, 85, 471, 103, 63, 53),
(54, 443, 10, 19, 136, 137, 58, 54),
(55, 254, 14, 31, 328, 97, 64, 55),
(56, 199, 8, 59, 471, 153, 77, 56),
(57, 168, 9, 29, 152, 119, 1, 57),
(58, 260, 50, 63, 170, 83, 58, 58),
(59, 281, 16, 46, 273, 168, 4, 59),
(60, 155, 49, 80, 87, 119, 40, 60),
(61, 101, 36, 73, 296, 75, 21, 61),
(62, 371, 49, 99, 266, 92, 76, 62),
(63, 198, 42, 79, 372, 120, 68, 63),
(64, 411, 36, 47, 272, 71, 11, 64),
(65, 276, 27, 91, 74, 56, 5, 65),
(66, 294, 29, 26, 205, 133, 74, 66),
(67, 240, 8, 50, 258, 168, 56, 67),
(68, 250, 40, 14, 238, 167, 46, 68),
(69, 223, 48, 1, 49, 60, 54, 69),
(70, 123, 26, 99, 81, 74, 72, 70),
(71, 70, 36, 49, 143, 65, 60, 71),
(72, 374, 34, 61, 29, 3, 27, 72),
(73, 71, 49, 51, 438, 138, 39, 73),
(74, 147, 36, 6, 344, 200, 79, 74),
(75, 78, 7, 96, 397, 189, 56, 75),
(76, 452, 36, 17, 465, 66, 68, 76),
(77, 148, 32, 30, 450, 181, 21, 77),
(78, 375, 25, 96, 181, 2, 24, 78),
(79, 249, 6, 63, 321, 150, 77, 79),
(80, 31, 35, 11, 261, 94, 5, 80),
(81, 443, 17, 83, 410, 70, 68, 81),
(82, 465, 28, 3, 482, 188, 61, 82),
(83, 43, 24, 86, 193, 161, 3, 83),
(84, 50, 21, 83, 213, 194, 55, 84),
(85, 167, 25, 6, 470, 184, 10, 85),
(86, 65, 12, 53, 415, 33, 32, 86),
(87, 494, 14, 48, 447, 151, 34, 87),
(88, 415, 43, 97, 168, 51, 43, 88),
(89, 13, 28, 9, 8, 2, 14, 89),
(90, 202, 31, 3, 252, 53, 28, 90),
(91, 393, 32, 80, 443, 120, 64, 91),
(92, 391, 30, 11, 340, 65, 15, 92),
(93, 400, 45, 13, 93, 188, 67, 93),
(94, 401, 28, 55, 124, 51, 54, 94),
(95, 243, 38, 56, 144, 98, 19, 95),
(96, 437, 23, 72, 243, 56, 9, 96),
(97, 367, 41, 28, 175, 10, 69, 97),
(98, 83, 15, 95, 53, 163, 52, 98),
(99, 124, 24, 81, 235, 37, 11, 99),
(100, 119, 41, 5, 435, 119, 9, 100);

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `cust_id` int(10) NOT NULL,
  `full_name` varchar(50) NOT NULL,
  `address` varchar(100) NOT NULL,
  `phone_no` int(20) NOT NULL,
  `city` varchar(40) NOT NULL,
  `group_membership` varchar(50) DEFAULT NULL,
  `discount_code` int(20) DEFAULT NULL,
  `driver_id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`cust_id`, `full_name`, `address`, `phone_no`, `city`, `group_membership`, `discount_code`, `driver_id`) VALUES
(1, 'Coby Giles', '7061 Vel Ave', 0, 'Ruette', 'Ut Company', 1024, 1),
(2, 'Cruz Marshall', 'P.O. Box 184, 7992 Lacus. Street', 76, 'Wuppertal', 'Nisl Company', 1581, 2),
(3, 'Micah Abbott', 'Ap #168-6223 Nulla Ave', 0, 'Honolulu', 'Lectus Sit Company', 914, 3),
(4, 'Drake Orr', 'P.O. Box 112, 6010 Leo. Rd.', 0, 'Dreux', 'Felis LLC', 98, 4),
(5, 'Emmanuel Gibbs', 'P.O. Box 451, 7082 Rhoncus. St.', 393, 'Bensheim', 'Consectetuer Cursus Et LLP', 121, 5),
(6, 'Neville Faulkner', '564-5917 Dapibus St.', 801, 'Río Negro', 'Urna Foundation', 542, 6),
(7, 'Porter Houston', 'Ap #119-5876 At Avenue', 0, 'Göteborg', 'Adipiscing Non LLP', 38, 7),
(8, 'Forrest Lott', '9310 Fringilla St.', 948, 'Mount Pearl', 'Mi Ac Mattis Company', 1036, 8),
(9, 'Kamal Glenn', '596-2108 Morbi St.', 7184, 'Ethe', 'Pharetra Nam Ac Foundation', 182, 9),
(10, 'Vaughan Webster', 'P.O. Box 949, 7027 Felis. Street', 945, 'Gougnies', 'Facilisis Incorporated', 1465, 10),
(11, 'Nolan Collier', '1995 Aenean Rd.', 825, 'Kaneohe', 'Pulvinar Arcu Inc.', 298, 11),
(12, 'Bevis Navarro', 'Ap #166-6452 Orci Rd.', 800, 'Haridwar', 'Curabitur Consequat Consulting', 405, 12),
(13, 'Kirk Peck', '147-1182 Augue Rd.', 814, 'Eisleben', 'Ultrices LLP', 17, 13),
(14, 'Ferdinand Beard', '438-3641 Lorem Street', 995, 'Opwijk', 'Dui Limited', 633, 14),
(15, 'Mufutau Morrison', '5393 Nulla Road', 7471, 'Kingston-on-Thames', 'A Mi Fringilla Corporation', 1438, 15),
(16, 'Tyrone Grimes', 'Ap #373-1637 Pellentesque, Street', 802, 'Mobile', 'Nulla Ltd', 1861, 16),
(17, 'Fitzgerald Knight', 'Ap #477-974 Magnis Rd.', 868, 'Arlon', 'Elit Ltd', 570, 17),
(18, 'Kasimir Gill', '621-7603 Dui Road', 0, 'Campos dos Goytacazes', 'Quis Accumsan Incorporated', 1958, 18),
(19, 'Cain Oliver', 'Ap #628-711 Risus. Rd.', 500, 'Moose Jaw', 'Cubilia Foundation', 1892, 19),
(20, 'Harrison Rivas', '126-2073 Arcu Road', 7624, 'Ancona', 'Magnis Dis Parturient Consulting', 840, 20),
(21, 'Hilel Joyner', 'P.O. Box 875, 7988 At Avenue', 7624, 'Worksop', 'Ultricies Ornare Foundation', 1792, 21),
(22, 'Samuel Cameron', '678-2302 Augue Av.', 76, 'Washington', 'Magna Limited', 102, 22),
(23, 'Hunter Hancock', 'P.O. Box 880, 9704 Ac Av.', 0, 'Amsterdam', 'Lacus Mauris Non Associates', 1989, 23),
(24, 'Raja Noel', '5407 Tempus Av.', 0, 'Sunderland', 'Augue Corporation', 507, 24),
(25, 'John Roberts', '8391 Non Ave', 800, 'Zwijndrecht', 'Proin Nisl Company', 1967, 25),
(26, 'Chaim Simmons', 'P.O. Box 673, 9509 In Avenue', 800, 'Remscheid', 'Libero Ltd', 337, 26),
(27, 'Joshua Mcdaniel', '6460 Enim. St.', 0, 'Gjoa Haven', 'Inceptos Hymenaeos Corp.', 1979, 27),
(28, 'Chandler Sandoval', 'Ap #335-3217 Egestas St.', 845, 'Louth', 'Primis In Faucibus Inc.', 920, 28),
(29, 'Stephen Watkins', '9073 Sed Street', 0, 'Carbonear', 'Per Inceptos LLC', 327, 29),
(30, 'Dante Castillo', 'Ap #922-8496 Lorem Rd.', 55, 'Lerwick', 'Nec Ante Maecenas LLP', 1435, 30),
(31, 'Stephen Jackson', '5006 Mattis. Street', 0, 'Fort Wayne', 'Lorem Tristique Aliquet Corp.', 1345, 31),
(32, 'Chandler Dennis', 'Ap #848-6995 Ligula. Ave', 0, 'Fleurus', 'A Corporation', 173, 32),
(33, 'Alfonso Hines', '1554 Nullam Rd.', 802, 'Grezzana', 'Congue Turpis Incorporated', 636, 33),
(34, 'Brock Leblanc', '2252 Mi Avenue', 0, 'Telford', 'Bibendum Donec Incorporated', 1597, 34),
(35, 'Demetrius Wright', 'Ap #795-1960 Vel St.', 0, 'Jhang', 'Quis Accumsan Convallis Corp.', 1227, 35),
(36, 'Jackson Benson', 'Ap #735-8673 Sit Rd.', 800, 'Ahmedabad', 'Orci Ut Semper Institute', 1785, 36),
(37, 'Bruno Hester', 'P.O. Box 377, 3515 Aenean Road', 845, 'Ceyhan', 'Taciti Sociosqu Institute', 522, 37),
(38, 'Robert Dodson', 'P.O. Box 835, 9136 Iaculis St.', 7536, 'Abbeville', 'Velit Pellentesque Ultricies Limited', 1730, 38),
(39, 'Dalton Mathis', '105-6268 Fermentum St.', 0, 'La Florida', 'Maecenas Libero Corp.', 478, 39),
(40, 'Yasir Alvarado', 'Ap #393-3572 Ligula. Street', 0, 'Anklam', 'Ipsum Ltd', 475, 40),
(41, 'Philip Frost', '6531 Rutrum, Avenue', 361, 'Kempten', 'Lobortis Limited', 832, 41),
(42, 'Oscar Price', '3861 Ullamcorper. St.', 7056, 'Geelong', 'Felis Purus LLP', 1719, 42),
(43, 'Elliott Cash', 'Ap #330-1717 Mattis. St.', 800, 'Ruvo del Monte', 'Urna Suscipit Foundation', 1688, 43),
(44, 'Elijah May', '625-333 Malesuada Road', 0, 'Annapolis County', 'Praesent Eu Nulla Foundation', 925, 44),
(45, 'Thane Elliott', '9782 Ligula Street', 800, 'Lochgilphead', 'Commodo At Libero LLP', 1828, 45),
(46, 'Zeph Francis', 'Ap #613-6618 Duis Rd.', 800, 'Mogliano', 'Varius Corp.', 1269, 46),
(47, 'Brennan Foley', 'Ap #270-6026 Mauris Avenue', 0, 'Schifferstadt', 'Dictum Placerat Corporation', 1341, 47),
(48, 'Gage Pena', '3893 Arcu Ave', 7624, 'Courcelles', 'Arcu Nunc Mauris Inc.', 1193, 48),
(49, 'Clinton Fischer', 'Ap #448-5191 Et Rd.', 0, 'Southaven', 'Arcu Vivamus Sit Ltd', 1222, 49),
(50, 'Guy Wise', '5671 Senectus Rd.', 55, 'Vegreville', 'Purus Accumsan Interdum Corporation', 97, 50),
(51, 'Dalton Horn', 'P.O. Box 442, 6310 Nostra, Ave', 70, 'Hualpén', 'Augue LLP', 947, 51),
(52, 'Brody Herring', '641-8960 Id Street', 76, 'El Carmen', 'Ultricies Adipiscing Enim Limited', 1960, 52),
(53, 'Calvin Reynolds', '7474 Quis, St.', 800, 'Luziânia', 'Sagittis Associates', 816, 53),
(54, 'Quinlan Mcguire', 'Ap #357-2046 Neque St.', 307, 'Las Palmas', 'Eleifend Nunc Corporation', 1413, 54),
(55, 'Julian Rivera', 'P.O. Box 126, 9874 Luctus Rd.', 800, 'Lexington', 'Quam Quis Institute', 758, 55),
(56, 'Maxwell Sexton', '867-1256 Rutrum St.', 70, 'Borriana', 'Lectus Rutrum Urna Consulting', 1929, 56),
(57, 'Malik Reed', '832-8305 Ac Rd.', 0, 'Beverlo', 'Elit Inc.', 1689, 57),
(58, 'Connor Wells', '480-4059 Nullam St.', 826, 'Knighton', 'Nec Industries', 645, 58),
(59, 'Caesar Lowe', 'Ap #440-6375 Id, St.', 0, 'Cannes', 'Nibh Quisque Nonummy Incorporated', 764, 59),
(60, 'Noah Madden', 'P.O. Box 814, 4713 Aliquet Av.', 0, 'Jammu', 'Sed Dictum Eleifend Consulting', 905, 60),
(61, 'Rudyard Vance', 'P.O. Box 937, 169 At, Street', 0, 'Whitchurch', 'Ornare Placerat Foundation', 873, 61),
(62, 'Xanthus Caldwell', '5826 Fusce St.', 0, 'Lower Hutt', 'Curae; Phasellus Corporation', 156, 62),
(63, 'Silas Bauer', 'Ap #369-9893 Nisi. Avenue', 837, 'St. Catharines', 'Vulputate Lacus Inc.', 1286, 63),
(64, 'Reuben Copeland', '690-8649 Id Rd.', 0, 'Davenport', 'Faucibus Ut Nulla Associates', 1542, 64),
(65, 'Xander Melendez', 'P.O. Box 625, 1183 Feugiat Rd.', 70, 'Aklavik', 'Enim Nisl Inc.', 1029, 65),
(66, 'Hop Baird', 'Ap #385-6294 Ligula Ave', 800, 'Budaun', 'Nonummy Fusce LLP', 799, 66),
(67, 'Jerry Pitts', 'Ap #448-3734 Sed Rd.', 0, 'Milestone', 'Libero Proin Inc.', 1839, 67),
(68, 'Zephania Stokes', '9637 Elit, St.', 7562, 'Eghezee', 'Erat Eget Ipsum LLC', 1435, 68),
(69, 'Jin Love', 'P.O. Box 752, 5148 Malesuada Rd.', 0, 'San José', 'Eu LLP', 749, 69),
(70, 'Kevin Mack', 'P.O. Box 270, 6391 Vel Street', 800, 'Melville', 'Velit Corp.', 105, 70),
(71, 'Ignatius Norris', '9409 Massa Av.', 0, 'Quinchao', 'Dignissim Maecenas Ornare Ltd', 1995, 71),
(72, 'William Bradshaw', 'P.O. Box 140, 8716 Quis St.', 344, 'Aurillac', 'Massa PC', 1290, 72),
(73, 'Nasim Mcgowan', '108-2932 Nam Av.', 0, 'Hampstead', 'Eget LLP', 354, 73),
(74, 'Zeph Frank', 'Ap #331-8409 Nec, Rd.', 7735, 'Beert', 'Sed Pharetra Felis Inc.', 612, 74),
(75, 'Bernard Lane', 'P.O. Box 416, 898 Scelerisque Road', 319, 'Laken', 'Proin Industries', 437, 75),
(76, 'Castor Lambert', '1155 Purus. Street', 7624, 'Pune', 'Mauris Ipsum Porta LLP', 1609, 76),
(77, 'Porter Wilson', 'P.O. Box 894, 8866 Eu Rd.', 0, 'Spruce Grove', 'Lacus Incorporated', 393, 77),
(78, 'Jackson Warren', '429-687 Primis St.', 7624, 'San Fratello', 'In Consectetuer Ipsum LLP', 577, 78),
(79, 'Tate Mccall', 'Ap #623-6656 Habitant Ave', 0, 'Farciennes', 'Turpis Institute', 1738, 79),
(80, 'Ashton Chandler', 'Ap #247-9233 Molestie Rd.', 0, 'Ettelgem', 'Fames Ac Turpis Ltd', 265, 80),
(81, 'Ahmed Rodgers', 'P.O. Box 160, 1099 Varius St.', 76, 'Drachten', 'Eros Proin Ultrices Corporation', 177, 81),
(82, 'Charles Zimmerman', 'Ap #474-9860 Adipiscing St.', 0, 'Nalinnes', 'Vitae LLC', 729, 82),
(83, 'Erich Moreno', '4629 Velit Avenue', 0, 'Leganés', 'Turpis Aliquam Ltd', 545, 83),
(84, 'Lyle Mcneil', '242-7096 Penatibus St.', 0, 'Olympia', 'Etiam Inc.', 1256, 84),
(85, 'Cooper Stephenson', 'P.O. Box 434, 7092 Fames Rd.', 70, 'Haguenau', 'Mauris Elit Dictum Associates', 1674, 85),
(86, 'Demetrius Ellis', 'P.O. Box 738, 3500 Nec Ave', 76, 'Serampore', 'A Corp.', 1291, 86),
(87, 'Grady Pruitt', '909 Nulla Rd.', 0, 'Vanier', 'Nostra Incorporated', 1629, 87),
(88, 'Gil Carey', 'P.O. Box 747, 2667 Eget Avenue', 884, 'Pugwash', 'Quis Diam Incorporated', 1421, 88),
(89, 'Malachi Huffman', 'Ap #659-634 Sed Rd.', 845, 'Oostkerk', 'Non Sollicitudin A Associates', 1182, 89),
(90, 'Raja Foster', 'Ap #234-324 Leo Rd.', 0, 'Ibadan', 'Nisl Nulla Eu Industries', 361, 90),
(91, 'Dominic Clements', 'Ap #370-4490 Sagittis. Avenue', 70, 'Akhisar', 'Commodo Auctor Velit Consulting', 1273, 91),
(92, 'Callum Mccall', 'Ap #335-1226 Ut, Rd.', 0, 'Abbeville', 'Neque Company', 1579, 92),
(93, 'Merrill Merritt', '7087 Etiam Rd.', 800, 'San José de Maipo', 'Ante Vivamus PC', 1293, 93),
(94, 'Callum Horn', '197-5817 Nascetur St.', 500, 'Ramskapelle', 'Eu Limited', 1840, 94),
(95, 'Reece Weeks', 'Ap #281-8389 Consectetuer Av.', 56, 'LaSalle', 'Nisi Limited', 509, 95),
(96, 'Dylan Becker', 'Ap #835-2839 Purus. Rd.', 845, 'Kamoke', 'Proin Vel Industries', 779, 96),
(97, 'Cameron Macias', '164-2881 Ipsum Street', 7121, 'Selva di Cadore', 'Massa Lobortis Ultrices LLC', 1729, 97),
(98, 'Rajah Stanton', 'P.O. Box 921, 3692 Phasellus Av.', 70, 'Blehen', 'Feugiat Placerat Velit Corporation', 195, 98),
(99, 'Dorian Shaw', 'P.O. Box 814, 2790 Arcu Ave', 0, 'GrivegnŽe', 'Mollis Inc.', 387, 99),
(100, 'Callum Schneider', '7194 Enim, Rd.', 500, 'San Felice a Cancello', 'Posuere At Velit PC', 1678, 100);

-- --------------------------------------------------------

--
-- Table structure for table `drivers`
--

CREATE TABLE `drivers` (
  `driver_id` int(10) NOT NULL,
  `full_name` varchar(40) NOT NULL,
  `phone_no` int(20) NOT NULL,
  `address` varchar(100) NOT NULL,
  `license_no` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `drivers`
--

INSERT INTO `drivers` (`driver_id`, `full_name`, `phone_no`, `address`, `license_no`) VALUES
(1, 'Arthur Montoya', 2147483647, 'P.O. Box 976, 8108 Phasellus Rd.', 425947),
(2, 'Jamal Frank', 2147483647, '4410 Fermentum St.', 47635),
(3, 'Honorato Landry', 2147483647, 'Ap #914-8842 Parturient Ave', 670183),
(4, 'Carter Flynn', 2147483647, 'Ap #638-4137 Quisque St.', 607263),
(5, 'Perry Mccall', 2147483647, 'Ap #249-2524 Cum Av.', 30007),
(6, 'Chester Decker', 2147483647, '588 Etiam Av.', 63951),
(7, 'Julian Schroeder', 2147483647, '413-2704 Eu Av.', 197852),
(8, 'David Harris', 2147483647, '1016 Ac Road', 494170),
(9, 'Mufutau Crane', 2147483647, '3133 In Ave', 57030),
(10, 'Samson Mcguire', 2147483647, 'P.O. Box 216, 157 Ultrices Road', 760805),
(11, 'Tad Oneil', 2147483647, '2300 Iaculis, Street', 249219),
(12, 'Barry Eaton', 2147483647, 'P.O. Box 499, 6200 Ut, Rd.', 198297),
(13, 'Yuli Moon', 2147483647, 'P.O. Box 835, 7502 Nonummy. St.', 132635),
(14, 'Howard Warren', 2147483647, 'P.O. Box 803, 4150 Hendrerit Rd.', 182214),
(15, 'Keegan Justice', 2147483647, '6094 Cras Avenue', 113611),
(16, 'Igor Rhodes', 2147483647, '3591 Libero Street', 263195),
(17, 'Nathaniel Stanley', 2147483647, '6337 Nibh St.', 323428),
(18, 'Myles Gross', 2147483647, 'P.O. Box 672, 6394 Mauris Rd.', 836763),
(19, 'Hedley Mclean', 2147483647, 'Ap #427-489 Interdum Rd.', 584327),
(20, 'Dean Dillard', 2147483647, 'P.O. Box 675, 7677 Vitae Rd.', 290204),
(21, 'Rahim Fisher', 2147483647, 'P.O. Box 100, 2392 Sapien. Av.', 749684),
(22, 'Brent Fry', 2147483647, 'Ap #934-2596 Phasellus Rd.', 539453),
(23, 'Calvin Stein', 2147483647, '4428 Lorem Ave', 591070),
(24, 'Coby Hays', 2147483647, 'P.O. Box 715, 6904 Dolor Av.', 655461),
(25, 'Malachi Mooney', 2147483647, 'Ap #974-7510 A Road', 782970),
(26, 'Tarik Mcclain', 2147483647, 'Ap #112-6476 Bibendum St.', 219890),
(27, 'Austin Whitney', 2147483647, '6402 Vitae Rd.', 688944),
(28, 'Jermaine Grant', 2147483647, 'Ap #849-6271 Purus, Avenue', 522258),
(29, 'Blake Jones', 2147483647, 'P.O. Box 397, 8061 Ultrices Av.', 825260),
(30, 'Hedley Duffy', 2147483647, '375-2928 Tellus Av.', 689814),
(31, 'Oscar Hayden', 2147483647, 'P.O. Box 548, 9404 Arcu. Rd.', 249273),
(32, 'Odysseus Lang', 2147483647, 'P.O. Box 876, 635 Adipiscing St.', 203804),
(33, 'Jordan Harding', 2147483647, 'Ap #710-9176 Maecenas Rd.', 217777),
(34, 'Dylan Larson', 2147483647, '390-5695 Donec Av.', 767515),
(35, 'Hedley Riddle', 2147483647, 'Ap #929-2959 Libero Street', 98180),
(36, 'Daquan Cervantes', 2147483647, '338 Massa. St.', 776108),
(37, 'Stephen Cain', 2147483647, 'P.O. Box 475, 1720 Nisl St.', 593091),
(38, 'Clark Thompson', 2147483647, 'P.O. Box 448, 1306 Non St.', 771753),
(39, 'Benjamin Hawkins', 2147483647, 'P.O. Box 806, 6875 Nunc St.', 261968),
(40, 'Warren Gray', 2147483647, '854-3821 Nullam Avenue', 47944),
(41, 'Cody Fernandez', 2147483647, 'P.O. Box 886, 8740 Tellus, Rd.', 823359),
(42, 'Colin Boone', 2147483647, '7596 Ligula. Ave', 937407),
(43, 'Sean Herring', 2147483647, '476-5414 Pellentesque Street', 256118),
(44, 'Ciaran Pate', 2147483647, 'P.O. Box 636, 4622 Non, Rd.', 618834),
(45, 'Travis Collins', 2147483647, 'P.O. Box 969, 1129 Odio. Road', 23452),
(46, 'Chandler Alvarado', 2147483647, '413-9822 Donec Road', 918802),
(47, 'Felix Graham', 2147483647, '3487 Urna Street', 927882),
(48, 'Salvador Hurley', 2147483647, '311-9474 Metus St.', 852048),
(49, 'Jamal Hays', 2147483647, '531-1265 Bibendum. Av.', 797381),
(50, 'Grant Chase', 2147483647, '821-3065 Ullamcorper Avenue', 843082),
(51, 'Noble Weeks', 2147483647, 'P.O. Box 149, 1038 Sodales Rd.', 426331),
(52, 'Quinn Rogers', 2147483647, 'P.O. Box 511, 9088 Ultrices St.', 970480),
(53, 'Charles Gutierrez', 2147483647, '421-601 Sit Road', 417384),
(54, 'Damon Donaldson', 2147483647, 'Ap #379-2817 Velit Avenue', 508341),
(55, 'Kasper Jordan', 2147483647, '8997 A, Street', 721909),
(56, 'Amal Combs', 2147483647, 'P.O. Box 441, 9656 Mauris Ave', 67111),
(57, 'Oleg Vazquez', 2147483647, 'Ap #843-6051 Tristique Avenue', 222658),
(58, 'Cruz Ballard', 2147483647, 'P.O. Box 715, 9666 Fringilla Rd.', 361965),
(59, 'Nehru Berg', 2147483647, '6518 Nisi. Road', 723083),
(60, 'Elijah Farley', 2147483647, 'Ap #496-4512 Nunc St.', 927730),
(61, 'Dale Love', 2147483647, 'P.O. Box 884, 7326 Dis Street', 102159),
(62, 'Clarke Mcleod', 2147483647, '5474 Sapien, Avenue', 793202),
(63, 'Chancellor English', 2147483647, '3500 Velit. Road', 871820),
(64, 'Damon Todd', 2147483647, 'Ap #280-5435 Libero Street', 903049),
(65, 'Travis Frederick', 2147483647, '8263 Convallis Ave', 512313),
(66, 'Hashim Carney', 2147483647, '7180 Elementum St.', 875774),
(67, 'Knox Calderon', 2147483647, '7820 Mi St.', 490425),
(68, 'Curran Hamilton', 2147483647, 'P.O. Box 852, 5407 Et St.', 251010),
(69, 'Kadeem Moss', 2147483647, 'P.O. Box 720, 9046 Justo Avenue', 976563),
(70, 'Hoyt Moon', 2147483647, '2843 Faucibus Rd.', 262245),
(71, 'Ignatius Huber', 2147483647, '1658 Iaculis, Road', 110992),
(72, 'Abbot Burns', 2147483647, '9492 Sed Av.', 525588),
(73, 'Vernon Barton', 2147483647, 'Ap #719-2471 Sit Avenue', 543153),
(74, 'Damon Hunter', 2147483647, '717-4877 Eget, Street', 76237),
(75, 'Solomon Jenkins', 2147483647, 'P.O. Box 523, 6923 Gravida. Av.', 980287),
(76, 'Eagan Gutierrez', 2147483647, '1301 Mi Ave', 455353),
(77, 'Keaton Hickman', 2147483647, '887-6397 Vivamus St.', 301313),
(78, 'Troy Black', 2147483647, '281-2177 Consectetuer, St.', 548066),
(79, 'Jackson Petty', 2147483647, 'P.O. Box 149, 1110 Ornare St.', 127229),
(80, 'Allistair Wilcox', 2147483647, 'P.O. Box 272, 7045 Fringilla St.', 478538),
(81, 'Reece Stark', 2147483647, 'P.O. Box 759, 1942 Lectus Street', 30541),
(82, 'Holmes Johns', 2147483647, '585-2047 At Rd.', 239117),
(83, 'Ishmael Bentley', 2147483647, 'Ap #992-195 Semper St.', 745160),
(84, 'Zeus Rosales', 2147483647, 'Ap #507-3607 Magnis Avenue', 451245),
(85, 'Dennis Calderon', 2147483647, '4585 Id, St.', 671547),
(86, 'Jackson Peters', 2147483647, '977-3161 At, Rd.', 355574),
(87, 'Donovan Sharpe', 2147483647, 'Ap #296-7648 Dui. Rd.', 440572),
(88, 'Kermit Weeks', 2147483647, 'P.O. Box 382, 9065 Magnis Street', 92170),
(89, 'Baker Reilly', 2147483647, 'P.O. Box 406, 1536 Sed Rd.', 422290),
(90, 'Camden Hubbard', 2147483647, '485 At St.', 71143),
(91, 'Elton Mcclure', 2147483647, 'P.O. Box 561, 3938 Etiam Rd.', 488620),
(92, 'Derek Turner', 2147483647, 'P.O. Box 500, 1710 Mollis Street', 244433),
(93, 'Cullen Miranda', 2147483647, '242-6047 Scelerisque, Av.', 423550),
(94, 'Denton Mccoy', 2147483647, '477-3663 Feugiat Rd.', 868206),
(95, 'Herrod Harvey', 2147483647, '2398 Cras Av.', 497843),
(96, 'Lucius Coleman', 2147483647, '167 Massa Street', 957803),
(97, 'Dexter Fleming', 2147483647, 'P.O. Box 460, 9260 Turpis Avenue', 599612),
(98, 'Demetrius Stanley', 2147483647, '866-9077 Lorem, Rd.', 334582),
(99, 'Tyler Boyd', 2147483647, 'P.O. Box 504, 8662 Sollicitudin Avenue', 430498),
(100, 'Colin Knox', 2147483647, '1120 Erat Ave', 919565);

-- --------------------------------------------------------

--
-- Table structure for table `franchise`
--

CREATE TABLE `franchise` (
  `franchise_id` int(10) NOT NULL,
  `city` varchar(40) NOT NULL,
  `location` varchar(100) NOT NULL,
  `inventory` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `franchise`
--

INSERT INTO `franchise` (`franchise_id`, `city`, `location`, `inventory`) VALUES
(1, 'Burhanpur', '4646 Sit Ave', 444),
(2, 'Wells', 'P.O. Box 640, 6490 Et St.', 2),
(3, 'Pointe-Claire', 'Ap #425-8420 Et Street', 658),
(4, 'Merthyr Tydfil', 'Ap #522-841 Ultrices St.', 984),
(5, 'Houtain-le-Val', 'P.O. Box 481, 5161 Nunc. St.', 422),
(6, 'Columbia', '4360 Pede, Rd.', 804),
(7, 'Mostazal', 'P.O. Box 894, 8389 Cras Av.', 531),
(8, 'Hohen Neuendorf', '3207 Et Street', 421),
(9, 'Santu Lussurgiu', 'Ap #858-8795 Nec, Road', 460),
(10, 'Vorselaar', '5204 Malesuada Ave', 138),
(11, 'Ollolai', '3346 Eleifend Rd.', 122),
(12, 'Sonnino', 'Ap #697-5801 In, Rd.', 137),
(13, 'Kidwelly', '4248 Dignissim Street', 294),
(14, 'Reading', '1383 In Rd.', 60),
(15, 'Amstetten', '480-4017 Et, St.', 396),
(16, 'Penrith', 'Ap #765-7062 Nunc St.', 341),
(17, 'Cariboo Regional District', '610 Aliquam St.', 448),
(18, 'Schleswig', '938-7691 Semper Ave', 833),
(19, 'Oria', '5732 Mollis. Avenue', 866),
(20, 'Newtown', 'P.O. Box 147, 471 Tincidunt Avenue', 462),
(21, 'Kuurne', '9673 Scelerisque, Av.', 265),
(22, 'Pergola', 'Ap #123-6207 Orci St.', 667),
(23, 'Cabano', '692-4735 Dui, St.', 871),
(24, 'Cumnock', '7083 Donec Rd.', 426),
(25, 'Kallo', 'Ap #417-6004 Aenean St.', 590),
(26, 'Coldstream', '7374 Est, Rd.', 919),
(27, 'Sant''Eufemia a Maiella', '398-4100 In Av.', 213),
(28, 'Salamanca', '6545 Cras St.', 888),
(29, 'Redwater', 'Ap #958-6703 Nulla. Av.', 521),
(30, 'Fortune', '3469 Quam Street', 862),
(31, 'Zelzate', 'Ap #311-1804 Ornare, Road', 195),
(32, 'Northumberland', '425-8964 Augue Ave', 354),
(33, 'Taunusstein', '109-1941 Posuere Road', 970),
(34, 'Bois-de-Villers', 'P.O. Box 441, 5378 Praesent Street', 376),
(35, 'Westmount', '7277 Pede. St.', 620),
(36, 'Anand', '622-6529 Lacus St.', 859),
(37, 'Qutubullapur', 'Ap #911-8726 Pharetra. Ave', 359),
(38, 'Fatehpur', 'Ap #489-8909 Eu Ave', 284),
(39, 'Sheffield', '3006 Ut, Rd.', 596),
(40, 'St. Albans', 'Ap #663-4811 Lacus. Ave', 85),
(41, 'Pinneberg', 'P.O. Box 524, 4706 Et Avenue', 605),
(42, 'Vejalpur', '432-856 Neque Avenue', 104),
(43, 'St. Clears', '4486 Consequat, St.', 483),
(44, 'Piovene Rocchette', '785 Non, Road', 960),
(45, 'Springfield', '7315 Nisl. St.', 332),
(46, 'Thorold', '5277 Urna. Street', 887),
(47, 'Prince Albert', '219-6494 Rhoncus Street', 647),
(48, 'Saint-Nicolas', 'P.O. Box 755, 1674 Nulla. Av.', 274),
(49, 'Saint Andr?', '2961 Ut Road', 803),
(50, 'Bendigo', 'Ap #754-8231 Nibh St.', 146),
(51, 'Moricone', '3250 Justo Rd.', 848),
(52, 'Basingstoke', 'Ap #586-6448 Netus Rd.', 516),
(53, 'Osgoode', 'Ap #151-6545 Duis Rd.', 91),
(54, 'Massarosa', 'P.O. Box 470, 9326 Diam Rd.', 399),
(55, 'Conselice', 'P.O. Box 171, 6872 Nullam Ave', 453),
(56, 'Passau', '9768 Aenean Av.', 83),
(57, 'Carapicuíba', '2417 Sed St.', 669),
(58, 'Hualaihué', '4753 Ullamcorper St.', 866),
(59, 'Durham', '459-9087 Leo. St.', 387),
(60, 'Kirkwall', '754-2682 Suspendisse Ave', 555),
(61, 'Colorado Springs', 'P.O. Box 919, 1660 Feugiat. Rd.', 481),
(62, 'Legnica', '601-6699 Donec Av.', 826),
(63, 'Pace del Mela', 'Ap #489-1674 Sollicitudin Avenue', 384),
(64, 'Baricella', '999-3478 Iaculis Rd.', 770),
(65, 'Lestizza', '6758 Aliquam St.', 42),
(66, 'Sacramento', 'Ap #675-9572 Sed Road', 134),
(67, 'Dallas', '729-9403 Urna. Avenue', 531),
(68, 'Malonne', '675-1713 Id Street', 842),
(69, 'Muzaffarpur', '4754 Maecenas Avenue', 723),
(70, 'Pontevedra', '5670 Dapibus Street', 779),
(71, 'Daknam', '7773 Semper Road', 919),
(72, 'Kallo', 'P.O. Box 772, 5475 Donec Rd.', 405),
(73, 'Lourdes', '164-8506 Amet St.', 153),
(74, 'Outremont', '906-7173 Ullamcorper. Street', 191),
(75, 'Rockingham', 'P.O. Box 949, 9243 Molestie St.', 541),
(76, 'Honolulu', '608-4123 Aliquet Rd.', 34),
(77, 'Cantalupo in Sabina', '141-6613 Sapien. Av.', 159),
(78, 'Bharuch', '338-9379 Velit Road', 936),
(79, 'Ville de Maniwaki', '7592 Sapien. Rd.', 607),
(80, 'Hachy', '618 Etiam St.', 228),
(81, 'Baschi', 'P.O. Box 176, 1449 Proin Road', 18),
(82, 'Pellezzano', '8699 Mauris Av.', 951),
(83, 'LouveignŽ', 'P.O. Box 663, 1534 Tellus Avenue', 910),
(84, 'Velden am Wörther See', '759-2370 Non, St.', 537),
(85, 'Knokke', '2827 Morbi Avenue', 701),
(86, 'Makurdi', 'P.O. Box 718, 3976 Eget St.', 361),
(87, 'Messancy', '4342 Mauris Ave', 28),
(88, 'Georgia', '238-3444 Ac St.', 425),
(89, 'Cairns', '9569 Lacus. Rd.', 832),
(90, 'Cavallino', 'P.O. Box 398, 6034 Amet Road', 996),
(91, 'Strombeek-Bever', 'Ap #605-1166 Neque Rd.', 152),
(92, 'Crowsnest Pass', 'Ap #213-4251 Ornare Rd.', 365),
(93, 'Buzet', '3373 Sed Ave', 437),
(94, 'Pemuco', '280-3005 Orci Rd.', 459),
(95, 'Zuienkerke', '251-492 Nullam Street', 416),
(96, 'Fontaine-l''Evque', '4537 Et St.', 696),
(97, 'Limoges', 'Ap #877-6231 Id, St.', 246),
(98, 'Cuenca', 'P.O. Box 870, 4965 Euismod St.', 996),
(99, 'Armo', '9300 Laoreet Road', 452),
(100, 'Greenwich', '188-894 Aliquam St.', 763);

-- --------------------------------------------------------

--
-- Table structure for table `reservations`
--

CREATE TABLE `reservations` (
  `reserv_id` int(10) NOT NULL,
  `duration_hrs` int(10) NOT NULL,
  `reserv_time` date NOT NULL,
  `month` varchar(20) NOT NULL,
  `status` varchar(20) NOT NULL,
  `cust_id` int(10) NOT NULL,
  `veh_id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `reservations`
--

INSERT INTO `reservations` (`reserv_id`, `duration_hrs`, `reserv_time`, `month`, `status`, `cust_id`, `veh_id`) VALUES
(1, 16, '0000-00-00', 'May', 'Completed', 1, 1),
(2, 6, '0000-00-00', 'November', 'Completed', 2, 2),
(3, 15, '0000-00-00', 'June', 'Completed', 3, 3),
(4, 8, '0000-00-00', 'October', 'In Progress', 4, 4),
(5, 22, '0000-00-00', 'April', 'Pending', 5, 5),
(6, 4, '0000-00-00', 'April', 'Pending', 6, 6),
(7, 23, '0000-00-00', 'December', 'Completed', 7, 7),
(8, 1, '0000-00-00', 'December', 'Completed', 8, 8),
(9, 17, '0000-00-00', 'May', 'Completed', 9, 9),
(10, 7, '0000-00-00', 'July', 'Completed', 10, 10),
(11, 17, '0000-00-00', 'September', 'Completed', 11, 11),
(12, 1, '0000-00-00', 'September', 'Completed', 12, 12),
(13, 11, '0000-00-00', 'May', 'In Progress', 13, 13),
(14, 2, '0000-00-00', 'September', 'Pending', 14, 14),
(15, 22, '0000-00-00', 'December', 'In Progress', 15, 15),
(16, 21, '0000-00-00', 'September', 'Pending', 16, 16),
(17, 8, '0000-00-00', 'March', 'Completed', 17, 17),
(18, 3, '0000-00-00', 'December', 'Pending', 18, 18),
(19, 17, '0000-00-00', 'May', 'Completed', 19, 19),
(20, 9, '0000-00-00', 'September', 'Pending', 20, 20),
(21, 16, '0000-00-00', 'April', 'Completed', 21, 21),
(22, 4, '0000-00-00', 'April', 'In Progress', 22, 22),
(23, 3, '0000-00-00', 'November', 'Completed', 23, 23),
(24, 13, '0000-00-00', 'August', 'Pending', 24, 24),
(25, 24, '0000-00-00', 'May', 'In Progress', 25, 25),
(26, 19, '0000-00-00', 'July', 'In Progress', 26, 26),
(27, 17, '0000-00-00', 'August', 'Completed', 27, 27),
(28, 21, '0000-00-00', 'July', 'Completed', 28, 28),
(29, 5, '0000-00-00', 'June', 'Pending', 29, 29),
(30, 14, '0000-00-00', 'October', 'Completed', 30, 30),
(31, 5, '0000-00-00', 'March', 'In Progress', 31, 31),
(32, 3, '0000-00-00', 'March', 'Completed', 32, 32),
(33, 15, '0000-00-00', 'December', 'Pending', 33, 33),
(34, 8, '0000-00-00', 'December', 'Completed', 34, 34),
(35, 6, '0000-00-00', 'May', 'Pending', 35, 35),
(36, 15, '0000-00-00', 'December', 'Pending', 36, 36),
(37, 1, '0000-00-00', 'November', 'Completed', 37, 37),
(38, 13, '0000-00-00', 'August', 'Completed', 38, 38),
(39, 4, '0000-00-00', 'December', 'In Progress', 39, 39),
(40, 16, '0000-00-00', 'October', 'Completed', 40, 40),
(41, 7, '0000-00-00', 'March', 'In Progress', 41, 41),
(42, 24, '0000-00-00', 'April', 'In Progress', 42, 42),
(43, 17, '0000-00-00', 'October', 'Completed', 43, 43),
(44, 16, '0000-00-00', 'October', 'Completed', 44, 44),
(45, 6, '0000-00-00', 'July', 'Completed', 45, 45),
(46, 19, '0000-00-00', 'May', 'Completed', 46, 46),
(47, 5, '0000-00-00', 'June', 'In Progress', 47, 47),
(48, 15, '0000-00-00', 'May', 'In Progress', 48, 48),
(49, 21, '0000-00-00', 'December', 'Completed', 49, 49),
(50, 15, '0000-00-00', 'October', 'Pending', 50, 50),
(51, 15, '0000-00-00', 'July', 'Completed', 51, 51),
(52, 3, '0000-00-00', 'December', 'In Progress', 52, 52),
(53, 2, '0000-00-00', 'October', 'Pending', 53, 53),
(54, 15, '0000-00-00', 'April', 'Completed', 54, 54),
(55, 5, '0000-00-00', 'July', 'Pending', 55, 55),
(56, 2, '0000-00-00', 'April', 'In Progress', 56, 56),
(57, 17, '0000-00-00', 'August', 'Pending', 57, 57),
(58, 2, '0000-00-00', 'November', 'Pending', 58, 58),
(59, 5, '0000-00-00', 'November', 'Pending', 59, 59),
(60, 13, '0000-00-00', 'January', 'Pending', 60, 60),
(61, 1, '0000-00-00', 'May', 'Completed', 61, 61),
(62, 24, '0000-00-00', 'August', 'Completed', 62, 62),
(63, 4, '0000-00-00', 'May', 'Completed', 63, 63),
(64, 17, '0000-00-00', 'August', 'Pending', 64, 64),
(65, 14, '0000-00-00', 'February', 'Completed', 65, 65),
(66, 15, '0000-00-00', 'March', 'Pending', 66, 66),
(67, 22, '0000-00-00', 'September', 'In Progress', 67, 67),
(68, 3, '0000-00-00', 'February', 'Pending', 68, 68),
(69, 7, '0000-00-00', 'June', 'Pending', 69, 69),
(70, 12, '0000-00-00', 'November', 'Completed', 70, 70),
(71, 15, '0000-00-00', 'December', 'Pending', 71, 71),
(72, 1, '0000-00-00', 'July', 'In Progress', 72, 72),
(73, 12, '0000-00-00', 'May', 'Completed', 73, 73),
(74, 15, '0000-00-00', 'December', 'In Progress', 74, 74),
(75, 11, '0000-00-00', 'September', 'Completed', 75, 75),
(76, 10, '0000-00-00', 'October', 'Pending', 76, 76),
(77, 16, '0000-00-00', 'May', 'Completed', 77, 77),
(78, 14, '0000-00-00', 'May', 'Completed', 78, 78),
(79, 15, '0000-00-00', 'August', 'Pending', 79, 79),
(80, 17, '0000-00-00', 'October', 'In Progress', 80, 80),
(81, 17, '0000-00-00', 'December', 'Pending', 81, 81),
(82, 4, '0000-00-00', 'May', 'Completed', 82, 82),
(83, 18, '0000-00-00', 'August', 'Pending', 83, 83),
(84, 21, '0000-00-00', 'December', 'In Progress', 84, 84),
(85, 5, '0000-00-00', 'June', 'In Progress', 85, 85),
(86, 24, '0000-00-00', 'April', 'Completed', 86, 86),
(87, 2, '0000-00-00', 'September', 'Pending', 87, 87),
(88, 24, '0000-00-00', 'March', 'In Progress', 88, 88),
(89, 20, '0000-00-00', 'March', 'In Progress', 89, 89),
(90, 13, '0000-00-00', 'June', 'Completed', 90, 90),
(91, 12, '0000-00-00', 'August', 'Completed', 91, 91),
(92, 11, '0000-00-00', 'October', 'Completed', 92, 92),
(93, 12, '0000-00-00', 'October', 'Pending', 93, 93),
(94, 2, '0000-00-00', 'October', 'Completed', 94, 94),
(95, 13, '0000-00-00', 'September', 'In Progress', 95, 95),
(96, 6, '0000-00-00', 'August', 'In Progress', 96, 96),
(97, 23, '0000-00-00', 'May', 'Completed', 97, 97),
(98, 6, '0000-00-00', 'February', 'Completed', 98, 98),
(99, 19, '0000-00-00', 'December', 'Completed', 99, 99),
(100, 20, '0000-00-00', 'March', 'In Progress', 100, 100);

-- --------------------------------------------------------

--
-- Table structure for table `vehicle`
--

CREATE TABLE `vehicle` (
  `vehicle_id` int(10) NOT NULL,
  `vehicle_name` varchar(40) NOT NULL,
  `make` int(20) NOT NULL,
  `model` varchar(50) NOT NULL,
  `type` varchar(50) NOT NULL,
  `franchise_id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vehicle`
--

INSERT INTO `vehicle` (`vehicle_id`, `vehicle_name`, `make`, `model`, `type`, `franchise_id`) VALUES
(1, 'Renault', 2009, 'Lorem ipsum', 'Luxry', 1),
(2, 'Suzuki', 2008, 'Lorem ipsum', 'Luxry', 2),
(3, 'Tata Motors', 2013, 'Lorem ipsum', 'Go+', 3),
(4, 'Kenworth', 2007, 'Lorem ipsum', 'Sports', 4),
(5, 'Dacia', 2010, 'Lorem ipsum', 'Sports', 5),
(6, 'Daihatsu', 2009, 'Lorem ipsum', 'Go+', 6),
(7, 'RAM Trucks', 2012, 'Lorem', 'Sports', 7),
(8, 'Jeep', 2003, 'Lorem ipsum', 'Go+', 8),
(9, 'Volvo', 2004, 'Lorem', 'Luxry', 9),
(10, 'Kia Motors', 2009, 'Lorem ipsum', 'Go+', 10),
(11, 'Ferrari', 2010, 'Lorem ipsum', 'Go', 11),
(12, 'Ford', 2008, 'Lorem', 'Sports', 12),
(13, 'Lexus', 2005, 'Lorem', 'Luxry', 13),
(14, 'Chevrolet', 2011, 'Lorem ipsum', 'Luxry', 14),
(15, 'Dongfeng Motor', 2009, 'Lorem ipsum', 'Go', 15),
(16, 'Dongfeng Motor', 2003, 'Lorem', 'Sports', 16),
(17, 'Buick', 2007, 'Lorem ipsum', 'Go', 17),
(18, 'Lexus', 2017, 'Lorem ipsum', 'Sports', 18),
(19, 'Maruti Suzuki', 2002, 'Lorem ipsum', 'Sports', 19),
(20, 'GMC', 2006, 'Lorem', 'Sports', 20),
(21, 'Jeep', 2003, 'Lorem ipsum', 'Go', 21),
(22, 'Nissan', 2010, 'Lorem', 'Go+', 22),
(23, 'Kenworth', 2001, 'Lorem', 'Sports', 23),
(24, 'BMW', 2009, 'Lorem', 'Luxry', 24),
(25, 'Suzuki', 2010, 'Lorem ipsum', 'Sports', 25),
(26, 'Mazda', 2006, 'Lorem ipsum', 'Go', 26),
(27, 'BMW', 2011, 'Lorem', 'Go+', 27),
(28, 'Peugeot', 2010, 'Lorem ipsum', 'Go', 28),
(29, 'Honda', 2008, 'Lorem', 'Sports', 29),
(30, 'Lincoln', 2006, 'Lorem', 'Sports', 30),
(31, 'Porsche', 2001, 'Lorem ipsum', 'Luxry', 31),
(32, 'Subaru', 2006, 'Lorem ipsum', 'Luxry', 32),
(33, 'General Motors', 2000, 'Lorem ipsum', 'Go+', 33),
(34, 'Daihatsu', 2002, 'Lorem', 'Go', 34),
(35, 'RAM Trucks', 2014, 'Lorem ipsum', 'Go+', 35),
(36, 'BMW', 2017, 'Lorem', 'Sports', 36),
(37, 'Fiat', 2014, 'Lorem ipsum', 'Go+', 37),
(38, 'Renault', 2013, 'Lorem ipsum', 'Luxry', 38),
(39, 'Maruti Suzuki', 2016, 'Lorem', 'Luxry', 39),
(40, 'Lincoln', 2006, 'Lorem', 'Go', 40),
(41, 'Dacia', 2016, 'Lorem ipsum', 'Go', 41),
(42, 'Ferrari', 2013, 'Lorem ipsum', 'Sports', 42),
(43, 'Nissan', 2004, 'Lorem', 'Go', 43),
(44, 'Jeep', 2012, 'Lorem ipsum', 'Sports', 44),
(45, 'Isuzu', 2007, 'Lorem', 'Sports', 45),
(46, 'Hyundai Motors', 2006, 'Lorem ipsum', 'Go', 46),
(47, 'Skoda', 2013, 'Lorem ipsum', 'Go', 47),
(48, 'Lexus', 2004, 'Lorem ipsum', 'Luxry', 48),
(49, 'Peugeot', 2003, 'Lorem ipsum', 'Go', 49),
(50, 'Chevrolet', 2012, 'Lorem', 'Go+', 50),
(51, 'Infiniti', 2000, 'Lorem ipsum', 'Go+', 51),
(52, 'Toyota', 2009, 'Lorem ipsum', 'Luxry', 52),
(53, 'Kia Motors', 2002, 'Lorem ipsum', 'Go+', 53),
(54, 'Dacia', 2001, 'Lorem', 'Go+', 54),
(55, 'Hyundai Motors', 2008, 'Lorem', 'Go+', 55),
(56, 'FAW', 2006, 'Lorem ipsum', 'Go+', 56),
(57, 'Honda', 2010, 'Lorem', 'Go', 57),
(58, 'Honda', 2007, 'Lorem ipsum', 'Luxry', 58),
(59, 'Jeep', 2013, 'Lorem', 'Go', 59),
(60, 'Volvo', 2009, 'Lorem', 'Go+', 60),
(61, 'Porsche', 2008, 'Lorem', 'Sports', 61),
(62, 'Infiniti', 2015, 'Lorem', 'Go+', 62),
(63, 'General Motors', 2001, 'Lorem', 'Sports', 63),
(64, 'Dongfeng Motor', 2000, 'Lorem', 'Sports', 64),
(65, 'Maruti Suzuki', 2013, 'Lorem ipsum', 'Sports', 65),
(66, 'Dongfeng Motor', 2017, 'Lorem', 'Luxry', 66),
(67, 'Dongfeng Motor', 2012, 'Lorem', 'Luxry', 67),
(68, 'Citroën', 2007, 'Lorem', 'Sports', 68),
(69, 'Renault', 2011, 'Lorem', 'Go+', 69),
(70, 'Dongfeng Motor', 2002, 'Lorem ipsum', 'Luxry', 70),
(71, 'Nissan', 2006, 'Lorem', 'Go+', 71),
(72, 'Dacia', 2007, 'Lorem', 'Sports', 72),
(73, 'Chrysler', 2008, 'Lorem ipsum', 'Luxry', 73),
(74, 'Seat', 2005, 'Lorem ipsum', 'Go', 74),
(75, 'General Motors', 2016, 'Lorem', 'Sports', 75),
(76, 'Suzuki', 2008, 'Lorem ipsum', 'Go', 76),
(77, 'MINI', 2013, 'Lorem', 'Sports', 77),
(78, 'Volkswagen', 2007, 'Lorem', 'Go', 78),
(79, 'Dodge', 2003, 'Lorem ipsum', 'Go', 79),
(80, 'Subaru', 2011, 'Lorem ipsum', 'Go+', 80),
(81, 'Dongfeng Motor', 2011, 'Lorem', 'Go', 81),
(82, 'Smart', 2016, 'Lorem', 'Go', 82),
(83, 'RAM Trucks', 2001, 'Lorem ipsum', 'Sports', 83),
(84, 'Peugeot', 2004, 'Lorem ipsum', 'Go+', 84),
(85, 'Ford', 2001, 'Lorem ipsum', 'Luxry', 85),
(86, 'Fiat', 2000, 'Lorem ipsum', 'Sports', 86),
(87, 'Lincoln', 2016, 'Lorem', 'Luxry', 87),
(88, 'Lexus', 2001, 'Lorem ipsum', 'Luxry', 88),
(89, 'Peugeot', 2014, 'Lorem', 'Go', 89),
(90, 'Subaru', 2010, 'Lorem ipsum', 'Sports', 90),
(91, 'Renault', 2009, 'Lorem', 'Luxry', 91),
(92, 'Cadillac', 2005, 'Lorem', 'Luxry', 92),
(93, 'Subaru', 2002, 'Lorem ipsum', 'Sports', 93),
(94, 'RAM Trucks', 2012, 'Lorem ipsum', 'Luxry', 94),
(95, 'Jeep', 2008, 'Lorem ipsum', 'Go+', 95),
(96, 'Smart', 2014, 'Lorem', 'Go', 96),
(97, 'Suzuki', 2005, 'Lorem ipsum', 'Luxry', 97),
(98, 'Mahindra and Mahindra', 2014, 'Lorem ipsum', 'Go', 98),
(99, 'Fiat', 2004, 'Lorem ipsum', 'Go', 99),
(100, 'FAW', 2000, 'Lorem', 'Sports', 100);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `charges`
--
ALTER TABLE `charges`
  ADD PRIMARY KEY (`charges_id`),
  ADD UNIQUE KEY `reserv_id` (`reserv_id`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`cust_id`),
  ADD UNIQUE KEY `driver_id` (`driver_id`);

--
-- Indexes for table `drivers`
--
ALTER TABLE `drivers`
  ADD PRIMARY KEY (`driver_id`);

--
-- Indexes for table `franchise`
--
ALTER TABLE `franchise`
  ADD PRIMARY KEY (`franchise_id`);

--
-- Indexes for table `reservations`
--
ALTER TABLE `reservations`
  ADD PRIMARY KEY (`reserv_id`),
  ADD UNIQUE KEY `cust_id` (`cust_id`,`veh_id`),
  ADD KEY `reservfk_2` (`veh_id`);

--
-- Indexes for table `vehicle`
--
ALTER TABLE `vehicle`
  ADD PRIMARY KEY (`vehicle_id`),
  ADD UNIQUE KEY `franchise_id` (`franchise_id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `charges`
--
ALTER TABLE `charges`
  ADD CONSTRAINT `chargesfk_1` FOREIGN KEY (`reserv_id`) REFERENCES `reservations` (`reserv_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `customer`
--
ALTER TABLE `customer`
  ADD CONSTRAINT `customerfk_1` FOREIGN KEY (`driver_id`) REFERENCES `drivers` (`driver_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `reservations`
--
ALTER TABLE `reservations`
  ADD CONSTRAINT `reservfk_1` FOREIGN KEY (`cust_id`) REFERENCES `customer` (`cust_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `reservfk_2` FOREIGN KEY (`veh_id`) REFERENCES `vehicle` (`vehicle_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `vehicle`
--
ALTER TABLE `vehicle`
  ADD CONSTRAINT `vehiclefk_1` FOREIGN KEY (`franchise_id`) REFERENCES `franchise` (`franchise_id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
