/*
---- running----
=> terminal
=> kotlin path\nama_file.kt -include-runtime -d path\out\nama_file.jar
=> java -jar path\out\nama_file.jar

kotlinc D:\Belajar\Kotlin\day-01\Main.kt -include-runtime -d D:\Belajar\Kotlin\day-01\out\Main.jar
java -jar D:\Belajar\Kotlin\day-01\out\Main.jar

*/

fun main() {
    // println("hai, dunya!")
    
println("=================INTEGER NUMBER================")
 var umur: Byte = 50
 var tinggi: Int = 185
 var jarak: Short = 5000
 var balance: Long = 100000000000L

 println(umur)
 println(tinggi)
 println(jarak)
 println(balance)
 println("tipe data Long (balance) harus diakhiri dengan L")


println("=================FLOATING POINT NUMBER================")
var nilai: Float = 98.59F
var radius: Double = 87564245.7646

println(nilai)
println("tipe data Float (nilai) harus diakhiri dengan F")
println(radius)


println("=================Literal================")
var desimalLiteral: Int = 100
var heksaLiteral: Int = 0xFF
var binariLiteral: Int = 0b0101010
println(binariLiteral)


println("=================Underscore================")
println("guna untuk mempermudah ketika membaca angka")
var umurUnderscore: Byte = 5_0
var tinggiUnderscore: Int = 1_8_5
var jarakUnderscore: Short = 5_000
var balanceUnderscore: Long = 100_000_000_000L

println(umurUnderscore)
println(tinggiUnderscore)
println(jarakUnderscore)
println(balanceUnderscore)


println("=================Conversion================")
var angkaConversion: Int = 19
// conversion
var byte: Byte = angkaConversion.toByte()
var short: Short = angkaConversion.toShort()
var int: Int = angkaConversion.toInt()
var long: Long = angkaConversion.toLong()
var float: Float = angkaConversion.toFloat()
var double: Double = angkaConversion.toDouble()

println(byte)
println(short)
println(int)
println(long)
println(float)
println(double)



}
