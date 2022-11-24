
```

### 3.- Ejercicio
 MYSQL , Java ,ORM el siguientes casos de uso, siguiendo los principios SOLID y patrones de arquitectura:

* Actualmente los clientes cuentan con una tarjeta electrónica, donde realizan recargas y comprar en cualquier punto de venta.

* Se solicita crear los siguientes casos de uso.
* Permitir agregar saldos si el cliente esta activo
* Permitir comprar un producto si este cuenta con saldo.
* Permitir y consultar el histórico de comprar y recargas.
* Permitir la edición del nombre del cliente.

*  Vistas
```

1.- Cliente
Nombre : Eduardo Padilla
Cuenta: 12234444

2.- Compras
Productos: Coca
Precio : 3500

3.- Recarga
Cuenta : 12234444
Cantidad : 5000

4.- Histórico
   Eduardo Padilla  
   Cta :12234444 

```
 Vista Histórico
 
|Descripción| Compras| Recargas|
| --- | --- |--- |
|Recarga	| 		 | 5000    |
|Coca		| 3500	 |         |
|Papas		| 1500	 |         |
|Recarga	|        |  1000   |
|TOTAL	    |   5000 |  6000   |
|Saldo	    |    |  	+1000   |


