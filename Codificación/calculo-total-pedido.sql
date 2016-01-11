select ped.idPedido, sum(lp.cantidad*p.precio) from precios p inner join productos o on p.idProducto=o.idProducto
inner join lineadepedido lp on lp.idProducto = o.idProducto inner join pedidos ped on ped.idPedido = lp.idPedido

group by ped.idPedido