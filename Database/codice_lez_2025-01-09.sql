-- DDL: data definition language

CREATE TABLE studenti(

  id INT PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(30),
  cognome VARCHAR(30)


);




-- CRUD
-- CREATE: insert

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

-- UPDATE

UPDATE studenti SET nome = upper(nome), cognome = upper(cognome);

-- delete

DELETE FROM studenti WHERE nome = 'ALESSANDRO';

-- READ: SELECT
SELECT cognome, nome FROM studenti ORDER BY nome;
