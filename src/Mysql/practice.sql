-- Створити базу даних social_network.
-- Таблиці:
-- ● user(id, name, surname, age)
-- ● account(id, login, password)
-- ● album(id, title, number_of_photos)
-- ● photo(id, title, size)
-- ● message(id, text)
-- 2) Самостійно подумати про типи даних та поставити необхідні атрибути (AUTO_INCREMENT,
-- UNIQUE, DEFAULT і т.д.)
-- 3) Побудувати зв’язки :
-- ● user може мати лише один account і акаунт може належати лише одному користувачу;
-- ● до одного account може бути прив’язано багато message, але одне message належить лише одному account;
-- ● account може мати багато album, але один album належить лише одному account;
-- ● album може мати багато photo і одне photo може належати кільком album.
-- 4). Заповнити таблицю даними. Створити діаграму таблиць.

create database social_network;
use social_network;
create table user (id int primary key auto_increment,
                   name varchar(100),
                   age int default "18",
                   acount_id int);
create  table account(id int primary key auto_increment,
                      login varchar(50) not null unique,
                      pass varchar(100) not null);
create table album (id int primary key auto_increment,
                    title varchar(22) default "untitled",
                    number_of_photos int default "0",
                    account_id int);
create table photo (id int primary key auto_increment,
                    title varchar(200) default "untitled",
                    size int default 1);
create table message (id int primary key auto_increment,
                      body text);

create table album_photo (id int primary key auto_increment,
                          album_id int,
                          photo_id int,
                          foreign key (album_id) references album(id),
                          foreign key (photo_id) references photo(id));

alter table user
    add foreign key (acount_id) references account(id);

alter table album
    add foreign key (account_id) references account(id);

alter table message
    add column account_id int;
alter table message
    add foreign key (account_id)references account(id);

insert into account (login,pass) values ("vasya","qwerty"),("admin","admin"),("selezen","123456"),("login","1qaz");
insert into user (name,age,account_id) values ("Андрей",30,1),("Вася",33,2),("Юля",21,3),("Заур",25,1);

insert into album (title,number_of_photos,account_id) values ("In Mountains",4,2),("Underwater",6,3),("FuckIT",1,4),("We smoking",34,3),("Working",37,2),("NiceDish",3,1),("what a dude",3,2);
insert into photo (size) values (5),(30),(23),(34),(28),(11),(111),(13),(12),(10),(12),(15),(99);
alter table message
    modify column body text charset utf8mb4 null;
insert into message (body,account_id) values ("Привет",1),("Кривед",2),("Кагдила",3),("Медвед",4),("КГАТ",1),("Гари в АДДУ",2),("Жги Ещо",1);
insert into album_photo (album_id,photo_id) values (9,12),(4,10),(2,1),(1,12),(7,4),(4,12),(1,11),(3,2),(4,7),(8,10),(9,9),(2,4),(2,11);