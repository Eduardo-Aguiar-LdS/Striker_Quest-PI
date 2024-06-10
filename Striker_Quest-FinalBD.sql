drop database if exists striker_quest;
create database if not exists striker_quest;
use striker_quest;

create table Professor (
id_professor int primary key auto_increment,
nome_professor varchar(50) not null,
senha varchar(50) not null,
email varchar(50) not null unique, 
rg_professor varchar(20) not null unique);
-- describe Professor;
insert into Professor(nome_professor, senha, email, rg_professor) values('teste_nome_professor', 'teste_senha', 'teste_email', 'teste_rg_professor');
select * from Professor;

create table Turma (
id_turma int primary key auto_increment,
nome_turma varchar(30) not null unique,
id_professor int,
foreign key(id_professor) references Professor(id_professor));
-- describe Turma;
select * from Turma;
delete from Turma where id_professor = 1;

create table Jogador (
id_jogador int primary key auto_increment,
nome_jogador varchar(50) not null,
rg varchar(20) not null unique,
pontuacao int,
maior_pontuacao int,
id_turma int,
foreign key(id_turma) references Turma(id_turma));
-- describe Jogador;
-- insert into Jogador (nome_jogador, rg, id_turma) values (teste, teste, 1);
select * from Jogador;