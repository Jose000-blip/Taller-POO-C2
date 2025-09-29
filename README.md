# Taller-POO-C2
# 📚 Ejercicios de Programación Orientada a Objetos en Java

Este repositorio contiene 6 ejercicios prácticos de Programación Orientada a Objetos (POO) en Java, diseñados para practicar conceptos fundamentales como clases, constructores, getters/setters, métodos personalizados y el método `toString()`.

---

## 📋 Tabla de Contenidos

1. [Clase Libro](#1-clase-libro)
2. [Clase Coche](#2-clase-coche)
3. [Clase Estudiante](#3-clase-estudiante)
4. [Clase CuentaBancaria](#4-clase-cuentabancaria)
5. [Clase Pelicula](#5-clase-pelicula)
6. [Clase Museo](#6-clase-museo)

---

## 1. Clase Libro

### 📖 Descripción
Modela un libro con sus características básicas y permite determinar si es antiguo según su año de publicación.

### 🔧 Atributos
- `titulo` (String): Título del libro
- `autor` (String): Nombre del autor
- `numeroPaginas` (int): Cantidad de páginas
- `anioPublicacion` (int): Año en que fue publicado

### ⚙️ Métodos principales
- **Constructor por defecto**: Inicializa los atributos con valores vacíos/cero
- **Constructor con parámetros**: Permite crear un libro con todos sus datos
- **Getters y Setters**: Para acceder y modificar cada atributo
- **`esAntiguo()`**: Retorna `true` si el libro tiene más de 20 años desde su publicación
- **`toString()`**: Muestra toda la información del libro

### 💡 Ejemplo de uso
```java
Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 471, 1967);
System.out.println(libro1.esAntiguo()); // true si tiene más de 20 años
```

### 🎯 Objetivo del ejercicio
Practicar la creación de constructores múltiples y métodos que calculan información basándose en los atributos del objeto.

---

## 2. Clase Coche

### 🚗 Descripción
Representa un automóvil con sus especificaciones y permite calcular su edad y determinar si es un vehículo rápido.

### 🔧 Atributos
- `marca` (String): Marca del coche
- `modelo` (String): Modelo específico
- `anioFabricacion` (int): Año de fabricación
- `velocidadMaxima` (int): Velocidad máxima en km/h

### ⚙️ Métodos principales
- **Constructor vacío**: Inicializa con valores por defecto
- **Constructor con parámetros**: Crea un coche con todas sus especificaciones
- **Getters y Setters**: Para todos los atributos
- **`edadCoche()`**: Calcula cuántos años tiene el coche respecto al año actual
- **`esRapido()`**: Retorna `true` si la velocidad máxima es mayor a 200 km/h
- **`toString()`**: Muestra la información completa del coche

### 💡 Ejemplo de uso
```java
Coche coche1 = new Coche("Ferrari", "F8 Tributo", 2020, 340);
System.out.println(coche1.edadCoche()); // Calcula la edad
System.out.println(coche1.esRapido()); // true
```

### 🎯 Objetivo del ejercicio
Trabajar con cálculos que involucran fechas y condiciones booleanas para clasificar objetos.

---

## 3. Clase Estudiante

### 🎓 Descripción
Modela un estudiante universitario con sus datos académicos y permite verificar su estado de aprobación y mayoría de edad.

### 🔧 Atributos
- `nombre` (String): Nombre completo del estudiante
- `edad` (int): Edad del estudiante
- `carrera` (String): Carrera que estudia
- `promedio` (double): Promedio académico

### ⚙️ Métodos principales
- **Constructores**: Vacío y con parámetros
- **Getters y Setters**: Para todos los atributos
- **`aprobo()`**: Retorna `true` si el promedio es mayor o igual a 3.0
- **`esMayorEdad()`**: Retorna `true` si el estudiante tiene 18 años o más
- **`toString()`**: Muestra toda la información del estudiante

### 💡 Ejemplo de uso
```java
Estudiante estudiante1 = new Estudiante("Carlos Mendoza", 20, "Ingeniería de Sistemas", 3.8);
System.out.println(estudiante1.aprobo()); // true
System.out.println(estudiante1.esMayorEdad()); // true
```

### 🎯 Objetivo del ejercicio
Practicar validaciones simples y trabajar con tipos de datos mixtos (String, int, double).

---

## 4. Clase CuentaBancaria

### 💰 Descripción
Simula una cuenta bancaria básica con operaciones de depósito y retiro, incluyendo validaciones de saldo.

### 🔧 Atributos
- `numeroCuenta` (String): Número único de la cuenta
- `titular` (String): Nombre del titular
- `saldo` (double): Saldo disponible en la cuenta

### ⚙️ Métodos principales
- **Constructores**: Vacío y con parámetros
- **Getters y Setters**: Para todos los atributos
- **`depositar(double monto)`**: Incrementa el saldo si el monto es válido
- **`retirar(double monto)`**: Disminuye el saldo si hay fondos suficientes, de lo contrario muestra un mensaje de error
- **`toString()`**: Muestra la información de la cuenta

### 💡 Ejemplo de uso
```java
CuentaBancaria cuenta = new CuentaBancaria("001-234567-89", "María García", 1000.0);
cuenta.depositar(500);  // Saldo: 1500
cuenta.retirar(300);    // Saldo: 1200
cuenta.retirar(2000);   // Error: Fondos insuficientes
```

### 🎯 Objetivo del ejercicio
Implementar métodos que modifican el estado del objeto con validaciones y mensajes informativos.

---

## 5. Clase Pelicula

### 🎬 Descripción
Representa una película con sus datos principales y permite clasificarla según su duración y calcular su antigüedad.

### 🔧 Atributos
- `titulo` (String): Título de la película
- `director` (String): Director de la película
- `duracionMinutos` (int): Duración en minutos
- `anioEstreno` (int): Año de estreno

### ⚙️ Métodos principales
- **Constructores**: Vacío y con parámetros
- **Getters y Setters**: Para todos los atributos
- **`esLarga()`**: Retorna `true` si la película dura más de 120 minutos
- **`antiguedad()`**: Calcula cuántos años han pasado desde su estreno
- **`toString()`**: Muestra toda la información de la película

### 💡 Ejemplo de uso
```java
Pelicula pelicula1 = new Pelicula("El Señor de los Anillos", "Peter Jackson", 201, 2003);
System.out.println(pelicula1.esLarga()); // true
System.out.println(pelicula1.antiguedad()); // Años desde 2003
```

### 🎯 Objetivo del ejercicio
Combinar validaciones numéricas con cálculos de tiempo transcurrido.

---

## 6. Clase Museo

### 🏛️ Descripción
Modela un museo con todas sus características operativas y permite calcular métricas importantes como ingresos anuales y distribución de visitantes.

### 🔧 Atributos
- `nombre` (String): Nombre del museo
- `ciudad` (String): Ciudad donde se encuentra
- `anioInauguracion` (int): Año de inauguración
- `capacidadVisitantes` (int): Capacidad máxima de visitantes simultáneos
- `costoEntrada` (double): Precio de la entrada
- `colecciones` (int): Número de colecciones permanentes
- `visitantesAnuales` (int): Total de visitantes al año

### ⚙️ Métodos principales
- **Constructor completo**: Inicializa todos los atributos
- **Getters y Setters**: Para todos los atributos
- **`antiguedad()`**: Calcula los años que lleva funcionando el museo
- **`ingresosAnuales()`**: Calcula los ingresos multiplicando visitantes anuales por costo de entrada
- **`promedioVisitantesPorColeccion()`**: Calcula el promedio de visitantes por colección
- **`toString()`**: Muestra toda la información del museo de forma estructurada

### 💡 Ejemplo de uso
```java
Museo museoPrado = new Museo("Museo del Prado", "Madrid", 1819, 5000, 120000, 12, 2000000);
System.out.println(museoPrado.antiguedad()); // Años desde 1819
System.out.println(museoPrado.ingresosAnuales()); // 240,000,000,000
System.out.println(museoPrado.promedioVisitantesPorColeccion()); // 166,666.67
```

### 🎯 Objetivo del ejercicio
Trabajar con múltiples atributos y realizar cálculos más complejos que involucran operaciones aritméticas entre varios campos.

---

## 🚀 Cómo ejecutar los ejercicios

### Requisitos previos
- Java JDK 8 o superior instalado
- Un IDE (Eclipse, IntelliJ IDEA, NetBeans) o un editor de texto con soporte para Java

### Pasos para ejecutar

1. **Clonar el repositorio**
```bash
git clone <url-del-repositorio>
cd nombre-del-repositorio
```

2. **Compilar una clase**
```bash
javac NombreDeLaClase.java
```

3. **Ejecutar el programa**
```bash
java NombreDeLaClase
```

### Ejemplo completo
```bash
javac Libro.java
java Libro
```

---

## 📝 Notas importantes

- **Año actual**: Los métodos que calculan antigüedad o edad no utilizan la librería `java.time.Year`. El año actual debe ser calculado manualmente o definido como una constante en el código.

- **Formato de salida**: Todos los ejercicios incluyen el método `toString()` sobrescrito para mostrar la información de forma legible.

- **Validaciones**: Las clases incluyen validaciones básicas (por ejemplo, en CuentaBancaria se valida que haya fondos suficientes antes de retirar).

- **Modificabilidad**: Los setters permiten modificar los atributos después de crear el objeto, lo que facilita la actualización de datos.

---

## 🎓 Conceptos de POO aplicados

Estos ejercicios practican los siguientes conceptos:

✅ **Encapsulamiento**: Atributos privados con acceso controlado mediante getters y setters

✅ **Constructores**: Múltiples constructores para diferentes formas de inicialización

✅ **Métodos de instancia**: Métodos que operan sobre los datos del objeto

✅ **Sobrescritura de métodos**: Implementación personalizada de `toString()`

✅ **Validaciones**: Lógica de negocio dentro de los métodos (como en `retirar()` de CuentaBancaria)

✅ **Cálculos**: Métodos que realizan operaciones matemáticas con los atributos

---

## 🤝 Contribuciones

Si encuentras algún error o tienes sugerencias para mejorar estos ejercicios, siéntete libre de:
- Abrir un Issue
- Enviar un Pull Request
- Contactar al autor

---

## 📄 Licencia

Este proyecto es de uso educativo y libre para fines de aprendizaje.

---

## ✍️ Autor

Desarrollado como material de práctica para aprender Programación Orientada a Objetos en Java.

---

**¡Feliz codificación!** 💻✨
