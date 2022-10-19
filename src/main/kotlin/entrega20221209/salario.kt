package entrega20221209

fun main( args: Array<String> ) {

    println("Qual o valor do salario")
    val salario:Float = readLine()!!.toFloat()

    if ( salario >= 0 && salario <= 400 ) {
        reajuste = salario * 0,15
        novoSalario = salario + reajuste
        porcentagem = 15
    } else  if ( salario > 400 && salario <= 800 ) {
        reajuste = salario * 0,12
        novoSalario = salario + reajuste
        porcentagem = 12
    } else  if ( salario > 800 && salario <= 1200 ) {
        reajuste = salario * 0,10
        novoSalario = salario + reajuste
        porcentagem = 10
    } else  if ( salario > 1200 && salario <= 2000 ) {
        reajuste = salario * 0,07
        novoSalario = salario + reajuste
        porcentagem = 7
    } else {
        reajuste = salario * 0,04
        novoSalario = salario + reajuste
        porcentagem = 4
    }

    println ( "Novo salario: " + novoSalario  )
    println ( "Reajuste ganho: " +  reajuste  )
    println ( "Em percentual: " + porcentagem + "%" )
}

}