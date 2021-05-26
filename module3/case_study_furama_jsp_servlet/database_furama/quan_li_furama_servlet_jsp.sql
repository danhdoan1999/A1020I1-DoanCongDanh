drop database if exists furama_resort_jsp_servlet;

create database furama_resort_jsp_servlet;

use furama_resort_jsp_servlet;

create table vi_tri(
id_vi_tri int primary key,
ten_vi_tri varchar(45)
);
create table trinh_do(
id_trinh_do int primary key,
trinh_do varchar(45)
);
create table bo_phan(
id_bo_phan int primary key,
bo_phan varchar(45)
);
create table dich_vu_di_kem(
id_dvdk int primary key,
ten_dv varchar(45),
gia_dv int,
don_vi int,
trang_thai varchar(45)
);
create table loai_khach(
id_loai_khach int primary key,
ten_loai_khach varchar(45)
);
create table kieu_thue(
id_kieu_thue int primary key,
ten_kieu_thue varchar(45),
gia int 
);
create table loai_dich_vu(
id_loai_dv int primary key,
ten_loai_dv varchar(45)
);

create table vai_tro(
id_vai_tro int primary key,
ten_vai_tro varchar(45)
);

create table tai_khoan(
ten_tai_khoan varchar(45) primary key,
mat_khau varchar(45)
);

create table dich_vu(
id_dich_vu int primary key,
ten_dv varchar(45),
dien_tich int,
so_tang int,
so_nguoi_toi_da varchar(45),
chi_phi_thue varchar(45),
id_kieu_thue int,
id_loai_dv int,
trang_thai varchar(45),
foreign key(id_kieu_thue) references kieu_thue(id_kieu_thue),
foreign key(id_loai_dv) references loai_dich_vu(id_loai_dv)
);
create table khach_hang(
id_khach_hang int primary key,
id_loai_khach int,
ho_ten_kh varchar(45),
ngay_sinh_kh date,
gioi_tinh varchar(10),
cmnd_kh varchar(45),
so_dth varchar(45),
email varchar(45),
dia_chi varchar(45),
foreign key (id_loai_khach) references loai_khach(id_loai_khach)
);
create table nhan_vien(
id_nhan_vien int primary key,
ten varchar(45),
id_vi_tri int,
id_trinh_do int,
id_bo_phan int,
ten_tai_khoan varchar(45),
ngay_sinh date,
cmnd varchar(45),
luong varchar(45),
sdt varchar(45),
email varchar(45),
dia_chi varchar(45),
foreign key(id_vi_tri) references vi_tri(id_vi_tri),
foreign key(id_trinh_do) references trinh_do(id_trinh_do),
foreign key(id_bo_phan) references bo_phan(id_bo_phan),
foreign key(ten_tai_khoan) references tai_khoan(ten_tai_khoan)
);
create table hop_dong(
id_hop_dong int primary key,
id_nhan_vien int,
id_khach_hang int,
id_dich_vu int,
ngay_bat_dau date,
ngay_ket_thuc date,
tien_dat_coc int,
tong_tien int,
foreign key(id_nhan_vien) references nhan_vien(id_nhan_vien),
foreign key(id_khach_hang) references khach_hang(id_khach_hang),
foreign key(id_dich_vu) references dich_vu(id_dich_vu)
);
create table hop_dong_chi_tiet(
id_hdct int primary key,
id_hop_dong int,
id_dvdk int,
so_luong int,
foreign key(id_dvdk) references dich_vu_di_kem(id_dvdk),
foreign key(id_hop_dong) references hop_dong(id_hop_dong)
);

create table vai_tro_tai_khoan(
id_vai_tro int,
ten_tai_khoan varchar(45),
foreign key(id_vai_tro) references vai_tro(id_vai_tro),
foreign key(ten_tai_khoan) references tai_khoan(ten_tai_khoan)
);

insert into vi_tri
values (1,'le tan'),
	   (2,'phuc vu'),
	   (3,'chuyen vien'),
	   (4,'giam sat'),
       (5,'quan li'),
       (6,'giam doc');
       
insert into trinh_do
values (1,'trung cap'),
	   (2,'cao dang'),
	   (3,'dai hoc'),
       (4,'sau dai hoc');
insert into bo_phan
values (1,'marketing'),
	   (2,'hanh chinh'),
	   (3,'phuc vu'),       
	   (4,'quan ly');
insert into dich_vu_di_kem
values (1,'massage',100000,1,'dang su dung'),       
	   (2,'karaoke',100000,1,'chua su dung'),       
	   (3,'food',150000,1,'dang su dung'),       
	   (4,'drink',50000,1,'dang su dung'),       
	   (5,'car',200000,1,'dang su dung');
       
insert into loai_dich_vu
values (1,'vip'), 
	   (2,'thuong');
       
insert into vai_tro
values (1,'quan ly he thong'), 
	   (2,'quan ly khach hang');

insert into tai_khoan
values ('danhdoan1999','danhkute99'), 
	   ('minhhien0709','minhhien11'),     
	   ('tronghieu33','handsomebo1'),
       ('huyvuong1901','huyhuy1212'),
       ('tungnguyen154','nguyen123456'),
       ('vanduy13121','duyduy123');
       
insert into kieu_thue
values (1,'ngay',250000),        
	   (2,'thang',7000000),        
	   (3,'nam',80000000);
insert into loai_khach
values (1,'diamond'),       
       (2,'platinium'),       
       (3,'gold'),       
       (4,'silver'),       
       (5,'member');
insert into khach_hang
values (1,1,'Danh Doan','1999-12-02','nam','201814047','0905081300','danhdoan1999@gmail.com','da nang'),       
	   (2,3,'Huy Vuong','2000-09-12','nam','201814048','0905081311','huyvuong19@gmail.com','quang ngai'),
       (3,3,'Bich Ngan','1987-01-03','nu','2018140505','0905081334','ngan@gmail.com','quang ngai');
insert into dich_vu
values (1,'villa',300,3,'20','11000000',1,2,'da thue'),       
	   (2,'house',100,2,'8','4500000',1,2,'da thue'),       
       (3,'room',200,1,'4','2800000',2,1,'da thue');
insert into nhan_vien
values(1,'danh doan',4,3,3,'danhdoan1999','1999-12-31','201914000','4500000','0905244000','luffy@gmail.com','ca mau'),       
	  (2,'minh hien',1,1,1,'minhhien0709','1999-09-20','201914001','6000000','0905244001','nami@gmail.com','binh dinh'),       
	  (3,'nguyen tung',3,1,2,'tungnguyen154','2001-01-29','201914002','5000000','0905244002','chopper@gmail.com','quang tri'),       
	  (4,'van duy',2,2,2,'vanduy13121','1995-01-11','201914003','5500000','0905244003','franky@gmail.com','quang binh'),
	  (5,'van huy',2,1,2,'huyvuong1901','1992-11-05','201914004','5800000','0905244004','karik@gmail.com','quang nam');
insert into hop_dong 
values(1,2,1,1,'2021-03-10','2021-03-13',2000000,6000000),
	  (2,2,3,1,'2019-12-10','2019-12-15',1000000,6000000),
	  (3,4,3,3,'2019-07-15','2019-07-20',3000000,5000000),
	  (4,2,2,2,'2019-11-11','2019-02-15',1000000,5000000),
      (5,4,2,2,'2019-02-15','2019-06-09',2000000,3000000),
      (6,5,2,3,'2018-02-15','2018-03-10',1000000,4000000),
      (7,2,1,1,'2016-03-31','2016-04-04',2000000,5000000);	
insert into hop_dong_chi_tiet
values (1,3,2,1),
	   (2,1,1,3),
       (3,2,4,3);
insert into vai_tro_tai_khoan
values (1,'danhdoan1999'),
	   (1,'minhhien0709'),
       (2,'huyvuong1901'),
       (2,'vanduy13121'),
       (2,'tungnguyen154');
