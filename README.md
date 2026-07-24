# API REST y Arquitectura de Base de Datos para Gestión Textil (Shalom)

##  Estado del Proyecto
Este proyecto representa el Backend para la gestión de una empresa del sector textil (Shalom). 
Actualmente, la arquitectura de la base de datos relacional está diseñada en su totalidad (20 tablas) para cubrir toda la logística de la empresa. La API REST se encuentra en su primera fase de desarrollo (MVP), exponiendo los endpoints principales para la gestión transaccional del módulo de Pedidos y Detalles de Pedido.

## Tecnologías Utilizadas
*   **Lenguaje:** Java 17+
*   **Framework:** Spring Boot
*   **Base de Datos:** SQL Server
*   **Herramientas de Testeo:** Postman

## Estructura del Repositorio
Además del código fuente de la API, este repositorio incluye:
*   `database/script_shalom.sql`: Script completo (Esquema y Datos) para recrear la base de datos de 20 tablas en SQL Server.
*   `postman/Shalom_API_Postman_Collection.json`: Colección de pruebas con endpoints GET y POST funcionales.

## Cómo ejecutar el proyecto

## 1. Base de Datos
1. Abrir SQL Server Management Studio (SSMS).
2. Ejecutar el archivo `database/script_shalom.sql` para generar la base de datos completa con su información de prueba.

## 2. API REST
1. Importar el proyecto en tu IDE favorito (IntelliJ IDEA, Eclipse, etc.).
2. Configurar el archivo `application.properties` con tus credenciales locales de SQL Server (usuario, contraseña, puerto).
3. Ejecutar la aplicación `ShalomApiRestApplication`.

## 3. Pruebas con Postman
1. Abrir Postman.
2. Ir a `File` -> `Import` y seleccionar el archivo `postman/Shalom_API_Postman_Collection.json`.
3. Ejecutar las peticiones para verificar la conexión y el manejo de relaciones (ej. `detallepedido`).

##  Próximos Pasos
*   Implementar métodos PUT y DELETE para completar el CRUD.
*   Integrar seguridad básica.
*   Expansión de endpoints hacia los módulos de inventario y proveedores.
