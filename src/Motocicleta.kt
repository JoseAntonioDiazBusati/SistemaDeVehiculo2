class Motocicleta(
    override val marca:String,
    override val modelo:String,
    override val capacidadCombustible:Float,
    override var combustibleActual:Float,
    override val kilometrosActuales:Int,
    var cilindrada:Int
    ):Vehiculo(marca, modelo, capacidadCombustible, combustibleActual, kilometrosActuales)  {

}