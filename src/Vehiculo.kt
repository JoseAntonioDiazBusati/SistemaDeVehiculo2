import kotlin.random.Random
open class Vehiculo(
     val nombre:String,
     val marca:String,
     val modelo:String,
     val capacidadCombustible:Float,
     var combustibleActual:Float,
     var kilometrosActuales:Float
    ) {
    companion object {
        const val KM_POR_LITRO = 10f
    }
    override fun toString(): String {
        return "Este vehiculo es de la marca: $marca, un modelo:$modelo, con una capacidad del combustible de $capacidadCombustible litros, " +
                "que posee ahora unos $combustibleActual litros y con $kilometrosActuales km actuales."
    }
     fun obtenerInformacion():String{
        return toString()
    }
    open fun calcularAutonomia():Float{
        return (KM_POR_LITRO * combustibleActual)
    }
    open fun realizaViaje(distancia: Float): Float {
        val autonomia = calcularAutonomia()
        val distanciaPosible = if (autonomia >= distancia) distancia else autonomia
        val combustibleGastado = distanciaPosible / KM_POR_LITRO
        combustibleActual -= combustibleGastado
        kilometrosActuales += distanciaPosible
        return if (autonomia >= distancia) 0f else distancia - autonomia
    }
   fun repostar(cantidad:Float= 0f):Float{
        if (cantidad<=0f){
            val cantidad=capacidadCombustible
            return cantidad
        }
        else{
            val cantidad=capacidadCombustible-combustibleActual
            return cantidad
        }
    }
}