INSERT INTO 
	`persona_db`.`persona`(`cc`,`nombre`,`apellido`,`genero`,`edad`) 
VALUES
	(123456789,'Pepe','Perez','M',30),
	(987654321,'Pepito','Perez','M',null),
	(321654987,'Pepa','Juarez','F',30),
	(147258369,'Pepita','Juarez','F',10),
	(963852741,'Fede','Perez','M',18);

INSERT INTO `persona_db`.`profesion` (`id`, `nom`, `des`) VALUES
    (1, 'Ingeniero', 'Diseña soluciones técnicas'),
    (2, 'Médico', 'Especialista en salud'),
    (3, 'Profesor', 'Educador profesional');

INSERT INTO `persona_db`.`telefono` (`num`, `oper`, `duenio`) VALUES
    ('3001234567', 'Claro', 123456789),
    ('3107654321', 'Movistar', 987654321),
    ('3134567890', 'Tigo', 321654987);

 INSERT INTO `persona_db`.`estudios` (`id_prof`, `cc_per`, `fecha`, `univer`) VALUES
    (1, 123456789, '2015-06-10', 'Javeriana'),
    (2, 987654321, '2020-08-15', 'Nacional'),
    (3, 321654987, '2012-02-20', 'Andes');
