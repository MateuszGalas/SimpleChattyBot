package bot

const val botName = "Brain"
const val year = "2022"

fun name() {
    println(
        "Hello! My name is $botName.\n" +
                "I was created in $year.\n" +
                "Please, remind me your name."
    )
    println("What a great name you have, ${readln()}!")
}

fun age() {
    println(
        "Let me guess your age.\n" +
                "Enter remainders of dividing your age by 3, 5 and 7."
    )
    val age = (readln().toInt() * 70 + readln().toInt() * 21 + readln().toInt() * 15) % 105
    println("Your age is $age; that's a good time to start programming!")
}

fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    for (i in 0..readln().toInt()) {
        println("$i!")
    }
}

fun question() {
    println(
        "Let's test your programming knowledge.\nWhy do we use methods?\n" +
                "1. To repeat a statement multiple times.\n" +
                "2. To decompose a program into several small subroutines.\n" +
                "3. To determine the execution time of a program.\n" +
                "4. To interrupt the execution of a program"
    )
    while (readln() != "2") {
        println("Please, try again.")
    }
    println("Congratulations, have a nice day!")
}

fun main() {
    name()
    age()
    count()
    question()
}
