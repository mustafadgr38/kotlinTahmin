import java.util.*

fun main (args:Array<String>){

   var rnd=Random()
    var sayi=rnd.nextInt(100)+1
    var sayac=1
    var tahmin:Int

    while (true){
        println("Tahmininiz: ")
        tahmin = readLine()!!.toInt()
        sayac++
        if (tahmin>sayi) println("Sayı Küçültün")
        else if (tahmin<sayi) println("Sayı Büyültün")
        else {
            println("Tebrikler Sayıyı " + sayac.toString() + " Seferde Bildiniz")
            break
        }
    }
}