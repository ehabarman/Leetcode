SELECT c.Name as Customers
FROM Customers c
Where c.Id not in (
    SELECT CustomerId
    FROM Orders
    GROUP by CustomerId
)