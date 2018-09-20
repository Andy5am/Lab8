package figuras

import comportamientos.Describible
import comportamientos.Dibujable

class Rectangulo: Describible,Dibujable {
    var ancho: Int = 0
    var alto: Int = 0

    override fun describir(){
       var _ancho: String = readLine()!!
        var _alto: String = readLine()!!
        ancho =  _ancho.toInt()
        alto = _alto.toInt()

    }
    override fun dibujar (){
        var rectangulo:String = ""
        for (i in 0 until alto){
            for (j in 0 until ancho){
                rectangulo + "*"
            }
            rectangulo +"\n"
        }
        println(rectangulo)
    }
}