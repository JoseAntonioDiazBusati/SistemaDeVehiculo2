class Automovil(
    val marca:String,
    val modelo:String,
    val capacidadCombustible:Float,
    var combustibleActual:Float,
    val kilometrosActuales:Int,
    var esElectrico:Boolean,
    var condicionBritanica:Boolean
):Vehiculo(marca, modelo, capacidadCombustible, combustibleActual, kilometrosActuales) {
}