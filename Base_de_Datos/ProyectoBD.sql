-- Universidad del Valle
-- Bases de Datos I - 750030M
-- Esquema SQL Proyecto

-- Integrantes:
-- Juan David Tello - 1628950 - 2711
-- Leidy Johanna Rivera Pazmiño - 1628002 - 2711
-- Kevin Eduardo Franco Lopez - 1629869 - 2711 

-------------------- TABLA AREA-------------------------------
DROP TABLE IF EXISTS area cascade;
CREATE TABLE area(
	codigo_area VARCHAR(15) NOT NULL,
	nombre VARCHAR (30) NOT NULL,
	descripcion VARCHAR(50) NOT NULL,
	CONSTRAINT area_pk PRIMARY KEY (codigo_area)
);

--------------------- TABLA CAMAS -----------------------------
DROP TABLE IF EXISTS camas cascade;
CREATE TABLE camas(
	numero_cama VARCHAR(15) NOT NULL,
	estado VARCHAR (30) NOT NULL,
	descripcion VARCHAR(50) NOT NULL,
	codigo_area VARCHAR(15) NOT NULL,
	CONSTRAINT camas_pk PRIMARY KEY (numero_cama),
	CONSTRAINT area_camas_fk FOREIGN KEY (codigo_area) REFERENCES area(codigo_area)
);

--------------------- TABLA PERSONA --------------------------
DROP TABLE IF EXISTS persona cascade;
CREATE TABLE persona(
	identificacion VARCHAR(15) NOT NULL,
	nombre VARCHAR (30) NOT NULL,
	direccion VARCHAR(40) NOT NULL,
	telefono VARCHAR(15) NOT NULL,
	CONSTRAINT persona_pk PRIMARY KEY (identificacion)
);

--------------------- TABLA EMPLEADO -------------------------
DROP TABLE IF EXISTS empleado cascade;
CREATE TABLE empleado(
	identificacion VARCHAR(15) NOT NULL,
	salario VARCHAR(20) NOT NULL,
	cargo VARCHAR (10) NOT NULL,
	email VARCHAR(20) NOT NULL,
	codigo_jefe VARCHAR(15) NOT NULL,
	codigo_area VARCHAR(15) NOT NULL,
	CONSTRAINT empleado_pk PRIMARY KEY (identificacion),
	CONSTRAINT empleado_persona_fk FOREIGN KEY (identificacion) REFERENCES persona(identificacion),
	CONSTRAINT empleado_jefe_fk FOREIGN KEY (codigo_jefe) REFERENCES empleado(identificacion),
	CONSTRAINT empleado_area_fk FOREIGN KEY (codigo_area) REFERENCES area(codigo_area)
);

---------------------- TABLA PACIENTE -----------------------
DROP TABLE IF EXISTS paciente cascade;
CREATE TABLE paciente(
	identificacion VARCHAR(15) NOT NULL,
	actividad_economica VARCHAR (30) NOT NULL,
	numero_seguro_social VARCHAR(15) NOT NULL,
	fecha_nacimiento DATE NOT NULL, 
	CONSTRAINT paciente_pk PRIMARY KEY (identificacion),
	CONSTRAINT paciente_persona_fk FOREIGN KEY (identificacion) REFERENCES persona(identificacion)
);

---------------------- TABLA PACIENTE_CAMAS -----------------------
DROP TABLE IF EXISTS paciente_camas cascade;
CREATE TABLE paciente_camas(
	id_paciente VARCHAR(15) NOT NULL,
	numero_cama VARCHAR (15) NOT NULL,
	fecha_ingreso DATE NOT NULL,
	fecha_salida DATE NOT NULL, 
	CONSTRAINT paciente_camas_pk PRIMARY KEY (id_paciente, numero_cama, fecha_ingreso, fecha_salida),
	CONSTRAINT paciente_camas_paciente_fk FOREIGN KEY (id_paciente) REFERENCES paciente(identificacion),
	CONSTRAINT paciente_camas_camas_fk FOREIGN KEY (numero_cama) REFERENCES camas(numero_cama)
);

---------------------- TABLA HistoriaClinica -----------------------
DROP TABLE IF EXISTS HistoriaClinica cascade;
CREATE TABLE HistoriaClinica(
	numero_historia VARCHAR(15) NOT NULL,
	fecha_apertura DATE NOT NULL,
	id_paciente VARCHAR(15) NOT NULL, 
	CONSTRAINT HistoriaClinica_pk PRIMARY KEY (numero_historia),
	CONSTRAINT HistoriaClinica_paciente_fk FOREIGN KEY (id_paciente) REFERENCES paciente(identificacion)
);


---------------------- TABLA ENFERMERA -----------------------
DROP TABLE IF EXISTS enfermera cascade;
CREATE TABLE enfermera(
	identificacion VARCHAR(15) NOT NULL,
	tiempo_experiencia VARCHAR(5) NOT NULL, 
	CONSTRAINT enfermera_pk PRIMARY KEY (identificacion),
	CONSTRAINT enfermera_empleado_fk FOREIGN KEY (identificacion) REFERENCES empleado(identificacion)
);

---------------------- TABLA ENFERMERA_HABILIDADES -----------------------
DROP TABLE IF EXISTS enfermera_habilidades cascade;
CREATE TABLE enfermera_habilidades(
	identificacion VARCHAR(15) NOT NULL,
	habilidad VARCHAR(20) NOT NULL, 
	CONSTRAINT enfermera_habilidades_pk PRIMARY KEY (identificacion, habilidad),
	CONSTRAINT enfermera_habilidades_enfermera_fk FOREIGN KEY (identificacion) REFERENCES empleado(identificacion)
);


---------------------- TABLA MEDICO -----------------------
DROP TABLE IF EXISTS medico cascade;
CREATE TABLE medico(
	identificacion VARCHAR(15) NOT NULL,
	especialidad VARCHAR(20) NOT NULL,
	numero_licencia VARCHAR(15) NOT NULL,
        universidad VARCHAR(30) NOT NULL, 
	CONSTRAINT medico_pk PRIMARY KEY (identificacion),
	CONSTRAINT medico_empleado_fk FOREIGN KEY (identificacion) REFERENCES empleado(identificacion)
);

---------------------- TABLA CAUSAS -----------------------
DROP TABLE IF EXISTS causas cascade;
CREATE TABLE causas(
	codigo VARCHAR(15) NOT NULL,
	nombre VARCHAR(30) NOT NULL,
	descripcion VARCHAR(30) NOT NULL, 
	CONSTRAINT causas_pk PRIMARY KEY (codigo)
);

---------------------- TABLA CITA -----------------------
DROP TABLE IF EXISTS cita cascade;
CREATE TABLE cita(
	id_paciente VARCHAR(15) NOT NULL,
	id_medico VARCHAR(15) NOT NULL,
	hora TIME NOT NULL,
	fecha DATE NOT NULL,
	estado VARCHAR(20),
	valor_consulta VARCHAR(30), 
	CONSTRAINT cita_pk PRIMARY KEY (id_paciente, id_medico, hora, fecha),
	CONSTRAINT cita_paciente_fk FOREIGN KEY (id_paciente) REFERENCES paciente(identificacion),
	CONSTRAINT cita_medico_fk FOREIGN KEY (id_medico) REFERENCES medico(identificacion)
);


---------------------- TABLA REGISTRO -----------------------
DROP TABLE IF EXISTS registro cascade;
CREATE TABLE registro(
	id_medico VARCHAR(15) NOT NULL,
	id_historia VARCHAR(15) NOT NULL,
	id_causa VARCHAR(15) NOT NULL,
	fecha DATE NOT NULL,
	descripcion VARCHAR(20), 
	CONSTRAINT registro_pk PRIMARY KEY (id_medico, id_historia, id_causa, fecha),
	CONSTRAINT registro_medico_fk FOREIGN KEY (id_medico) REFERENCES medico(identificacion),
	CONSTRAINT registro_historia_fk FOREIGN KEY (id_historia) REFERENCES HistoriaClinica(numero_historia),
	CONSTRAINT registro_causas_fk FOREIGN KEY (id_causa) REFERENCES causas(codigo)
);

---------------------- TABLA CampañaPreventiva -----------------------
DROP TABLE IF EXISTS CampanaPreventiva cascade;
CREATE TABLE CampanaPreventiva(
	codigo VARCHAR(15) NOT NULL,
	nombre VARCHAR(30) NOT NULL,
	objetivo VARCHAR(30) NOT NULL,
	fecha DATE NOT NULL,
	id_medico VARCHAR(15), 
	CONSTRAINT CampanaPreventiva_pk PRIMARY KEY (codigo),
	CONSTRAINT CampanaPreventiva_medico_fk FOREIGN KEY (id_medico) REFERENCES medico(identificacion)
);

---------------------- TABLA PACIENTE_CAMPAÑA -----------------------
DROP TABLE IF EXISTS Paciente_Campana cascade;
CREATE TABLE Paciente_Campana(
	id_paciente VARCHAR(15) NOT NULL,
	id_campana VARCHAR(15) NOT NULL,
	CONSTRAINT Paciente_Campana_pk PRIMARY KEY (id_paciente,id_campana),
	CONSTRAINT Paciente_Campana_paciente_fk FOREIGN KEY (id_paciente) REFERENCES paciente(identificacion),
	CONSTRAINT Paciente_Campana_CampanaPreventiva_fk FOREIGN KEY (id_campana) REFERENCES CampanaPreventiva(codigo)
);

---------------------- TABLA FORMULA -----------------------
DROP TABLE IF EXISTS formula cascade;
CREATE TABLE formula(
	id_formula VARCHAR(15) NOT NULL,
	id_medico VARCHAR(15) NOT NULL,
	id_paciente VARCHAR(15) NOT NULL,
	fecha DATE NOT NULL, 
	CONSTRAINT formula_pk PRIMARY KEY (id_formula),
	CONSTRAINT formula_medico_fk FOREIGN KEY (id_medico) REFERENCES medico(identificacion),
	CONSTRAINT formula_paciente_fk FOREIGN KEY (id_paciente) REFERENCES paciente(identificacion)
);

---------------------- TABLA MEDICAMENTO -----------------------
DROP TABLE IF EXISTS medicamento cascade;
CREATE TABLE medicamento(
	codigo VARCHAR(15) NOT NULL,
	nombre VARCHAR(30) NOT NULL,
	costo VARCHAR(20) NOT NULL,
	descripcion VARCHAR(30) NOT NULL, 
	CONSTRAINT medicamento_pk PRIMARY KEY (codigo)
);

---------------------- TABLA AGENDA -----------------------
DROP TABLE IF EXISTS agenda cascade; 
CREATE TABLE agenda(
	id_secuencia SERIAL NOT NULL,
	dia VARCHAR(15) NOT NULL,
	mes VARCHAR(15) NOT NULL,
	fecha DATE NOT NULL,
	horario TIME NOT NULL,
	estado VARCHAR(15) NOT NULL,
	id_medico VARCHAR(15) NOT NULL, 
	CONSTRAINT agenda_pk PRIMARY KEY (id_secuencia),
	CONSTRAINT agenda_medico_fk FOREIGN KEY (id_medico) REFERENCES medico(identificacion)
);


---------------------- TABLA FORMULA_MEDICAMENTO -----------------------
DROP TABLE IF EXISTS Formula_Medicamento cascade;
CREATE TABLE Formula_Medicamento(
	id_formula VARCHAR(15) NOT NULL,
	codigo_medicamento VARCHAR(15) NOT NULL,
	cantidad VARCHAR(10) NOT NULL,
	CONSTRAINT Formula_Medicamento_pk PRIMARY KEY (id_formula,codigo_medicamento),
	CONSTRAINT Formula_Medicamento_formula_fk FOREIGN KEY (id_formula) REFERENCES formula(id_formula),
	CONSTRAINT Formula_Medicamento_medicamento_fk FOREIGN KEY (codigo_medicamento ) REFERENCES medicamento(codigo)
);
