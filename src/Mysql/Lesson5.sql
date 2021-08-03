/*

Продовжуємо працювати з попередніми завданнями.
1) Вам потрібно переробити БД "бібліотека" таким чином, щоб получився
зв`язок many-to-many і наповнити даними.
2) Наповнити даними БД, яку самі проектували.
3) Попрактикуватись в написанні JOIN до БД "Бібліотека" і до своєї
БД. Спробуйте добавити умови і сортування до написаних з використанням
JOIN запитів.
*/
use library;
insert into authors (first_name,last_name,date_of_birth) values 	("Антуан ","Экзюпери","19000629"),
                                                                   ("Джордж","Оурэл","19000629"),
                                                                   ("Михаил","Булгаков","16660606"),
                                                                   ("Грегор","Робертс","19520621"),
                                                                   ("Дениел","Киз","19270809");
insert into genre (name) values ("Класика"),("Русская Класика"),("Фантастика"),("Детская");

insert into books (book_name,price,isbn,genere_id) values 	("451 по Фаренгейту","190.1", "9780345342966",1),
                                                             ("1984", 130.2, "9780436350221",  1),
                                                             ("Мастер и Маргерита", 120.8, "9783630620930",2),
                                                             ("Шантарам", 12.0,"9780312330521",1),
                                                             ("Цветы для Элджернона",130, "9780606340182",3),
                                                             ("Маленький Принц",140, "9780152048044",4);
insert into authors (first_name,last_name) value ("Рэй","Бредбери");
insert into books_authors (book_id,author_id) values (1,7),(2,3),(3,4),(4,5),(5,6),(6,1);
select books.book_name,books.isbn, authors.first_name,authors.last_name from books inner join authors on authors.id = books.id;
select books.book_name,books.isbn, authors.first_name,authors.last_name from books left join authors on authors.id = books.id;
select books.book_name,books.isbn, authors.first_name,authors.last_name from books right join authors on authors.id = books.id;

