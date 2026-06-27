# 🧠 Evaluación Sumativa 2 – Llanquihue Tour App V1



## 👤 Autor del proyecto

* Nombre completo: Braulio Meriño Valdivia

* Carrera: Desarrollo de Aplicaciones

* Sede: Campus Online



---

📘 Descripción general del sistema

Este proyecto corresponde a la Actividad Formativa 2 de la asignatura \*Desarrollo Orientado a Objetos I\*. Se trata de un sistema de gestión orientado a objetos en lenguaje JAVA.
Este trabajo consiste en aprender y aplicar la Herencia y el Polimorfismo.
Y siempre intentar aplicar las buenas practicas de la Programación Orientada a Objetos.

---

Debes tener la versión 23 de Java o posterior.
 
⚙️ Instrucciones para clonar y ejecutar el proyecto

1) Crea una carpeta vacía con un nombre para identificar el proyecto

- Haz clic derecho dentro de la carpeta, pulsa el botón 'Abrir en terminal'.

2) Una vez que en la terminal escribe lo siguiente: git clone https://github.com/BraulioVevo/LlanquihueTourApp_S6.git 
  
 - Una vez que se haya clonado el proyecto.

3) Abre la carpeta src, luego ui, ejecuta el Main. 
    o Abre el proyecto en tu IDE que más te guste.

4) Ejecutar la clase Main.java.

  🧱 Estructura general del proyecto
  
```text
src/
└── main/
    └── java/
        ├── model/                 
        │   ├── ServicioTuristico.java  (Clase Base)
        │   ├── RutaGastronomica.java   (Subclase)
        │   ├── PaseoLacustre.java      (Subclase)
        │   └── ExcursionCultural.java   (Subclase)
        ├── data/                  # Lógica de negocio y simulación de datos
        │   └── GestorServicios.java
        └── ui/                    # Interfaz de usuario (Consola) y ejecución
            └── Main.java 



