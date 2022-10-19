SELECT ContactName Adi, CustomerName MusteriAdi, City Sehir FROM Customers 

SELECT * FROM Customers WHERE City='London'

--case sensitive
Select * from Products
Select * From Products where categoryId = 1
SElect * FROM Products where categoryId=1 or categoryId=3
SELECT * from Products Where categoryId=1 and Price>=10
SELECT * FROM Products ORDER BY ProductName
SELECT * FROM Products ORDER BY CategoryID, ProductName
SELECT * FROM Products ORDER BY Price
SELECT * FROM Products ORDER BY Price ASC
SELECT * FROM Products WHERE categoryId=3 ORDER BY Price DESC
SELECT COUNT(*) FROM Products
SELECT categoryId, count(*) Adet FROM Products GROUP BY Price DESC
SELECT categoryId, COUNT(*) Adet FROM Products WHERE Price>20 GROUP BY categoryId HAVING Count(*)<10

SELECT Products.ProductId, Products.ProductName, Products.Price, Categories.CategoryName
FROM Products INNER JOIN Categories ON Products.CategoryID = Categories.CategoryID
WHERE Products.Price >= 10

SELECT * FROM Products p LEFT JOIN Orders o on p.ProductId = o.ProductId
SELECT * FROM Products p INNER JOIN Orders o ON p.ProductId = o.ProductId
SELECT * FROM Customer c INNER JOIN Orders o ON c.CustomerId = o.CustomerId
SELECT * FROM Customer c LEFT JOIN Orders o ON c.CustomerID = o.CustomerId

