create database nba;

create table equipe (
    idequipe serial primary key,
    nom varchar(50)
);

create table joueur (
    idjoueur serial primary key,
    idequipe int references equipe(idequipe),
    nom varchar(50),
    prenom varchar(50)
);

create table match(
    idmatch serial primary key,
    equipea int references equipe(idequipe),
    equipeb int references equipe(idequipe),
    date date default current_date
);

create table composition (
    idcomposition serial primary key,
    idmatch int references match(idmatch),
    idjoueur int references joueur(idjoueur)
);

create table statistique (
    idstatistique serial primary key,
    idmatch int references match(idmatch),
    idjoueur int references joueur(idjoueur),
    p3tire int default 0,
    p3marque int default 0,
    p2tire int default 0,
    p2marque int default 0,
    rboff int default 0,
    rbdeff int default 0,
    passedes int default 0
);

insert into statistique values (default,1,1,7,6,6,5,4,2,10);
insert into statistique values (default,1,2,6,4,6,3,1,3);
