package entrega20221209

fun main( ) {

    println("Qual o primeiro ponto")
    val x:Double = readLine()!!.toDouble()

    println("Qual o segundo ponto")
    val y:Double = readLine()!!.toDouble()


    while ( x == 0.0 && y == 0.0) println ( "Origem" )

    if ( x == 0.0 ) {
        println ( "Eixo Y" )
    } else if ( y == 0.0 ) {
        println ( "Eixo X" )
    } else if (y > 0.0 && (x > 0.0)) {
        println ( "Q1" )
    } else if ( y > 0.0 && x < 0.0 ) {
        println ( "Q2" )
    } else if ( y < 0.0 && x < 0.0 ) {
        println   ( "Q3" )
    } else if ( y < 0.0 && x > 0.0 ) {
        println ( "Q4" )
    }
}