drop database if exists furama_resort_jsp_servlet;

create database furama_resort_jsp_servlet;

use furama_resort_jsp_servlet;

create table vi_tri(
id_vi_tri int primary key not null,
ten_vi_tri varchar(45) not null
);
create table trinh_do(
id_trinh_do int primary key not null,
trinh_do varchar(45) not null
);
create table bo_phan(
id_bo_phan int primary key not null,
bo_phan varchar(45) not null
);
create table dich_vu_di_kem(
id_dvdk int primary key not null,
ten_dv varchar(45) not null,
gia_dv int not null,
don_vi int not null,
trang_thai varchar(45) not null
);
create table loai_khach(
id_loai_khach int primary key not null,
ten_loai_khach varchar(45) not null
);
create table kieu_thue(
id_kieu_thue int primary key not null,
ten_kieu_thue varchar(45) not null,
gia int not null
);
create table loai_dich_vu(
id_loai_dv int primary key not null,
ten_loai_dv varchar(45) not null
);

create table vai_tro(
id_vai_tro int primary key not null,
ten_vai_tro varchar(45) not null
);

create table tai_khoan(
ten_tai_khoan varchar(45) primary key not null,
mat_khau varchar(45) default '123456'
);

create table dich_vu(
id_dich_vu int primary key not null auto_increment,
ten_dv varchar(45) not null,
dien_tich int not null,
so_tang int not null,
so_nguoi_toi_da varchar(45) not null,
chi_phi_thue varchar(45) not null,
id_kieu_thue int not null,
id_loai_dv int not null,
trang_thai varchar(45) not null,
foreign key(id_kieu_thue) references kieu_thue(id_kieu_thue),
foreign key(id_loai_dv) references loai_dich_vu(id_loai_dv)
);
create table khach_hang(
id_khach_hang int primary key not null auto_increment,
id_loai_khach int not null,
ho_ten_kh varchar(45) not null,
ngay_sinh_kh date not null,
gioi_tinh varchar(10) not null,
cmnd_kh varchar(45) not null,
so_dth varchar(45) not null,
email varchar(45) not null,
dia_chi varchar(45) not null,
foreign key (id_loai_khach) references loai_khach(id_loai_khach)
);
create table nhan_vien(
id_nhan_vien int primary key not null auto_increment,
ten varchar(45) not null,
id_vi_tri int not null,
id_trinh_do int not null,
id_bo_phan int not null,
ten_tai_khoan varchar(45),
ngay_sinh date not null,
cmnd varchar(45) not null,
luong varchar(45) not null,
sdt varchar(45) not null,
email varchar(45) not null,
dia_chi varchar(45) not null,
foreign key(id_vi_tri) references vi_tri(id_vi_tri),
foreign key(id_trinh_do) references trinh_do(id_trinh_do),
foreign key(id_bo_phan) references bo_phan(id_bo_phan),
foreign key(ten_tai_khoan) references tai_khoan(ten_tai_khoan)
);
create table hop_dong(
id_hop_dong int primary key not null auto_increment,
id_nhan_vien int not null,
id_khach_hang int not null,
id_dich_vu int not null,
ngay_bat_dau date not null,
ngay_ket_thuc date not null,
tien_dat_coc int not null,
tong_tien int not null,
foreign key(id_nhan_vien) references nhan_vien(id_nhan_vien),
foreign key(id_khach_hang) references khach_hang(id_khach_hang),
foreign key(id_dich_vu) references dich_vu(id_dich_vu)
);
create table hop_dong_chi_tiet(
id_hdct int primary key not null,
id_hop_dong int not null,
id_dvdk int not null,
so_luong int not null,
foreign key(id_dvdk) references dich_vu_di_kem(id_dvdk),
foreign key(id_hop_dong) references hop_dong(id_hop_dong)
);

create table vai_tro_tai_khoan(
id_vai_tro int not null,
ten_tai_khoan varchar(45) not null,
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
       (3,2,'Bich Ngan','1987-01-03','nu','2018140505','0905081334','ngan@gmail.com','hue'),
       (4,1,'Bich Thao','1997-12-03','nu','2018140506','0905081335','abc123@gmail.com','quang binh'),
       (5,4,'Hieu Vuong','1967-10-12','nam','2018140507','0905081356','nganngan1231@gmail.com','quang binh'),
       (6,5,'Minh Hien','1999-11-12','nam','2018140577','0905081111','minhhien1231@gmail.com','binh dinh'),
       (7,4,'Ngoc Cuong','1999-05-25','nam','2018140589','0905081263','ngoccuong1231@gmail.com','ha noi'),
       (8,5,'Anh Khoa','1980-06-11','nam','2018140566','0905081235','anhkhoa1231@gmail.com','da lat');
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

DELIMITER $$
CREATE PROCEDURE customer_list()
BEGIN
select id_khach_hang,ho_ten_kh ,ngay_sinh_kh ,gioi_tinh ,cmnd_kh,so_dth,email,ten_loai_khach,dia_chi 
from khach_hang kh inner join loai_khach lk 
on kh.id_loai_khach = lk.id_loai_khach;
END$$
DELIMITER ;

call customer_list;

DELIMITER $$
CREATE PROCEDURE customer_create(
	IN `name` varchar(45),
	IN birthday date,
	IN gender varchar(10),
    IN id_card varchar(45),
    IN phone varchar(45),
    IN email varchar(45),
    IN `type` int,
    IN address varchar(45)
)
BEGIN
    insert into khach_hang(ho_ten_kh, ngay_sinh_kh, gioi_tinh, cmnd_kh, so_dth, email, id_loai_khach, dia_chi) 
    values(`name`, birthday, gender, id_card, phone, email, `type`, address);
END$$
DELIMITER ;

DELIMITER $$
CREATE PROCEDURE customer_delete(
	IN id INT
)
BEGIN
    delete from khach_hang where khach_hang.id_khach_hang = id;
END$$
DELIMITER ;

 call customer_create('Trinh', '1021-5-25', 'nu', '123123123', '0987654321', 'Trinh@gmail.com', 2, 'Da nang');

DELIMITER $$
CREATE PROCEDURE customer_update(
	IN id INT,
	IN `name` varchar(45),
	IN birthday date,
	IN gender bit(1),
    IN id_card int,
    IN phone int,
    IN email varchar(45),
    IN `type` int,
    IN address varchar(45)
)
BEGIN
    update khach_hang kh
    set kh.ho_ten_kh = `name`, kh.ngay_sinh_kh = birthday, kh.gioi_tinh = gender, kh.cmnd_kh = id_card, kh.so_dth = phone, kh.email = email, kh.id_loai_khach = `type`, kh.dia_chi = address
    where kh.id_khach_hang = id;
END$$
DELIMITER ;

DELIMITER $$
CREATE PROCEDURE get_customer_by_id(IN id INT)
BEGIN
    select id_khach_hang,ho_ten_kh ,ngay_sinh_kh ,gioi_tinh ,cmnd_kh,so_dth,email,ten_loai_khach,dia_chi
    from khach_hang kh inner join loai_khach lk
	on kh.id_loai_khach = lk.id_loai_khach
    where kh.id_khach_hang = id;
END$$
DELIMITER ;

call get_customer_by_id(1);

select * from khach_hang;

DELIMITER $$
CREATE PROCEDURE employee_list()
BEGIN
    select id_nhan_vien, ten,ngay_sinh , cmnd, luong, sdt, email,dia_chi, ten_vi_tri , trinh_do ,bo_phan , ten_tai_khoan
    from nhan_vien nv left join vi_tri vt 
    on nv.id_vi_tri = vt.id_vi_tri left join trinh_do td
    on nv.id_trinh_do = td.id_trinh_do left join bo_phan bp
    on nv.id_bo_phan = bp.id_bo_phan;
END$$
DELIMITER ;

call employee_list();

DELIMITER $$
CREATE PROCEDURE employee_create(
	IN `name` varchar(45),
	IN birthday date,
    IN id_card varchar(45),
    IN salary varchar(45),
    IN phone varchar(45),
    IN email varchar(45),
    IN address varchar(45),
	IN position int,
    IN education_degree int,
    IN division int,
    IN username varchar(45)
    
)
BEGIN
	insert into tai_khoan(ten_tai_khoan)
    values(username);
    insert into nhan_vien(ten, ngay_sinh, cmnd, luong, sdt, email, dia_chi, id_vi_tri, id_trinh_do, id_bo_phan, ten_tai_khoan)
    values(`name`, birthday, id_card, salary, phone, email, address, position, education_degree, division, username);
END$$
DELIMITER ;
-- call employee_create('La Chinh', '2000-5-25', '200035689', '8500000', '0987654321', 'lachinh123@gmail.com', 'Da nang', 2, 3, 1, 'lachinh');  

