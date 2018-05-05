-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 04-05-2018 a las 19:10:37
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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Volcado de datos para la tabla `asignatura`
--

INSERT INTO `asignatura` (`id`, `curso`, `profesor`, `nombre`, `urlImagen`) VALUES
(1, 'Ingeniería del software', 'Javier', 'Arquitectura del Software', 'https://itblogsogeti.files.wordpress.com/2014/07/arquitecturasoftware.jpg'),
(2, 'Ingeniería del software', 'Agustin', 'Metodologias de desarrollo agil', 'https://thumbs.dreamstime.com/z/concepto-de-ciclo-de-vida-del-desarrollo-del-mel%C3%A9-y-de-metodolog%C3%ADa-%C3%A1gil-71220632.jpg'),
(4, 'Seguridad', 'Muñoz', 'Servicios y seguridad en red', 'http://www.grupsertec.com/wp-content/uploads/2011/04/Fotolia_21337715_XS.jpg'),
(5, 'Programacion Web', 'Juan Carlos', 'Microservicios', 'http://comunytek.com/wp-content/uploads/2017/03/Microservicios.png'),
(6, 'Ingeniería del software', 'Ana', 'Requisitos', 'https://apunteslegalesblog.files.wordpress.com/2017/05/requisitos.png?w=312&h=312&crop=1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `biblioteca`
--

CREATE TABLE IF NOT EXISTS `biblioteca` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  `urlImagen` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Volcado de datos para la tabla `biblioteca`
--

INSERT INTO `biblioteca` (`id`, `nombre`, `urlImagen`) VALUES
(1, 'Biblioteca Informatica', 'https://i.ytimg.com/vi/SRjZisYG3v8/maxresdefault.jpg'),
(2, 'biblioteca arquitectura', 'https://plantayalzado.files.wordpress.com/2011/02/biblioteca2.jpg'),
(3, 'biblioteca general', 'https://c1.staticflickr.com/9/8545/15601059148_1ae19e32e7_h.jpg'),
(4, 'biblioteca ciencias basicas', 'https://www.ulpgc.es/sites/default/files/ArchivosULPGC/noticia/fcm.jpg'),
(5, 'biblioteca enfermeria', 'http://www.gobiernodecanarias.org/opencms8/export/sites/cultura/oficinadeapoyo/.content/galeria/espacios/gcbibliocienciassalud.jpg');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuestionario`
--

CREATE TABLE IF NOT EXISTS `cuestionario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pregunta` varchar(255) NOT NULL,
  `respuesta1` varchar(255) NOT NULL,
  `respuestaVerdad1` tinyint(1) NOT NULL,
  `respuesta2` varchar(255) NOT NULL,
  `respuestaVerdad2` tinyint(1) NOT NULL,
  `respuesta3` varchar(255) NOT NULL,
  `respuestaVerdad3` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Volcado de datos para la tabla `cuestionario`
--

INSERT INTO `cuestionario` (`id`, `pregunta`, `respuesta1`, `respuestaVerdad1`, `respuesta2`, `respuestaVerdad2`, `respuesta3`, `respuestaVerdad3`) VALUES
(1, '¿De que país procede el primer PC?', 'China', 0, 'Reino Unido', 1, 'Estados Unidos', 0),
(2, '¿Cuál es el origen de la palabra serendipia?', 'India', 0, 'Japón', 0, 'Sri Lanka', 1),
(3, '¿Quién descubrió América?', 'Americo', 0, 'Vespucio', 0, 'Colón', 1),
(4, '¿Quién inventó las pinzas de la ropa?', 'Monjes', 0, 'Astures', 0, 'Marinos', 1),
(5, '¿De donde procede el término calistenia?', 'Ingles', 1, 'Frances', 0, 'Latin', 0);

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=40 ;

--
-- Volcado de datos para la tabla `curso`
--

INSERT INTO `curso` (`idCurso`, `titulo`, `autor`, `asignatura`, `duracion`, `video`, `imagen`) VALUES
(3, 'MDA', 'Agustin Salgado', 'Matematicas', 150, 'https://player.vimeo.com/external/194837908.sd.mp4?s=c350076905b78c67f74d7ee39fdb4fef01d12420&profile_id=164', 'https://www.codejobs.biz/public/images/blog/original/a6cd96ce30b459e.png'),
(35, 'Scala', 'Nuereeena', 'Matematicas', 3332, '', 'http://2.bp.blogspot.com/-KRqoq8kBqzs/T2x_qB8zu5I/AAAAAAAAGR0/Mu0RWv9CbWc/s1600/libro.jpg'),
(36, 'Ruby', 'Elsa', 'Programacion', 441, 'https://player.vimeo.com/external/194837908.sd.mp4?s=c350076905b78c67f74d7ee39fdb4fef01d12420&profile_id=164', 'http://2.bp.blogspot.com/-KRqoq8kBqzs/T2x_qB8zu5I/AAAAAAAAGR0/Mu0RWv9CbWc/s1600/libro.jpg'),
(37, 'Programacion Web', 'Juan Carlos', 'Microservicios', 322, 'https://player.vimeo.com/external/194837908.sd.mp4?s=c350076905b78c67f74d7ee39fdb4fef01d12420&profile_id=164', ' http://2.bp.blogspot.com/-KRqoq8kBqzs/T2x_qB8zu5I/AAAAAAAAGR0/Mu0RWv9CbWc/s1600/libro.jpg'),
(38, 'Ingenieria Software', 'Ana', 'Requisitos', 900, 'https://player.vimeo.com/external/194837908.sd.mp4?s=c350076905b78c67f74d7ee39fdb4fef01d12420&profile_id=164', 'http://2.bp.blogspot.com/-KRqoq8kBqzs/T2x_qB8zu5I/AAAAAAAAGR0/Mu0RWv9CbWc/s1600/libro.jpg'),
(39, 'BD 3', 'Mia', 'Matematicas', 421, 'https://player.vimeo.com/external/194837908.sd.mp4?s=c350076905b78c67f74d7ee39fdb4fef01d12420&profile_id=164', 'http://2.bp.blogspot.com/-KRqoq8kBqzs/T2x_qB8zu5I/AAAAAAAAGR0/Mu0RWv9CbWc/s1600/libro.jpg');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `encuesta`
--

CREATE TABLE IF NOT EXISTS `encuesta` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cuestion` varchar(255) NOT NULL,
  `puntuacion` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Volcado de datos para la tabla `encuesta`
--

INSERT INTO `encuesta` (`id`, `cuestion`, `puntuacion`) VALUES
(1, '¿Que te parecen las instalaciones?', 0),
(2, '¿Que piensas del temario?', 0),
(3, '¿El profesor es puntual?', 0),
(4, '¿Se logran los objetivos?', 0),
(5, '¿Se cumple con la temporizacion?', 0);

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Volcado de datos para la tabla `evaluacion`
--

INSERT INTO `evaluacion` (`id`, `alumno`, `curso`, `nota`, `comentario`) VALUES
(1, 'David', 'Ingeniería del software', '7.9', 'Puntualidad en las entregas. Falta interfaz de usuario más atractiva. Claridad a la hora de poner los nombres de las variables.'),
(2, 'Ana', 'Ingeniería del software', '8.1', 'Hechas 2 de las 3 partes opcionales. El código abusa de los condicionales. Se esfuerza al hacer usable la interfaz al colocar botones grandes.'),
(3, 'Eva', 'Programacion Web', '5', 'Muchos conocimientos HTML. Poco entendimientos JavaScript'),
(4, 'Ruben', 'Ingeniería del software', '7', 'Practicas entregadas a tiempo.'),
(5, 'Victoria', 'MDA', '9.2', 'Mucho trabajo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `messages`
--

CREATE TABLE IF NOT EXISTS `messages` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idSender` int(11) NOT NULL,
  `idReceiver` int(11) NOT NULL,
  `message` varchar(1000) NOT NULL,
  `subject` varchar(100) NOT NULL,
  `date` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idSender` (`idSender`,`idReceiver`),
  KEY `idReceiver` (`idReceiver`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `messages`
--

INSERT INTO `messages` (`id`, `idSender`, `idReceiver`, `message`, `subject`, `date`) VALUES
(1, 1, 3, 'Es', 'Matematicas', '2018-05-02'),
(2, 1, 2, 'Nuevo', 'Hey', '2018-05-03'),
(3, 8, 2, 'Proyecto', 'ITC', '2018-05-03');

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Volcado de datos para la tabla `profesor`
--

INSERT INTO `profesor` (`idProfesor`, `nombre`, `contrasena`, `asignatura`, `valoracion`, `correo`, `telefono`, `despacho`) VALUES
(1, 'Javier', '1234', 'AS', 0, 'javier@gmail.com', 323, 'S3'),
(2, 'Agustin', '1234', 'MDA', 8, 'agustin.salgado@ulpgc.es', 111222, 'S9'),
(3, 'Juan Carlos', '1234', 'PR4', 7, 'juan.carlos@ulpgc.es', 99228811, 'M44'),
(8, 'Ana', '1234', 'Requisitos', 6, 'ana.placido@ulpgc.es', 889331223, 'S99'),
(9, 'Cayetano', '1234', 'Microservicios', 9, 'cayetano.guerra@ulpgc.es', 912331331, 'K91');

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Volcado de datos para la tabla `tema`
--

INSERT INTO `tema` (`id`, `asignatura`, `nombre`, `descripcion`) VALUES
(2, 'Arquitectura del software', 'Patrones de la capa de datos', 'Tema 4: Arquitecturas Multi-capa: Capa de Datos   4.1 Introducción   4.2 Consideraciones generales de diseño   4.3 Tecnologías disponibles   4.4 Consideraciones sobre el rendimiento y la seguridad   4.5 Consideraciones sobre el despliegue   4.6 Pasos de diseño sobre la capa de datos   4.7 Patrones de diseño de la capa de datos   Competencias: G1, G2, G3, G4, G5, N1, N2, N3, N4, N5, IS01, IS04, IS06         Bibliografía:    Patterns    of    enterprise    application    architecture,    Documenting    Software Architectures, Microsoft Application Architecture Guide'),
(3, 'Arquitectura del software', 'Fundamentos de la Arquitectura del Software', 'Tema 1: Fundamentos de la Arquitectura del Software    1.1 Definición    1.2 Principios básicos   1.3 El arquitecto del software   1.4 El proceso de definición de la arquitectura   1.5 Estilos arquitectónicos   1.6 Vistas y perspectivas   Competencias: G1, G2, G5, IS01, IS03, IS04   Bibliografía: Software Architecture in Practice, Software Systems Architecture'),
(4, 'Arquitectura del software', 'Patrones de la capa de modelo', 'Domain Model'),
(5, 'Arquitectura del software', 'Patrones de la capa de presentacion', 'Two Steps View, Front Controller');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `valoracion`
--

CREATE TABLE IF NOT EXISTS `valoracion` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idCurso` int(255) NOT NULL,
  `idAsignatura` int(255) NOT NULL,
  `idProfesor` int(11) NOT NULL,
  `valoracionNumerica` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `curso` (`idCurso`,`idAsignatura`,`idProfesor`),
  KEY `idProfesor` (`idProfesor`),
  KEY `asignatura` (`idAsignatura`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Volcado de datos para la tabla `valoracion`
--

INSERT INTO `valoracion` (`id`, `idCurso`, `idAsignatura`, `idProfesor`, `valoracionNumerica`) VALUES
(1, 3, 1, 1, 7),
(2, 35, 2, 2, 8),
(3, 36, 4, 3, 8),
(4, 38, 5, 8, 5),
(5, 39, 6, 9, 10);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `messages`
--
ALTER TABLE `messages`
  ADD CONSTRAINT `messages_ibfk_2` FOREIGN KEY (`idReceiver`) REFERENCES `profesor` (`idProfesor`),
  ADD CONSTRAINT `messages_ibfk_1` FOREIGN KEY (`idSender`) REFERENCES `profesor` (`idProfesor`);

--
-- Filtros para la tabla `valoracion`
--
ALTER TABLE `valoracion`
  ADD CONSTRAINT `valoracion_ibfk_3` FOREIGN KEY (`idAsignatura`) REFERENCES `asignatura` (`id`),
  ADD CONSTRAINT `valoracion_ibfk_1` FOREIGN KEY (`idProfesor`) REFERENCES `profesor` (`idProfesor`),
  ADD CONSTRAINT `valoracion_ibfk_2` FOREIGN KEY (`idCurso`) REFERENCES `curso` (`idCurso`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
