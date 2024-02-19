open class Vehiculo(
    val marca:String,
    val modelo:String,
    val capacidadCombustible:Float,
    var combustibleActual:Float,
    val kilometrosActuales:Int
) {

    init {
        require(marca.isNotBlank()){"La marca no puede estar en blanco"}
        require(modelo.isNotBlank()){"El modelo no puede estar en blanco"}
    }
    override fun toString(): String {
        return ""
    }
    fun calcularAutonomia():Int{
        return (10 * combustibleActual).toInt()
    }
    fun realizaViaje(distancia:Int):Int{

    }
    fun repostar(cantidad:Float= 0f):Float{
    }
}