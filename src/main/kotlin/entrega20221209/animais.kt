package entrega20221209

fun main( args: Array<String> ) {

    println("Qual a primeira palavra")
    Var palavra1:String = readLine()!!.toString()

    println("Qual a psegunda palavra")
    Var palavra2:String = readLine()!!.toString()

    println("Qual a terceira palavra")
    Var palavra3:String = readLine()!!.toString()


    if ( palavra1 == "vertebrado" ) {
        if ( palavra2 == "ave"  {
                if ( palavra3 == "carnivoro" ) {
                    println ( "aguia" )
                } else {
                    println ( "pomba" )
                }
            } else {
            if ( palavra3 == "onivoro" ) {

                println ( "homem" )
            } else {
                println ( "vaca" )
            }
        }
    } else {
        if ( palavra2  == "inseto" ) {
            if ( palavra3 == "hematofago" ) {
                println ( "pulga" )
            } else {
                println ( "lagarta" )
            }
        } else {
            if ( palavra3 == "hematofago" ) {
                println ( "sanguessuga" )
            } else {
                println ( "minhoca" )
            }
        }
    }
}

}