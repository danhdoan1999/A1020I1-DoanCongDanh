drop database if exists quan_li_mat_bang;

create database quan_li_mat_bang;

use quan_li_mat_bang;

create table mat_bang(
ma_mat_bang varchar(45) primary key not null,
trang_thai varchar(45) not null,
dien_tich varchar(45) not null,
so_tang int not null,
loai_mat_bang varchar(45) not null,
gia_tien int not null,
ngay_bat_dau date not null,
ngay_ket_thuc date not null
);
insert into mat_bang
values ('MB123456','Trong','100',6,'van phong chia se',10000000,'2020-01-01','2020-08-01'),
	   ('MB123457','Ha tang','200',7,'van phong chia se',20000000,'2019-01-01','2020-08-01'),
	   ('MB123458','Day du','150',5,'van phong tron goi',15000000,'2019-01-01','2020-08-01');
       
DELIMITER $$
CREATE PROCEDURE building_list()
BEGIN
select * from mat_bang; 
END$$
DELIMITER ;

call building_list();
