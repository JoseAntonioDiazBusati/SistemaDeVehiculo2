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
        return "Este vehiculo es de la marca: $marca, un modelo:$modelo, con una capacidad del combustible de $capacidadCombustible litros, " +
                "que posee ahora unos $combustibleActual litros y con $kilometrosActuales km actuales."
    }
    fun obtenerInformacion():String{
        return calcularAutonomia().toString()
    }
    fun calcularAutonomia():Int{
        return (10 * combustibleActual).toInt()
    }
    fun realizaViaje(distancia:Int):Int{

    }
    fun repostar(cantidad:Float= 0f):Float{
    }
}