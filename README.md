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
7. [Cómo ejecutar](#-cómo-ejecutar-los-ejercicios)

---

## 1. Clase Libro

### 📖 Descripción
Modela un libro con sus características básicas y permite determinar si es antiguo según su año de publicación.

### 🔧 Atributos
- `titulo` (String): Título del libro
- `autor` (String): Nombre del autor
- `numeroPaginas` (int): Cantidad de páginas
- `añoPublicacion` (int): Año en que fue publicado

### ⚙️ Métodos principales
- **Constructor por defecto**: Inicializa los atributos con valores vacíos/cero
- **Constructor con parámetros**: Permite crear un libro con todos sus datos
- **Getters y Setters**: Para acceder y modificar cada atributo
- **`esAntiguo()`**: Retorna `true` si el libro tiene más de 20 años desde su publicación (usando 2025 como año actual)
- **`toString()`**: Muestra toda la información del libro

### 💡 Ejemplo de uso
```java
Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 471, 1967);
System.out.println(libro1);
System.out.println("Es viejo? ");
System.out.println(libro1.esAntiguo() ? "Si" : "No");
```

### 📊 Salida esperada
```
Libro {titulo='Cien años de soledad', autor='Gabriel García Márquez', numero de paginas=471, año de publicacion=1967}
Es viejo? 
Si
```

---

## 2. Clase Coche

### 🚗 Descripción
Representa un automóvil con sus especificaciones y permite calcular su edad y determinar si es un vehículo rápido.

### 🔧 Atributos
- `marca` (String): Marca del coche
- `modelo` (String): Modelo específico
- `añoFabricacion` (int): Año de fabricación
- `velocidadMaxima` (int): Velocidad máxima en km/h

### ⚙️ Métodos principales
- **Constructor vacío**: Inicializa con valores por defecto
- **Constructor con parámetros**: Crea un coche con todas sus especificaciones
- **Getters y Setters**: Para todos los atributos
- **`edadCoche()`**: Calcula cuántos años tiene el coche respecto al año 2025
- **`esRapido()`**: Retorna `true` si la velocidad máxima es mayor a 200 km/h
- **`toString()`**: Muestra la información completa del coche

### 💡 Ejemplo de uso
```java
Coche coche1 = new Coche("Ferrari", "F8 Tributo", 2020, 340);
System.out.println(coche1);
System.out.println("Edad: " + coche1.edadCoche() + " años");
System.out.println("Corre duro? ");
System.out.println(coche1.esRapido() ? "Si" : "No");
```

### 📊 Salida esperada
```
Coche {marca='Ferrari', modelo='F8 Tributo', año de fabricacion=2020, velocidad maxima=340 km/h}
Edad: 5 años
Corre duro? 
Si
```

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
- **Constructor vacío**: Inicializa con valores por defecto
- **Constructor con parámetros**: Crea un estudiante con todos sus datos
- **Getters y Setters**: Para todos los atributos
- **`aprobo()`**: Retorna `true` si el promedio es mayor o igual a 3.0
- **`esMayorEdad()`**: Retorna `true` si el estudiante tiene 18 años o más
- **`toString()`**: Muestra toda la información del estudiante

### 💡 Ejemplo de uso
```java
Estudiante estudiante1 = new Estudiante("Juanito Mendoza", 20, "Ingeniería de Sistemas", 3.8);
System.out.println(estudiante1);
System.out.println("¿Aprobó? " + (estudiante1.aprobo() ? "Sí" : "No"));
System.out.println("¿Es mayor de edad? " + (estudiante1.esMayorEdad() ? "Sí" : "No"));
```

### 📊 Salida esperada
```
Estudiante {nombre='Juanito Mendoza', edad=20, carrera='Ingeniería de Sistemas', promedio=3.8}
¿Aprobó? Sí
¿Es mayor de edad? Sí
```

---

## 4. Clase CuentaBancaria

### 💰 Descripción
Simula una cuenta bancaria básica con operaciones de depósito y retiro, incluyendo validaciones de saldo. **Esta clase solicita datos por consola usando Scanner**.

### 🔧 Atributos
- `numeroCuenta` (String): Número único de la cuenta
- `titular` (String): Nombre del titular
- `saldo` (double): Saldo disponible en la cuenta

### ⚙️ Métodos principales
- **Constructor vacío**: Inicializa con valores por defecto
- **Constructor con parámetros**: Crea una cuenta con todos sus datos
- **Getters y Setters**: Para todos los atributos
- **`depositar(double monto)`**: Incrementa el saldo si el monto es válido
- **`retirar(double monto)`**: Disminuye el saldo si hay fondos suficientes, de lo contrario muestra un mensaje de error
- **`toString()`**: Muestra la información de la cuenta

### 💡 Ejemplo de uso
El programa solicita al usuario:
1. Número de cuenta
2. Nombre del titular
3. Saldo inicial
4. Monto a depositar
5. Monto a retirar

### 📊 Ejemplo de interacción
```
=== CREAR CUENTA BANCARIA ===
Ingrese número de cuenta: 001-234567-89
Ingrese nombre del titular: María García
Ingrese saldo inicial: $1000

Estado inicial:
CuentaBancaria {numero de cuenta='001-234567-89', titular='María García', saldo=$1000.0}

Ingrese monto a depositar: $500
Depósito exitoso de $500.0
Saldo actual: $1500.0

Ingrese monto a retirar: $300
Retiro exitoso de $300.0
Saldo actual: $1200.0

Estado final:
CuentaBancaria {numero de cuenta='001-234567-89', titular='María García', saldo=$1200.0}
```

### ⚠️ Características especiales
- **Entrada interactiva**: Utiliza `Scanner` para leer datos desde la consola
- **Validaciones**: No permite retiros si el saldo es insuficiente
- **Mensajes informativos**: Muestra el estado de cada operación

---

## 5. Clase Pelicula

### 🎬 Descripción
Representa una película con sus datos principales y permite clasificarla según su duración y calcular su antigüedad.

### 🔧 Atributos
- `titulo` (String): Título de la película
- `director` (String): Director de la película
- `duracionMinutos` (int): Duración en minutos
- `añoEstreno` (int): Año de estreno

### ⚙️ Métodos principales
- **Constructor vacío**: Inicializa con valores por defecto
- **Constructor con parámetros**: Crea una película con todos sus datos
- **Getters y Setters**: Para todos los atributos
- **`esLarga()`**: Retorna `true` si la película dura más de 120 minutos
- **`antiguedad()`**: Calcula cuántos años han pasado desde su estreno (usando 2025 como año actual)
- **`toString()`**: Muestra toda la información de la película

### 💡 Ejemplo de uso
```java
Pelicula pelicula1 = new Pelicula("El Señor de los Anillos: El Retorno del Rey",
                                  "Peter Jackson", 201, 2003);
System.out.println(pelicula1);
System.out.println("Es larga? ");
System.out.println(pelicula1.esLarga() ? "Si" : "No");
System.out.println("Antiguedad: " + pelicula1.antiguedad() + " años");
```

### 📊 Salida esperada
```
Pelicula {titulo='El Señor de los Anillos: El Retorno del Rey', director='Peter Jackson', duracion en minutos=201, año de estreno=2003}
Es larga? 
Si
Antiguedad: 22 años
```

---

## 6. Clase Museo

### 🏛️ Descripción
Modela un museo con todas sus características operativas y permite calcular métricas importantes como ingresos anuales y distribución de visitantes.

### 🔧 Atributos
- `nombre` (String): Nombre del museo
- `ciudad` (String): Ciudad donde se encuentra
- `añoInauguracion` (int): Año de inauguración
- `capacidadVisitantes` (int): Capacidad máxima de visitantes simultáneos
- `costoEntrada` (double): Precio de la entrada
- `colecciones` (int): Número de colecciones permanentes
- `visitantesAnuales` (int): Total de visitantes al año

### ⚙️ Métodos principales
- **Constructor completo**: Inicializa todos los atributos
- **Getters y Setters**: Para todos los atributos
- **`antiguedad()`**: Calcula los años que lleva funcionando el museo (usando 2025 como año actual)
- **`ingresosAnuales()`**: Calcula los ingresos multiplicando visitantes anuales por costo de entrada
- **`promedioVisitantesPorColeccion()`**: Calcula el promedio de visitantes por colección
- **`toString()`**: Muestra toda la información del museo de forma estructurada

### 💡 Ejemplo de uso
```java
Museo museoPrado = new Museo("Museo del Prado", "Madrid", 1819, 
                             5000, 120000, 12, 2000000);
System.out.println(museoPrado);
System.out.println();
System.out.println("Antiguedad: " + museoPrado.antiguedad() + " años");
System.out.println("Ingresos Anuales: $" + String.format("%.2f", museoPrado.ingresosAnuales()));
System.out.println("Promedio de Visitantes por Colección: " + 
                  String.format("%.2f", museoPrado.promedioVisitantesPorColeccion()) + " visitantes");
```

### 📊 Salida esperada
```
=========================================
           INFORMACIÓN DEL MUSEO         
=========================================
Nombre: Museo del Prado
Ciudad: Madrid
Año de Inauguración: 1819
Capacidad de Visitantes: 5000 personas
Costo de Entrada: $120000.0
Colecciones Permanentes: 12
Visitantes Anuales: 2000000
=========================================

Antiguedad: 206 años
Ingresos Anuales: $240000000000.00
Promedio de Visitantes por Colección: 166666.67 visitantes
```

---

## 🚀 Cómo ejecutar los ejercicios

### Requisitos previos
- **Java JDK 8 o superior** instalado
- Un **IDE** (Eclipse, IntelliJ IDEA, NetBeans, VS Code) o un editor de texto con soporte para Java
- Terminal o línea de comandos

### Pasos para ejecutar

#### 1️⃣ Clonar el repositorio
```bash
git clone <url-del-repositorio>
cd nombre-del-repositorio
```

#### 2️⃣ Compilar una clase
```bash
javac NombreDeLaClase.java
```

#### 3️⃣ Ejecutar el programa
```bash
java NombreDeLaClase
```

### 📝 Ejemplo completo

**Para ejecutar la clase Libro:**
```bash
javac Libro.java
java Libro
```

**Para ejecutar la clase CuentaBancaria (con entrada interactiva):**
```bash
javac CuentaBancaria.java
java CuentaBancaria
```
*Nota: Este programa te pedirá ingresar datos por teclado*

### 🔄 Compilar y ejecutar todas las clases
```bash
javac *.java
java Libro
java Coche
java Estudiante
java CuentaBancaria
java Pelicula
java Museo
```

---

## 📝 Notas importantes

### ⏰ Año actual hardcodeado
Todos los métodos que calculan antigüedad o edad **NO utilizan librerías externas** como `java.time.Year`. El año actual está definido como **2025** directamente en el código:

```java
int añoActual = 2025;
```

Esto significa que:
- `edadCoche()` calcula: `2025 - añoFabricacion`
- `esAntiguo()` verifica si: `2025 - añoPublicacion > 20`
- `antiguedad()` calcula: `2025 - añoEstreno` o `2025 - añoInauguracion`

### 📥 Entrada de datos
- **CuentaBancaria**: Es la única clase que solicita datos por consola usando `Scanner`
- **Las demás clases**: Tienen valores predefinidos en el método `main()`

### ✨ Características implementadas
- ✅ **Encapsulamiento**: Todos los atributos son privados
- ✅ **Constructores múltiples**: Constructor vacío y con parámetros
- ✅ **Getters y Setters**: Para todos los atributos
- ✅ **Métodos personalizados**: Lógica de negocio específica de cada clase
- ✅ **toString() sobrescrito**: Formato legible para mostrar objetos
- ✅ **Validaciones**: En métodos como `depositar()` y `retirar()`

### 🎨 Formato de salida
Todos los métodos `toString()` están personalizados para mostrar la información de forma clara y estructurada.

---

## 🎓 Conceptos de POO aplicados

Estos ejercicios practican los siguientes conceptos fundamentales:

| Concepto | Descripción | Ejemplo en el código |
|----------|-------------|---------------------|
| **Encapsulamiento** | Atributos privados con acceso controlado | `private String titulo;` |
| **Constructores** | Múltiples formas de inicializar objetos | Constructor vacío y con parámetros |
| **Métodos de instancia** | Operan sobre los datos del objeto | `esAntiguo()`, `edadCoche()` |
| **Sobrescritura** | Implementación personalizada de métodos | `@Override toString()` |
| **Validaciones** | Lógica de negocio dentro de métodos | `retirar()` valida saldo suficiente |
| **Métodos de cálculo** | Procesan datos para obtener información | `ingresosAnuales()`, `antiguedad()` |
| **Entrada de usuario** | Interacción con el usuario | `Scanner` en CuentaBancaria |

---

## 📂 Estructura del proyecto
```
Taller POO/
│
├── src/
│   ├── Libro.java
│   ├── Coche.java
│   ├── Estudiante.java
│   ├── CuentaBancaria.java
│   ├── Pelicula.java
│   └── Museo.java
│
├── out/
│   └── production/
│       └── Taller POO/
│           ├── Libro.class
│           ├── Coche.class
│           ├── Estudiante.class
│           ├── CuentaBancaria.class
│           ├── Pelicula.class
│           └── Museo.class
│
├── Taller POO.iml
└── README.md
```
---

## 🐛 Solución de problemas comunes

### Problema: Error de compilación con caracteres especiales
**Solución**: Asegúrate de que tu archivo esté guardado con codificación UTF-8

### Problema: Scanner no lee correctamente
**Solución**: En CuentaBancaria, si tienes problemas con `nextLine()` después de `nextDouble()`, agrega:
```java
scanner.nextLine(); // Limpiar buffer
```

### Problema: El año actual cambia
**Solución**: Actualiza manualmente el valor `int añoActual = 2025;` en cada clase según sea necesario

---
