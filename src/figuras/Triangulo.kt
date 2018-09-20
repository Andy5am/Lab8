package figuras

import comportamientos.Describible
import comportamientos.Dibujable
//Clase triangulo con sus atributos
class Triangulo: Dibujable,Describible {
    var altura:Int = 0

    override fun describir(){
        //Se pide el ancho y se comprueba que sea numero
        println("Ingrese la altura: ")
        try {
            altura = readLine()!!.toInt()
        }catch (e: Exception){
            //si no es numero el valor por defecto es 0
            println("Escriba un numero")
            altura = 0
        }
    }
    //Metodo que dibuja el cuadrado
    override fun dibujar(){
        //ciclos necesarios para dibujar el cuadrado en base a su ancho
        var triangulo =""
        // esta variable ayuda eliminar los espacion al dibujar el triangulo
        var espacios:Int = 1
        for (i in 0 until altura){
            for (j in 0 until altura-espacios){
                triangulo = triangulo+" "
            }
            for (k in 0 until espacios){
                triangulo = triangulo+"* "
            }
            triangulo = triangulo+"\n"
            espacios+=1
        }
        println(triangulo)
    }
}