fun main() {
    println("The coffee machine has:")
    var initialWater = 400
    println("$initialWater ml of water")
    var initialMilk = 540
    println("$initialMilk ml of milk")
    var initialCoffeeBeans = 120
    println("$initialCoffeeBeans g of coffee beans")
    var initialCups = 9
    println("$initialCups disposable cups")
    var initialMoney = 550
    println("$$initialMoney of money")
    println("")

    println("Write action (buy, fill, take): ")

    var yourFirstChoice = readLine().toString()
    if (yourFirstChoice == "buy") {
        println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:")

        var coffeeNumber = readln().toInt()

        if (coffeeNumber == 1) {
            initialWater -= 250
            initialCoffeeBeans -= 16
            initialCups -= 1
            initialMoney += 4
            println("The coffee machine has:")
            println("$initialWater ml of water")
            println("$initialMilk ml of milk")
            println("$initialCoffeeBeans g of coffee beans")
            println("$initialCups disposable cups")
            println("$$initialMoney of money")
        }
        if (coffeeNumber == 2) {
            initialWater -= 350
            initialMilk -= 75
            initialCoffeeBeans -= 20
            initialCups -= 1
            initialMoney += 7
            println("The coffee machine has:")
            println("$initialWater ml of water")
            println("$initialMilk ml of milk")
            println("$initialCoffeeBeans g of coffee beans")
            println("$initialCups disposable cups")
            println("$$initialMoney of money")
        }
        if (coffeeNumber == 3) {
            initialWater -= 200
            initialMilk -= 100
            initialCoffeeBeans -= 12
            initialCups -= 1
            initialMoney += 6
            println("The coffee machine has:")
            println("$initialWater ml of water")
            println("$initialMilk ml of milk")
            println("$initialCoffeeBeans g of coffee beans")
            println("$initialCups disposable cups")
            println("$$initialMoney of money")
        }
    }

    if (yourFirstChoice == "fill") {
        println("Write how many ml of water you want to add:")
        var additionalWater = readln().toInt()
        println("Write how many ml of milk you want to add:")
        var additionalMilk = readln().toInt()
        println("Write how many grams of coffee beans you want to add:")
        var additionalCoffee = readln().toInt()
        println("Write how many disposable cups you want to add:")
        var additionalCups = readln().toInt()
        var totalWater = initialWater + additionalWater
        var totalMilk = initialMilk + additionalMilk
        var totalCoffee = initialCoffeeBeans + additionalCoffee
        var totalCups = initialCups + additionalCups

        println("")
        println("The coffee machine has:")
        println("$totalWater ml of water")
        println("$totalMilk ml of milk")
        println("$totalCoffee g of coffee beans")
        println("$totalCups disposable cups")
        println("$$initialMoney of money")
    }

    if (yourFirstChoice == "take") {
        println("I gave you $$initialMoney")
        println("")
        println("The coffee machine has:")
        println("$initialWater ml of water")
        println("$initialMilk ml of milk")
        println("$initialCoffeeBeans g of coffee beans")
        println("$initialCups disposable cups")
        println("$0 of money")
    }
}