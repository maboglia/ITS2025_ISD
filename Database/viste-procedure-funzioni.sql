SELECT * 
FROM libreria_completa
WHERE editore = 'Mondadori'
ORDER BY prezzo
;

SELECT editore, count(*) as num_libri 
FROM libreria_completa
group by editore
having num_libri > 1
ORDER BY num_libri desc
;

DROP PROCEDURE Add_Book;
DELIMITER //

CREATE PROCEDURE Add_Book(
	IN titolo_libro VARCHAR(30), 
	IN nome_autore VARCHAR(30), 
	IN cognome_autore VARCHAR(30), 
	IN nome_editore VARCHAR(30)    
    )

    BEGIN
	DECLARE id_editore int; 
	DECLARE id_libro int; 
	DECLARE id_autore int; 
    
    INSERT INTO editore (nome) VALUES (nome_editore);
	-- last_insert_id() l'id dell'editore appena inserito
    SET id_editore = last_insert_id();
 	INSERT INTO libro (titolo, editore_id) VALUES (titolo_libro, last_insert_id());
    SET id_libro = last_insert_id();
	INSERT INTO autore (nome, cognome) VALUES (nome_autore, cognome_autore);
    SET id_autore = last_insert_id();
	INSERT INTO autore_libro (libro_id, autore_id) VALUES (id_libro, id_autore);
	-- last_insert_id() l'id dell'autore appena inserito
    
END //

DELIMITER ;

CALL Add_Book(
	'io robot',
    'isaac',
    'asimov',
    'Alessandro Ruo Rui'
);
delete from autore where id > 23;

select *
from libro l
right outer join autore_libro al on l.id = al.libro_id;



















