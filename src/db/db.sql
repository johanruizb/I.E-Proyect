CREATE TABLE IF NOT EXISTS informacion_Personal(
	serialInfo serial,
	numeroCedula VARCHAR(255) NOT NULL PRIMARY KEY,
	nombre VARCHAR(255) NOT NULL,
	apellido1 VARCHAR(255) NOT NULL,
	apellido2 VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS informacion_Acceso(
	serialInfo serial,
	numeroCedula_FK VARCHAR(255) NOT NULL,
	email VARCHAR(255) NOT NULL PRIMARY KEY,
	contraseña VARCHAR(255) NOT NULL,
	FOREIGN KEY (numeroCedula_FK) REFERENCES informacion_Personal(numeroCedula) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE IF NOT EXISTS informacion_Locacion(
	serialInfo serial,
	numeroCedula_FK VARCHAR(255) NOT NULL PRIMARY KEY,
	ciudad VARCHAR(255) NOT NULL,
	empresa VARCHAR(255) NOT NULL,
	localidad VARCHAR(255) NOT NULL,
	FOREIGN KEY (numeroCedula_FK) REFERENCES informacion_Personal(numeroCedula) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO informacion_Personal(numeroCedula,nombre,apellido1,apellido2) VALUES('1000000','Juan','Perez','NONE');
INSERT INTO informacion_Acceso(numeroCedula_FK, email, contraseña) VALUES ('1000000','juan@gmail.com','juan123');
INSERT INTO informacion_Locacion(numeroCedula_FK, ciudad, empresa, localidad) VALUES ('1000000','Cali','Inspecta','El Troncal');

