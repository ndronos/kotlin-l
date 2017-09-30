/* alrubaye-2-9 naguib-2-10
 * var val datatypes concatenation
 * var - read, write; Mutable, can be reassined
 * val - read only, Immutable, define 1st time and will never change
 */

fun main(args: Array<String>) {

    val name = "Kotlin"
    val age =  7

    println("Name: " + name)
    println("Age: " + age)

    val pi:Double = 3.1415
    println("Pi: "+ pi)

    var dep:String?
    dep = "Software Engineering"
    println("Department: " + dep)

    dep = "JetBrains"
    println("Made by " + dep)

}