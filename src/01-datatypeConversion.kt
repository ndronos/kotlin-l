/* naguib-2-12
 * datatypes
 */

fun main(args: Array<String>) {

    var aString:String =  "01002544521"
    println(aString)
    var aLong:Long = aString.toLong()
    println(aLong)

    var bString:String = "1.3100F"
    println(bString)
    var bVar:Float = bString.toFloat()
    println(bVar)

    var cString:String = "5243543111"
    println(cString)
    var cLong:Long = cString.toLong()
    println(cLong)

    var aInt:Int = 123
    println(aInt)
    var dLong:Long = aInt.toLong()
    println(dLong)

    var aDouble:Double = 123.99
    println(aDouble)
    var dInt:Int = 0
    println(dInt)
    dInt = aDouble.toInt()
    println(dInt)

}