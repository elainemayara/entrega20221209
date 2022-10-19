package entrega20221209

fun main( args: Array<String> ) {

    println("Qual o primeiro valor")
    val a: Float = readLine()!!.toFloat()

    println("Qual o primeiro valor")
    val b: Float = readLine()!!.toFloat()

    println("Qual o primeiro valor")
    val c: Float = readLine()!!.toFloat()

    if ((a < b + c) && (b < a + c) && (c < b + a)) {
        var perimetro = a + b + c
        printf("Perimetro = " $perimetro)
    } else {
        var area = ((a + b) * c) / 2
        printf("Area = " $area)
    }

}