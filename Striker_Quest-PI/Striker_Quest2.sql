drop database if exists striker_quest;
create database if not exists striker_quest;
use striker_quest;

create table Professor (
id_professor int primary key auto_increment,
nome_professor varchar(50) not null,
senha varchar(50) not null,
email varchar(50) not null unique, 
rg_professor varchar(20) not null unique);
describe Professor;

create table Turma (
id_turma int primary key auto_increment,
nome_turma varchar(30) not null unique,
id_professor int,
foreign key(id_professor) references Professor(id_professor));
describe Turma;

create table Jogador (
id_jogador int primary key auto_increment,
nome_jogador varchar(50) not null,
rg varchar(20) not null unique,
pontuacao int,
maior_pontuacao int,
id_turma int,
foreign key(id_turma) references Turma(id_turma));
describe Jogador;

create table Pergunta(
id_pergunta int primary key auto_increment,
pergunta varchar(50) not null unique,
id_professor int,
foreign key(id_professor) references Professor(id_professor));
describe Pergunta;

create table Resposta (
id_resposta int primary key auto_increment,
resposta varchar(200) not null,
id_pergunta int,
foreign key(id_pergunta) references Pergunta(id_pergunta));
describe Resposta;