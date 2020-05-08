drop table if exists player;

create table player(
id_player bigint auto_increment,
nick varchar(100) not null,
rota double not null,
rank int not null,
primary key (id_player));
