USE learning;

-- Create Employee Table
CREATE TABLE employee(
emp_id INT(6),
emp_name VARCHAR(50),
salary DECIMAL(8,2),
dept_id INT(6)
);

ALTER TABLE employee
MODIFY salary DECIMAL(8,2);
-- Insert into Employee
INSERT INTO employee VALUES
(101,'Vikram',34567,1),
(102,'Aruna',25000,2),
(103,'Baskar',12000,1),
(104,'Latha',16700,4),
(105,'Getha',34500,3);

-- Create Department Table
CREATE TABLE department(
dept_id INT(6),
dept_name VARCHAR(50)
);

-- Insert into Department
INSERT INTO department VALUES
(1,'Sales'),
(2,'Purchase'),
(3,'Marketing'),
(4,'HR'),
(5,'IT');

select * from employee;
select * from department;


-- 1. display the details of the employee with department name instead of dept id
SELECT e.emp_id, e.emp_name, e.salary, d.dept_name
FROM employee e
JOIN department d
ON e.dept_id = d.dept_id;

-- 2. display the employee name and dept name 
SELECT e.emp_name, d.dept_name
FROM employee e, department d
WHERE e.dept_id = d.dept_id;

-- 3. display the employee name along with dept name by using right join
SELECT e.emp_name, d.dept_name
FROM employee e
RIGHT JOIN department d
ON e.dept_id = d.dept_id;

-- 4. display the employee name along with dept name by using left join
SELECT e.emp_name, d.dept_name
FROM employee e
LEFT JOIN department d
ON e.dept_id = d.dept_id;

-- 5. display the employee name along with dept name by using inner join
SELECT e.emp_name, d.dept_name
FROM employee e
INNER JOIN department d
ON e.dept_id = d.dept_id;

-- 6. display the employee name along with dept name by using cross join
SELECT e.emp_name, d.dept_name
FROM employee e
CROSS JOIN department d;

-- 7. display the department name and number of people working in the dept
SELECT d.dept_name, COUNT(e.emp_id) AS No_of_Employees
FROM department d
LEFT JOIN employee e
ON d.dept_id = e.dept_id
GROUP BY d.dept_name;

-- 8. display the department name and total salary of the emp working in the dept
SELECT d.dept_name, SUM(e.salary) AS Total_Salary
FROM department d
LEFT JOIN employee e
ON d.dept_id = e.dept_id
GROUP BY d.dept_name;
