fun main(args: Array<String>){

    println("Digite o primeiro numero: ")
    val X = readLine()!!.toInt()

    // NullPointerException

    print("Digite o segundo numero: ")
    val Y = readLine()!!.toInt()

    val resultado = multiplica(X, Y)

    println("O resultado da multiplicação é = $resultado")
}

fun multiplica(X: Int, Y: Int): Any{
    return X * Y
}