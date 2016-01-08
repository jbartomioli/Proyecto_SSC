truncate table userdetail;

insert into userdetail
select idCliente as id, concat(nombre," ",apellido) as name, concat(substr(lower(nombre),1,1),lower(apellido)) as username, 12345 as password, idCliente as idCliente from clientes