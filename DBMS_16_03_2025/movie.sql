USE learning;

DROP TABLE IF EXISTS movie;

CREATE TABLE movie(
Id INT(6),
Title VARCHAR(30),
Release_date DATE,
Generic VARCHAR(10),
Price DECIMAL(12,2),
Rating VARCHAR(10),
Actor_id INT
);

-- Insert data with star ratings
INSERT INTO movie VALUES
(101, 'Inception', '2010-07-16', 'SciFi', 150.00, '*****', 1),
(102, 'Avatar', '2009-12-18', 'SciFi', 180.00, '****', 2),
(103, 'Titanic', '1997-12-19', 'Rom', 120.00, '****', 3),
(104, 'Avengers', '2012-05-04', 'Act', 200.00, '*****', 4),
(105, 'Joker', '2019-10-04', 'Drama', 140.00, '*****', 5),
(106, 'Joker', '2019-10-04', 'Drama', 160.00, '****', 6);
-- View table
SELECT * FROM movie;

-- Total price
SELECT SUM(Price) AS TotalPrice FROM movie;

-- 5. Average price of Drama movies
SELECT AVG(Price) AS AvgDrama 
FROM movie 
WHERE Generic = 'Drama';

-- 6. Maximum price
SELECT MAX(Price) AS MaxPrice 
FROM movie;

-- 7. Minimum price of Action movies
SELECT MIN(Price) AS MinPrice 
FROM movie 
WHERE Generic = 'Act';

-- 8. Position of letter 'a'
SELECT Title, INSTR(Title,'a') AS position_of_a 
FROM movie;

-- 9. Length of movie name
SELECT Title, LENGTH(Title) AS Title_Length 
FROM movie;

-- 10. Replace 'a' with 'i'
SELECT Title, REPLACE(Title,'a','i') AS Modified_Title 
FROM movie;

-- 11. Concatenate Title and Generic
SELECT Title, Generic, CONCAT(Title,' ',Generic) AS Concatenation 
FROM movie;

-- 12. First 4 characters
SELECT Title, SUBSTR(Title,1,4) AS First4_Characters 
FROM movie;

-- 13. Date format dd-mm-yyyy
SELECT Title, DATE_FORMAT(Release_date, '%d-%m-%Y') AS Formatted_Date 
FROM movie;

-- 14. Months since release
SELECT Title, TIMESTAMPDIFF(MONTH, Release_date, CURDATE()) AS Months_Since_Release
FROM movie;

-- 15. Movies released in December
SELECT Title, Release_date 
FROM movie 
WHERE MONTH(Release_date) = 12;

-- 16. Movies released before 2 years
SELECT Title, Release_date
FROM movie
WHERE Release_date < DATE_SUB(CURDATE(), INTERVAL 2 YEAR);

-- 17. Total price per Generic
SELECT Generic, SUM(Price) AS Total_Price 
FROM movie 
GROUP BY Generic;

-- 18. Average price per Actor_id
SELECT Actor_id, AVG(Price) AS Actor_Price 
FROM movie 
GROUP BY Actor_id;

-- 19. Average price per Actor_id < 5000
SELECT Actor_id, AVG(Price) AS Actor_Price 
FROM movie 
GROUP BY Actor_id 
HAVING AVG(Price) < 5000;

-- 20. Number of movies per Generic
SELECT Generic, COUNT(*) AS Movie_Count
FROM movie
GROUP BY Generic;

-- 21. Movies per year
SELECT YEAR(Release_date) AS Release_Year, COUNT(*) AS Movie_Count
FROM movie
GROUP BY YEAR(Release_date);

-- 22. Order by Release date
SELECT *
FROM movie
ORDER BY Release_date;


create table Actor(
Aid int(6),
Aname varchar(50)
);

insert into Actor values(
(1,'Vijay'),
(2,'Kamal'),
(3,'Ajith'),
(4,'Vikram Prabhu')
);

-- Display the movies details in which price is greater than the price of drama generic movies
SELECT *
FROM movie
WHERE Price > ALL (
    SELECT Price 
    FROM movie 
    WHERE Generic = 'Drama'
);

-- Display the movies details in which price is any of the price of drama generic movies
SELECT *
FROM movie
WHERE Price = ANY (
    SELECT Price 
    FROM movie 
    WHERE Generic = 'Drama'
);

-- Display the movie details in which the price is less than the average price
SELECT *
FROM movie
WHERE Price < (
    SELECT AVG(Price) FROM movie
);

-- Display the Kamal and Vijay movie names
SELECT m.Title
FROM movie m
JOIN Actor a ON m.Actor_id = a.Aid
WHERE a.Aname IN ('Kamal', 'Vijay');

-- Display the movie name and the actor name for the movie which does not belong to drama generic
SELECT m.Title, a.Aname
FROM movie m
JOIN Actor a ON m.Actor_id = a.Aid
WHERE m.Generic <> 'Drama';

-- Display the actor name whose movie price is greater than the price of 7000
SELECT DISTINCT a.Aname
FROM movie m
JOIN Actor a ON m.Actor_id = a.Aid
WHERE m.Price > 7000;

-- Add 2000 to movie price for the Ajith movies
UPDATE movie
SET Price = Price + 2000
WHERE Actor_id = (
    SELECT Aid FROM Actor WHERE Aname = 'Ajith'
);

-- Display the movie title and release date of actor Kamal
SELECT m.Title, m.Release_date
FROM movie m
JOIN Actor a ON m.Actor_id = a.Aid
WHERE a.Aname = 'Kamal';

-- Update the id to 100 in the movie table which i having the greatest actor id
UPDATE movie
SET Id = 100
WHERE Actor_id = (
    SELECT MAX(Actor_id) FROM (
        SELECT Actor_id FROM movie
    ) AS temp
);


create table workerjoined (
worker_id int(6),
first_name varchar(50),
salary int(8),
join_date date,
department varchar(10)
);

insert into workerjoined values
(1,'Ravi',30000,'2023-01-15','IT'),
(2,'Meena',40000,'2022-05-10','HR'),
(3,'Arun',35000,'2023-03-20','IT'),
(4,'Divya',45000,'2021-12-01','Finance'),
(5,'Kiran',50000,'2022-07-25','IT');

-- 1. Display only fitst_name and Join_date
SELECT first_name, join_date
FROM workerjoined;


-- 2. Display workers who joined after 2022-01-01
SELECT *
FROM workerjoined
WHERE join_date > '2022-01-01';


-- 3. Display workers who joined after 2023-01-01
SELECT *
FROM workerjoined
WHERE join_date > '2023-01-01';

-- 4. Display workers who joined in the year 2022
SELECT *
FROM workerjoined
WHERE YEAR(join_date) = 2022;

-- 5. Display current date
SELECT CURDATE();

-- 6. Find workers who joined in the current year
SELECT *
FROM workerjoined
WHERE YEAR(join_date) = YEAR(CURDATE());

-- 7. Display workers who joined  in March
SELECT *
FROM workerjoined
WHERE MONTH(join_date) = 3;

-- 8. Display workers who joined in year 2023
SELECT *
FROM workerjoined
WHERE YEAR(join_date) = 2023;

-- 9. Display workers sorted by join_date (ascending)
SELECT *
FROM workerjoined
ORDER BY join_date ASC;