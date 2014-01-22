/*insert into BD_SSC.categorias 
(select * from aux.categorias)*/

select * from BD_SSC.categorias

/*
insert into BD_SSC.clientes
select * from aux.clientes ac order by ac.idCliente
*/

select * from BD_SSC.clientes ac order by ac.idCliente


/*
insert into BD_SSC.parametrosNegocio
select * from aux.parametrosNegocio
*/
select * from BD_SSC.parametrosNegocio

/*
insert into BD_SSC.subcategorias (idCategoria, descripcion)
(select sc.idCategoria, sc.descripcion from aux.subcategorias sc)
*/
select * from BD_SSC.subcategorias sc

/*
insert into BD_SSC.ventas
select * from aux.ventas
*/
select * from BD_SSC.ventas

/*
insert into productos (idProducto, codProducto, nombre, stock)
(select idProducto, codProducto, nombre, stock from aux.productos)
*/
select * from BD_SSC.productos

/*
insert into BD_SSC.precios
select * from aux.precios 
*/
select * from BD_SSC.precios 


/*
insert into BD_SSC.lineasDeVentas (subtotal, cantidad, idVenta, idProducto)
(select subtotal, cantidad, idVenta, idProducto from aux.lineasDeVentas)
*/
select * from BD_SSC.lineasDeVentas