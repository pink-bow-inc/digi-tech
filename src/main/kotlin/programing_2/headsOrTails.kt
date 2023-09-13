package programing_2

import i
import kotlin.random.Random
fun headsOrTails() {

    println("how many coins do you want to flip?")
    var howManyCoins = readln().toInt()

    var amountOfHeads = 0
    var amountOfTails = 0

    while (true) {
         newLine()

        when (Random.nextInt(0, 2)) {
            0 -> { //this is tails
                amountOfTails += 1
                slowPrint(50, "Tails!")
            }

            1 -> { //this is heads
                amountOfHeads += 1
                slowPrint(50, "Heads!")
            }

        }

        howManyCoins -= 1
        if (howManyCoins == 0) {
            newLine()
            print("you got $amountOfTails tail(s) and $amountOfHeads head(s)")
            break
        }
    }
}
fun slowPrint(delay: Long,message: String) { //<- just thought this was a nice idea
    i = 0
    val arrayMessage = message.toCharArray()
    while (message.length > i){
        print(arrayMessage[i])
        Thread.sleep(delay)
        i += 1
    }
}
fun newLine() {
    println("")
}