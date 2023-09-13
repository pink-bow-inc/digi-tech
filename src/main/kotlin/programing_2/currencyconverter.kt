package programing_2

fun convert() {
    while (true) { //forever loop

        var input = readln()

        val outputUnit = when { //what type of currency will the output be
            input.endsWith("USD") -> "USD"
            input.endsWith("AUD") -> "AUD"
            else -> {1}
        }

        input = input.removeSuffix("= $outputUnit") //in kotlin you can '$' io put a variable into a String

        val inputUnit = when { //what type of currency the input is
            input.endsWith("USD ") -> "USD"
            input.endsWith("AUD ") -> "AUD"
            else -> {1}
        }

        val cleanInPut: Float = (input.removeSuffix("$inputUnit ")).toFloat()

        var output = when(inputUnit) { //changing output to USD
            "USD" -> cleanInPut*1
            "AUD" -> cleanInPut*0.68f
            else -> 0f
        }

        output = when(outputUnit) { //changing output to outputCurrency
            "USD" -> output*1
            "AUD" -> output*1.47f
            else -> 0f
        }

        println("$cleanInPut$inputUnit = $output$outputUnit")
    }
}
