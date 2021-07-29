use library;
/*Для цього ДЗ потрібно працювати з базою даних та таблицею, які були створені у ДЗ до 2-го заняття.
● Потрібно написати наступні запити:
1. витягнути всі книжки
2. змінити прізвище автора в 2х книжках
3. підрахувати кількість книжок, в яких автори мають нагороди
4. вивести інформацію про книжку з найменшою кількістю сторінок
5. вивести максимальну кількість сторінок
6. вивести середню ціну книжки
7. порахувати суму книжок за категорією
8. вивести мінімальну ціну книжки
9. вивести інформацію про книжку з найменшою ціною
10. написати 3 запити, використавши різні види пошуку за співпадіннями(like)
11. вивести книжки де ціна на проміжку: 1. 50-120, 2. не включаючи проміжок 200-600.
12. 3 запити на видалення книжки(за id, name, isbn)
● Cпробувати змінити назву колонок, деякі записи з бази даних
● Спробувати видалити деякі записати з БД.*/
select * from books;
update books set author_surname = 'Аноним' where id IN (1,9);
select count(*) from books where author_rewards is not null;
select * from books where page_quantity  = (select min(page_quantity) from books);
select max(page_quantity) from books;
/*в базе нет цен поэтому 6ое задание не возможно выплонить  но оно выглдело б примерно так select avg(price) from books;*/
select count(*) from books where category = "Класика";
/*в базе нет цен поэтому 6ое задание не возможно выплонить  но оно выглдело б примерно так select min(price) from books;*/
/*в базе нет цен поэтому 6ое задание не возможно выплонить  но оно выглдело б примерно так select * from books where price = (select min(price) from books)*/
select * from books where book_name like "%а";
select * from books where book_name like "а%";
select * from books where book_name like "%ж%";
/*Цен в таблице нету потому на страницах потренеруюсь в задании 11*/
select * from books where page_quantity between 50 and 120;
select * from books where page_quantity not between 200 and 600;
delete from books where Id = "5";
delete from books where isbn = "9780140431872";
SET SQL_SAFE_UPDATES = 0; -- Почемуто сработал сейфпадейт мод
delete from books where book_name = "Над пропастью во ржи";
alter table books rename column page_quantity to pages;