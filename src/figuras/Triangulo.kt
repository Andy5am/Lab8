package figuras

import comportamientos.Describible
import comportamientos.Dibujable

abstract class Triangulo: Dibujable,Describible {
    var altura:Int = 0

    override fun describir(){
        var _alto : String = readLine()!!
        altura = _alto.toInt()
    }

}