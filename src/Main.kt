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