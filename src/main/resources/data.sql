create table person
(
	id integer not null,
	name varchar(255) not null,
	location varchar(255),
	date_birth timestamp,
	primary key(id)
);

insert into person (id,name,location,date_birth) values (10001,'Bharath Kumar','Chengalpattu',sysdate());
insert into person (id,name,location,date_birth) values (10002,'Reethi','Potheri',sysdate());
insert into person (id,name,location,date_birth) values (10003,'Abdul','Pallavaram',sysdate());