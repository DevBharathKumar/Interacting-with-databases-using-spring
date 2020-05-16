/* Commenting it because the jpa creates the table by itself 
 * 
 * create table person
(
	id integer not null,
	name varchar(255) not null,
	location varchar(255),
	birth_date timestamp,
	primary key(id)
);*/

insert into person (id,name,location,birth_date) values (10001,'Bharath Kumar','Chengalpattu',sysdate());
insert into person (id,name,location,birth_date) values (10002,'Reethi','Potheri',sysdate());
insert into person (id,name,location,birth_date) values (10003,'Abdul','Pallavaram',sysdate());