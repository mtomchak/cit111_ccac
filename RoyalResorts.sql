Create Database RoyalResorts;

USE RoyalResorts;

CREATE TABLE Room(

RoomID INT PRIMARY KEY IDENTITY,

RoomNumber INT Not NULL, 

RoomFloor INT Not NULL); 


CREATE TABLE RoomType(

RoomTypeID INT PRIMARY KEY IDENTITY,

RoomName VARCHAR(100) Not NULL,

RoomTypeDesc Varchar(100) NULL,

RoomNumber INT FOREIGN KEY References Room(RoomNumber);



CREATE TABLE Reservation(

ReservationID Int Primary Key Identity,

GuestID Varchar(100) Foreign Key References Guest(GuestID),

RoomID Int Foreign Key References Room(RoomID),
CheckInDate Int Not Null,
CheckOutDate Int Not Null,
TotalPeople Int Null);

Create Table Guest(

GuestID int Primary Key Identity,

FName varchar(100) Not Null,
LName varchar(100) Not Null,
PhoneNumber varchar(100) Not Null,
Email varchar(100) Not Null,
Address varchar(100) Not Null,
City varchar(100) Not Null,
Zip Varchar (100),
Country Varchar(100);





Create Table Payment(

PaymentID int Primary Key Identity,
GuestID int Foreign Key References Guest(GuestID),
ReservationID int Foreign Key References Reservation(ReservationID),
FName Varchar(100) Not Null,
LName Varchar (100) Not Null,
RoomCost int Not Null,
CreditCard int Not null);


Create Table Hotel (

HotelID int Primary Key Identity,
EmployeeID int Foreign Key References Employee(EmployeeID),
HotelName Varchar(100) Not Null,
NumRooms int Null);

Create Table Employee (

EmployeeID int Primary Key Identity,
BadgeNum int Not null,
FName Varchar(100) Not null,
LName Varchar(100) Not null,
PhoneNumber int Null);

CREATE INDEX IX_RoomNumber

ON Room (RoomNumber);

ALTER TABLE RoomType

ADD RoomService NVARCHAR(100);

INSERT INTO Room

VALUES ('Room 1');




--Inserts Data into Room Table:
INSERT INTO Room
	(RoomNumber, RoomFloor)

	VALUES ('561', '5th'),
			('421', '4th'),
			('322', '3rd'),
			('987', '9th'),
			('256', '2nd'),
			('855', '8th'),
			('111', '1st'),
			('744', '7th'),
			('621', '6th'),
			('500', '5th');
		
			

GO

--Inserts Data into RoomType Table:
INSERT INTO RoomType

(RoomName, RoomDesc, RoomNumber)

VALUES ('Single', 'Pool-View', '441');
		
		

GO

--Inserts Data into Reservation Table:
INSERT INTO Reservation

(CheckInDate, CheckOutDate, TotalPeople)

VALUES ('7-12-18', '7-16-18', '2');


GO 

--Inserts Data into Guests Table:
INSERT INTO Guests

(FName, LName, PhoneNumber, Email, Address, City, Zip, Country)

VALUES ('Ben', 'Langmore', '555-444-3333', 'BL@gmail.com', '1 Oak St', 'Miami', '33101', 'USA');

GO

--Inserts Data into Payment Table:
INSERT INTO Payment

(FName, LName, RoomCost, CreditCard)

VALUES ('Ben', 'Langmore', '$125', '1234-5678-9999-22');

GO

--Inserts Data into Hotel Table:
INSERT INTO Hotel

(HotelName, NumRooms)

VALUES ('RoyalResorts', '1000');

GO

--Inserts Data into Employee Table:
INSERT INTO Employee

(BadgeNum, FName, LName, PhoneNumber)

VALUES ('0615', 'Jerry', 'Holder', '111-222-3333')

GO

--Room List to view every room in Hotel:
Create View RoomList AS
SELECT RoomNumber AS 'Room #', RoomFloor AS 'Floor #'
FROM Room;
GO

--Shows what type of room a guest will be in:
Create View RoomTypeList AS
SELECT RoomName AS 'Name of Room', RoomTypeDesc AS 'Description of Room', RoomNumber AS 'Room #'
FROM RoomType;
GO

--Shows Guest's Reservation Info:
Create View ReservationList AS
SELECT GuestID AS 'Guest ID', RoomID AS 'Room ID', CheckInDate AS 'Date Checked In',
CheckOutDate AS 'Date Checked Out', TotalPeople AS '# of People in Room'
FROM Reservation;
GO

--Shows Guest's Personal Info:
Create View GuestList AS
SELECT Fname AS 'First Name', LName AS 'Last Name', PhoneNumber AS 'Phone #',
Email AS 'Email Address', Address AS 'Steet Address', City AS 'Home City', Zip AS 'Zip Code',
Country AS 'Home Country'
FROM Guest;
GO

--How the guest will be paying:
Create View PaymentList AS
SELECT GuestID AS 'Guest ID', ReservationID AS 'Reservation ID', FName AS 'First Name',
LName AS 'Last Name', RoomCost AS 'Cost of Room', CreditCard AS 'Credit Card Info'
FROM Payment JOIN Guest ON Payment .PaymentID = Guest .GuestID;
GO

--Branch of the Hotel info
Create View HotelList AS
SELECT EmployeeID AS 'Employee ID', HotelName AS 'Name of Hotel', NumRooms AS 'Number of Rooms'
FROM Hotel JOIN Employee ON Hotel .HotelID = Employee .EmployeeID;
GO

--Employee Login
Create View EmployeeList AS
SELECT BadgeNum AS 'Badge Number', FName AS 'First Name', LName AS 'Last Name', 
PhoneNumber AS 'Phone Number'
FROM Hotel;
GO


Use RoyalResorts;

--Declares Variables:

Declare @CheckInDateVar datetime, @CheckOutDateVar datetime;
Declare @RoomAvailability text
Declare @RoomClean text; 

--Sets Variables for Unavailable Room:

Set @RoomAvailability = Unavailable
Set @RoomClean = Dirty

--If statement for Available Room:

If @CheckInDateVar + @CheckOutDateVar <= 14

PRINT 'Room is occupied'
ELSE
PRINT 'Room is uncleaned'
ELSE



--Sets Variables for Available room:
SET @RoomAvailability = Available
SET @RoomClean = Clean
--If statement for Available room:
IF @CheckInDateVar + @CheckOutDateVar >= 14

Print 'Room is Available'
ELSE
Print 'Room is Clean'
ELSE

--Hotel allows a maximum 2 week stay.
--This will show what rooms are available due to guests staying for the max amount of time.


USE RoyalResorts

GO

SELECT FName, LName, RoomCost, CreditCard

INTO #ReservationPayment

FROM Payment

WHERE RoomCost <= 180;

--This transaction will show how much the customer owes for the room and how they will pay

BEGIN TRAN;

SELECT RoomCost FROM Payment WHERE RoomCost = '$155';
SELECT FName FROM Payment WHERE FName = 'Chip';
SELECT LName FROM Payment WHERE LName = 'Barlow';
SELECT CreditCard FROM Payment WHERE CreditCard = '1434-5555-1234-6666';

SAVE TRAN Payment1;
Rollback Tran Payment1;
SELECT * FROM #ReservationPayment;
Commit Tran; 


--Trigger updates when a guest pays for the room

USE RoyalResorts

GO


CREATE TRIGGER Room_Payment ON Payment
AFTER INSERT AS
BEGIN
SELECT 'Guest has payed. Room is now available to book.' AS [Message]
END


--Testing the Trigger's Function

SELECT * FROM Payment; --Before Firing Trigger

INSERT INTO Payment(FName, LName, RoomCost, CreditCard)

VALUES ('Guy', 'Thomas', '$135', '2222-1111-5555-8888')

SELECT * FROM Payment; --After Trigger Fires


