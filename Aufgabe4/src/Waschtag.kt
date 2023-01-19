fun main(){
val shirts = mutableListOf(
        "rot", "blau", "rot", "blau", "blau", "rot", "rot", "blau", "blau",
        "blau", "rot", "blau", "rot", "blau", "blau", "rot", "rot", "blau")

    var redShirt = mutableListOf<String>()
    var blueShirt : MutableList<String> = mutableListOf<String>()

    for ( item in shirts){
        when (item ){
         "rot" ->  redShirt.add(item)
         "blau" -> blueShirt.add(item)


        }
    }
    var redShirtAnzahl: Int = redShirt.size
    var blueShirtAnzah2 : Int = blueShirt.size

    println(redShirtAnzahl)
    println(blueShirt.size)






}