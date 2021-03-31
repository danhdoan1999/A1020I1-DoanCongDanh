drop database if exists classic_models;

create database classic_models;

use classic_models;

create table customers (
id int primary key,
namecustomer varchar(20),
phone varchar(20),
city varchar(20),
country varchar(20)
);
insert into customers 
values (1 , 'Danh' , '0905081300','Da Nang','Viet Nam'),
	   (2 , 'Hieu' , '0908765432','Hue','Viet Nam'),
	   (3 , 'Cuong' , '0905244870','Quang Binh','Viet Nam'),
	   (4 , 'Huy' , '0122582442','Ca Mau','Viet Nam');

select * from customers;
-- hien thi tat ca thong tin cua customer

select namecustomer,phone,city from customers;
-- hien thi ten,sdt,thanh pho trong bang customers

select namecustomer,phone from customers where namecustomer like '%a%'; 
-- hien thi so dien thoai cua cua khach hang co ten chua ki tu a . 

select * from customers where namecustomer = 'Huy';
-- hien thi tat ca thong tin cua customer co ten la Huy

select * from customers where city in ('Da Nang','Quang Nam','Hue');
-- hien thi tat ca thong tin KH co thanh pho la DN,QN,H

 alter table customers add column tuoi int;
-- them cot tuoi cho bang customers 	 

update customers set tuoi = '18';
-- cap nhat tuoi cho customer 

set SQL_SAFE_UPDATES = 0;

update customers set city = 'Thua Thien Hue' where namecustomer = 'Cuong';
-- chinh sua city cua customers co ten la Cuong

delete from customers where id = 3;
-- xoa thong tin customers co id la 3 

-- drop database classic_models;
-- xoa database classic_models

-- drop table customers;
-- xoa bang customers 

