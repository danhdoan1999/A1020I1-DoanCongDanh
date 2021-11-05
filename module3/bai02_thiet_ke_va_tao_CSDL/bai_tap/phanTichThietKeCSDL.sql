drop database if exists car_store;

create database car_store;

use car_store;

create table offices(
officeCode varchar(10) primary key not null,
city varchar(50) not null,
phone varchar(50) not null,
addressLine1 varchar(50) not null,
addressLine2 varchar(50) ,
state varchar(50) not null,
country varchar(50) not null,
postalCode varchar(15) not null
);
create table employees(
employeeNumber int not null primary key,
lastName varchar(50) not null,
firstName varchar(50) not null,
email varchar(100) not null,
jobTitle varchar(50) not null,
officeCode_offices varchar(10),
reportTo int,
foreign key(officeCode_offices) references offices(officeCode),
foreign key(reportTo) references employees(employeeNumber)
);
create table customers(
customerNumber int primary key not null ,
customerName varchar(50) not null,
contactLastName varchar(50) not null,
contactFirstName varchar(50) not null,
phone varchar(50) not null,
addressLine1 varchar(50) not null ,
addressLine2 varchar(50) ,
city varchar(50) not null ,
state varchar(50) not null ,
postalCode  varchar(15) not null ,
country varchar(50) not null ,
creditLimit double,
salesRepEmployeeNumber int ,
foreign key (salesRepEmployeeNumber) references employees(employeeNumber)
);
create table productsLine(
productLine varchar(50) not null primary key,
textDescription text,
image varchar(50)
);
create table orders(
orderNumber int primary key not null ,
orderDate date not null,
requiredDate date not null,
shippedDate date ,
`status` varchar(15) not null,
comments text ,
quantityOrdered int not null,
priceEach double not null ,
customerNumber_customers int ,
foreign key (customerNumber_customers) references customers(customerNumber) 
);
create table products(
productCode varchar(15) not null primary key,
productName varchar(70) not null,
productScale varchar(10) not null,
productVendor varchar(50) not null,
productDescription text not null,
quantityInStock int not null,
buyPrice double not null,
MSRP double not null,
productLine_productsLine varchar(50),
foreign key (productLine_productsLine) references productsLine(productLine)
);
create table order_details(
orderNumber_orders int ,
productCode_products varchar(15),
primary key(orderNumber_orders,productCode_products),
foreign key(orderNumber_orders) references orders(orderNumber),
foreign key(productCode_products) references products(productCode)
);
create table payments(
customerNumber_cutomers int not null ,
checkNumber varchar(50) not null primary key,
paymentDate  date not null,
amount double not null,
foreign key(customerNumber_cutomers) references customers(customerNumber)
);
