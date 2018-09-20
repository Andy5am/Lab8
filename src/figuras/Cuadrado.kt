package figuras

import comportamientos.Describible
import comportamientos.Dibujable

open class Cuadrado: Describible, Dibujable{
    var ancho: Int = 0

    override fun describir(){
        var numero: String = readLine()!!
        ancho = numero.toInt()
    }

    override fun dibujar(){
        var cuadrado = ""
        for (i in 0 until ancho){
            for (j in 0 until ancho){
                cuadrado = "*"
            }
            cuadrado + "\n"
        }
        println(cuadrado)
    }
}