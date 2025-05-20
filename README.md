# personapp-hexa-spring-boot
Plantilla Laboratorio Arquitectura Limpia

Instalar MariaDB en puerto 3307
Instalar MongoDB en puerto 27017

Ejecutar los scripts en las dbs

el adaptador rest corre en el puerto 3000
el swagger en http://localhost:3000/swagger-ui.html

Si los datos no se insertan en Mongo. En el contenedor de Mongo, usando Docker Desktop en el contenedor de mongodb en la sección de Exec. Ejecutar: 
mongosh -u admin -p admin --authenticationDatabase admin

y luego ejecutar el dml de mongo: 
use persona_db

db.persona.insertMany([
	{
		"_id": NumberInt(123456789),
		"nombre": "Pepe",
		"apellido": "Perez",
		"genero": "M",
		"edad": NumberInt(30),
		"_class": "co.edu.javeriana.as.personapp.mongo.document.PersonaDocument"
	},
	{
		"_id": NumberInt(987654321),
		"nombre": "Pepito",
		"apellido": "Perez",
		"genero": "M",
		"edad": NumberInt(25),
		"_class": "co.edu.javeriana.as.personapp.mongo.document.PersonaDocument"
	},
	{
		"_id": NumberInt(321654987),
		"nombre": "Pepa",
		"apellido": "Juarez",
		"genero": "F",
		"edad": NumberInt(30),
		"_class": "co.edu.javeriana.as.personapp.mongo.document.PersonaDocument"
	},
	{
		"_id": NumberInt(147258369),
		"nombre": "Pepita",
		"apellido": "Juarez",
		"genero": "F",
		"edad": NumberInt(10),
		"_class": "co.edu.javeriana.as.personapp.mongo.document.PersonaDocument"
	},
	{
		"_id": NumberInt(963852741),
		"nombre": "Fede",
		"apellido": "Perez",
		"genero": "M",
		"edad": NumberInt(18),
		"_class": "co.edu.javeriana.as.personapp.mongo.document.PersonaDocument"
	}
], { ordered: false })

// Insertar profesiones
db.profesion.insertMany([
  { _id: 1, nom: "Ingeniero", des: "Diseña soluciones técnicas", _class: "co.edu.javeriana.as.personapp.mongo.document.ProfesionDocument" },
  { _id: 2, nom: "Médico", des: "Especialista en salud", _class: "co.edu.javeriana.as.personapp.mongo.document.ProfesionDocument" },
  { _id: 3, nom: "Profesor", des: "Educador profesional", _class: "co.edu.javeriana.as.personapp.mongo.document.ProfesionDocument" }
]);

// Insertar teléfonos
db.telefono.insertMany([
  { _id: "3001234567", oper: "Claro", duenio: NumberInt(123456789), _class: "co.edu.javeriana.as.personapp.mongo.document.TelefonoDocument" },
  { _id: "3107654321", oper: "Movistar", duenio: NumberInt(987654321), _class: "co.edu.javeriana.as.personapp.mongo.document.TelefonoDocument" },
  { _id: "3134567890", oper: "Tigo", duenio: NumberInt(321654987), _class: "co.edu.javeriana.as.personapp.mongo.document.TelefonoDocument" }
]);

// Insertar estudios
db.estudios.insertMany([
  { id_prof: 1, cc_per: NumberInt(123456789), fecha: ISODate("2015-06-10T00:00:00Z"), univer: "Javeriana", _class: "co.edu.javeriana.as.personapp.mongo.document.EstudioDocument" },
  { id_prof: 2, cc_per: NumberInt(987654321), fecha: ISODate("2020-08-15T00:00:00Z"), univer: "Nacional", _class: "co.edu.javeriana.as.personapp.mongo.document.EstudioDocument" },
  { id_prof: 3, cc_per: NumberInt(321654987), fecha: ISODate("2012-02-20T00:00:00Z"), univer: "Andes", _class: "co.edu.javeriana.as.personapp.mongo.document.EstudioDocument" }
]);

