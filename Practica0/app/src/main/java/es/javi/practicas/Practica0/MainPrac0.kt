package es.javi.practicas.Practica0

fun main(){
    val tareas = Tareas() // Acceso a funciones de clase Tareas

    // Tarea 1 - Comprobar si un número entero es capicúa.
    tareas.capicua(121)

    //Tarea 2 - Calcular media, moda y mediana de un listado de números.
    val numeros = listOf(6, 9, 8, 7, 5, 15, 3, 2, 1, 5)
    tareas.mediamModaMediana(numeros)

    // Tarea 3 - Obtener la cadena de caracteres más larga contenida en un listado de cadenas.
    val cadena = listOf("Hola", "Esta no es", "Esta es la que sale por pantalla")
    tareas.cadenaMasLarga(cadena)

    // Tarea 4 - Mostrar la sucesión de fibonacci hasta el número entero dado.
    tareas.succesionFibonacci(12)

    // Tarea 5 - Transformar una cadena de caracteres a lenguage hacker:
    tareas.lenguajeHacker("Hola esto es Art Attack")

    // Tarea 6 - Retornar una cadena de caracteres dada invertida y con efecto espejo desde el último carácter.
    tareas.invertirEspejoCadena("Android")

    // Tarea 7 - Piedra, Papel, Tijera, Lagarto, Spock
    val p1 = listOf("tijeras","piedra","papel")
    val p2 = listOf("papel","papel","piedra")
    tareas.piedraPapelTijerasLagartoSpock(p1,p2)

    // Tarea 8 - Escribir una función que muestre los números del 1 al 100, sustituyendo:
    tareas.numeros1a100Sustituyendo()

   // Tarea 9 - El partido de tenis
    val puntos = listOf("P1","P1","P2","P2","P1","P2","P1","P1")
    tareas.partidoDeTenis(puntos)

    //Tarea 10 - Juego de mesa
    tareas.juegoDeMesa(6)

}