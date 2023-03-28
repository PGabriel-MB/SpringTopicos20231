use anotacao;

create table ant_anotacao (
  ant_id bigint unsigned not null auto_increment,
  ant_texto varchar(20) not null,
  ant_data_hora datetime not null default current_timestamp,
  ant_usr_id bigint unsigned not null,
  primary key (ant_id),
  foreign key aut_usr_fk (ant_usr_id) references usr_usuario (usr_id) on delete restrict on update cascade
);