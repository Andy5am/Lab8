import comportamientos.Describible
import comportamientos.Dibujable
import figuras.Cuadrado
import figuras.Rectangulo
import figuras.Triangulo

fun main(args: Array<String>){
    // Se crean los menus
    val menu1:String = """
        Menu Principal
    1. Dibujar una figura
    2. Salir

    """.trimIndent()
    val menu2:String="""
        Menu
    1. Dibujar cuadrado
    2. Dibujar rectangulo
    3. Dibujar triangulo
    4. Salir al menu principal
    """.trimIndent()
    //variable para el ciclo
    var continuar = true
    do {
        //Se imprime el primer menu
        println(menu1)
        val opcion = readLine()!!
        when(opcion){
            "1"->{
                do {
                    //En la opcion 1 del menu 1 se abre el menu 2
                    //variable para el ciclo del menu 2
                    var regresar = false
                    println(menu2)
                    val opcion2: String = readLine()!!
                    when (opcion2) {
                        //En la opcion 1 del menu 2 se crea el cuadrado
                        "1" -> {
                            val cuadrado = Cuadrado()
                            //Se pregunta los datos del cuadrado y se dibuja
                            describir(cuadrado)
                            dibujar(cuadrado)
                        }
                        "2" -> {
                            //En la opcion 2 se crea el rectangulo
                            val rectangulo = Rectangulo()
                            //Se preguntan los datos y se dibuja
                            describir(rectangulo)
                            dibujar(rectangulo)
                        }
                        "3" -> {
                            //En la opcion 3 se crea el triangulo
                            val triangulo = Triangulo()
                            //Se preguntan los datos y se dibuja
                            describir(triangulo)
                            dibujar(triangulo)
                        }
                        "4"-> {
                            //Se sale del menu2
                            regresar = true
                        }
                    }
                    //condicion para el ciclo
                }while (!regresar)
            }
            "2"->{
                //se cierra el programa
                println("Adios")
                continuar = false
            }
        }
        //condicion del menu 2
    }while (continuar)
}
// Funcion para dibujar el objeto que es dibujable
fun dibujar(dibujable:Dibujable){
    dibujable.dibujar()
}
//Funcion para pedir los datos de los objetos que se pueden describir
fun describir(describible: Describible){
    describible.describir()
}