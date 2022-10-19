package entrega20221209

fun main( ) {

    println("Qual a primeira nota")
    val n1: Float = readLine()!!.toFloat()

    println("Qual a segunda nota")
    val n2: Float = readLine()!!.toFloat()
    println("Qual a terceira nota")
    val n3: Float = readLine()!!.toFloat()

    println("Qual a quarta nota")
    val n4: Float = readLine()!!.toFloat()

    var media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1) / 10)

    if (media >= 7) {
        print("Aluno aprovado.")
    } else if (media < 7 && media >= 5) {
        println("Aluno em exame.")

        println("Qual a nota do exame")
        val exame: Float = readLine()!!.toFloat()

        val final = (exame + media) / 2

        println("Nota do exame: " + final)

        if (final >= 5) {
            ("Aluno aprovado.")
        } else {
            println("Aluno reprovado.")
        }
        println("Media final: " + final)

    } else {
        println("Aluno reprovado.")
    }
}