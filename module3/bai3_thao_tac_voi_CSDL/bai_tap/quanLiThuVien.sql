drop database if exists quan_li_thu_vien;

create database quan_li_thu_vien;

use quan_li_thu_vien;

create table category(
number_type_book varchar(15) primary key,
name_type varchar(50)
);
create table address(
street_address varchar(500) primary key,
city varchar(50),
state varchar(50)
);
create table student(
student_number varchar(15) primary key,
student_name varchar(50),
address varchar(500),
email varchar(50),
image varchar(50),
foreign key (address) references address(street_address)
);
create table book(
book_number varchar(15) primary key,
name_book varchar(50),
quality int,
day_publish varchar(50),
number_type_book varchar(15),
foreign key(number_type_book) references category(number_type_book)
);
create table borrow(
number_borrow varchar(15) primary key,
student_number varchar(15),
book_number varchar(15),
foreign key(student_number) references student(student_number),
foreign key(book_number) references book(book_number)
);