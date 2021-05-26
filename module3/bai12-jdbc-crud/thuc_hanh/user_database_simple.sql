drop database if exists demo;
CREATE DATABASE demo;
USE demo;

create table users (
 id  int(3) NOT NULL AUTO_INCREMENT,
 name varchar(120) NOT NULL,
 email varchar(220) NOT NULL,
 country varchar(120),
 PRIMARY KEY (id)
);
create table Permision(

id int(11) primary key,

name varchar(50)

);
create table User_Permision(

permision_id int(11),

user_id int(11),

foreign key(permision_id) references Permision(id),
foreign key(user_id) references users(id)
);

insert into users(name, email, country) values('Minh','minh@codegym.vn','Viet Nam');
insert into users(name, email, country) values('Kante','kante@che.uk','Kenia');
insert into users(name, email, country) values('danh','danhdoan@che.uk','danang');

insert into Permision(name) values('add');
insert into Permision(name) values('edit');
insert into Permision(name) values('delete');
insert into Permision(name) values('view');

select * from users;
select * from users where country like "%nam%";
select * from User_Permision;

DELIMITER $$

CREATE PROCEDURE get_user_by_id(IN user_id INT)

BEGIN

    SELECT users.name, users.email, users.country

    FROM users

    where users.id = user_id;

    END$$

DELIMITER ;

DELIMITER $$

CREATE PROCEDURE insert_user(

IN user_name varchar(50),

IN user_email varchar(50),

IN user_country varchar(50)

)

BEGIN

    INSERT INTO users(name, email, country) VALUES(user_name, user_email, user_country);

    END$$

DELIMITER ;