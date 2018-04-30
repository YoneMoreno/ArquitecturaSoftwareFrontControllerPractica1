-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 30-04-2018 a las 11:26:22
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
-- Estructura de tabla para la tabla `asignatura`
--

CREATE TABLE IF NOT EXISTS `asignatura` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `curso` varchar(255) NOT NULL,
  `profesor` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `urlImagen` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `asignatura`
--

INSERT INTO `asignatura` (`id`, `curso`, `profesor`, `nombre`, `urlImagen`) VALUES
(1, 'Ingeniería del software', 'Javier', 'Arquitectura del Software', 'https://itblogsogeti.files.wordpress.com/2014/07/arquitecturasoftware.jpg'),
(2, 'Ingeniería del software', 'Agustin', 'Metodologias de desarrollo agil', 'https://thumbs.dreamstime.com/z/concepto-de-ciclo-de-vida-del-desarrollo-del-mel%C3%A9-y-de-metodolog%C3%ADa-%C3%A1gil-71220632.jpg'),
(3, 'Ingeniería del software', 'Agustin', 'Metodologias de desarrollo agil', 'https://thumbs.dreamstime.com/z/concepto-de-ciclo-de-vida-del-desarrollo-del-mel%C3%A9-y-de-metodolog%C3%ADa-%C3%A1gil-71220632.jpg');

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=27 ;

--
-- Volcado de datos para la tabla `curso`
--

INSERT INTO `curso` (`idCurso`, `titulo`, `autor`, `asignatura`, `duracion`, `video`, `imagen`) VALUES
(3, 'MDA', 'Agustin Salgado', 'Matematicas', 150, 'https://player.vimeo.com/external/194837908.sd.mp4?s=c350076905b78c67f74d7ee39fdb4fef01d12420&profile_id=164', 'https://www.codejobs.biz/public/images/blog/original/a6cd96ce30b459e.png'),
(13, 'Telecomunicaciones', 'Maria', 'Matematicas', 290, 'https://www.youtube.com/watch?v=xX5HpT67icoo&list=PL6dt1cs7som7I4HSi1rPquJOjrUlnLqtD&index=5', 'https://www.youtube.com/watch?v=xX5HpT67icooo&list=PL6dt1cs7som7I4HSi1rPquJOjrUlnLqtD&index=5');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `evaluacion`
--

CREATE TABLE IF NOT EXISTS `evaluacion` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `alumno` varchar(255) NOT NULL,
  `curso` varchar(255) NOT NULL,
  `nota` varchar(255) NOT NULL,
  `comentario` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `evaluacion`
--

INSERT INTO `evaluacion` (`id`, `alumno`, `curso`, `nota`, `comentario`) VALUES
(1, 'David', 'Ingeniería del software', '7.9', 'Puntualidad en las entregas. Falta interfaz de usuario más atractiva. Claridad a la hora de poner los nombres de las variables.'),
(2, 'Ana', 'Ingeniería del software', '8.1', 'Hechas 2 de las 3 partes opcionales. El código abusa de los condicionales. Se esfuerza al hacer usable la interfaz al colocar botones grandes.');

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `profesor`
--

INSERT INTO `profesor` (`idProfesor`, `nombre`, `contrasena`, `asignatura`, `valoracion`, `correo`, `telefono`, `despacho`) VALUES
(1, 'Javier', '1234', 'AS', 0, 'javier@gmail.com', 323, 'S3'),
(2, 'Agustin', '1234', 'MDA', 8, 'agustin.salgado@ulpgc.es', 84499263, 'S9'),
(3, 'Juan Carlos', '1234', 'PR4', 7, 'juan.carlos@ulpgc.es', 99228811, 'M44');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tema`
--

CREATE TABLE IF NOT EXISTS `tema` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `asignatura` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `descripcion` varchar(1000) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `tema`
--

INSERT INTO `tema` (`id`, `asignatura`, `nombre`, `descripcion`) VALUES
(2, 'Arquitectura del software', 'Patrones de la capa de datos', 'Tema 4: Arquitecturas Multi-capa: Capa de Datos   4.1 Introducción   4.2 Consideraciones generales de diseño   4.3 Tecnologías disponibles   4.4 Consideraciones sobre el rendimiento y la seguridad   4.5 Consideraciones sobre el despliegue   4.6 Pasos de diseño sobre la capa de datos   4.7 Patrones de diseño de la capa de datos   Competencias: G1, G2, G3, G4, G5, N1, N2, N3, N4, N5, IS01, IS04, IS06         Bibliografía:    Patterns    of    enterprise    application    architecture,    Documenting    Software Architectures, Microsoft Application Architecture Guide'),
(3, 'Arquitectura del software', 'Fundamentos de la Arquitectura del Software', 'Tema 1: Fundamentos de la Arquitectura del Software    1.1 Definición    1.2 Principios básicos   1.3 El arquitecto del software   1.4 El proceso de definición de la arquitectura   1.5 Estilos arquitectónicos   1.6 Vistas y perspectivas   Competencias: G1, G2, G5, IS01, IS03, IS04   Bibliografía: Software Architecture in Practice, Software Systems Architecture');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
