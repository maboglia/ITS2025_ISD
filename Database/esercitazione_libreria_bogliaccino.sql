use libreria;

select *
from libro 
inner join editore on libro.editore_id = editore.id;

select * from editore;

update libro set editore_id = 1 where editore_id IS NULL;

delete from editore where id = 1;
insert into editore (id, nome, contatto) value (1,'Mondadori', 'info-mondadori@gmail.com');

alter table libro
drop constraint fk_libro_editore;

alter table libro
add constraint fk_libro_editore
foreign key libro(editore_id)
references editore(id)
on delete CASCADE
;

select 
	l.titolo,
    l.prezzo,
    e.nome,
    concat(a.nome, ' ', a.cognome) as autore
from libro as l
join editore as e on l.editore_id = e.id
join autore_libro al on l.id = al.libro_id
join autore a on a.id = al.autore_id
;

alter table autore_libro
add constraint fk_libro_autore
foreign key autore_libro(autore_id)
references autore(id);

alter table autore_libro
add constraint fk_libro_libro
foreign key autore_libro(libro_id)
references libro(id);











