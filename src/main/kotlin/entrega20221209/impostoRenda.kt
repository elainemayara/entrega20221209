package entrega20221209

fun main( args: Array<String> ) {

    println("Qual o seu salario")
    val x:Float = readLine()!!.toFloat()

    if ( 0 < x <= 2000 ){
        print ( "Isento" )}

    else if ( 2000 < x <= 3000 ){
        t = ( x - 2000 )
        tx = ( t * 8 ) / 100
        print ( "R$  $tx %" )}

    else if ( 3000 < x <= 4500 ){
        t = ( x - 2000 )
        t1 = t - 1000
        tx1 = ( 1000 * 8 ) / 100
        tx2 = ( t1 * 18 ) / 100
        print ( "R$ $tx2 %" )}
    else {
        t = ( x - 2000 )
        t1 =  t - 1000
        tx1 = ( 1000 * 8 ) / 100
        t2 = t1 - 1500
        tx2 = ( 1500 * 18 ) / 100
        tx = ( t2 * 28 ) / 100
        print ( "R$ $tx %")}