package PRO3_HighOrderFunction

fun main() {
    // HIGH-ORDER FUNC
//    => Func yang menggunakan func sebagai parameter atau mengembalikan func
//    lambda yang dijadikan sebagai parameter => high order func

    fun hello(name: String, transform:(String) -> String): String {
        return "Hello ${transform(name)}"
    }

    val besar: (String) -> String = {value: String -> value.toUpperCase()}
    val kecil = {value: String -> value.toLowerCase()}

    println(hello("Hase", besar))
    println(hello("Hase", kecil))
    println(hello("Hase", {value: String -> value.toUpperCase()})) // rata2 orang menggunakan ini

    // TRAILING LAMBDA
//    ketika lambda expr nya berada di parameter terakhir maka kita dapat menggunakan trailling lambda.
//    yaitu menuliskan lambda wxpr di luar tanda ()
    val result = hello("Baby Hase") {value: String -> value.toUpperCase()}
    println(result)
}

//By Venonymous