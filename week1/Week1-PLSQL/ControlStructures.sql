-- Scenario 1
UPDATE Loans l
JOIN Customers c
ON l.CustomerID = c.CustomerID
SET l.InterestRate = l.InterestRate - 1
WHERE c.Age > 60;

SELECT * FROM Loans;


-- Scenario 2
UPDATE Customers
SET IsVIP = TRUE
WHERE Balance > 10000;

SELECT * FROM Customers;


-- Scenario 3
SELECT
    c.Name AS CustomerName,
    l.LoanID,
    l.DueDate,
    CONCAT(
        'Reminder: Dear ',
        c.Name,
        ', your loan ',
        l.LoanID,
        ' is due on ',
        l.DueDate
    ) AS Message
FROM Customers c
JOIN Loans l
ON c.CustomerID = l.CustomerID
WHERE l.DueDate BETWEEN CURDATE()
AND DATE_ADD(CURDATE(), INTERVAL 30 DAY);
