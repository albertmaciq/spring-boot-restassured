# Spring-boot-restassured
## ️ ⚙️ Ejecución ️y configuración
Para iniciar la aplicación, debemos correr los siguientes comandos:
```
mvn clean package -pl greeting-module
```
Para correr los tests de REST-assured sólo será necesario aplicar el 
siguiente comando:
```
mvn clean test -pl restassured
```

Puesto que para la ejecución de los tests de REST-assured es necesario 
que la API se encuentre desplegada y funcional, se debe destacar que 
estos **NO funcionarán indefinidamente** a no ser que se actualicen 
los correspondientes cambios para en los ficheros de despliegue de 
este proyecto `(greeting-module/k8s)` y se desplieguen en otro 
directorio del *cloud* de su elección.

En caso de que se quiera desplegar la API se deberán ejecutar los 
siguientes comandos:
```
mvn clean spring-boot:build-image -pl greeting-module
docker push [image-name]
```
Deberemos situarnos en el path `greeting-module/k8s`
correspondiente a la ubicación de los ficheros *deployment.yml*,
*ingress.yml* y *service.yml* para la ejecución de los siguientes
comandos:
```
kubectl delete service/spring-boot-restassured -n vass-radar-app
kubectl delete deployment.apps/spring-boot-restassured -n vass-radar-app
kubectl apply -f deployment.yml
kubectl apply -f service.yml
```

Comando para obtener el status de la API desplegada:
```
kubectl get all -n vass-radar-app
```