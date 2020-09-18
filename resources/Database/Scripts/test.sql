connect 'jdbc:derby://localhost:1527/TriveraTunes;create=true;user=sa;password=password';
 
Select * from Cd where Name Like '%A%' OR ARTIST LIKE '%A%';
