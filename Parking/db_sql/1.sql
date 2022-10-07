--
-- Estructura de tabla para la tabla `cargo`
--

DROP TABLE IF EXISTS `cargo`;
CREATE TABLE IF NOT EXISTS `cargo` (
  `id_cargo` int NOT NULL AUTO_INCREMENT,
  `cargo_posicion` varchar(20) NOT NULL,
  PRIMARY KEY (`id_cargo`)
);

--
-- Volcado de datos para la tabla `cargo`
--

INSERT INTO `cargo` (`id_cargo`, `cargo_posicion`) VALUES
(1, 'Administrador'),
(2, 'Asistente');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoriavehiculo`
--

DROP TABLE IF EXISTS `categoriavehiculo`;
CREATE TABLE IF NOT EXISTS `categoriavehiculo` (
  `id_categoria` int NOT NULL AUTO_INCREMENT,
  `tipo_vehiculo` varchar(20) DEFAULT NULL,
  `tarifa_vehiculo` int DEFAULT NULL,
  `tarifa_minima` int DEFAULT NULL,
  PRIMARY KEY (`id_categoria`)
);

--
-- Volcado de datos para la tabla `categoriavehiculo`
--

INSERT INTO `categoriavehiculo` (`id_categoria`, `tipo_vehiculo`, `tarifa_vehiculo`, `tarifa_minima`) VALUES
(1, 'Automovil', 20, 50),
(2, 'Moto', 10, 25);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

DROP TABLE IF EXISTS `empleados`;
CREATE TABLE IF NOT EXISTS `empleados` (
  `id_empleado` int NOT NULL AUTO_INCREMENT,
  `nombre_empleado` varchar(25) NOT NULL,
  `apellido_empleado` varchar(25) NOT NULL,
  `telefono_empleado` varchar(20) NOT NULL,
  `correo_empleado` varchar(30) NOT NULL,
  `cedula_empleado` varchar(30) NOT NULL,
  PRIMARY KEY (`id_empleado`),
  UNIQUE KEY `cedula_empleado` (`cedula_empleado`)
);

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`id_empleado`, `nombre_empleado`, `apellido_empleado`, `telefono_empleado`, `correo_empleado`, `cedula_empleado`) VALUES
(1, 'Thomis', 'Garrido', '829-876-2485', 'thomisgarrido@gmail.com', '402-2451185-3'),
(2, 'Pedro', 'Gaxa', '856-879-3652', 'gaxapedro@gmail.com', '402-5635644-2'),
(3, 'Adriana', 'Garrido', '829-278-2016', 'garridoa206@gmail.com', '402-5113268-5'),
(4, 'Andiery', 'Dominguez', '846-852-9631', 'hidedarkness@gmail.com', '402-3659874-2'),
(5, 'Kuzuna', 'King', '787-563-4892', 'kingkuzuna@gmail.com', '600-3694751-2'),
(6, 'Yimmi', 'Garrido', '564-789-2336', 'garridoyimmi@gmail.com', '569-8423647-8'),
(7, 'Adrian', 'Garrido', '564-789-2153', 'garridoadrian@gmail.com', '455-2268778-1'),
(8, 'Rob', 'Manz', '564-723-1000', 'manz@gmail.com', '456-9712305-6');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE IF NOT EXISTS `usuarios` (
  `id_usuario` int NOT NULL AUTO_INCREMENT,
  `usuario` varchar(10) NOT NULL,
  `contrasena_usuario` varchar(20) NOT NULL,
  `id_empleado` int NOT NULL,
  `Posicion` varchar(20) NOT NULL,
  `Estado` varchar(20) NOT NULL,
  PRIMARY KEY (`usuario`) USING BTREE,
  KEY `id_empleado` (`id_empleado`),
  KEY `id_usuario` (`id_usuario`) USING BTREE
);

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `usuario`, `contrasena_usuario`, `id_empleado`, `Posicion`, `Estado`) VALUES
(1, 'thom', 'thom12', 1, 'Administrador', 'Activo'),
(2, 'pedro', 'pedro12', 2, 'Asistente', 'Activo'),
(3, 'Adri', 'adri12', 3, 'Asistente', 'Activo'),
(4, 'hidedark', 'indumb', 4, 'Administrador', 'Activo'),
(5, 'kuzuna', 'king12', 5, 'Asistente', 'Activo'),
(6, 'yim', 'yim12', 6, 'Asistente', 'Activo'),
(7, 'adrian', 'adri123', 7, 'Asistente', 'Activo'),
(8, 'rob', 'rob12', 8, 'Asistente', 'Activo');
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `espacios`
--

DROP TABLE IF EXISTS `espacios`;
CREATE TABLE IF NOT EXISTS `espacios` (
  `id_espacios` int NOT NULL AUTO_INCREMENT,
  `total_espacios` int NOT NULL,
  `total_ocupado` int NOT NULL,
  `total_disponibles` int NOT NULL,
  PRIMARY KEY (`id_espacios`)
);

--
-- Volcado de datos para la tabla `espacios`
--

INSERT INTO `espacios` (`id_espacios`, `total_espacios`, `total_ocupado`, `total_disponibles`) VALUES
(1, 150, 4, 146);

-- --------------------------------------------------------

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehiculos`
--

DROP TABLE IF EXISTS `vehiculos`;
CREATE TABLE IF NOT EXISTS `vehiculos` (
  `id_vehiculo` int NOT NULL AUTO_INCREMENT,
  `placa_vehiculo` varchar(8) NOT NULL,
  `propietario_vehiculo` varchar(50) NOT NULL,
  `tipo_vehiculo` varchar(50) NOT NULL,
  `horaentrada_vehiculo` datetime NOT NULL,
  `horasalida_vehiculo` datetime DEFAULT NULL,
  `valorpagado` int DEFAULT NULL,
  `estado_vehiculo` varchar(13) NOT NULL,
  `usuario` varchar(10) NOT NULL,
  `usuario_salida` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_vehiculo`),
  UNIQUE KEY `placa` (`placa_vehiculo`)
);

--
-- Volcado de datos para la tabla `vehiculos`
--

INSERT INTO `vehiculos` (`id_vehiculo`, `placa_vehiculo`, `propietario_vehiculo`, `tipo_vehiculo`, `horaentrada_vehiculo`, `horasalida_vehiculo`, `valorpagado`, `estado_vehiculo`, `usuario`, `usuario_salida`) VALUES
(1, 'K526398', 'Klein', 'Moto', '2020-12-21 23:41:19', '2020-12-22 00:08:43', 25, 'No Disponible', 'Adri', 'thom'),
(2, 'AS5630', 'Yuno', 'Automovil', '2020-12-21 23:41:19', '2020-12-25 19:36:13', 1820, 'No Disponible', 'Adri', 'pedro'),
(3, 'LM5050', 'Gon', 'Automovil', '2020-12-22 00:08:43', '2020-12-24 22:59:37', 1400, 'No Disponible', 'pedro', 'thom'),
(4, 'K526396', 'Peña', 'Moto', '2020-12-24 22:59:36', '2020-12-25 23:27:13', 240, 'No Disponible', 'Adri', 'thom'),
(5, 'D526314', 'Kevin', 'Automovil', '2020-12-25 19:02:45', '2020-12-26 19:42:50', 480, 'No Disponible', 'Adri', 'thom'),
(6, 'L852063', 'Darlin in the Franxx', 'Moto', '2020-12-25 19:22:12', '2021-01-05 20:30:57', 2650, 'No Disponible', 'thom', 'Adri'),
(7, 'J520361', 'Tami', 'Moto', '2020-12-25 19:36:13', '2021-01-18 13:40:55', 5700, 'No Disponible', 'thom', 'pedro'),
(8, 'F569321', 'Gari', 'Moto', '2020-12-25 22:53:48', '2021-01-18 14:02:10', 5670, 'No Disponible', 'thom', 'pedro'),
(9, 'B569874', 'Marvel', 'Moto', '2020-12-25 23:27:13', '2021-01-18 14:04:17', 5660, 'No Disponible', 'Adri', 'Adri'),
(10, 'T520698', 'Don', 'Moto', '2020-12-26 00:40:21', '2021-01-18 14:18:57', 5650, 'No Disponible', 'pedro', 'pedro'),
(12, 'G562389', 'Helen', 'Moto', '2020-12-26 00:56:59', '2021-01-18 14:25:44', 5650, 'No Disponible', 'Adri', 'pedro'),
(13, 'H526398', 'Lolo', 'Moto', '2020-12-26 19:32:55', '2020-12-26 19:32:55', 25, 'No Disponible', 'pedro', 'Adri'),
(14, 'A569874', 'Jason', 'Automovil', '2021-01-18 13:40:55', '2021-01-28 23:11:23', 4980, 'No Disponible', 'Adri', 'thom'),
(16, 'G563987', 'Gargamet', 'Moto', '2021-01-18 14:18:57', '2021-01-28 23:13:59', 2480, 'No Disponible', 'thom', 'thom'),
(17, 'H203041', 'Freddy', 'Moto', '2021-01-18 14:25:44', '2021-01-29 00:00:16', 2490, 'No Disponible', 'Adri', 'pedro'),
(18, 'M121011', 'Venon', 'Moto', '2021-01-18 14:25:44', '2021-01-29 20:19:35', 2690, 'No Disponible', 'thom', 'thom'),
(19, 'D563201', 'Eren Krager', 'Automovil', '2021-01-21 21:28:30', NULL, NULL, 'Disponible', 'pedro', NULL),
(20, 'A457896', 'Armin', 'Moto', '2021-01-21 21:37:08', '2021-02-04 14:13:05', 3280, 'No Disponible', 'thom', 'THOM'),
(21, 'G562310', 'Narnia', 'Moto', '2021-01-21 22:03:28', NULL, NULL, 'Disponible', 'pedro', NULL),
(22, 'D232323', 'Kimetsu', 'Automovil', '2021-01-28 23:55:12', NULL, NULL, 'Disponible', 'thom', NULL),
(23, 'N565254', 'Ajax', 'Automovil', '2021-01-29 20:19:35', NULL, NULL, 'Disponible', 'thom', NULL);