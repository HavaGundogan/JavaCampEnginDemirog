--Select
Select ContactName Adi,CompanyName SirketAdi,City Sehir from Customers

Select * from Customers where City = 'London'

--case insensitive
Select * from Products where CategoryID=1 or CategoryID = 3

Select * from Products where CategoryID=1 and UnitPrice>=10

select * from Products where CategoryID=1 order by UnitPrice desc --asc --desc

Select count(*) Adet from Products where CategoryID = 2

select categoryID,count(*) from products where UnitPrice>20 group by CategoryID having count(*)<10

select Products.ProductID, Products.ProductName , Products.UnitPrice , Categories.CategoryName
from Products inner join Categories
on Products.CategoryID = Categories.CategoryID

--DTO DATA TRANSFORMATİON OBJECT

Select * from Products p  left join [Order Details] od
on p.ProductID = od.ProductID

Select * from Customers c left join Orders o
on c.CustomerID = o.CustomerID
where o.CustomerID is null
