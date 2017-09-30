/* /index
 *  class fun main() arg[] val String
 */

class Greeter(val name: String) {       // class with a primary constructor and
    fun greet() {                       // a member function
        println("Hello, $name")         // string interpolation to cut down ceremony
    }
}

fun main(args: Array<String>) {
    Greeter(args[0]).greet()            // note that there's no "new" keyword
                                        // used to cretate an object
}
