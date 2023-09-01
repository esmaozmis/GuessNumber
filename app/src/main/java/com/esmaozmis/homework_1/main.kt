package com.example.tahminoyunu
import kotlin.random.Random

fun main() {
    val rastgeleSayi = Random.nextInt(0, 101)
    var kalanTahmin = 3

    println(" TAHMİN OYUNUNA HOŞGELDİNİZ!")

    do {
        println("Kalan tahmin hakkınız: $kalanTahmin")
        print("Lütfen 0 ile 101 arasında bir sayı girin: ")
        val giris = readLine()?.toIntOrNull()

        if (giris == rastgeleSayi) {
            println("Tebrikler! Doğru sayıyı tahmin ettiniz. Harikasınız!")
            return
        } else if (giris != null) {
            val ipucu = if (giris < rastgeleSayi) "daha büyük" else "daha küçük"
            println("Bir $ipucu sayı girmelisiniz!")
        }

        kalanTahmin--
    } while (kalanTahmin > 0)

    println("Oyun bitti. Kaybettiniz! Sayı: $rastgeleSayi")
}
