class Circle(val radian : Double ){
    fun run(){
        println("Ini fungsi untuk perhitungan Lingkaran")
        println("Luas : "+area(radian))
        println("Keliling : "+circumference(radian))
    }
    private fun area(radian: Double):Double{
        val phi: Double =3.14
        return (phi*radian*radian)
    }
    private fun circumference(radian: Double):Double{
        val phi: Double =3.14
        return (2*phi*radian)
    }
}

fun main() {
        Circle(7.00).run()
}

class Triangle() {
    var width: Double = 8.0
    var height: Double = 5.0
    var sideC: Double = 3.0
    var sideB: Double = 3.0
    var area: Double = 0.0
    var circumference: Double = 0.0
    fun circumferenceTriangle() {
        circumference = width + sideB + sideC
    }

    fun areaTriangle() {
        area = 0.5 * width * height
    }
}