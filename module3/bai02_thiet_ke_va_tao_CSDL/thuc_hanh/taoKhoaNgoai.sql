drop database if exists make_foreign_key;

create database make_foreign_key;

use make_foreign_key;

create table customer(
id int auto_increment primary key,
namecus varchar(20),
address varchar(20),
email varchar(20) 
);
create table orders(
id int auto_increment,
staff varchar(20),
primary key(id),
id_customer int,
foreign key (id_customer) references customer(id)
);