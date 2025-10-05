
# PedidosYa

Este proyecto, llamado **PedidosYa**, ha sido desarrollado como parte de una actividad para la asignatura **Acceso a Datos** del ciclo formativo de grado superior **Desarrollo de Aplicaciones Multiplataforma (DAM)**.  

La aplicación permite gestionar una lista de **clientes** y sus **pedidos**, exportar los datos a archivos en formato **CSV** y **binario (.dat)**, y posteriormente leerlos desde disco.

---

## 🛠 Tecnologías utilizadas

- Java 17 (o versión compatible)
- IntelliJ IDEA
- Programación orientada a objetos (POO)
- Serialización de objetos (`Serializable`)
- Lectura y escritura de archivos:
  - CSV (texto plano)
  - Binario (`.dat`)

---

## 📁 Estructura del proyecto

src/
├── model/
│ ├── Cliente.java # Clase que representa un cliente
│ └── Pedido.java # Clase que representa un pedido
│
├── utils/
│ ├── ListGenerator.java # Genera listas simuladas de clientes y pedidos
│ └── FileManager.java # Gestiona la exportación y lectura de archivos
│
├── testing/
│ └── Test.java # Clase main para probar la aplicación
│
└── resources/
├── clientes.csv # Archivo CSV generado con los clientes
├── clientes.dat # Archivo binario/.dat generado con los clientes
├── pedidos.csv # Archivo CSV generado con los pedidos
└── pedidos.dat # Archivo binario/.dat generado con los pedidos

---

## ▶️ Cómo ejecutar el proyecto

1. Clona el repositorio:
   ```bash
   git clone https://github.com/tuusuario/pedidosya.git
Abre el proyecto con IntelliJ IDEA o cualquier otro IDE Java.

Asegúrate de que la carpeta resources/ exista dentro de src/.

Ejecuta la clase Test.java ubicada en el paquete testing.

El método main en la clase Test está preparado para ejecutar directamente 
las funcionalidades de exportar y leer archivos, sin necesidad de modificar el código.

---

## 📌 Notas adicionales

El contenido de las listas es simulado para fines académicos.

Se hace uso de la sobreescritura de toString() para facilitar la exportación a texto plano (CSV).

Se recomienda ejecutar el proyecto desde un entorno que permita escribir archivos en disco.

---

## ✍️ Autor

Samantha Mohedano Barrena
Asignatura: Acceso a Datos
Ciclo: CFGS Desarrollo de Aplicaciones Multiplataforma (DAM)
Curso académico: 2025-2026

---

## ⚖️ Licencia

Este proyecto se ha desarrollado con fines educativos. Puedes reutilizarlo o modificarlo siempre que se mantenga el crédito a la autora original.


