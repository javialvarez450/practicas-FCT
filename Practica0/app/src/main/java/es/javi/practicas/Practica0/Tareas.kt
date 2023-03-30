package es.javi.practicas.Practica0

import java.text.DecimalFormat
import java.util.*
import kotlin.math.ceil
import kotlin.math.sqrt


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
        var ganador : String

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
                ganador = if (reglas.containsKey(tirada)){
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



        val puntuacion = mutableMapOf( // control de los puntos
            "P1" to "Love",
            "P2" to "Love"
        )


        println()
    }

    fun juegoDeMesa(
        num: Int
    ) {
        println("========TAREA 10========")
        println(ceil(sqrt((num).toDouble())).toInt())
    }


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