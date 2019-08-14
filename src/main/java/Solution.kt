
fun main() {
//    val list = listOf<Int?>(1,2,3)
    val list = listOf<Foo?>(Foo(1), Foo(2))
    println("list.indexOf(1) = ${list.indexOf(list[0])}")
    println("list.indexOf(3) = ${list.indexOf(list[1])}")
    println("list.indexOf(null) = ${list.indexOf(null)}")
}