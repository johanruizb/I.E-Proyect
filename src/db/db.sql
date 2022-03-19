CREATE SCHEMA IF NOT EXISTS Public;

CREATE TABLE IF NOT EXISTS informacion_Personal(
	serialInfo SERIAL,
	numeroCedula VARCHAR(255) NOT NULL PRIMARY KEY,
	nombre VARCHAR(255) NOT NULL,
	apellido1 VARCHAR(255) NOT NULL,
	apellido2 VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS informacion_Acceso(
	serial_info SERIAL,
	numeroCedula_FK VARCHAR(255) NOT NULL,
	email VARCHAR(255) NOT NULL PRIMARY KEY,
	contraseña VARCHAR(255) NOT NULL,
	FOREIGN KEY (numeroCedula_FK) REFERENCES informacion_Personal(numeroCedula) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE IF NOT EXISTS informacion_Locacion(
	serial_info SERIAL,
	numeroCedula_FK VARCHAR(255) NOT NULL PRIMARY KEY,
	ciudad VARCHAR(255) NOT NULL,
	empresa VARCHAR(255) NOT NULL,
	localidad VARCHAR(255) NOT NULL,
	FOREIGN KEY (numeroCedula_FK) REFERENCES informacion_Personal(numeroCedula) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE IF NOT EXISTS registro_evidencias(
	serial_registro SERIAL NOT NULL PRIMARY KEY,
	id_informe VARCHAR(255) NOT NULL,
	email VARCHAR(255) NOT NULL,
	fecha VARCHAR(255) NOT NULL,
	estado VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS registro_detalles(
	serial_evidencia_FK INT NOT NULL PRIMARY KEY,
	email VARCHAR(255) NOT NULL,
	id_informe VARCHAR(255) NOT NULL,
	n_contrato VARCHAR(255) NOT NULL,
	observaciones VARCHAR(255) NOT NULL,
	fecha_registro VARCHAR(255) NOT NULL,
	tipo_trabajo VARCHAR(255) NOT NULL,
	ciudad VARCHAR(255) NOT NULL,
	FOREIGN KEY (serial_evidencia_FK) REFERENCES registro_evidencias(serial_registro) ON DELETE CASCADE ON UPDATE CASCADE
);
