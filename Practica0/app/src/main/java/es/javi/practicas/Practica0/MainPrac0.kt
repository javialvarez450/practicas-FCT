package es.javi.practicas.Practica0

fun main(){
    val tareas = Tareas()
    val numeros = listOf(6, 9, 8, 7, 5, 15, 3, 2, 1, 5)
    val cadena = listOf("Hola", "Esta no es", "Esta es la que sale por pantalla")

    // Tarea 1 - Comprobar si un número entero es capicúa.
    tareas.capicua(121)

    //Tarea 2 - Calcular media, moda y mediana de un listado de números.
    tareas.mediaModaMediana(numeros)

    // Tarea 3 - Obtener la cadena de caracteres más larga contenida en un listado de cadenas.
    tareas.cadenaMasLarga(cadena)

    // Tarea 4 - Mostrar los números primos entre 1 y 100.
    tareas.numPrimos1a100()

    // Tarea 5 - Invertir una cadena de caracteres dada
    tareas.invertirCadena("Android")

    // Tarea 6 - Retornar una cadena de caracteres dada invertida y con efecto espejo desde el último carácter.
    tareas.invertirEspejoCadena("Android")

    // Tarea 7 - Dado un número positivo y mayor que 0, representarlo en número romano.
    tareas.convertirRomano(7)

    // Tarea 8 - Dado dos números enteros, comprobar que sean amigos. Dos números son amigos, si la suma de sus factores (distintos de ellos mismos y de uno) son iguales.
    tareas.numerosAmigos(220,284)
   /* Tarea 9 - La Gofrería
    * Tenéis una fantabulosa pastelería y vuestra especialidad son los gofres. Para organizar los tamaños contáis las líneas horizontales y
    * verticales de cada gofre, pero vuestros clientes sólo quieren saber el tamaño del gofre en número de cuadrados.
    * Calcular dado el número de líneas verticales y el número de líneas horizontales el número de cuadrados del gofre.*/
    tareas.gofreria(5,5)
    /*Tarea 10 - Juego de mesa
    * Estamos construyendo un juego de mesa, y para el sistema de puntuación se nos ha ocurrido usar cartas de manera que sumando sus valores podamos llegar a cualquier puntuación.
    * Las cartas son caras así que NO queremos cartas REPETIDAS.
    * Dado un número P, tenemos que calcular el mínimo número de cartas necesarias para poder representar todos los números desde 1 a P*/
    tareas.juegoDeMesa(6)

}