CREATE TABLE professor (id_professor SERIAL PRIMARY KEY, 
nome varchar(100) NOT NULL, 
nome_turma varchar);

CREATE TABLE file (
id varchar(100),
name varchar(100),
type varchar(100),
data oid); 


CREATE TABLE atividade (id_atividade SERIAL PRIMARY KEY,
nome varchar(30) NOT NULL,
data date NOT NULL,
nota_max real NOT NULL,
enviado boolean default false);

CREATE TABLE aluno (id_aluno SERIAL PRIMARY KEY,
nome varchar(30) NOT NULL,
email varchar(100) NOT NULL,
matricula INTEGER NOT NULL, 
nota real,
id_atividade INTEGER NOT NULL,
FOREIGN KEY(id_atividade) REFERENCES atividade(id_atividade));




