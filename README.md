# Aplicación Web Segura

En este repositorio podrá encontrar como se desarrollo una aplicación web segura que:
* garantice autenticación, autorización e integridad de usuarios.
* Tenga al menos dos computadores comunicandose entre ellos y el acceso de servicios remotos debe garantizar:
   * autenticación, autorización e integridad entre los servicios. 
   * Nadie puede invocar los servicios si no está autorizado.
   
## Prerequisitos

Es necesario tener instalado Java 1.8 y Apache Maven 3.6.0

## Ejecutar

### Descagar dependencias y compilar
```
mvn package
```
### Documentación
```
mvn javadoc:jar
```
La documentación generada por el comando anterior se encuentra en la ruta **target\apidocs**
### Ejecutar
```
java -jar target\secure_application-0.0.1-SNAPSHOT.jar
java -jar target\client_secure_application-0.0.1-SNAPSHOT.jar
```
   
## Certificados

Lo primero que se debe realizar es generar los certificados para el cliente y para el servidor

![](https://github.com/anamaria1299/SecureWebApp/blob/master/images/Screen%20Shot%202019-10-23%20at%209.28.23%20AM.png)

![](https://github.com/anamaria1299/SecureWebApp/blob/master/images/Screen%20Shot%202019-10-23%20at%209.52.00%20AM.png)

Luego de esto se debe crear el certificado público de la siguiente forma

![](https://github.com/anamaria1299/SecureWebApp/blob/master/images/Screen%20Shot%202019-10-23%20at%209.55.35%20AM.png)

El siguiente paso es importar los certificados desde cada uno de los anteriormente creados

![](https://github.com/anamaria1299/SecureWebApp/blob/master/images/Screen%20Shot%202019-10-23%20at%2010.11.19%20AM.png)

![](https://github.com/anamaria1299/SecureWebApp/blob/master/images/Screen%20Shot%202019-10-23%20at%2010.11.53%20AM.png)

Finalmente se realizan las configuraciones correspondientes en el application.properties que puede encontrar en los dos 
proyectos y finalmete se debe exportar el certificado como .p12

![](https://github.com/anamaria1299/SecureWebApp/blob/master/images/Screen%20Shot%202019-10-23%20at%203.33.44%20PM.png)

y de esta forma poderlo importar al navegador.

# Funcionalidad de la aplicación

La aplicación por medio de un formulario se comunica con el servidor y este devuelve un saludo con un nombre dado anteriormente,
además solo es posible acceder a dicho formulario cuando se ha cumplido con un proceso de autenticación.

![](https://github.com/anamaria1299/SecureWebApp/blob/master/images/Screen%20Shot%202019-10-24%20at%2012.18.53%20AM.png)

primero se debe agregar el certificado al navegador, para permitirle confiar en la página de nuestra aplicación

![](https://github.com/anamaria1299/SecureWebApp/blob/master/images/Screen%20Shot%202019-10-24%20at%2012.19.13%20AM.png)

Luego, esto nos lleva a una página donde debemos autenticarnos y dicha autenticación nos redirige a el formulario antes mencionado,
donde luego el servidor nos manda una respuesta que se muestra en la siguiente imagen

![](https://github.com/anamaria1299/SecureWebApp/blob/master/images/Screen%20Shot%202019-10-24%20at%2012.19.58%20AM.png)

![](https://github.com/anamaria1299/SecureWebApp/blob/master/images/Screen%20Shot%202019-10-24%20at%2012.20.06%20AM.png)

## Autor
Ana María Rincón Casallas

## Licencia
Este proyecto está licenciado bajo GNU General Public License - ver [LICENSE](https://github.com/anamaria1299/SecureWebApp/blob/master/LICENSE) para más detalles 
