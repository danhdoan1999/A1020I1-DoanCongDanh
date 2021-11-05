drop database if exists luyen_tap_su_dung_csdl;

create database luyen_tap_su_dung_csdl;

use luyen_tap_su_dung_csdl;

create table product_lines(
product_line int primary key,
text_description varchar(50),
html_description varchar(50),
image varchar(50)
);
create table products(
product_code int primary key,
product_name  varchar(50),
product_line_product_lines int,
product_scale  varchar(50),
product_vendor  varchar(50),
product_description varchar(50),
quantity_in_stock int,
buy_price int,
msrp varchar(50),
foreign key(product_line_product_lines) references product_lines(product_line)
);
insert into product_lines
values (1,'green','ferrari','greencar'),
	   (7,'red','bwm','reddot'),
	   (5,'red','huyndai','bluesky'),
	   (4,'orange','camry','dot');
       
insert into products
values (1,'chopper',1,'abc','danh','cute',4,1000,'hihi'),
	   (11,'luffy',7,'aaw','cuong','stink',5,5780,'haha'),
	   (12,'robin',5,'awa','hieu','hater',12,5600,'hoho'),
	   (13,'zoro',4,'xaz','huy','kiuu',43,2000,'hehe'),
       (14,'brook',7,'xfa','hien','ex',34,2113,'huhu');
       
select product_code, product_name, buy_price, quantity_in_stock from products
where buy_price > 1500 and quantity_in_stock > 15;

SELECT product_code,product_name, buy_price, text_description
FROM products p
INNER JOIN product_lines pl
ON pl.product_line = p.product_line_product_lines
WHERE buy_price > 2000 AND buy_price < 6000;

select product_code, product_name, buy_price, quantity_in_stock, product_vendor, product_line_product_lines 
from products p
where product_line_product_lines = '5' or product_vendor = 'hieu';

-- su dung right join 
select *
from product_lines pl
right join products p
on p.product_line_product_lines = pl.product_line 