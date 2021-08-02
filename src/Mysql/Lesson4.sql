/*Описати БД на тему "Бібліотека»
• Зв’язати між собою таблиці. Типи даних - подумайте і проставте самі.
Таблиці:
- книжка( назва, опис, ціна, isbn)
- жанр_книжки(назва)
- автор (ім`я, прізвище, емейл, адрес, дата народження)
• Отже, потрібно об`єднати між собою книжку і жанр книжки.
• Умова - книжка може належати до одного жанру.
• Подумати, як правильно і зробити об`єднання таблиць автор і книжка.
• Умови - книжку може писати багато авторів */

create table books (id int primary key auto_increment,
                    book_name varchar(100) not null,
                    description text,
                    price double not null,
                    isbn varchar(13));
create table genre (id int primary key auto_increment not null,
                    name varchar(100) not null);
alter table books add column genere_id int;
alter table books add foreign key (genere_id) references genre(id);
create table authors (id int primary key auto_increment,
                      first_name varchar(50) not null,
                      last_name varchar(50) not null,
                      email varchar(100),
                      adress text,
                      date_of_birth date default '19000101');
create table books_authors(book_id int not null,
                           author_id int not null,
                           constraint id primary key(book_id,author_id),
                           foreign key (book_id) references books(id),
                           foreign key(author_id)references authors(id));