package figuras

import comportamientos.Describible
import comportamientos.Dibujable
//Clase cuadrado con sus atributos
open class Cuadrado: Describible, Dibujable{
    var ancho: Int = 0
    //Metodo que pide los datos del cuadrado
    override fun describir(){
        println("Ingrese el ancho/alto del cuadrado: ")
        //Se pide el ancho y se comprueba que sea numero
        try {
            ancho = readLine()!!.toInt()
        }catch (e:Exception){
            //si no es numero el valor por defecto es 0
            println("Escriba un numero")
            ancho = 0
        }
    }
    //Metodo que dibuja el cuadrado
    override fun dibujar(){
        //ciclos necesarios para dibujar el cuadrado en base a su ancho
        var cuadrado = ""
        for (i in 0 until ancho){
            for (j in 0 until ancho){
                cuadrado = cuadrado + "* "
            }
            cuadrado = cuadrado + "\n"
        }
        println(cuadrado)
    }
}