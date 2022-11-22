CREATE TABLE Campus (
CampusID	int		PRIMARY KEY,			
campusName		varchar(100)	NOT NULL,
campusAddress	varchar(150)	UNIQUE,
)

INSERT INTO Campus VALUES(1,	'University of British Columbia West Point Grey',	'University Endowment Lands, Vancouver, BC');
INSERT INTO Campus VALUES(2,	'University of British Columbia Okanagan',	'3333 University Way, Kelowna, BC');
INSERT INTO Campus VALUES(3,	'University of British Columbia Robson',	'800 Robson St, Vancouver, BC');
INSERT INTO Campus VALUES(4,	'University of British Columbia Revelstoke',	'416 9th St, Revelstoke, BC');
INSERT INTO Campus VALUES(5,	'University of British Columbia Granville',	'1050 Granville St, Vancouver, BC');

CREATE TABLE ResidenceStaff (
staffID				int		PRIMARY KEY,			
staffName				varchar(100)	NOT NULL,
Birthdate			date,		
sinNo				int		UNIQUE,
residenceLifePosition	varchar(50),	
buildingMaintenanceTitle	varchar(50),
diningHall Name		varchar(50),
diningHallPosition  		varchar(50),
);

INSERT INTO ResidenceStaff VALUES(67001, 'Thomas Lloyd', TO_DATE('18/02/2000','DD/MM/YYYY'),	573972784,	'Front Desk Staff',	NULL,	NULL,	NULL);
INSERT INTO ResidenceStaff VALUES(67002,	'Harry Potter',	TO_DATE('24/05/1997','DD/MM/YYYY'),	184475920,	NULL,	NULL,	'Open Kitchen',	'Line Cook');
INSERT INTO ResidenceStaff VALUES(67003,	'Rosie	Turner', TO_DATE('30/09/1989','DD/MM/YYYY'),	374017389,	NULL,	'Electrician',	NULL,	NULL);
INSERT INTO ResidenceStaff VALUES(67004,	'Julian	Watson', TO_DATE('05/12/1999','DD/MM/YYYY'),	365910037,	NULL,	'Plumber',	'Gather',	'Cashier');
INSERT INTO ResidenceStaff VALUES(67005,	'Mike Wazowski',	TO_DATE('13/10/2001','DD/MM/YYYY'),	102847269,	'Residence Advisor',	NULL,	NULL,	NULL);


CREATE TABLE Residence (
residenceID		int		PRIMARY KEY,			
residenceAddress	varchar(150)	UNIQUE,
residenceName		varchar(75)	NOT NULL		
);

INSERT INTO Residence VALUES(110,	'6363 Agronomy Road, Vancouver, BC',	'Orchard Commons');
INSERT INTO Residence VALUES(120,	'6335 Thunderbird Crescent, Vancouver, BC',	'Thunderbird Residence');
INSERT INTO Residence VALUES(130, '2075 West Mall, Vancouver, BC',	'Ponderosa Commons');
INSERT INTO Residence VALUES(140,	'5959 Student Union Blvd., Vancouver, BC',	'Walter Gage');
INSERT INTO Residence VALUES(150,	'2525 West Mall, Vancouver, BC',	'Totem Park');

CREATE TABLE Amenities (
amenityID		int		PRIMARY KEY,			
amenityName		varchar(75)	NOT NULL,		-- removed no of rooms	
);

INSERT INTO Amenities VALUES(2345, 'Laundry');
INSERT INTO Amenities VALUES(2346, 'Study Room');
INSERT INTO Amenities VALUES(2347,	'Ping Pong Table');
INSERT INTO Amenities VALUES(2348,	'Copy Room');
INSERT INTO Amenities VALUES(2349,	'Garbage Room');

CREATE TABLE Application (
applicationID			int		PRIMARY KEY,			
applicantName			varchar(75)	NOT NULL,
residentType		varchar(30)	NOT NULL,
1stPrefRoom		varchar(50)	NOT NULL,				
2ndPrefRoom		varchar(50)	, -- removed not null
1stPrefResidence	varchar(75)	NOT NULL,
2ndPrefResidence	varchar(75), 		-- removed not null
housingSession				varchar(75)	NOT NULL,	
CWL					varchar(10)	UNIQUE,           -- added all below fields from resident
studentNumber			int		UNIQUE,
Program				varchar(75),	
EmailAddress				varchar(50)	UNIQUE,
LengthofStay				varchar(50),	
EmployeeNumber			int,		
NoOfAccompanysFamilyMembers	int
);

INSERT INTO Application VALUES(201,	'Roger Brown',	'Student',	'Studio',	'2 Bedroom',	'Totem Park',	NULL, '2021W', 'rogerb', 78627864, "Undergraduate", NULL, NULL, NULL, NULL);
INSERT INTO Application VALUES(202,	'Catherine Davis',	'Visitor',	'2 Bedroom',	'Studio',	'Ponderosa Commons',	'Marine Drive', '2022S', Null, null, null, 'cat57davis@gmail.com', '2 weeks', null, null);
-- INSERT INTO Application VALUES(203,	'Nancy Drew',	'UBC Teaching Staff',	'4 Bedroom',	'4 Bedroom',	'Brock Commons',	'Marine Drive');



CREATE TABLE CFA (
cfaID					int		PRIMARY KEY,		
accessibilityAccommodation		varchar(100)	NOT NULL	
);

INSERT INTO CFA VALUES(38911,	'OCD Accomodations');
INSERT INTO CFA VALUES(39285,	'Dyslexia Accomodations');
INSERT INTO CFA VALUES(38957,	'Anxiety Accomadations');
INSERT INTO CFA VALUES(39275,	'Mobility Accomadations');
INSERT INTO CFA VALUES(38562,	'Mobility Accomadations');

CREATE TABLE Resident (
residentID					int		PRIMARY KEY,		
residentName					varchar(100)	NOT NULL,
housingSession				varchar(75)	NOT NULL,	
CWL					varchar(10)	UNIQUE,
studentNumber			int		UNIQUE,
Program				varchar(75)	
EmailAddress				varchar(50)	UNIQUE,
LengthofStay				varchar(50)	
EmployeeNumber			int,		
NoOfAccompanysFamilyMembers	int

);

INSERT INTO Resident VALUES(11,	'John Smith',	'2022W',	'Jsmith10',	12446798,	'Undergraduate',	NULL,	NULL,	NULL,	NULL);
INSERT INTO Resident VALUES(22,	'Jane Doe',	'2022W',	'JaneD2',	45628719,	'Undergraduate',	NULL,	NULL,	NULL,	NULL);
INSERT INTO Resident VALUES(33,	'William Jones',	'2022W',	'WillJones44',	NULL,	NULL,	NULL,	NULL,	231,	3);
INSERT INTO Resident VALUES(44,	'Sarah Clark',	'2022W',	'Sclark99',	NULL,	NULL,	NULL,	NULL,	574,	2);
INSERT INTO Resident VALUES(55,	'George Shrinks',	'2021W',	'Shrinks123',	NULL,	NULL,	'gshrinks123@gmail.com','7days',	NULL,	NULL);
INSERT INTO Resident VALUES(66, 'Jessica Parker',	'2022W',	'127Jess',	28920292,	'Graduate',	NULL,	NULL,	NULL,	Null);

CREATE TABLE RoomInfo (
House					varchar(20)	PRIMARY KEY,	
unitNumber				int		PRIMARY KEY,
roomType				varchar(20)	NOT NULL,
Rent					int		NOT NULL,
residenceID 	int		NOT NULL, -- added
FOREIGN KEY (residenceID) REFERENCES Residence ON DELETE CASCADE -- added
);

INSERT INTO RoomInfo VALUES('Bartlett',	5-114-1,	'Connected Bathroom',	1375, 110);
INSERT INTO RoomInfo VALUES('Maple',	4-123-0,	'Shared four-bedroom', 965, 33);
INSERT INTO RoomInfo VALUES('Selkirk', 6-321-4,	'Shared four-bedroom', 965, 22);
INSERT INTO RoomInfo VALUES('Columbia',	2-123-1,	'Shared four-bedroom', 965, 22);
INSERT INTO RoomInfo VALUES('McDonald',	2-314-3,	'Studio',	1300, 44);

CREATE TABLE RoomAllocationInfo (
House					varchar(20)	PRIMARY KEY,
unitNumber				int		PRIMARY KEY,
residentID				int, -- no pk
residenceID       int, -- added, no pk
-- residentName					varchar(100)	NOT NULL,
-- Session				varchar(75)	NOT NULL,	
-- CWL					varchar(10)	UNIQUE,
-- Student Number			int		UNIQUE,
-- Program				varchar(75),	
-- Email Address				varchar(50)	UNIQUE,
-- Length of Stay				varchar(50),	
-- Employee Number			int,		UNIQUE		
-- NoOfAccompanysFamilyMembers	int,
FOREIGN KEY(House, UnitNumber) REFERENCES RoomInfo ON DELETE CASCADE,
FOREIGN KEY (ResidentID ) REFERENCES Resident ON DELETE CASCADE,
FOREIGN KEY (residenceID) REFERENCES Residence ON DELETE CASCADE
);

INSERT INTO RoomAllocationInfo VALUES('Bartlett',	5-114-1,	11, 110);
INSERT INTO RoomAllocationInfo VALUES('Maple',	4-123-0,	22, 33);
INSERT INTO RoomAllocationInfo VALUES('Selkirk',	6-321-4,	44, 22);
INSERT INTO RoomAllocationInfo VALUES('Columbia',	6-123-4,	66, 22);
INSERT INTO RoomAllocationInfo VALUES('McDonald',	2-314-3, 55, 44);


CREATE TABLE Works (
	residenceStaffID			int,
	residenceID				int, 
	PRIMARY KEY(ResidenceStaffID, ResidenceID), 
	FOREIGN KEY(ResidenceStaffID) REFERENCES ResidenceStaff ON DELETE CASCADE,
	FOREIGN KEY(ResidenceID) REFERENCES Residence ON DELETE CASCADE,
);


INSERT INTO Works VALUES(67001,	110);
INSERT INTO Works VALUES(67002,	110);
INSERT INTO Works VALUES(67003,	120);
INSERT INTO Works VALUES(67004,	140);
INSERT INTO Works VALUES(67005,	150);

CREATE TABLE LivesWith  (
	residentID				int,
	otherResidentID			int,
	PRIMARY KEY(residentID, otherResidentID), 
	FOREIGN KEY(ResidentID) REFERENCES Resident ON DELETE CASCADE,
	FOREIGN KEY(OtherResidentID) REFERENCES Resident ON DELETE CASCADE,
);

INSERT INTO LivesWith VALUES(44, NULL);



CREATE TABLE amenitiesInResidence(
	AmenityID				int,
	ResidenceID				int,
  NoOfRooms	int		NOT NULL, -- added
	PRIMARY KEY(AmenityID, ResidenceID),
	FOREIGN KEY(AmenityID) REFERENCES Amenity ON DELETE CASCADE,
	FOREIGN KEY(ResidenceID) REFERENCES Residence ON DELETE CASCADE,
);

INSERT INTO amenitiesInResidence VALUES(2345, 110, 3);
INSERT INTO amenitiesInResidence VALUES(2345, 130, 2);
INSERT INTO amenitiesInResidence VALUES(2349, 140, 1);
INSERT INTO amenitiesInResidence VALUES(2346, 140, 2);
INSERT INTO amenitiesInResidence VALUES(2349, 150, 4);


CREATE TABLE CFAresidents (
	ResidentID				int,
	cfaID					int,
	PRIMARY KEY(ResidentID, cfaID),
	FOREIGN KEY(ResidentID) REFERENCES Resident ON DELETE CASCADE,
	FOREIGN KEY(cfaID) REFERENCES CFA ON DELETE CASCADE,
);

INSERT INTO CFAresidents VALUES(44, 38911);
INSERT INTO CFAresidents VALUES(11, 38562);

CREATE TABLE residenceOnCampus(
	CampusID				int,
	ResidenceID				int,
	PRIMARY KEY(CampusID, ResidenceID), 
	FOREIGN KEY(CampusID) REFERENCES Campus ON DELETE CASCADE, 
	FOREIGN KEY(ResidenceID) REFERENCES Residence ON DELETE CASCADE,
);

INSERT INTO residenceOnCampus VALUES(1, 110);
INSERT INTO residenceOnCampus VALUES(2, 130);
INSERT INTO residenceOnCampus VALUES(1, 120);
INSERT INTO residenceOnCampus VALUES(1, 140);
INSERT INTO residenceOnCampus VALUES(2, 150);

CREATE TABLE applicationsForResidence(
	ResidenceID				int,
	ApplicationID				int,
	PRIMARY KEY(ResidenceID, ApplicationID), -- pk
	FOREIGN KEY(ResidenceID) REFERENCES Residence ON DELETE CASCADE,
	FOREIGN KEY(ApplicationID) REFERENCES Application ON DELETE CASCADE,
);

INSERT INTO applicationsForResidence VALUES(110, 201);
INSERT INTO applicationsForResidence VALUES(140, 202);

