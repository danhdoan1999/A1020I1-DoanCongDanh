drop database if exists furama_resort;

create database furama_resort;

use furama_resort;

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
ngay_sinh date,
cmnd varchar(45),
luong varchar(45),
sdt varchar(45),
email varchar(45),
dia_chi varchar(45),
foreign key(id_vi_tri) references vi_tri(id_vi_tri),
foreign key(id_trinh_do) references trinh_do(id_trinh_do),
foreign key(id_bo_phan) references bo_phan(id_bo_phan)
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
insert into vi_tri
values (1,'quan li'),
	   (2,'le tan'),
	   (3,'phuc vu'),
	   (4,'bao ve');
       
insert into trinh_do
values (1,'cu nhan'),
	   (2,'dai hoc'),
	   (3,'trung cap');
       
insert into bo_phan
values (1,'manager'),
	   (2,'sales'),
	   (3,'security');       
insert into dich_vu_di_kem
values (1,'an sang',100000,1,'dang su dung'),       
	   (2,'buffee',230000,1,'chua su dung'),       
	   (3,'coffee',200000,1,'dang su dung');
       
insert into loai_dich_vu
values (1,'vip'), 
	   (2,'thuong');
insert into kieu_thue
values (1,'ngay',250000),        
	   (2,'thang',7000000),        
	   (3,'nam',80000000);
insert into loai_khach
values (1,'vip'),       
       (2,'diamond'),       
       (3,'platinium');
insert into khach_hang
values (1,1,'Danh Doan','1999-12-02','201814047','0905081300','danhdoan1999@gmail.com','da nang'),       
	   (2,3,'Huy Vuong','2000-09-12','201814048','0905081311','huyvuong19@gmail.com','quang ngai'),
       (3,3,'Bich Ngan','1987-01-03','2018140505','0905081334','ngan@gmail.com','quang ngai'),
	   (4,3,'Ngoc Cuong','1994-02-10','201814056','0905081333','cuongngoc19@gmail.com','vinh'),
       (5,3,'Hieu Trong','1995-10-06','201814049','0905081322','hieukute19@gmail.com','quang nam'),
       (6,2,'Minh Hien','1999-09-07','201814050','0905081311','hien19@gmail.com','da nang');
insert into dich_vu
values (1,'massage',300,1,'6','1000000',1,2,'da thue'),       
	   (2,'karaoke',100,2,'8','2000000',1,2,'trong'),       
       (3,'poor',200,1,'10','3000000',2,1,'da thue'),
       (4,'car',50,0,'4','1000000',1,2,'trong');
insert into nhan_vien
values(1,'luffy',4,3,3,'1999-12-31','201914000','4500000','0905244000','luffy@gmail.com','ca mau'),       
	  (2,'nami',1,1,1,'1999-09-20','201914001','6000000','0905244001','nami@gmail.com','binh dinh'),       
	  (3,'chopper',3,1,2,'2001-01-29','201914002','5000000','0905244002','chopper@gmail.com','quang tri'),       
	  (4,'franky',2,2,2,'1995-01-11','201914003','5500000','0905244003','franky@gmail.com','quang binh'),
	  (5,'karik',2,1,2,'1992-11-05','201914004','5800000','0905244004','karik@gmail.com','quang nam');
insert into hop_dong 
values(1,2,1,1,'2021-03-10','2021-03-13',2000000,6000000),
	  (2,2,3,1,'2019-12-10','2019-12-15',1000000,6000000),
	  (3,4,3,3,'2019-07-15','2019-07-20',3000000,5000000),
	  (4,2,5,4,'2019-11-11','2019-02-15',1000000,5000000),
      (5,4,6,2,'2019-02-15','2019-06-09',2000000,3000000),
      (6,5,2,4,'2018-02-15','2018-03-10',1000000,4000000),
      (7,2,4,4,'2016-03-31','2016-04-04',2000000,5000000);
insert into hop_dong_chi_tiet
values (1,3,2,1),
	   (2,1,3,3),
       (3,2,3,3);
-- cau 2 :
-- Hi???n th??? th??ng tin c???a t???t c??? nh??n vi??n c?? trong h??? th???ng 
-- c?? t??n b???t ?????u l?? m???t trong c??c k?? t??? ???H???, ???T??? ho???c ???K??? v?? c?? t???i ??a 15 k?? t???.

select * 
from nhan_vien
where (ten like 'h%' or ten like 't%' or ten like 'k%') and length(ten) <= 15;

-- cau 3 : 
-- 	Hi???n th??? th??ng tin c???a t???t c??? kh??ch h??ng c?? ????? tu???i t??? 18 ?????n 50 tu???i v?? c?? ?????a ch??? ??? ??????? N???ng??? ho???c ???Qu???ng Tr??????.
select * 
from khach_hang 
where dia_chi in('quang tri','da nang') and (curdate()-ngay_sinh_kh > (18*30*365) and curdate()-ngay_sinh_kh < (50*30*365));

-- cau 4 : 
-- 	?????m xem t????ng ???ng v???i m???i kh??ch h??ng ???? t???ng ?????t ph??ng bao nhi??u l???n. 
-- K???t qu??? hi???n th??? ???????c s???p x???p t??ng d???n theo s??? l???n ?????t ph??ng c???a kh??ch h??ng. 
-- Ch??? ?????m nh???ng kh??ch h??ng n??o c?? T??n lo???i kh??ch h??ng l?? ???Diamond???. 

select ho_ten_kh , count(hd.id_khach_hang) as 'so lan dat' 
from khach_hang kh 
inner join hop_dong hd
on kh.id_khach_hang = hd.id_khach_hang
inner join loai_khach lk
on lk.id_loai_khach = kh.id_loai_khach
where ten_loai_khach = 'diamond'
group by kh.id_khach_hang 
order by count(hd.id_khach_hang) ;

-- cau 5 : 
 
 select kh.id_khach_hang , kh.ho_ten_kh , lk.ten_loai_khach , hd.id_hop_dong , dv.ten_dv , hd.ngay_bat_dau , hd.ngay_ket_thuc
 , sum(dv.chi_phi_thue + hdct.so_luong*dvdk.gia_dv) as 'Tong tien'
 from khach_hang kh 
 left join hop_dong hd on kh.id_khach_hang = hd.id_khach_hang
 left join loai_khach lk on kh.id_loai_khach = lk.id_loai_khach
 left join dich_vu dv on dv.id_dich_vu = hd.id_dich_vu
 left join hop_dong_chi_tiet hdct on hdct.id_hop_dong = hd.id_hop_dong
 left join dich_vu_di_kem dvdk on dvdk.id_dvdk = hdct.id_dvdk
 group by hd.id_hop_dong;
 
 -- cau 6 : 
 
 select dv.id_dich_vu , dv.ten_dv , dv.dien_tich , dv.chi_phi_thue , ldv.ten_loai_dv
 from dich_vu dv 
 inner join loai_dich_vu ldv on ldv.id_loai_dv = dv.id_loai_dv
 where not exists (
 select hd.id_hop_dong from hop_dong hd where (hd.ngay_bat_dau between '2019-01-01' and '2019-03-31') and hd.id_dich_vu = dv.id_dich_vu
 );
 
 -- cau 7: 
 -- Hi???n th??? th??ng tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu c???a t???t c??? c??c lo???i d???ch v??? ???? t???ng ???????c 
 -- Kh??ch h??ng ?????t ph??ng trong n??m 2018 nh??ng ch??a t???ng ???????c Kh??ch h??ng ?????t ph??ng  trong n??m 2019.

select dv.id_dich_vu , dv.ten_dv , dv.dien_tich , dv.so_nguoi_toi_da , dv.chi_phi_thue , ldv.ten_loai_dv
from dich_vu dv 
inner join loai_dich_vu ldv on ldv.id_loai_dv = dv.id_loai_dv
where dv.id_dich_vu  in (
select hd.id_dich_vu from hop_dong hd where (year(hd.ngay_bat_dau) = '2018') and hd.id_dich_vu is not null
)
and dv.id_dich_vu not in (
select hd.id_dich_vu from hop_dong hd where (year(hd.ngay_bat_dau) = '2019') and hd.id_dich_vu is not null
);

-- cau 8 :
-- c1:
select distinct ho_ten_kh from khach_hang;
-- c2:
select ho_ten_kh from khach_hang group by ho_ten_kh;
-- c3:
select ho_ten_kh from khach_hang union select ho_ten_kh from khach_hang;

-- cau 9 :
select temp.month , count(month(hd.ngay_bat_dau)) as 'so lan dang ki' , sum(hd.tong_tien) as 'tong tien' from  
 ( select 1 as month
 union  select 2 as month
 union  select 3 as month
 union  select 4 as month
 union  select 5 as month
 union  select 6 as month
 union  select 7 as month
 union  select 8 as month
 union  select 9 as month
 union  select 10 as month
 union  select 11 as month
 union  select 12 as month ) as temp 
 left join hop_dong hd on month(hd.ngay_bat_dau) = temp.month
 left join khach_hang kh on kh.id_khach_hang = hd.id_khach_hang
 where year(hd.ngay_bat_dau) = '2019' or year(hd.ngay_bat_dau) is null or month(hd.ngay_bat_dau) is null
 group by temp.month
 order by temp.month;
 
 -- cau 10 :
 
 select hd.id_hop_dong , hd.ngay_bat_dau , hd.ngay_ket_thuc , hd.tien_dat_coc , count(hdct.id_hdct) as 'so luong dat' 
 from hop_dong hd 
 inner join hop_dong_chi_tiet hdct on hdct.id_hop_dong = hd.id_hop_dong
 group by hdct.id_hop_dong;
 
 -- cau 11 : 
 
 select dvdk.id_dvdk, dvdk.ten_dv,dvdk.gia_dv,dvdk.don_vi from dich_vu_di_kem dvdk
 inner join hop_dong_chi_tiet hdct on hdct.id_dvdk = dvdk.id_dvdk
 inner join hop_dong hd on hd.id_hop_dong = hdct.id_hop_dong
 inner join khach_hang kh on kh.id_khach_hang = hd.id_khach_hang
 inner join loai_khach lk on kh.id_loai_khach = lk.id_loai_khach
 where ten_loai_khach = 'diamond' and (dia_chi in ('vinh','quang ngai'));
 
 -- cau 12 : 
 -- Hi???n th??? th??ng tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem 
 -- (???????c t??nh d???a tr??n t???ng H???p ?????ng chi ti???t), TienDatCoc 
 -- c???a t???t c??? c??c d???ch v??? ???? t???ng ???????c kh??ch h??ng ?????t v??o 3 th??ng cu???i n??m 2019 nh??ng ch??a t???ng ???????c kh??ch h??ng ?????t v??o 6 th??ng ?????u n??m 2019.
 
select hd.id_hop_dong , nv.ten , kh.ho_ten_kh , kh.so_dth , dv.ten_dv , count(hdct.id_dvdk) as 'so lan su dung' , hd.tien_dat_coc 
from dich_vu dv 
inner join hop_dong hd on hd.id_dich_vu = dv.id_dich_vu 
inner join hop_dong_chi_tiet hdct on hdct.id_hop_dong = hd.id_hop_dong
inner join khach_hang kh on kh.id_khach_hang = hd.id_khach_hang
inner join nhan_vien nv on nv.id_nhan_vien = hd.id_nhan_vien
where exists (
select hd.ngay_bat_dau from hop_dong hd where (hd.ngay_bat_dau between '2019-10-01' and '2019-12-31' )
)
and not exists (
select hd.ngay_bat_dau from hop_dong hd where (hd.ngay_bat_dau between '2019-01-01' and '2019-06-30' )
);

-- cau 13 : 
select distinct dvdk.id_dvdk , dvdk.ten_dv,dvdk.gia_dv,dvdk.don_vi from dich_vu_di_kem dvdk
inner join hop_dong_chi_tiet hdct on dvdk.id_dvdk = hdct.id_dvdk 
inner join hop_dong hd on hd.id_hop_dong = hdct.id_hop_dong
where exists (
select id_hdct from hop_dong hd where (hd.id_hop_dong = hdct.id_hop_dong)
);

-- cau 14 : 
-- IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung

select hd.id_hop_dong , ldv.ten_loai_dv , dvdk.ten_dv , count(hdct.id_dvdk) as 'so lan su dung'
from dich_vu_di_kem dvdk 
inner join hop_dong_chi_tiet hdct on hdct.id_dvdk = dvdk.id_dvdk 
inner join hop_dong hd on hd.id_hop_dong = hdct.id_hop_dong
inner join dich_vu dv on dv.id_dich_vu = hd.id_dich_vu
inner join loai_dich_vu ldv on ldv.id_loai_dv = dv.id_loai_dv  
group by (dvdk.id_dvdk) having count(hdct.id_dvdk) = 1;

-- cau 15 : 
-- Hi???n thi th??ng tin c???a t???t c??? nh??n vi??n bao g???m IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi 
-- m???i ch??? l???p ???????c t???i ??a 3 h???p ?????ng t??? n??m 2018 ?????n 2019.

select nv.id_nhan_vien , nv.ten , td.trinh_do , bp.bo_phan , nv.sdt , count(hd.id_nhan_vien) as 'so lan tao hop dong', nv.dia_chi 
from nhan_vien nv
inner join hop_dong hd on nv.id_nhan_vien = hd.id_nhan_vien
inner join trinh_do td on td.id_trinh_do = nv.id_trinh_do  
inner join bo_phan bp on bp.id_bo_phan = nv.id_bo_phan
where hd.ngay_bat_dau between '2018-01-01' and '2019-12-31'
group by hd.id_nhan_vien having count(hd.id_nhan_vien) <= 3;

-- cau 16 : 
delete from nhan_vien nv where not exists (
select nv.id_nhan_vien from hop_dong hd where (hd.ngay_bat_dau between '2017-01-01' and '2019-12-31') and hd.id_nhan_vien = nv.id_nhan_vien
);
-- cau 17 : 
update khach_hang kh , (select hd.id_khach_hang as id_temp , sum(hd.tong_tien) from hop_dong hd 
										   where year(ngay_bat_dau) = '2019'
                                           group by hd.id_khach_hang having sum(hd.tong_tien) > 10000000) as temp
						set kh.id_loai_khach = (select lk.id_loai_khach from loai_khach lk where ten_loai_khach = 'diamond')
                        where kh.id_loai_khach = (select lk.id_loai_khach from loai_khach lk where ten_loai_khach = 'platinium') 
                        and temp.id_temp = kh.id_khach_hang;
                        
select * from khach_hang ; 

-- cau 18 :
delete from khach_hang kh where exists(   
select hd.id_khach_hang from hop_dong hd where year(hd.ngay_bat_dau) <= 2016 and hd.id_khach_hang = kh.id_khach_hang
); 
 select * from khach_hang ;                                                                                                          
-- cau 19 : 
update dich_vu_di_kem dvdk inner join (select dvdk.id_dvdk as 'id_temp' , count(hdct.id_dvdk) as 'so_lan_su_dung' 
													 from hop_dong_chi_tiet hdct
                                                     inner join hop_dong hd on hdct.id_hop_dong = hd.id_hop_dong
                                                     inner join dich_vu_di_kem dvdk on dvdk.id_dvdk = hdct.id_dvdk
                                                     where year(hd.ngay_bat_dau) = '2019' and dvdk.id_dvdk = hdct.id_dvdk 
                                                     group by hdct.id_dvdk having so_lan_su_dung <= 2 ) 
						   as temp set dvdk.gia_dv =  dvdk.gia_dv*2 where dvdk.id_dvdk = temp.id_temp;
select * from dich_vu_di_kem;
-- cau 20 : 
select id_nhan_vien as 'id',ten,ngay_sinh,cmnd,sdt,email,dia_chi,"nhanvien" from nhan_vien
union all
select id_khach_hang as 'id',ho_ten_kh,ngay_sinh_kh,cmnd_kh,so_dth,email,dia_chi,"khachhang" from khach_hang;

-- cau 21 :
-- T???o khung nh??n c?? t??n l?? V_NHANVIEN ????? l???y ???????c th??ng tin c???a t???t c??? c??c nh??n vi??n c?? ?????a ch??? l?? ???H???i Ch??u??? v?? ???? t???ng l???p h???p ?????ng cho 1 ho???c nhi???u Kh??ch h??ng b???t k???  v???i ng??y l???p h???p ?????ng l?? ???12/12/2019???
create view v_nhanvien as 
select distinct * from nhan_vien nv 
inner join hop_dong hd on nv.id_nhan_vien = hd.id_nhan_vien where nv.dia_chi = 'da nang' and hd.ngay_bat_dau = '2019-12-12';

-- cau 22 : 
-- Th??ng qua khung nh??n V_NHANVIEN th???c hi???n c???p nh???t ?????a ch??? th??nh ???Li??n Chi???u??? ?????i v???i t???t c??? c??c Nh??n vi??n ???????c nh??n th???y b???i khung nh??n n??y.
update nhan_vien nv set dia_chi = 'lien chieu' where nv.id_nhan_vien in (select id_nhan_vien from v_nhan_vien);
-- cau 23 : 
-- T???o Store procedure Sp_1 D??ng ????? x??a th??ng tin c???a m???t Kh??ch h??ng n??o ???? v???i Id Kh??ch h??ng ???????c truy???n v??o nh?? l?? 1 tham s??? c???a Sp_1
delimiter //
create procedure sp_1(in id_khach_hang int)
begin
	delete khach_hang from khach_hang kh where kh.id_khach_hang = id_khach_hang; 
end
   
// delimiter 

call sp_1(9);
-- cau 24 : 
delimiter //
drop procedure if exists sp_2 // 
create procedure sp_2(in id_hop_dong int , in in_nhan_vien int , in id_khach_hang int , in id_dich_vu int , in ngay_bat_dau date , in ngay_ket_thuc date , in tien_dat_coc int , in tong_tien int)
begin
set @x = (select count(id_hop_dong) from hop_dong hd where hd.id_hop_dong = id_hop_dong group by hd.id_hop_dong);
if(@x is null and (select id_nhan_vien from nhan_vien nv where nv.id_nhan_vien = id_nhan_vien)
			  and (select id_khach_hang from khach_hang kh where kh.id_khach_hang = id_khach_hang)
              and (select id_dich_vu from dich_vu dv where dv.id_dich_vu = id_dich_vu)
              and (ngay_ket_thuc > ngay_bat_dau)) 
              then insert hop_dong values (id_hop_dong , id_nhan_vien , id_khach_hang,id_dich_vu , ngay_bat_dau,ngay_ket_thuc,tien_dat_coc,tong_tien);
              else signal sqlstate '45000' set message_text = 'sai du lieu';
              end if;
end 
// delimiter ;

-- cau 25 :
-- T???o triggers c?? t??n Tr_1 X??a b???n ghi trong b???ng HopDong th?? hi???n th??? t???ng s??? l?????ng b???n ghi c??n l???i c?? trong b???ng HopDong ra giao di???n console c???a database

delimiter //
drop trigger if exists tr_1 //
create trigger tr_1 after delete on hop_dong for each row
begin
set @x = (select count(*) from hop_dong );
end;
// delimiter ;
-- chay 
set @x = 0;
delete from hop_dong hd where hd.id_hop_dong = 5;
select @x as 'so luong hop dong sau khi xoa';

-- cau 26 :
-- T???o triggers c?? t??n Tr_2 Khi c???p nh???t Ng??y k???t th??c h???p ?????ng, 
-- c???n ki???m tra xem th???i gian c???p nh???t c?? ph?? h???p hay kh??ng, v???i quy t???c sau: 
-- Ng??y k???t th??c h???p ?????ng ph???i l???n h??n ng??y l??m h???p ?????ng ??t nh???t l?? 2 ng??y. 
-- N???u d??? li???u h???p l??? th?? cho ph??p c???p nh???t, n???u d??? li???u kh??ng h???p l??? th?? in ra th??ng b??o 
-- ???Ng??y k???t th??c h???p ?????ng ph???i l???n h??n ng??y l??m h???p ?????ng ??t nh???t l?? 2 ng??y??? tr??n console c???a database

delimiter //
drop trigger if exists tr_2 //
create trigger tr_2 after update on hop_dong for each row 
begin
if datediff(new.ngay_ket_thuc , old.ngay_bat_dau) < 2 then
signal sqlstate '45000' set message_text = 'Ng??y k???t th??c h???p ?????ng ph???i l???n h??n ng??y l??m h???p ?????ng ??t nh???t l?? 2 ng??y';
end if; 
end;
// delimiter ;
 -- chay thu trigger 
 update hop_dong set ngay_ket_thuc = '2019-01-16' where (id_hop_dong = 3);
 
-- cau 27 :
-- T???o user function th???c hi???n y??u c???u sau:
-- T???o user function func_1: ?????m c??c d???ch v??? ???? ???????c s??? d???ng v???i T???ng ti???n l?? > 2.000.000 VN??.
select count(distinct id_dich_vu) from hop_dong where id_dich_vu in (select id_dich_vu from hop_dong)
												group by id_dich_vu having sum(tong_tien) > 2000000;
-- T???o user function Func_2: T??nh kho???ng th???i gian d??i nh???t t??nh t??? l??c b???t ?????u l??m h???p ?????ng ?????n l??c k???t th??c h???p ?????ng 
-- m?? Kh??ch h??ng ???? th???c hi???n thu?? d???ch v??? 
-- (l??u ?? ch??? x??t c??c kho???ng th???i gian d???a v??o t???ng l???n l??m h???p ?????ng thu?? d???ch v???, kh??ng x??t tr??n to??n b??? c??c l???n l??m h???p ?????ng). 
-- M?? c???a Kh??ch h??ng ???????c truy???n v??o nh?? l?? 1 tham s??? c???a function n??y.

delimiter //
drop function if exists func_1 // 
create function func_1() returns int 
deterministic
begin
create temporary table temp
(select count(distinct id_dich_vu) from hop_dong where id_dich_vu in (select distinct id_dich_vu from hop_dong)
												group by id_dich_vu having sum(tong_tien) > 2000000);
                                                set @tong_so_dich_vu = (select count(*) from temp);
                                                drop temporary table temp;
                                                return @tong_so_dich_vu;
end;
-- chay thu 
select func_1() as 'so luong dich vu co tong tien tren 2000000'
// delimiter 
-- b
delimiter // 
drop function if exists func_2 //
create function func_2( id_khach_hang int) returns int 
deterministic
begin
set @time_dai_nhat = (select max(datediff(hd.ngay_ket_thuc,hd.ngay_bat_dau)) from hop_dong hd 
																			 where hd.id_khach_hang = id_khach_hang);
																			 return @time_dai_nhat;	
end;
-- chay thu vs khach hang co id la 6 
select func_2(6) as 'thoi gian dai nhat'
// delimiter 

-- cau 28 : 
                                                
