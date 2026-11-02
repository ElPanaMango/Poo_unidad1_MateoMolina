# Práctica de Programación Orientada a Objetos - Unidad 2
Repositorio desarrollado para la Universidad Politécnica Salesiana (UPS).

## Descripción del Proyecto
Este proyecto es una ampliación de un sistema de gestión de contenidos audiovisuales aplicando los pilares fundamentales de la Programación Orientada a Objetos (POO): Herencia, Polimorfismo, Asociación, Agregación y Composición en Java.

## Estructura de Clases y Paquetes
El proyecto se encuentra organizado bajo el paquete `uni1a` y `poo`:
- **ContenidoAudiovisual (Clase Abstracta Padre):** Define los atributos base (id, titulo, duracionMinutos, genero) y el método abstracto `mostrarDetalles()`.
- **Pelicula:** Hereda de `ContenidoAudiovisual` e incluye relación de asociación con la clase `Actor`.
- **SerieDeTV:** Hereda de `ContenidoAudiovisual` e incluye una relación de composición con la clase `Temporada`.
- **Documental:** Hereda de `ContenidoAudiovisual` e incluye relación con la clase `Investigador`.
- **VideoYouTube (Nueva subclase):** Extiende la funcionalidad base agregando atributos de canal y vistas.
- **Cortometraje (Nueva subclase):** Extiende la funcionalidad base incorporando datos de festivales.

## Ejecución
1. Clonar el repositorio o importarlo en Eclipse como un proyecto Java existente.
2. Asegurar que las clases estén dentro de los paquetes correspondientes (`uni1a` y `poo`).
3. Ejecutar la clase principal `PruebaAudioVisual.java` ubicada en el paquete `poo`.
