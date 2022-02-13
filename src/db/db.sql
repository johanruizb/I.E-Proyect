CREATE TABLE IF NOT EXISTS informacionPersonal(
	serialInfo serial,
	numeroCedula VARCHAR(255) NOT NULL PRIMARY KEY,
	nombre VARCHAR(255) NOT NULL,
	apellido1 VARCHAR(255) NOT NULL,
	apellido2 VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS informacionAcceso(
	serialInfo serial,
	numeroCedula_FK VARCHAR(255) NOT NULL,
	email VARCHAR(255) NOT NULL PRIMARY KEY,
	contraseña VARCHAR(255) NOT NULL,
	FOREIGN KEY (numeroCedula_FK) REFERENCES informacionPersonal(numeroCedula) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE IF NOT EXISTS informacionLocacion(
	serialInfo serial,
	numeroCedula_FK VARCHAR(255) NOT NULL PRIMARY KEY,
	ciudad VARCHAR(255) NOT NULL,
	empresa VARCHAR(255) NOT NULL,
	localidad VARCHAR(255) NOT NULL,
	FOREIGN KEY (numeroCedula_FK) REFERENCES informacionPersonal(numeroCedula) ON DELETE CASCADE ON UPDATE CASCADE
);