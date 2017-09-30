/* alrubaye-2-10
 * readLine() println() print()  ?.(safe) !!.(non-null) toInt() toDouble()
 */

fun main(args: Array<String>) {

    println("*** Input ***")

    print("Enter name: ")
    var name = readLine()

    print("Enter age: ")
//  var age = readLine().toInt()
    var age = readLine()!!.toInt()

    print("Enter sector: ")
//  var sector:String
    var sector:String?
    sector = readLine()

    print("Enter force: ")
//  var force = readLine().toDouble()
    var force = readLine()!!.toDouble()

    println("*** Output ***")

    println("name: " + name)
    println("age: " + age)
    println("sector: " + sector)
    println("force: " + force)

}

/*
Error:(17, 14) Kotlin: Type mismatch: inferred type is String? but String was expected

Error:(13, 25) Kotlin: Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?

Error:(22, 27) Kotlin: Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?

 */