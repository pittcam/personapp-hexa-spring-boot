// Se conecta a la base de datos admin primero (donde se maneja la autenticación)
db = db.getSiblingDB('admin');

// Crea el usuario persona_db si no existe
db.createUser({
  user: "admin",
  pwd: "admin",
  roles: [{ role: "userAdminAnyDatabase", db: "admin" }, "readWriteAnyDatabase"]
});

// Cambia a la base de datos persona_db
db = db.getSiblingDB('persona_db');

// Crea las colecciones necesarias
db.createCollection("persona");
db.createCollection("profesion");
db.createCollection("telefono");
db.createCollection("estudios");

// Inserta personas
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
], { ordered: false });

// Inserta profesiones
db.profesion.insertMany([
  { "_id": NumberInt(1), "nom": "Ingeniero", "des": "Diseña soluciones técnicas", "_class": "co.edu.javeriana.as.personapp.mongo.document.ProfesionDocument" },
  { "_id": NumberInt(2), "nom": "Médico", "des": "Especialista en salud", "_class": "co.edu.javeriana.as.personapp.mongo.document.ProfesionDocument" },
  { "_id": NumberInt(3), "nom": "Profesor", "des": "Educador profesional", "_class": "co.edu.javeriana.as.personapp.mongo.document.ProfesionDocument" }
]);

// Inserta teléfonos
db.telefono.insertMany([
  { "_id": "3001234567", "oper": "Claro", "duenio": NumberInt(123456789), "_class": "co.edu.javeriana.as.personapp.mongo.document.TelefonoDocument" },
  { "_id": "3107654321", "oper": "Movistar", "duenio": NumberInt(987654321), "_class": "co.edu.javeriana.as.personapp.mongo.document.TelefonoDocument" },
  { "_id": "3134567890", "oper": "Tigo", "duenio": NumberInt(321654987), "_class": "co.edu.javeriana.as.personapp.mongo.document.TelefonoDocument" }
]);

// Inserta estudios
db.estudios.insertMany([
  { "id_prof": NumberInt(1), "cc_per": NumberInt(123456789), "fecha": new Date("2015-06-10"), "univer": "Javeriana", "_class": "co.edu.javeriana.as.personapp.mongo.document.EstudioDocument" },
  { "id_prof": NumberInt(2), "cc_per": NumberInt(987654321), "fecha": new Date("2020-08-15"), "univer": "Nacional", "_class": "co.edu.javeriana.as.personapp.mongo.document.EstudioDocument" },
  { "id_prof": NumberInt(3), "cc_per": NumberInt(321654987), "fecha": new Date("2012-02-20"), "univer": "Andes", "_class": "co.edu.javeriana.as.personapp.mongo.document.EstudioDocument" }
]);

// Confirma la cantidad de registros insertados
print("Personas insertadas: " + db.persona.count());
print("Profesiones insertadas: " + db.profesion.count());
print("Teléfonos insertados: " + db.telefono.count());
print("Estudios insertados: " + db.estudios.count());