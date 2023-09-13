package programing_2

fun timesTable() {
    println("what number do you want to see the times table for? (max 999)")
    var startingNumber = readln().toInt()
    if (startingNumber > 999) startingNumber = 999// this makes sure that the number never goes over 999

    println("what's the max number you want to multiply by? (max 999)")
    var max = readln().toInt()

    if (max > 999) max = 999// this makes sure that the number never goes over 999

    var currentMultiplier: Int = 0

    while (max != currentMultiplier) { // this loop will end when the current multiplier is equal to the max
        currentMultiplier += 1

        var outputMultiplier = currentMultiplier.toString()
        when {//cleaning up the output a little
            currentMultiplier < 10 ->  outputMultiplier = "$outputMultiplier  "
            currentMultiplier < 100 -> outputMultiplier = "$outputMultiplier "
        }

        println("$startingNumber * $outputMultiplier = " + startingNumber * currentMultiplier)
    }
}