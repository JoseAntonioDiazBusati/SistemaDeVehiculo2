class Automovil(
     nombre: String,
     marca:String,
     modelo:String,
    capacidadCombustible:Float,
     combustibleActual:Float,
     kilometrosActuales:Float,
    var esHibrido:Boolean,
    var condicionBritanica:Boolean
):Vehiculo(nombre,marca, modelo, capacidadCombustible, combustibleActual, kilometrosActuales) {
    companion object {
        const val AHORRO_HIBRIDO = 5f
        var condicionBritanicaGlobal: Boolean = false
    }

    override fun calcularAutonomia(): Float {
        val autonomiaBase = super.calcularAutonomia()
        return if (esHibrido) {
            autonomiaBase + AHORRO_HIBRIDO * capacidadCombustible
        } else {
            autonomiaBase
        }
    }

    fun cambiarCondicionBritanica(nuevaCondicion: Boolean) {
        condicionBritanicaGlobal = nuevaCondicion
    }

    fun realizaDerrape(): Float {
        val distanciaRecorrida = if (condicionBritanicaGlobal) 6.25f else 7.5f
        val combustibleGastado = distanciaRecorrida / KM_POR_LITRO
        combustibleActual -= combustibleGastado
        return combustibleActual
    }
}