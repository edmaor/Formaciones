# drop table if exists Firm;
# create table Firm(id int primary key AUTO_INCREMENT, cif varchar(12), name varchar(72), address varchar(512));
#
# drop table if exists Student;
# create table Student(id int primary key AUTO_INCREMENT,fname varchar(48), last_name varchar(96), cycle varchar(24), modality varchar(32), practices_status varchar(24), firm_id int, foreign key (firm_id) references Firm(id));

insert into Firm (cif, name, address) values ('43040966B', 'Coctelea', 'Passeig de Gràcia');
insert into Firm (cif, name, address) values ('37081589V', 'Andalax', '85 Mifflin Plaza');
insert into Firm (cif, name, address) values ('38203902y', 'Solarbreeze', '60007 Gateway Point');
insert into Firm (cif, name, address) values ('69195702R', 'Keylex', '4528 Village Alley');

insert into Student (fname, last_name, cycle, modality, practices_status, firm_id) values ('Edu', 'Martorell Ortuño', 'DAM', 'FCT', 'UNDERWAY', 1);
insert into Student (fname, last_name, cycle, modality, practices_status, firm_id) values ('Mark', 'Radford', 'DAW', 'FCT', 'FINALIZED', 2);
insert into Student (fname, last_name, cycle, modality, practices_status, firm_id) values ('Janella', 'Cornwell', 'ASIX', 'DUAL', 'UNDERWAY', 3);
insert into Student (fname, last_name, cycle, modality, practices_status, firm_id) values ('Emlyn', 'Rameaux', 'DAW', 'FCT', 'FINALIZED', 4);
insert into Student (fname, last_name, cycle, modality, practices_status, firm_id) values ('Harlie', 'Crawford', 'DAM', 'DUAL', 'UNDERWAY', 1);
insert into Student (fname, last_name, cycle, modality, practices_status, firm_id) values ('Cad', 'Longforth', 'DAW', 'FCT', 'FINALIZED', 2);
insert into Student (fname, last_name, cycle, modality, practices_status, firm_id) values ('Lise', 'Bolens', 'SMX', 'FCT', 'UNDERWAY', 3);
insert into Student (fname, last_name, cycle, modality, practices_status, firm_id) values ('Bryana', 'Spykings', 'DAW', 'DUAL', 'UNDERWAY', 4);
insert into Student (fname, last_name, cycle, modality, practices_status, firm_id) values ('Benoit', 'Giamuzzo', 'DAW', 'DUAL', 'FINALIZED', 1);
insert into Student (fname, last_name, cycle, modality, practices_status, firm_id) values ('Mario', 'Owen', 'DAM', 'DUAL', 'FINALIZED', 1);
insert into Student (fname, last_name, cycle, modality, practices_status, firm_id) values ('Nels', 'Caress', 'DAW', 'FCT', 'UNDERWAY', 2);
insert into Student (fname, last_name, cycle, modality, practices_status, firm_id) values ('Christoper', 'Columbus', 'SMX', 'DUAL', 'FINALIZED', 3);
insert into Student (fname, last_name, cycle, modality, practices_status, firm_id) values ('Mariejeanne', 'Slocum', 'DAW', 'DUAL', 'UNDERWAY', 4);
insert into Student (fname, last_name, cycle, modality, practices_status, firm_id) values ('Alexander', 'Smith', 'DAW', 'DUAL', 'UNDERWAY', 1);
insert into Student (fname, last_name, cycle, modality, practices_status, firm_id) values ('Willetta', 'Kingstne', 'DAW', 'DUAL', 'UNDERWAY', 2);

