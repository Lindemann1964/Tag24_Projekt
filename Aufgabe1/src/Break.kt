fun main() {
    val numbers: List<Int> = listOf(62, 34, 364, 235, 57, 68, 2, 325, 6, 42, 7, 57, 3, 246, 24, 62, 46, 7346, 34)

    for (i  in numbers){

        if (i==42){
            println("Zahl gefunden")
            break
        }
        println(i)
    }


}
















 // Schreibe eine Schleife, die vom Anfang der Liste ausgehend eine Zahl nach der Anderen prüft und in der Konsole ausgibt.
 // Wenn die Zahl gleich 42 ist, gib in der Konsole "Zahl gefunden." aus. Breche dann die Schleife mit break ab.
 // "Zahl gefunden."