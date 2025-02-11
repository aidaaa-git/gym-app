CREATE database gym
use gym
CREATE table member(
id int NOT NULL,
name varchar(256),
surname varchar(256),
phone varchar(256),
email varchar(256),
gender varchar(256),
PRIMARY KEY(id)
)

CREATE table membership(
id int NOT NULL,
name varchar(256),
price int,
duration int,
daysPerWeek int,
primary key(id)
)

create table members_Membership(
id int not null,
memberId int,
membershipId int,
startDate varchar(256),
endDate varchar(256),
price int,
primary key(id),
FOREIGN KEY (memberId) REFERENCES member(id),
FOREIGN KEY (membershipId) REFERENCES membership(id)
)

create table attendance(
id int,
memberId int,
arrivalTime datetime,
leavingTime datetime,
primary key(id),
FOREIGN KEY (memberId) REFERENCES member(id)
)
