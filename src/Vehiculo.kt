open class Vehiculo(
    open val marca:String,
    open val modelo:String,
    open val capacidadCombustible:Float,
    open var combustibleActual:Float,
    open val kilometrosActuales:Float
    ) {
    companion object{

    }
    override fun toString(): String {
        return "Este vehiculo es de la marca: $marca, un modelo:$modelo, con una capacidad del combustible de $capacidadCombustible litros, " +
                "que posee ahora unos $combustibleActual litros y con $kilometrosActuales km actuales."
    }
    open fun obtenerInformacion():String{
        return calcularAutonomia().toString()
    }
    open fun calcularAutonomia():Float{
        return (10f * combustibleActual)
    }
    open fun realizaViaje(distancia:Float):Float{
        val distancia=(combustibleActual*10f)
        if (distancia >= calcularAutonomia()){
            return calcularAutonomia()
        }
        else{
            return distancia
        }
    }
    open fun repostar(cantidad:Float= 0f):Float{
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