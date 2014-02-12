drop table products if exists

-- Tables
create table products (
	id bigint auto_increment, 
	name varchar(255), 
	description text,
	primary key (id)
);

-- Data
insert into products (name, description) values ('banany', 'kupilem 2 kg bananow');
insert into products (name, description) values ('swinie', 'Do ubicia na kiełbę');
insert into products (name, description) values ('kaloryfer', 'na brzuch');