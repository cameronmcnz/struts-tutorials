connect 'jdbc:derby://localhost:1527/TriveraTunes;user=sa;password=password';
Delete from Cd; 
Delete from Category; 
 
Insert into Category values(0,'UnKnown');
Insert into Category values(1,'Rock');
Insert into Category values(2,'Pop');
Insert into Category values(3,'SoundTrack');
Insert into Category values(4,'Classic');
Insert into Category values(9,'NEW');

Insert into Cd values('CD501', 'Diva', 'Annie Lennox', '1992-01-04', 17.97, 13.99,2);
Insert into Cd values('CD502', 'Dream of the Blue Turtles', 'Sting', '1985-02-05', 17.97, 14.99,2);
Insert into Cd values('CD503', 'Trouble is...', 'Kenny Wayne Shepherd Band', '1997-08-08', 17.97, 14.99,2);
Insert into Cd values('CD504', 'Lie to Me', 'Jonny Lang', '1997-08-26', 17.97, 14.99,2);
Insert into Cd values('CD505', 'Little Earthquakes', 'Tori Amos', '1992-01-18', 17.97, 14.99,2);
Insert into Cd values('CD506', 'Seal', 'Seal', '1991-08-18', 17.97, 14.99,2);
Insert into Cd values('CD507', 'Ian Moore', 'Ian Moore', '1993-12-05', 9.97, 9.97,2);
Insert into Cd values('CD508', 'So Much for the Afterglow', 'Everclear', '1997-01-19', 16.97, 13.99,1);
Insert into Cd values('CD509', 'Surfacing', 'Sarah McLachlan', '1997-12-04', 17.97, 13.99,2);
Insert into Cd values('CD510', 'Hysteria', 'Def Leppard', '1987-06-20', 17.97, 14.99,1);
Insert into Cd values('CD511', 'A Life of Saturdays', 'Dexter Freebish', '2000-12-06', 16.97, 12.99,2);
Insert into Cd values('CD512', 'Human Clay', 'Creed', '1999-10-21', 18.97, 13.28,1);
Insert into Cd values('CD513', 'My, I am Large', 'Bobs', '1987-02-20', 11.97, 11.97,2);
Insert into Cd values('CD514', 'So', 'Peter Gabriel', '1986-10-03', 17.97, 13.99,2);
Insert into Cd values('CD515', 'Big Ones', 'Aerosmith', '1994-05-08', 18.97, 14.99,1);
Insert into Cd values('CD516', '90125', 'Yes', '1983-10-16', 11.97, 11.97,2);
Insert into Cd values('CD517', '1984', 'Van Halen', '1984-08-19', 11.97, 11.97,1);
Insert into Cd values('CD518', 'Escape', 'Journey', '1981-02-25', 11.97, 11.97,1);

Insert into Cd values('CD519', 'Chicago (The Miramax Motion Picture Soundtrack)','Various Artists','2002-12-04',18.99,13.99,3);
Insert into Cd values('CD520', 'The Lord of the Rings: The Two Towers','Various Artists','2002-12-10',19.98,14.99,3);
Insert into Cd values('CD521', 'The Lord of the Rings: The Fellowship of the Ring', 'Various Artists','2001-11-24',19.98,14.99,3);
Insert into Cd values('CD522', '8 Mile (Deluxe Limited Edition)', 'Eminem', '2002-10-29',19.98,14.99,3);
Insert into Cd values('CD523', 'The Best of 1990-2000', 'U2' ,'2002-11-12',19.98,13.49,2); 
Insert into Cd values('CD524', 'Best of 1980-1990', 'U2' ,'1998-11-10',19.98,13.49,2); 
Insert into Cd values('CD526', 'Brothers in Arms', 'Dire Straits', '2000-09-19',11.98,11.98,1);
Insert into Cd values('CD527', 'Making Movies', 'Dire Straits', '2000-09-19',11.98,11.98,1);
Insert into Cd values('CD528', 'Simply The Best', 'Tina Turner', '1991-10-22',19.98,16.99,2);
Insert into Cd values('CD529', 'Private Dancer', 'Tina Turner', '2000-03-14',11.98,11.98,2);
Insert into Cd values('CD530', 'Money for Nothing', 'Dire Straits', '1998-10-09',11.98,11.98,1);