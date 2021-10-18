package PRO5_Closure

fun main() {
    // CLOSURE
//    => kemampuan sebuah func, lambda / anonym func berinteraksi dengan data2 disekitarnya,
//    dalam scope yang sama
//    Penggunaan closure bisa berbahaya, krn dapat mengganti data tempat lain secara
//    tidak sengaja.
//    Sebisa mungkin hindari penggunaan closure.

    var counter: Int = 0
    println("Nilai Counter saat ini = $counter")
//    val lambdaInc = {
//        println("Lambda Increment")
//        counter++
//    } -> type unit tanpa param

    val lambdaInc: () -> Unit = {
        println("Lambda Increment")
        counter++
    }

    val anonymInc = fun(){
        println("Anonym Func Increment")
        counter++
    }

    fun funcInc(){
        println("Function Increment")
        counter++
    }

    // di running
    lambdaInc()
    anonymInc()
    funcInc()
    lambdaInc()
    anonymInc()
    funcInc()

    println("Nilai Counter saat ini = $counter")
}

//By Venonymous