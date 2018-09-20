package figuras

import comportamientos.Describible
import comportamientos.Dibujable
//Clase rectangulo con sus atributos
class Rectangulo: Describible,Dibujable {
    var ancho: Int = 0
    var alto: Int = 0
    //Metodo que pide los datos del rectangulo
    override fun describir(){
        //Se pide el ancho y se comprueba que sea numero
        println("Ingrese el ancho: ")
        try {
            ancho = readLine()!!.toInt()
        }catch (e: Exception){
            //si no es numero el valor por defecto es 0
            println("Escriba un numero")
            ancho = 0
        }
        //Se pide el alto y se comprueba que sea numero
        println("Ingrese el alto: ")
        try {
            alto = readLine()!!.toInt()
        }catch (e: Exception){
            //si no es numero el valor por defecto es 0
            println("Escriba un numero")
            alto = 0
        }
    }
    //Metodo que dibuja el cuadrado
    override fun dibujar (){
        //ciclos necesarios para dibujar el cuadrado en base a su ancho
        var rectangulo:String = ""
        for (i in 0 until alto){
            for (j in 0 until ancho){
                rectangulo =rectangulo + "* "
            }
            rectangulo= rectangulo +"\n"
        }
        println(rectangulo)
    }
}