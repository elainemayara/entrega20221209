package entrega20221209

fun main( args: Array<String> ) {
    println("Qual o codigo do produto?")
    val x:Int = readLine()!!.toInt()

    println("Qual a quantidade do produto?")
    val y:Int = readLine()!!.toInt()

    if(x == 1) {

        print("Valor total" + y*4)
    }
    else if(x == 2) {

        print("Valor total" + y*4.5)
    }
    else if (x == 3) {

        print("Valor total" + y*5)
    }
    else if (x == 4) {

        print("Valor total" + y*2)
    }
    else if (x == 5) {

        print("Valor total" + y*1.5)
    }
}