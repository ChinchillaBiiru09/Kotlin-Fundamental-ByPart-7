package PRO1_TailRecursiveFunction

fun main() {
    //TAIL RECURSIVE FUNCTION
//    => Teknik merubah recursive menjadi looping biasa saat dijalankan
//    Recyrsive function merupakan salah satu kemampuan yang bagus dikotlin, dan hampir semua
//    bahasa pemrograman mendukung fitur ini.
//    Namun sayangnya ada keterbasan dikotlin dalam penggunaan recursive, hal ini disebabkan
//    karena jvm sendiri yang menjadi dasar untuk menjalankan program kotlin, masih memiliki
//    keterbatasan dalam penggunaan recursive.(jvm = java virtual machine)
//    Jika saat menjalankan recursive function yang dibuat memanggil dirinya sendiri terlalu
//    dalam, maka bisa dimungkinkan akan terjadi error stack overflow (untuk batasan datanya
//    tergantung spek hardware masing2)
//    Dalam java permasalahan ini tidak bisa ditangani, namun di kotlin bisa ditangani dengan
//    menggunakan tail recursive function meskipun tidak semua func bisa diubah ke tail
//    recursive secara otomatis karena terdapat syarat-syarat berikut:
//    *menambahkan 'tailrec' diawal func nya
//    *hanya boleh memanggil dirinya sendiri, tanpa adanya operasi denga data lain

    //    Contoh program tailrec sederhana
    tailrec fun tailRecursive(value:Int){
        println("Recursive $value")
        if (value > 0){
            tailRecursive(value-1)
        }
    }
    tailRecursive(10)


    //  Contoh program tailrec factorial
    tailrec fun tailrecFactorial(value: Int, Total : Int = 1):Int{
        return when(value){
            1 -> Total
            else -> tailrecFactorial(value-1, Total*value)
        }
    }
    println(tailrecFactorial(10, 1))
}

//By Venonymous