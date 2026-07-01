-- Scenario 1
-- ProcessMonthlyInterest

CREATE TABLE Accounts (
    AccountID INT PRIMARY KEY,
    CustomerID INT,
    AccountType VARCHAR(20),
    Balance DECIMAL(10,2)
);

INSERT INTO Accounts VALUES
(1,1,'Savings',10000),
(2,2,'Savings',20000),
(3,3,'Current',15000);

DELIMITER //

CREATE PROCEDURE ProcessMonthlyInterest()
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountType = 'Savings';
END //

DELIMITER ;

CALL ProcessMonthlyInterest();

SELECT * FROM Accounts;


-- Scenario 2
-- UpdateEmployeeBonus

ALTER TABLE employee
ADD department VARCHAR(20);

UPDATE employee
SET department = 'IT'
WHERE emp_id IN (101,102);

UPDATE employee
SET department = 'HR'
WHERE emp_id = 103;

DELIMITER //

CREATE PROCEDURE UpdateEmployeeBonus(
    IN dept VARCHAR(20),
    IN bonusPercent DECIMAL(5,2)
)
BEGIN
    UPDATE employee
    SET salary = salary + (salary * bonusPercent / 100)
    WHERE department = dept;
END //

DELIMITER ;

CALL UpdateEmployeeBonus('IT',10);

SELECT * FROM employee;

-- Scenario 3
-- TransferFunds

DELIMITER //

CREATE PROCEDURE TransferFunds(
    IN fromAccount INT,
    IN toAccount INT,
    IN transferAmount DECIMAL(10,2)
)
BEGIN
    DECLARE sourceBalance DECIMAL(10,2);

    SELECT Balance
    INTO sourceBalance
    FROM Accounts
    WHERE AccountID = fromAccount;

    IF sourceBalance >= transferAmount THEN

        UPDATE Accounts
        SET Balance = Balance - transferAmount
        WHERE AccountID = fromAccount;

        UPDATE Accounts
        SET Balance = Balance + transferAmount
        WHERE AccountID = toAccount;

    END IF;

END //

DELIMITER ;

CALL TransferFunds(1,2,2000);

SELECT * FROM Accounts;
