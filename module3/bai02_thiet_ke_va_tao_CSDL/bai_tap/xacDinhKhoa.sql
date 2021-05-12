drop database if exists xac_dinh_khoa_chinh_khoa_phu;

create database xac_dinh_khoa_chinh_khoa_phu;

use xac_dinh_khoa_chinh_khoa_phu;

create table customers(
customer_number int primary key,
fullname varchar(30),
address varchar(30),
email varchar(30),
phone varchar(12)
);
create table accounts(
account_number int primary key,
account_type  varchar(30),
`date` date,
balance double,
customer_number_customers int,
foreign key (customer_number_customers) references customers(customer_number) 
);
create table transactions(
tran_number int primary key,
account_number int,
`date` date,
amounts double,
descriptions varchar(50),
account_number_accounts int ,
foreign key (account_number_accounts) references accounts(account_number)
);