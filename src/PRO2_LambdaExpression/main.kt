package PRO2_LambdaExpression

fun hurufBesar (value: String) : String = value.toUpperCase()

fun main() {
    // LAMBDA EXP
//    adalah func yang tidak memiliki nama. kita dapat membuat func tanpa harus mendeklarasikan terlebih dahulu
//    Func di kotlin => first-class citizen, artinya dianggap seperti tipe data lainnya. mampu berdiri sendiri.
//    func  bisa disimpan dalam variable, array, atau dikirim ke parameter func itu sendiri

//  deklarasi | nama variable | param func | return type | = variable param | -> body func
    val lambdaEx: (String, String) -> String = {value : String, value2: String ->
        val result = "$value $value2"
        result
    }
//    gak perlu pake katakunci return, bydefault baris terakhir dari lambda expr digunakan sebagai return nya

    val name = lambdaEx("Fidah", "bii")
    println(name)


    // IT KEYWORDS
//    digunakan untk lambad expr yang hanya memiliki 1 parameter saja
    val lambdaEx2: (String) -> String = {
        "Hello ${it.uppercase()}"
    }

    println(lambdaEx2("bii"))


    // METHOD REFERENCE
    val  lambdaEx3: (String) -> String = ::hurufBesar

    println(lambdaEx3("hase"))
}

//By Venonymous