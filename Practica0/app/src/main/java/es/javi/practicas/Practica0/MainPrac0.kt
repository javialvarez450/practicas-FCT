package es.javi.practicas.Practica0

fun main(){
    val tareas = Tareas() // Acceso a funciones de clase Tareas

    // Variables necesarias para las funciones
    val numeros = listOf(6, 9, 8, 7, 5, 15, 3, 2, 1, 5)
    val cadena = listOf("Hola", "Esta no es", "Esta es la que sale por pantalla")
    val p1 = listOf("tijeras","piedra","papel")
    val p2 = listOf("papel","papel","piedra")

    // Tarea 1 - Comprobar si un número entero es capicúa.
    tareas.capicua(121)

    //Tarea 2 - Calcular media, moda y mediana de un listado de números.
    tareas.media_moda_mediana(numeros)

    // Tarea 3 - Obtener la cadena de caracteres más larga contenida en un listado de cadenas.
    tareas.cadena_mas_larga(cadena)

    // Tarea 4 - Mostrar la sucesión de fibonacci hasta el número entero dado.
    tareas.succesion_fibonacci(12)

    // Tarea 5 - Transformar una cadena de caracteres a lenguage hacker:
    tareas.lenguaje_hacker("Android")

    // Tarea 6 - Retornar una cadena de caracteres dada invertida y con efecto espejo desde el último carácter.
    tareas.invertir_espejo_cadena("Android")

    // Tarea 7 - Piedra, Papel, Tijera, Lagarto, Spock
    tareas.piedra_papel_tijeras_lagarto_spock(p1,p2)

    // Tarea 8 - Escribir una función que muestre los números del 1 al 100, sustituyendo:
    tareas.numeros_1a100_sustituyendo()

   /* Tarea 9 - El partido de tenis
    Escribe un programa que muestre cómo transcurre un juego de tenis y quién lo ha ganado.
    El programa recibirá una secuencia formada por "P1" (Player 1) o "P2" (Player 2), según quien
    gane cada punto del juego.*/
    tareas.partido_de_tenis()

    /*Tarea 10 - Juego de mesa
    * Estamos construyendo un juego de mesa, y para el sistema de puntuación se nos ha ocurrido usar cartas de manera que sumando sus valores podamos llegar a cualquier puntuación.
    * Las cartas son caras así que NO queremos cartas REPETIDAS.
    * Dado un número P, tenemos que calcular el mínimo número de cartas necesarias para poder representar todos los números desde 1 a P*/
    tareas.juegoDeMesa(6)

}