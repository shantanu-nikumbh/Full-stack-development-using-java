USE employee_db;

CREATE TABLE employee(
    emp_id INT,
    emp_name VARCHAR(50),
    emp_address VARCHAR(100),
    emp_phone VARCHAR(15),
    emp_salary DECIMAL(10,2),
    emp_joinDate DATE
);

INSERT INTO employee(emp_id, emp_name, emp_address, emp_phone, emp_salary, emp_joinDate)
VALUES (1, 'Amit Sharma', 'Mumbai', '9876543210', 35000.00, '2023-01-15');

INSERT INTO employee(emp_id, emp_name, emp_address, emp_phone, emp_salary, emp_joinDate)
VALUES (2, 'Rahul Patil', 'Pune', '9123456780', 42000.00, '2022-11-20');

INSERT INTO employee(emp_id, emp_name, emp_address, emp_phone, emp_salary, emp_joinDate)
VALUES (3, 'Sneha Joshi', 'Nagpur', '9988776655', 38000.00, '2023-03-10');

INSERT INTO employee(emp_id, emp_name, emp_address, emp_phone, emp_salary, emp_joinDate)
VALUES (4, 'Priya Deshmukh', 'Nashik', '9012345678', 45000.00, '2021-09-05');

INSERT INTO employee(emp_id, emp_name, emp_address, emp_phone, emp_salary, emp_joinDate)
VALUES (5, 'Karan Mehta', 'Thane', '9090909090', 40000.00, '2022-06-18');

SELECT * FROM employee;

UPDATE employee
SET emp_name = 'Aman Sharma'
WHERE emp_id = 1;

DELETE FROM employee
WHERE emp_id = 5;
