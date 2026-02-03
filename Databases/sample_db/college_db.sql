USE employee_db;

CREATE TABLE college(
    college_id INT,
    college_name VARCHAR(100),
    college_city VARCHAR(50),
    college_phone VARCHAR(15)
);

INSERT INTO college VALUES (101, 'ABC College of Engineering', 'Pune', '9876501234');
INSERT INTO college VALUES (102, 'XYZ Institute of Technology', 'Mumbai', '9123405678');
INSERT INTO college VALUES (103, 'Modern College', 'Nagpur', '9988701234');
INSERT INTO college VALUES (104, 'National College', 'Nashik', '9012305678');
INSERT INTO college VALUES (105, 'City College', 'Thane', '9090901234');

SELECT * FROM college;

UPDATE college
SET college_city = 'Delhi'
WHERE college_id = 101;

DELETE FROM college
WHERE college_id = 105;