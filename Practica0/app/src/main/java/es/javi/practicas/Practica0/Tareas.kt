package es.javi.practicas.Practica0

import java.lang.Math.ceil
import java.lang.Math.sqrt
import java.text.DecimalFormat
import java.util.*


class Tareas {
    fun capicua(
        numero: Int
    ) {
        println("========TAREA 1========")
        val cadNumero = numero.toString()
        val cadInvertida = cadNumero.reversed() // invierto el numero convertido en string

        if (cadNumero == cadInvertida) { // verificar si ambos numeros son iguales
            println("Es capicua")
        } else {
            println("NO es capicua")
        }

        println()
    }

    fun mediamModaMediana(
        list: List<Int>
    ) {
        println("========TAREA 2========")
        val df = DecimalFormat("#.##")

        // media
        val media = list.average() // uso de la
        println("La media es: ${df.format(media)}")

        // moda
        // Crea objeto(clave,valor) número) y veces que aparece usando groupingBy. Recoge la key con mayor valor
        val moda = list.groupingBy { it }.eachCount().maxBy { it.value }.key
        println("La moda es: $moda")

        // mediana
        val mediana =

            if (list.size % 2 == 0) {
                val mitad = list.size / 2
                (list[mitad - 1] + list[mitad]) / 2
            } else {
                list[list.size / 2]
            }

        println("La mediana es: $mediana")
        println()
    }

    fun cadenaMasLarga(
        cadena: List<String>
    ){
        println("========TAREA 3========")
        println(cadena.maxByOrNull{it.length})
        println()
    }

    fun succesionFibonacci(
        numero_final: Int
    ){
        println("========TAREA 4========")
        var numLista: Int
        val listaNumeros = mutableListOf(0, 1)

        for (i in 1..numero_final) {
            numLista = listaNumeros[i] + listaNumeros[i-1] // sumar los dos números anteriores para obtener el siguiente
            listaNumeros.add(numLista)
        }

        println(listaNumeros)
        println()
    }

    fun lenguajeHacker(
        cadena: String
    ){
        println("========TAREA 5========")
        val diccionario = hashMapOf(
            'A' to "4",
            'B' to "I3",
            'C' to "[",
            'D' to ")",
            'E' to "3",
            'F' to "|=",
            'G' to "&",
            'H' to "#",
            'I' to "1",
            'J' to ",_|",
            'K' to ">|",
            'L' to "1",
            'M' to "/\\/\\",
            'N' to "^/",
            'Ñ' to "Ñ",
            'O' to "0",
            'P' to "|*",
            'Q' to "(_,)",
            'R' to "I2",
            'S' to "5",
            'T' to "7",
            'U' to "(_)",
            'V' to "\\/",
            'W' to "\\/\\/",
            'X' to "><",
            'Y' to "j",
            'Z' to "2",
            '1' to "L",
            '2' to "R",
            '3' to "E",
            '4' to "A",
            '5' to "S",
            '6' to "b",
            '7' to "T",
            '8' to "B",
            '9' to "g",
            '0' to "o",
            ' ' to " ",
        )
        var resultado = ""

        for (caracter in cadena) {
            val valor = diccionario.getOrDefault(caracter.toUpperCase(), caracter.toString())
            resultado += valor
        }
        println(resultado)

        println()
    }

    fun invertirEspejoCadena(
        cad: String
    ){
        println("========TAREA 6========")
        val cadenaInvertida = cad.reversed() // invertir cadena

        println(cad.substring(0,cad.length-1) + cadenaInvertida) // muestro cadena sin la ultima letra y la cadena invertida

        println (cad + cadenaInvertida.substring(1)) // muestro cadena y cadena invertida sin la primera letra

        println()
    }
    fun piedraPapelTijerasLagartoSpock(
        p1 : List<String>,
        p2 : List<String>
    ) {
        println("========TAREA 7========")
        val resultado : MutableList<String> = mutableListOf() // lista de las jugadas

        val reglas : Map<String,String> = mapOf(
            "papel VS tijeras" to "tijeras",
            "papel VS piedra" to "papel",
            "papel VS lagarto" to "lagarto",
            "papel VS spock" to "papel",
            "tijeras VS piedra" to "piedra",
            "tijeras VS spock" to "spock",
            "tijeras VS lagarto" to "tijeras",
            "piedra VS lagarto" to "piedra",
            "piedra VS spock" to "spock",
            "lagarto VS spock" to "lagarto"

        )

        val puntos = mutableMapOf( // control de los puntos
            "P1" to 0,
            "P2" to 0
        )

        if (p1.indices != p2.indices) {

            println("Los jugadores deben tener el mismo número de jugadas")

        } else {

            for (i in p1.indices) {
                // variables para controlar reglas del juego
                val tirada = "${p1[i].lowercase(Locale.ROOT)} VS ${p2[i].lowercase(Locale.ROOT)}"
                val tiradaReversed = "${p2[i].lowercase(Locale.ROOT)} VS ${p1[i].lowercase(Locale.ROOT)}"
                // buscamos las reglas para establecer ganador
                val ganador = if (reglas.containsKey(tirada)){
                    reglas[tirada].toString()
                } else {
                    reglas[tiradaReversed].toString()
                }

                resultado.add("($tirada)")

                val puntos1 = puntos["P1"]
                val puntos2 = puntos["P2"]

                // sistema de puntos
                if (p1[i].lowercase(Locale.ROOT) == ganador){

                    puntos1?.let {
                        puntos["P1"] = puntos1 + 1
                    }

                } else {

                    puntos2?.let {
                        puntos["P2"] = puntos2 + 1
                    }

                }

            }

            val puntos1 = puntos["P1"]
            val puntos2 = puntos["P2"]

            if (puntos1 != null && puntos2 != null){

                if (puntos1 > puntos2) {

                    println("$resultado = P1")

                } else if (puntos1 < puntos2) {

                    println("$resultado = P2")

                } else {
                    println("$resultado = X")
                }

            }

        }

        println()
    }

    fun numeros1a100Sustituyendo() {
        println("========TAREA 8========")
        val listaNumeros : MutableList<String> = mutableListOf()

         for (i in 1..100) {

             if (i % 3 == 0 && i % 5 == 0){
                listaNumeros.add("triplepremio")
             } else if (i % 3 == 0) {
                 listaNumeros.add("triple")
             } else if (i % 5 == 0){
                 listaNumeros.add("premio")
             } else {
                 listaNumeros.add(i.toString())
             }

         }
        println(listaNumeros)
        println()
    }

    fun partidoDeTenis(
        puntos : List<String>
    ) {
        println("========TAREA 9========")

        val sistemaPuntuacion = mapOf(0 to "Love", 1 to "15", 2 to "30", 3 to "40")
        var puntosJug1 = 0
        var puntosJug2 = 0

        var ganador = ""
        var empate = false
        var ventajaJug1 = false
        var ventajaJug2 = false

        for (punto in puntos) {

            if (punto == "P1") {

                puntosJug1++

                if (ventajaJug1) {
                    ganador = "P1"
                    break
                }

                if (empate) {
                    ventajaJug1 = puntosJug1 > puntosJug2
                }


            }

            else if (punto == "P2") {
                puntosJug2++

                if (ventajaJug1) {
                    ventajaJug1 = false
                }

                if (ventajaJug2) {
                    ganador = "P2"
                    break
                }

                if (empate) {
                    ventajaJug2 = puntosJug2 > puntosJug1
                }

            } else {
                println("Punto inválido: $punto")
            }

            empate = puntosJug1 == puntosJug2 && puntosJug1 >= 3

            // Imprimir la puntuación actual del juego
            if (empate) {
                println("Deuce")
            } else if (ventajaJug1) {
                println("Ventaja P1")
            } else if (ventajaJug2) {
                println("Ventaja P2")
            } else {
                println("${sistemaPuntuacion[puntosJug1] ?: "Love"} - ${sistemaPuntuacion[puntosJug2] ?: "Love"}")
            }

            // Comprobar si hay un ganador del juego
            if (puntosJug1 >= 4 && puntosJug1 >= puntosJug2 + 2) {
                ganador = "P1"
                break
            } else if (puntosJug2 >= 4 && puntosJug2 >= puntosJug1 + 2) {
                ganador = "P2"
                break
            }
        }

        // Control fin de puntos
        if (ganador.isNotBlank()) {
            println("Ha ganado el $ganador")
        }else if (puntosJug1 == puntosJug2) {
            println("El partido ha terminado en empate")
        } else {
            println("El partido no ha terminado")
        }

        println()
    }

    fun juegoDeMesa(
        num: Int
    ) {
        println("========TAREA 10========")

        val cartas = mutableListOf<Int>()
        var numActual = 0

        for (i in 1..num) {

            if (numActual >= i) {
                continue // Ya podemos representar el número actual
            }

            var nuevaCarta = 1

            while (cartas.contains(nuevaCarta) || numActual + nuevaCarta < i) {
                nuevaCarta++
            }
            cartas.add(nuevaCarta)
            numActual += nuevaCarta
        }

        println("Se necesitan ${cartas.size} cartas: $cartas")

    }



    // No quería perder este código por eso esta aquí comentado

    /*fun convertirRomano(num: Int){
        println("========TAREA 7========")
        var numero = num
        var romano = ""

        val valores = listOf(
            1000 to "M",
            900 to "CM",
            500 to "D",
            400 to "CD",
            100 to "C",
            90 to "XC",
            50 to "L",
            40 to "XL",
            10 to "X",
            9 to "IX",
            5 to "V",
            4 to "IV",
            1 to "I"
        )

        for ((valor, letra) in valores) {
            println("$valor $letra")
            while (numero >= valor) {
                romano += letra
                numero -= valor
            }
        }

        println("El número romano es: $romano")
    }*/

    /*fun numerosAmigos(num1: Int, num2:Int) {
        println("========TAREA 8========")
        val sum1 = sumaDivisores(num1)
        val sum2 = sumaDivisores(num2)

        if (sum1 == num2 && sum2 == num1) {
            println("$num1 y $num2 son números amigos")
        } else {
            println("$num1 y $num2 NO son números amigos")
        }
    }

    fun sumaDivisores(num: Int): Int {
        var sum = 0

        for (i in 1 until num) {
            if (num % i == 0) {
                sum += i
            }
        }

        return sum
    }*/

    /*fun gofreria(vertical: Int, horizontal: Int) {
        println("========TAREA 9========")
        println("El gofre tiene ${vertical * horizontal} cuadrados.")
    }*/

}