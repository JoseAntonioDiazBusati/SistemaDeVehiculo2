class Motocicleta(
    val marca:String,
    val modelo:String,
    val capacidadCombustible:Float,
    var combustibleActual:Float,
    val kilometrosActuales:Int,
    var cilindrada:Int
):Vehiculo(marca, modelo, capacidadCombustible, combustibleActual, kilometrosActuales)  {
}