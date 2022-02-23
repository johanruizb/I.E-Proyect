CREATE TABLE IF NOT EXISTS informacion_Personal(
	serialInfo serial,
	numeroCedula VARCHAR(255) NOT NULL PRIMARY KEY,
	nombre VARCHAR(255) NOT NULL,
	apellido1 VARCHAR(255) NOT NULL,
	apellido2 VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS informacion_Acceso(
	serial_info serial,
	numeroCedula_FK VARCHAR(255) NOT NULL,
	email VARCHAR(255) NOT NULL PRIMARY KEY,
	contraseña VARCHAR(255) NOT NULL,
	FOREIGN KEY (numeroCedula_FK) REFERENCES informacion_Personal(numeroCedula) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE IF NOT EXISTS informacion_Locacion(
	serial_info serial,
	numeroCedula_FK VARCHAR(255) NOT NULL PRIMARY KEY,
	ciudad VARCHAR(255) NOT NULL,
	empresa VARCHAR(255) NOT NULL,
	localidad VARCHAR(255) NOT NULL,
	FOREIGN KEY (numeroCedula_FK) REFERENCES informacion_Personal(numeroCedula) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE IF NOT EXISTS dummy(
	serial_info serial,
	cedula VARCHAR(255) NOT NULL PRIMARY KEY,
);

CREATE TABLE IF NOT EXISTS registro_evidencias(
	serial_registro SERIAL,
	id_evidencia VARCHAR(255) NOT NULL PRIMARY KEY,
	id_informe VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS registro_detalles(
	serial_registro SERIAL,
	id_evidencia_FK VARCHAR(255) NOT NULL PRIMARY KEY,
	registro_aprobado BOOLEAN NOT NULL,
	fecha VARCHAR(255) NOT NULL,
	ciudad VARCHAR(255) NOT NULL,
	fecha_registro VARCHAR(255) NOT NULL,
	FOREIGN KEY (id_evidencia_FK) REFERENCES registro_evidencias(id_evidencia) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO
	informacion_Personal(numeroCedula, nombre, apellido1, apellido2)
VALUES
	('1000001', 'Juan', 'Perez', 'NONE');

INSERT INTO
	informacion_Acceso(numeroCedula_FK, email, contraseña)
VALUES
	('1000001', 'juan@gmail.com', 'juan123');

INSERT INTO
	informacion_Locacion(numeroCedula_FK, ciudad, empresa, localidad)
VALUES
	('1000001', 'Cali', 'Inspecta', 'El Troncal');