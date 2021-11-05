drop database if exists su_dung_cac_ham;

create database su_dung_cac_ham;

use su_dung_cac_ham;

create table student(
id int ,
ten varchar(50),
tuoi int,
khoa_hoc varchar(50),
tien_hoc int
);

insert into student
values (1,'hoang',21,'cntt',400000),
	   (2,'viet',19,'dtvt',320000),
	   (3,'thanh',18,'ktdn',400000),
	   (4,'nhan',19,'ck',450000),
	   (5,'huong',20,'tcnh',500000),
	   (5,'huong',20,'tcnh',200000);
       
select * 
from student
where ten = 'huong';

select ten , sum(tien_hoc) 'tong tien'
from student
where ten = 'huong';

select distinct ten  
from student ;