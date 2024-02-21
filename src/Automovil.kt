class Automovil(
    override val marca:String,
    override val modelo:String,
    override val capacidadCombustible:Float,
    override var combustibleActual:Float,
    override val kilometrosActuales:Float,
    var esHibrido:Boolean,
    var condicionBritanica:Boolean
):Vehiculo(marca, modelo, capacidadCombustible, combustibleActual, kilometrosActuales) {
    fun tipoAutomovil():Boolean{
        if (esHibrido==true){
            println("El automovil es híbrido.")
            return true
        }
        else{
            println("El automovil no es hibrido.")
            return esHibrido==false
        }
    }
}