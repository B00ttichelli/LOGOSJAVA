/*1. Працюємо далі з БД "Бібліотека".
2. Створити таблицю "книжка" з полями(
- Id not null primary key auto_increment
- назва книги(не null, до 120 символів),
- опис(потрібно подумати який тип даних),
- дата публікації(не null, default значення "2018-01-01"),#date
- категорія(не null, до 30 символів),
- isbn (не null, до 20 символів, унікальний),
- кількість сторінок(не null)
- ім"я автора (не null, до 45 символів),
- прізвище автора (не null, до 45 символів),
- email автора (не null, до 50 символів, унікальне)
- вік автора(не null),
- дата народження автора(не null),
- нагороди автора(до 120 символів, якщо нема - то NULL)
*/

use library;
create table books (Id int primary key auto_increment not null,
                    book_name char(120) not null,
                    book_description text,
                    publication_date date not null default"2018-01-01",
                    category char(30) not null,
                    isbn bigint(20) unique,
                    page_quantity int not null,
                    author_name char(45) not null,
                    author_surname char(45) not null,
                    author_email char(50) unique not null,
                    author_age int not null,
                    author_dob date not null,
                    author_rewards char(120) default null);
/*3. Добавити в таблицю 10 записів.*/
insert into books (book_name,category,isbn,page_quantity,author_name,author_surname,author_email,author_age,author_dob)
values ("451 по Фаренгейту","Класика","9780345342966","400","Рэй","Брэдбери","bradbary@zalupa.com","101","1920-08-20"),
       ("1984","Класика","9780436350221","340","Джордж","Оурэлл","ourell1985@mail.ru","119","1903-06-25"),
       ("Мастер и Маргерита","Русская класика","9783630620930","260","Михаил","Булгаков","voland@yandex.ru","130","1981-05-03"),
       ("Шантарам","Класика","9780312330521","300","Грегори Дэвид","Робертса","shantaram@mail.ru","71","1952-06-21"),
       ("Три товарища","Класика","9783462046311","200","Эрих Мария","Ремарк","remark@book.com","123","1898-06-22"),
       ("Цветы для Элджернона","Фантастика","9780606340182","210","Дэниел","Киз","kiz@bestseller.com","95","1927-08-09"),
       ("Портрет Дориана Грея","Класика","9780140431872","190","Оскар","Уйльд","oscar@wilde.com","167","1864-10-16"),
       ("Маленький Принц","Детская"," 9780152048044","100","Антуан","Экзюпери","pilot@fly.com","121","1900-06-29"),
       ("Над пропастью во ржи","Американская Класика","9783462015393","277","Джером","Сэлинджер","american@coolstory.2ch.ru","102","1919-01-01");







/*4. Потрібно написати наступні запити:
- витягнути всі книги
- витягнути книги з id 5, 10, 13
- витягнути всі книги де кількість сторінок більше 150
- витягнути книги, де автори старше 30 років
- витягнути книги, в яких автори не мають нагород
- витягнути книгу по email автора
- витягнути книгу по isbn
- витягнути всіх книги які належать до певної категорії
- витягнути книги в яких кількість сторінок більше 200 та вік автора більше 25
- витягнути книги, в яких категорія "комедія" або "драма"(назви категорії можете змінити)
- витягнути книги та посортувати за назвою
- витягнути книги та посортувати за email автора
- витягнути книги та посортувати за кількістю сторінок(проти алфавіту)
- витягнути унікальні значення категорій
- витягнути унікальні імена авторів
- витягнути книги які було написано після '2000-01-01'
- витягнути книги які було написано до '2010-01-01'*/

select * from books;
select * from books where id = "5" or id = "10" or id = "13";
select * from books where page_quantity > 150;
select * from books where author_age > 30;
select * from books where author_rewards is null;
select * from books where author_email = "voland@yandex.ru";
select * from books where isbn = "9783630620930";
select * from books where category = "Класика";
select * from books where page_quantity>200 and author_age > 25;
select * from books where category = "Русская класика" or category = "Фантастика";
select * from books order by book_name;
select * from books order by author_email;
select * from books order by page_quantity desc;
select distinct category from books;
select distinct author_name from books;
select * from books where publication_date > "2000-01-01";
select * from books where publication_date < "2010-01-01";