CREATE DATABASE QL_SieuThi
GO
USE  QL_SieuThi

--Bảng nhân viên
CREATE TABLE Employees (
  EmployeeID INT PRIMARY KEY,
  Username VARCHAR(50),
  Password VARCHAR(50)
);

--Bảng nhà cung cấp (1)
CREATE TABLE Suppliers (
  SupplierID INT PRIMARY KEY,
  SupplierName NVARCHAR(50),
  Address NVARCHAR(100),
  Phone NVARCHAR(20)
);

--Bảng sản phẩm (2)
CREATE TABLE Products (
  ProductID INT PRIMARY KEY,
  ProductName NVARCHAR(50),
  Price FLOAT,
  Quantity INT,
  SupplierID INT,
  FOREIGN KEY (SupplierID) REFERENCES Suppliers(SupplierID)
);

--Bảng khách hàng (3)
CREATE TABLE Customers (
  CustomerID INT PRIMARY KEY,
  CustomerName NVARCHAR(50),
  Address NVARCHAR(100),
  Phone NVARCHAR(20)
);

--Bảng hoá đơn (4)
CREATE TABLE Orders (
  OrderID INT PRIMARY KEY,
  OrderDate DATE,
  CustomerID INT,
  FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

--Bảng chi tiết hoá đơn (5)
CREATE TABLE OrderDetails (
  OrderDetailID INT PRIMARY KEY,
  OrderID INT,
  ProductID INT,
  Quantity INT,
  Price FLOAT,
  FOREIGN KEY (OrderID) REFERENCES Orders(OrderID),
  FOREIGN KEY (ProductID) REFERENCES Products(ProductID)
);


INSERT INTO Employees (EmployeeID, Username, Password)
VALUES 
(1, 'admin', 'admin123'),
(2, 'anhti', 'anhti123'),
(3, 'khanh', 'khanh123')


INSERT INTO Suppliers
VALUES 
(1, N'Công ty may mặc', N'Số 10 đường A, Quận B, TP. HCM', '0901234567'),
(2, N'Công ty bánh kẹo', N'Số 356 đường C, Quận D, TP. HCM', '039847562'),
(3, N'Công ty nông sản', N'Số 10 đường Y, Quận Z, TP. HCM', '038564179')


INSERT INTO Products
VALUES 
(1, N'Áo khoác', 500000, 2, 1),
(2, N'Quần tây', 1500000, 1, 1),
(3, N'Đồ mưa', 70000, 10, 1),
(4, N'Bánh ngọt', 100000, 5, 2),
(5, N'Trái cây', 200000, 10, 3)


INSERT INTO Customers
VALUES 
(1, N'Nguyễn Văn An', N'Số 20 đường A, Quận B, TP. HCM', '0385476215'),
(2, N'Nguyễn Minh Bảo', N'Số 235 đường C, Quận D, TP. HCM', '0906326543'),
(3, N'Lê Thị Cúc', N'Số 157 đường I, Quận K, TP. HCM', '0965874125'),
(4, N'Bùi Thị Dung', N'Số 847 đường Y, Quận Z, TP. HCM', '0365892102')


INSERT INTO Orders
VALUES 
(1, '2022-04-10', 1),
(2, '2022-02-15', 2),
(3, '2022-01-06', 3),
(4, '2022-03-22', 4)


INSERT INTO OrderDetails
VALUES 
(1, 1, 4, 2, 100000),
(2, 2, 5, 10, 200000),
(3, 3, 2, 1, 1500000),
(4, 4, 1, 2, 500000),
(5, 4, 3, 4, 70000)

