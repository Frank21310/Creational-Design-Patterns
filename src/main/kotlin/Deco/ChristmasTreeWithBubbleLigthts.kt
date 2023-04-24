package Deco

fun main() {

    var christmasTree = Garlands (BubbleLights(PineChristmasTree()))
    val decoratedChristmasTree = christmasTree.decorate()
    println(decoratedChristmasTree)
}