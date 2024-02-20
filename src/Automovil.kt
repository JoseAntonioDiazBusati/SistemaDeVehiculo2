class Automovil(
    override val marca:String,
    override val modelo:String,
    override val capacidadCombustible:Float,
    override var combustibleActual:Float,
    override val kilometrosActuales:Int,
    var esElectrico:Boolean,
    var condicionBritanica:Boolean
):Vehiculo(marca, modelo, capacidadCombustible, combustibleActual, kilometrosActuales) {

}