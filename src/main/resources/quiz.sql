create database quizdev
use quizdev
CREATE TABLE Question(id int,questionTitle varchar(255),option1 varchar(255),option2 varchar(255),option3 varchar(255),option4 varchar(255),rightAnswer varchar(255),difficultylevel varchar(255),category varchar(255));
SELECT * FROM quizdev.question;
insert into quizdev.question(id,questionTitle,option1,option2,option3,option4,rightAnswer,difficultylevel,category) values (1,"Number of primitive data types in Java are","8","6","9","5","8","Easy","java")

SELECT * FROM quizdev.question WHERE Category="java" ORDER BY RANDOM() LIMIT=2
SELECT * FROM quizdev.question Where category="java" ORDER BY RAND() LIMIT 1

INSERT INTO quizdev.question (id, questionTitle, option1, option2, option3, option4, rightAnswer, difficultylevel, category)VALUES (6, 'What is the correct way to declare a variable in Python?', 'var x = 5;', 'int x = 5;', 'x = 5;', 'Dim x As Integer = 5;', 'x = 5;', 'Easy', 'python');

create table quiz(id int,title varchar(255),CONSTRAINT FK_PersonOrder FOREIGN KEY (PersonID)
    REFERENCES question(id))

UPDATE question SET id=5 WHERE option1="int x;"