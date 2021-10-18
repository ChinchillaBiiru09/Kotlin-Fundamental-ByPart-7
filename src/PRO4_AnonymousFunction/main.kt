package PRO4_AnonymousFunction

fun main() {
    //ANONYMOUS FUNC
//    func yang mirip dengan lambda, jika lambda hanya digunakan untuk operasi sederhana, maka anonym func bisa utk
//    operasi func yang kompleks

    val anonymHello = fun(value:String):String{
        if (value.isBlank()){
            return "hello boy"
        } else{
            return "hello $value"
        }
    }

    println(anonymHello(""))
    println(anonymHello("hase"))


    //    anonym + high order
    fun hello(name: String, transform:(String) -> String): String {
        return "Hello ${transform(name)}"
    }

    val big = fun(value:String):String{
        if (value=="") return "ups"
        else return value.toUpperCase()
    }

    println(hello("hase",big))


//    anonym
    val say = hello("Hase", fun(value: String): String{
        if (value == ""){
            return "ups"
        }
        return value.toUpperCase()
    }) // gak iso pake trailing
}

//By Venonymous