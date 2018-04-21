-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 21-04-2018 a las 13:16:41
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `asaplicacion`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `curso`
--

CREATE TABLE IF NOT EXISTS `curso` (
  `idCurso` int(11) NOT NULL AUTO_INCREMENT,
  `titulo` varchar(20) NOT NULL,
  `autor` varchar(20) NOT NULL,
  `asignatura` varchar(50) NOT NULL,
  `duracion` int(11) NOT NULL,
  `video` varchar(255) NOT NULL,
  `imagen` varchar(255) NOT NULL,
  PRIMARY KEY (`idCurso`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Volcado de datos para la tabla `curso`
--

INSERT INTO `curso` (`idCurso`, `titulo`, `autor`, `asignatura`, `duracion`, `video`, `imagen`) VALUES
(1, 'AS', 'Javier Sanchez Perez', 'AS', 150, 'https://www.youtube.com/embed/xulqPJdBt5E', 'https://image.slidesharecdn.com/the-recovered-architect-140318152419-phpapp02/95/the-modern-software-architect-13-638.jpg?cb=1395216721'),
(3, 'MDA', 'Agustin Salgado de l', 'MDA', 150, 'https://player.vimeo.com/external/194837908.sd.mp4?s=c350076905b78c67f74d7ee39fdb4fef01d12420&profile_id=164', 'https://www.codejobs.biz/public/images/blog/original/a6cd96ce30b459e.png'),
(4, 'BD 3', 'Rafael', 'BD', 150, 'https://a.es', 'https://www.youtube.com/watch?v=xX5HpT67ico&list=PL6dt1cs7som7I4HSi1rPquJOjrUlnLqtD&index=5'),
(5, 'Teleco', 'Luisa', 'Matematicas', 150, 'https://www.youtube.com/watch?v=xX5HpT67ico&list=PL6dt1cs7som7I4HSi1rPquJOjrUlnLqtD&index=5', 'https://www.youtube.com/watch?v=xX5HpT67ico&list=PL6dt1cs7som7I4HSi1rPquJOjrUlnLqtD&index=5'),
(6, 'PI', 'Pedro', 'Programacion', 150, '', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesor`
--

CREATE TABLE IF NOT EXISTS `profesor` (
  `idProfesor` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  `contrasena` varchar(255) NOT NULL,
  `asignatura` varchar(255) NOT NULL,
  `valoracion` int(11) NOT NULL,
  `correo` varchar(255) NOT NULL,
  `telefono` int(11) NOT NULL,
  `despacho` varchar(255) NOT NULL,
  PRIMARY KEY (`idProfesor`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
