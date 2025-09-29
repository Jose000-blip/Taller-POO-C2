# Taller POO - Ejercicios Java

Ejercicios de programación orientada a objetos para la clase. Son 6 clases básicas que practican constructores, getters/setters y métodos.

---

## Ejercicios

### 1. Libro
Clase que guarda info de un libro (titulo, autor, paginas, año). Tiene un método `esAntiguo()` que dice si tiene más de 20 años.

**Ejemplo:**
```java
Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 471, 1967);
System.out.println(libro1.esAntiguo() ? "Si" : "No");
```

### 2. Coche
Representa un carro con marca, modelo, año y velocidad maxima. Calcula la edad del coche y si es rapido (más de 200 km/h).

**Ejemplo:**
```java
Coche coche1 = new Coche("Ferrari", "F8 Tributo", 2020, 340);
System.out.println("Edad: " + coche1.edadCoche() + " años");
System.out.println(coche1.esRapido() ? "Si" : "No");
```

### 3. Estudiante
Info de un estudiante: nombre, edad, carrera y promedio. Tiene métodos para saber si aprobó (promedio >= 3.0) y si es mayor de edad.

**Ejemplo:**
```java
Estudiante est1 = new Estudiante("Juanito Mendoza", 20, "Ingeniería de Sistemas", 3.8);
System.out.println(est1.aprobo() ? "Sí" : "No");
```

### 4. CuentaBancaria
Simula una cuenta de banco con depositos y retiros. **Esta es la única que pide datos por consola con Scanner**.

El programa te pregunta:
- Numero de cuenta
- Nombre del titular  
- Saldo inicial
- Cuanto quieres depositar
- Cuanto quieres retirar

Valida que no puedas sacar más plata de la que tienes.

### 5. Pelicula
Datos de una peli: titulo, director, duracion y año de estreno. Dice si es larga (más de 120 min) y calcula cuantos años tiene.

**Ejemplo:**
```java
Pelicula peli = new Pelicula("El Señor de los Anillos", "Peter Jackson", 201, 2003);
System.out.println(peli.esLarga() ? "Si" : "No");
System.out.println("Antiguedad: " + peli.antiguedad() + " años");
```

### 6. Museo
La clase más completa. Guarda toda la info de un museo (nombre, ciudad, año, capacidad, precio entrada, colecciones, visitantes).

Calcula:
- Antiguedad del museo
- Ingresos anuales (visitantes * precio)
- Promedio de visitantes por colección

**Ejemplo del Museo del Prado** con todos los datos que pidieron en el ejercicio.

---

## Como ejecutar

### Desde la terminal:

```bash
cd "Taller POO/src"
javac Libro.java
java Libro
```

Cambias `Libro` por la clase que quieras correr (Coche, Estudiante, etc).

### Desde IntelliJ o Eclipse:

1. Abre el proyecto
2. Ve a la carpeta `src/`
3. Click derecho en el archivo .java
4. Run (o Shift+F10 en IntelliJ)

Para CuentaBancaria acuerdate que te va a pedir que ingreses datos.

---

## Estructura del proyecto

```
Taller POO/
│
├── src/                    # archivos .java
│   ├── Libro.java
│   ├── Coche.java
│   ├── Estudiante.java
│   ├── CuentaBancaria.java
│   ├── Pelicula.java
│   └── Museo.java
│
├── out/production/         # archivos compilados (.class)
└── README.md
```

---

## Notas importantes

**Sobre el año actual:** En todos los métodos que calculan edad o antiguedad, el año esta hardcodeado como 2025. No uso ninguna librería tipo `java.time.Year`, solo puse:

```java
int añoActual = 2025;
```

Así que si corres esto en otro año toca cambiar ese numero manualmente en cada clase.

**Sobre Scanner:** Solo CuentaBancaria usa Scanner para leer datos del usuario. Las otras clases tienen los datos ya puestos en el main.

---

## Que se practica aqui

- Atributos privados
- Constructores (vacio y con parametros)
- Getters y Setters  
- Métodos propios de cada clase
- toString() para mostrar info
- Validaciones (como en el retiro de dinero)
- Entrada de datos con Scanner

Basicamente los conceptos basicos de POO que vimos en clase.
