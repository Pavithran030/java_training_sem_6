use learning;
select* from testing;
create table Worker(
	WORKER_ID INT NOT NULL PRIMARY KEY,
    FIRST_NAME CHAR(25),
    LAST_NAME CHAR(25),
    SALARY INT,
    JOINING_DATE DATETIME,
    DEPARTMENT CHAR(25)
);

insert into Worker(WORKER_ID,FIRST_NAME,LAST_NAME,SALARY,JOINING_DATE,DEPARTMENT) 
values(2,'Praveen','S',50000,'2026-02-21 09:05:00','AIML'),
(3,'Sakthivel','E',60000,'2025-03-26 08:06:25','AIML'),
(4,'Prain','S',20000,'2026-02-21 09:05:00','AIML'),
(5,'Ram','S',40000,'2026-02-21 09:05:00','AIML'),
(6,'Steve','S',70000,'2026-02-21 09:05:00','AIML'),
(7,'Dube','S',50000,'2026-02-21 09:05:00','AIML'),
(8,'Tilak','S',80000,'2026-02-21 09:05:00','AIML'),
(9,'Abishek','S',90000,'2026-02-21 09:05:00','AIML'),
(10,'Sundar','S',100000,'2026-02-21 09:05:00','AIML'),
(11,'Gates','S',880000,'2026-02-21 09:05:00','AIML'),
(12,'Wills','S',890000,'2026-02-21 09:05:00','AIML');

alter table worker add Gender enum('Male','Female','Other');

update worker set Gender='Male' where WORKER_ID='2';  

select* from worker;
select * from worker where FIRST_NAME="Praveen";