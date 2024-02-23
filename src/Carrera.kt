class Carrera(
    var nombreCarrera: String,
    val distanciaTotal: Float,
    var participantes: List<Vehiculo>
) {
    val estadoCarrera: Boolean = false
    val historialAcciones:MutableMap<String, MutableList<String>> = mutableMapOf()
    val posiciones: MutableMap<String,Int> = mutableMapOf()

    init {
        inicializarRegistros()
    }

    companion object {
        const val KM_POR_TRAMO_HASTA_FILIGRANA = 20f
    }

    private fun inicializarRegistros() {
        var posicion = 1
        participantes.forEach { vehiculo ->
            historialAcciones[vehiculo.nombre] = mutableListOf()
            posiciones[vehiculo.nombre] = posicion++
        }
    }


    fun iniciarCarrera(){
        //cambiar estadoCarrera
        //Bucle mientras estadoCarrera sea true

            //obtener un vehiculo
            val vehiculo = obtenerVehiculoAleatorio()
            avanzarVehiculo(vehiculo)

            determinarGanador()

        //Fin bucle
    }

    private fun obtenerDistanciaAleatoria() = ((1000..20000).random() / 100).toFloat()

    private fun obtenerVehiculoAleatorio() = participantes.random()

    fun avanzartramo(vehiculo: Vehiculo, distanciaTramo: Float) {
        val distanciaSinRecorrer = vehiculo.realizaViaje(distanciaTramo)

        //Si no pudo recorrerla toda... repostar y hacer el viaje del resto
    }

    fun avanzarVehiculo(vehiculo: Vehiculo){
        var distanciaViaje = obtenerDistanciaAleatoria()

        //13km => 13km
        //45km => 20km + Filigranas (1 o 2) + 20km + Filigranas (1 o 2) + 5km

        registrarAccion(vehiculo.nombre, "Inicio Viaje ... km a recorrer")

        //calcular tramos

        //Bucle para avanzar por tramos...
        while (distanciaViaje > 0) {

            val distanciaTramo = minOf(KM_POR_TRAMO_HASTA_FILIGRANA, distanciaViaje)

            /*val distanciaTramo =
                if (distanciaViaje >= KM_POR_TRAMO_HASTA_FILIGRANA) {
                    KM_POR_TRAMO_HASTA_FILIGRANA
                }
                else {
                    KM_POR_TRAMO_HASTA_FILIGRANA - distanciaViaje
                }
              */

            avanzartramo(vehiculo, distanciaTramo)

            distanciaViaje -= distanciaTramo

        }

    }
    fun repostarVehiculo(vehiculo: Vehiculo, cantidad: Float){
        //repostar y registrar accion
    }
    fun realizarFiligrana(vehiculo: Vehiculo){
        //dependiendo si es moto o automovil derrape o caballito
    }
    fun actualizarPosiciones(){
        //actualizar posiciones... ordenar segun kmactuales de los participantes
    }
    fun determinarGanador(){
        //si hay un vehiculo con kmactuales >= 1000 cambiar estadoCarrera
    }
    fun obtenerResultados(){
        //crear lista de tipo ResultadoCarrera ... recorriendose posiciones, cogiendo datos de participantes  e historial...
    }
    fun registrarAccion(nombreVehiculo: String, accion: String){
        historialAcciones[nombreVehiculo]?.add(accion)
    }
}