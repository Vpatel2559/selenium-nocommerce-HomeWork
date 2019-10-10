# SQL-HomeWork
1. Write a sql query to fetch all records from table 'products' where
'price' is 20 or 30
Ans.  SELECT * FROM [ products] where products price = 20 or price =30

2. Write a sql query to fetch all records from table 'products' where
'productname' starts with 'T' and end with 'e'
Ans.  SELECT * FROM [products] where productsName like T %e

3. Write a sql query to fetch all records from table 'Categories'
having CategoryId in descending order
Ans.  SELECT * FROM [ Categories] order by CategoriesID Desc

4. Write a sql query to get an average of 'price' from table
'products'
Ans.  SELEVE AVG (Price)  FROM [products];

5. Write a sql query to get the total number of records in table
'Orders' 
Ans.  SELECT*FROM[Orders];

6. Write a sql query to get unique list of 'productname'
from table 'products'
Ans. SELECT Productname FROM [Poducts];
