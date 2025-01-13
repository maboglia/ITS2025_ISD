use fondamenti;

create table studenti_bkp
like studenti;

drop table studenti_bkp;

insert into studenti_bkp (nome, cognome)
select nome, cognome from studenti;

SET sql_safe_updates = 0;

delete from studenti;

update studenti set nome = 'mauro' where id = 2;


INSERT INTO studenti (nome, cognome) 
VALUES 
('Francesco','Amerio'),
('Elisa','Andreoli'),
('Mattia','Borrelli'),
('Artem','Bulgakov'),
('Lorenzo','Cattano'),
('Francesco','Ciancaglini'),
('Matteo','Crut'),
('Fabio','De Leo'),
('achille','fomo'),
('Andrea','Frasson'),
('Alessandro','Ganzit'),
('Riccardo','Ottino'),
('John Estiven','Peinetti'),
('Andrea','Rapelli'),
('Alessandro','Ruo Rui'),
('Andrea','Scarrone'),
('Albert Gabriel','Sfetcu'),
('Wendy','Sheme'),
('Matteo','Solavagione'),
('Abel','Starluciuc'),
('Lorenzo','Torres'),
('Vittorio','Umoret'),
('Stefano','Boscolo'),
('Matteo','Cai'),
('Alessandro','D\'Alelio'),
('Enrico','Giacomini');

