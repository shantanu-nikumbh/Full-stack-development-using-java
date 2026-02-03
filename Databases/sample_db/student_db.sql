USE employee_db;

CREATE TABLE student(
    stud_id INT,
    stud_name VARCHAR(50),
    stud_city VARCHAR(50),
    stud_marks INT,
    stud_phone VARCHAR(15)
);

INSERT INTO student VALUES (1, 'Raj Rathod', 'Pune', 85, '9876543210');
INSERT INTO student VALUES (2, 'Tushar Pawar', 'Mumbai', 90, '9123456780');
INSERT INTO student VALUES (3, 'Omkar Dighe', 'Nagpur', 78, '9988776655');
INSERT INTO student VALUES (4, 'Hemraj Atre', 'Nashik', 88, '9012345678');
INSERT INTO student VALUES (5, 'Suyog Dhoot', 'Thane', 92, '9090909090');

SELECT * FROM student;

UPDATE student
SET stud_marks = 95
WHERE stud_id = 1;

DELETE FROM student
WHERE stud_id = 5;