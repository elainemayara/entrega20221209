package entrega20221209

fun main( args: Array<String> ) {

    println("Qual o primeiro numero")
    val a: Int = readLine()!!.toInt()

    println("Qual o primeiro numero")
    val b: Int = readLine()!!.toInt()


    if (a % b == 0 && b % a == 0) {
        println("São Multiplos")
    } else
    {
        println("Nao sao multiplos")
    }
}