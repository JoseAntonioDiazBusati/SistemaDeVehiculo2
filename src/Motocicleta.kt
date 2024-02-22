class Motocicleta(
    override val marca:String,
    override val modelo:String,
    override val capacidadCombustible:Float,
    override var combustibleActual:Float,
    override var kilometrosActuales:Float,
    var cilindrada:Int
    ):Vehiculo(marca, modelo, capacidadCombustible, combustibleActual, kilometrosActuales)  {
        fun confirmarCilindrada():String{
            if (cilindrada<125){
                return "No puede ser menor que 125"
            }
            if (cilindrada>1000){
                return "No puede ser mayor que 1000"
            }
            else{
                return cilindrada.toString()
            }
        }
    override fun calcularAutonomia(): Float {
        val autonomiaBase = super.calcularAutonomia()
        val autonomiaCilindrada = autonomiaBase - (cilindrada /1000f)
        return if (autonomiaCilindrada < 0) 0f else autonomiaCilindrada
    }
    override fun realizaViaje(distancia: Float): Float {
        val autonomia = calcularAutonomia()
        val distanciaPosible = if (autonomia >= distancia) distancia else autonomia
        val combustibleGastado = distanciaPosible / KM_POR_LITRO
        combustibleActual -= combustibleGastado
        kilometrosActuales += distanciaPosible
        return if (autonomia >= distancia) 0f else distancia - autonomia
    }

    fun realizaCaballito(): Float {
        val combustibleGastado = 6.5f / KM_POR_LITRO
        combustibleActual -= combustibleGastado
        return combustibleActual
    }
}