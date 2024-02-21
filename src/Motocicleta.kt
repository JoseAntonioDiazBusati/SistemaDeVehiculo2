class Motocicleta(
    override val marca:String,
    override val modelo:String,
    override val capacidadCombustible:Float,
    override var combustibleActual:Float,
    override val kilometrosActuales:Float,
    var cilindrada:IntRange=125..1000
    ):Vehiculo(marca, modelo, capacidadCombustible, combustibleActual, kilometrosActuales)  {
        override fun calcularAutonomia():Float{
           return (19f * combustibleActual)
       }
    override fun realizaViaje(distancia: Float): Float {
        return super.realizaViaje(distancia)
    }
}