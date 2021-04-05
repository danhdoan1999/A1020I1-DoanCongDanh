drop database if exists make_primary_key;

create database make_primary_key;

use make_primary_key;

create table users(
id_user int auto_increment primary key, -- cach 1
name_user varchar(50),
age_user int ,
city varchar(20)
);
create table roles(
id_roles int auto_increment,
name_roles varchar(20),
primary key(id_roles) -- cach 2 
);
create table userroles(
id_user int,
id_roles int,
primary key(id_user,id_roles) -- khoa chinh to hop
);

-- cau lenh bo sung khoa chinh khi da tao bang 
-- alter table users add primary key(name_user)