# Uso de POO + Diagrama de clases + Gestores de datos
### Integrantes
- Sebastián Bustos
- Sebastián Lück
- Eduardo Gómez
---
### Ánalisis de la problematica:
Las principales clases identificadas son Cliente, Desktop, Dispositivo, Notebook, Pantalla, Tablet, Factura y Tienda.
Tienda, siendo la clase que maneja las principales funciones de la aplicación, como cambiar la dirección de la tienda, registrar clientes, buscar, filtrar, crear y entregar los dispositivos, agregar y eliminar dispositivos a un carro para poder comprar más tarde, también contiene una relación de agregacion con Clientes y Dispositivos.
Dispositivo es la clase padre de Notebook, Desktop y Tablet, y todas en común contienen métodos ToString() personalizados, para poder mostrar la información detallada de cada dispositivo.
Desktop contiene un objeto Pantalla, cuya relación de composición, siendo que la pantalla no puede existir sin el Desktop y cuya información tambien se incluye en el ToString().
Factura puede contener ninguno o un Cliente y siempre una Tienda.
### El diagrama de clases UML:
![Diagrama uml](assets/Tienda.png)
Como disclaimer, utilizamos el gestor de datos proporcionado por el ayudante por ende se sobre entiende que está aplicado a la tienda.
--
# Capturas del funcionamiento del programa
![Diagrama uml](assets/img.png)
aquí irán las capturas del funcionamiento del programa