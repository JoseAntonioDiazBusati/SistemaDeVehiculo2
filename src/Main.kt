/*
* Ejercicio: Sistema de Vehículos II (Ampliación)
* 1. Descripción
*
* La actividad se centra en el diseño y desarrollo de un sistema de gestión de los vehículos que se trata el paradigma de la programación orientada a objetos. Se-crear una jerarquía de clases que modela vehículos genéricos y especializados, cuentos como automóviles y motocicletas, cada uno con propiedades y Individos específicos. Además, se integrará una funcionalidad para gestionar una característica particular en los automóviles con la La conducción británica, a través del uso de métodos de clase.
* 2. Objetivo
*
* Desarrollar un entendimiento profundo de la herencia y la sobreescritura en la programación orientada a objetos a objetos. Practicar la implementación de métodos de clase para modificar atributos se da a la práctica a toda una categoría de objetos. El manejo de la visibilidad y el control de acceso a los miembros de las clases.
* 3. Trabajo a realizar
*
* Definir la clase base Vehiculo con propiedades comunes y sus métodos correspondientes. Implementar la clase derivada Automovil, propiedades específicas y un método de clase para gestionar la condición de conducción británica. Desarrollar la clase derivada Motocicleta, con propiedades únicas y la sobrecritura de métodos para reflejar su comportamiento especializado.
* 4. Estructura de Clases:
*
* 4.1. Base de la Clase Vehiculo
*
*Propiedades: marca (String), modelo (String), capacidadCombustible (Float), combustibleActual (Float), kilometrosActuales (Float).
*obtenerInformacion() -> String, Retorna los kilómetros que el vehículo puede recorrer con el combustible real (suponemos que cada litro da para 10 km).
*calcularAutonomia() -> Float, que retorna un valor Float (Suponemos que cada litro da para 10 km.).
*realizaViaje(distancia: Float) -> Float: Realiza un viaje donde hasta da combustibleActual. Ajusta el combustible gastado y el kilometraje realizado de acuerdo con el viaje. Devuelve la distancia.
*repostar(cantidad: float)-> Float: Incrementa combustibleActual hasta el máximo de capacidadCombustible si no pasa se pasa o cantidad es de 0 o negativa. Sino, en la cantidad hasta llegar a capacidadCombustible. Devuelve la cantidad repostada.
*
*
*Redondear a dos decimales los administrarse.
*Utilizado para definir a nivel de clase valores que no durante el programa... pueden cómo ser KM-POR-LITRO, AHORRO-ELECTRICO, etc.
*
* 4.2. Clase Derivada Automovil
*
*Propiedades Específicas:
*esHibrido (Boolean): Indica si el automóvil es híbrido es híbrido (eléctrico . gasolina) o no (solo gasolina).
*condicionBritanica (Boolean): Propiedad de la clase que indica si los automóviles están configurados para la conducción británica (volante la derecha) o no.
*Comportamiento Especializado:
*calcularAutonomia() -> Float: Modifica el cálculo de autonomía asumiendo un rendimiento de 5 km más por litro si híbrido es.
*Comportamiento Adicional:
*cambiarCondicionBritanica(nuevaCondicion: Boolean): Método de clase que permite modificar la configuración de la conducción de la británica para todos los automóviles.
*realizaDerrape()-> Float: método que simula un derrape. Realiza un gasto adicional en el combustible, retornando el combustible. El gasto equivale a a 7.5 km o 6,25 km si es híbrido.
*
*Clase Derivada Motocicleta
*Propiedad específica: cilindrada (Int) (no puede ser inferior a 125 ni superior a 1000 cc).
*Comportamiento Especializado:
*calcularAutonomia() -> Float: Modifica el cálculo de autonomía asumiendo un rendimiento de 20 km por litro. También afectará la cilindrada de la misma... si es 1000 no afectará, pero el resto de cilindradas menores, restará su valor dividido por 1000. Es decir, una motocicleta de 500 cc recorrer puede 19,5 km por litro, hasta que una de 125 solo 19.125 y una moto de 1000cc de recorrer el máximo... 20 km por litro.
*realizaViaje(distancia: Float) -> FloatAjusta el cálculo de combustible necesario para viajes a la autonomía en su específica.
*Comportamiento Adicional:
*realizaCaballito()-> Float: realización de un gasto adicional en el combustible, retornando el combustible. El gasto equivale a un 6,5 kilómetros.
*/

/*
* Ejercicio: Carrera
*1. Descripción:
*Este ejercicio simula una emocionante carrera automovilística donde varios vehículos compiten para alcanzar una distancia total establecida. La competencia destaca no solo por la velocidad sino también por la habilidad de los conductores para realizar maniobras espectaculares conocidas como filigranas (derrapes en automóviles y caballitos en motocicletas), junto con la gestión estratégica del combustible.
*
*2. Lógica de la carrera:
*Se iterará sobre la lista de vehículos. En cada iteración se elegirá uno aleatoriamente, incrementándole los kilómetros recorridos en una cantidad aleatoria entre 10 y 200. Cada vehículo realizará cada 20 km, y de forma aleatoria, una o dos filigramas (derrape, caballito). Hay que tener en cuenta que tendrá que repostar cuando se quede sin combustible, por tanto, si tiene que recorrer 100 km y tiene combustible para recorrer 10, tendrá que recorrer los 10 kilómetros, repostar y luego recorrer los 90 restantes.
*
*3. Detalles de la Carrera:
*Distancia Total: Se define una distancia total que cualquier vehículo puede alcanzar para completar la carrera.
*Iteraciones Aleatorias: En cada turno, se selecciona aleatoriamente un vehículo para avanzar una distancia aleatoria entre 10 y 200 kilómetros.
*Filigranas: Cada 20 kilometros recorridos, de forma aleatoria, los vehículos realizarán una o dos filigranas, lo que impacta el consumo de combustible.
*Repostaje: Los vehículos necesitan repostar combustible cuando no tienen suficiente para completar la distancia planeada en un turno. Repostarán tantas veces como necesiten hasta completar la distancia del turno.
*Historial de Acciones: De cada vehículo se mantendrá un registro de todas sus acciones durante la carrera, incluyendo el inicio, los repostajes, las filigranas realizadas, y su posición final.
*Finalización y Clasificación: La carrera finaliza cuando al menos un vehículo alcance la distancia total. Se mostrará una clasificación final con la posición de cada vehículo y los kilómetros totales recorridos. También se podrá mostrar información relativa a cada vehículo, repostajes, filigranas realizadas, etc.
*4. Objetivo:
*Desarrollar un entendimiento profundo de la herencia y la sobreescritura en la programación orientada a objetos. Practicar la implementación de métodos de clase para modificar atributos aplicables a toda una categoría de objetos. Reforzar el manejo de visibilidad y control de acceso a los miembros de las clases.
*
*5. Trabajo a realizar:
*Agregar la propiedad nombre (String) a la clase Vehiculo. A la hora de crear la lista de vehículos en el main, el nombre de cada vehículo será distinto (controladlo desde la clase Vehiculo con código).
*Definir la clase Carrera, clase que solo contendrá una única instancia, con las propiedades y métodos necesarios para llevar a cabo el sistema.
*Implementar la función main, en la que se ejecute todo el sistema.
*Recuerda mostrar por pantalla todo lo que sucede en la carrera y la posición final de cada participante.
*6. Estructura de Clases:
*Para que la clase Carrera gestione efectivamente el seguimiento de los movimientos y posiciones de los vehículos, así como el historial de sus acciones, se pueden proponer las siguientes propiedades y métodos:
*
*Propiedades:
*
*nombreCarrera: String - El nombre de la carrera para identificación.
*distanciaTotal: Float - La distancia total que los vehículos deben recorrer para completar la carrera.
*participantes: List<Vehiculo> - Una lista que contiene todos los vehículos participantes en la carrera.
*estadoCarrera: Boolean - Un indicador de si la carrera está en curso o ha finalizado.
*historialAcciones: MutableMap<String, MutableList<String>> - Un mapa para registrar el historial de acciones de cada vehículo. La clave es el nombre del vehículo y el valor es una lista de strings describiendo sus acciones.
*posiciones: MutableList<Pair<String, Int>> o MutableMap<String, Int> - Una lista o diccionario para mantener un registro de la posición y los kilómetros recorridos por cada vehículo. Cada elemento es un par donde el primer valor es el nombre del vehículo y el segundo su kilometraje acumulado.
*Métodos:
*
*iniciarCarrera(): Inicia la carrera, estableciendo estadoCarrera a true y comenzando el ciclo de iteraciones donde los vehículos avanzan y realizan acciones.
*
*avanzarVehiculo(vehiculo: Vehiculo): Identificado el vehículo, le hace avanzar una distancia aleatoria entre 10 y 200 km. Si el vehículo necesita repostar, se llama al método repostarVehiculo() antes de que pueda continuar. Este método llama a realizar filigranas.
*
*repostarVehiculo(vehiculo: Vehiculo, cantidad: Float): Reposta el vehículo seleccionado, incrementando su combustibleActual y registrando la acción en historialAcciones.
*
*realizarFiligrana(vehiculo: Vehiculo): Determina aleatoriamente si un vehículo realiza una filigrana (derrape o caballito) y registra la acción.
*
*actualizarPosiciones(): Actualiza posiciones con los kilómetros recorridos por cada vehículo después de cada iteración, manteniendo un seguimiento de la competencia.
*
*determinarGanador(): Revisa posiciones para identificar al vehículo (o vehículos) que haya alcanzado o superado la distanciaTotal, estableciendo el estado de la carrera a finalizado y determinando el ganador.
*
*obtenerResultados(): Devuelve una clasificación final de los vehículos, cada elemento tendrá el nombre del vehiculo, posición ocupada, la distancia total recorrida, el número de paradas para repostar y el historial de acciones. La collección estará ordenada por la posición ocupada.
*
*Para este método podéis crear una data class nested en la propia clase Carrera:

/**
 * Representa el resultado final de un vehículo en la carrera, incluyendo su posición final, el kilometraje total recorrido,
 * el número de paradas para repostar, y un historial detallado de todas las acciones realizadas durante la carrera.
 *
 * @property vehiculo El [Vehiculo] al que pertenece este resultado.
 * @property posicion La posición final del vehículo en la carrera, donde una posición menor indica un mejor rendimiento.
 * @property kilometraje El total de kilómetros recorridos por el vehículo durante la carrera.
 * @property paradasRepostaje El número de veces que el vehículo tuvo que repostar combustible durante la carrera.
 * @property historialAcciones Una lista de cadenas que describen las acciones realizadas por el vehículo a lo largo de la carrera, proporcionando un registro detallado de su rendimiento y estrategias.
 */
*data class ResultadoCarrera(
    *val vehiculo: Vehiculo,
    *val posicion: Int,
    *val kilometraje: Float,
    *val paradasRepostaje: Int,
    *val historialAcciones: List<String>
*)
*De esta manera, la función obtenerResultados() podría retornar una lista de tipo ResultadoCarrera.
*
*registrarAccion(vehiculo: String, accion: String): Añade una acción al historialAcciones del vehículo especificado.
*
*Este diseño permite a la clase Carrera llevar un control exhaustivo sobre el desarrollo de la carrera, desde el seguimiento del progreso de cada vehículo hasta la gestión de eventos como repostajes y filigranas, culminando con la determinación del ganador y la presentación de los resultados finales. La inclusión de un historial detallado de acciones para cada vehículo enriquece la simulación, proporcionando una narrativa completa de la competencia.
*
*Inicialización de la clase carrera:
*
*El constructor estará formado por el nombre de la carrera, la distancia a recorrer y el numero de participantes.
*
*Un ejemplo de lista de participantes podría ser:
*
*val aurora = Automovil("Aurora", "Seat", "Panda", 50f, 50f * 0.1f, 0f, true) // Coche eléctrico con capacidad de 50 litros, inicia con el 10%
*val boreal = Automovil("Boreal", "BMW", "M8", 80f, 80f * 0.1f, 0f, false) // SUV híbrido con capacidad de 80 litros, inicia con el 10%
*val cefiro = Motocicleta("Céfiro", "Derbi", "Motoreta", 15f, 15f * 0.1f, 0f, 500) // Motocicleta de gran cilindrada con capacidad de 15 litros, inicia con el 10%
*val dinamo = Automovil("Dinamo", "Cintroen", "Sor", 70f, 70f * 0.1f, 0f, true) // Camioneta eléctrica con capacidad de 70 litros, inicia con el 10%
*val eclipse = Automovil("Eclipse", "Renault", "Espacio", 60f, 60f * 0.1f, 0f, false) // Coupé deportivo con capacidad de 60 litros, inicia con el 10%
*val fenix = Motocicleta("Fénix", "Honda", "Vital", 20f, 20f * 0.1f, 0f, 250) // Motocicleta eléctrica con capacidad de 20 litros, inicia con el 10%
*ACLARACIÓN: Simulando un entorno de trabajo y desarrollo real, os encontrareis necesidades que no se han contemplado previamente en el diseño de las clases, coméntalas en clase con tus compañeros y profesor antes de continuar.
*/
fun main() {

    val vehiculos = listOf(
        Automovil("Aurora", "Seat", "Panda", 50f, 50f * 0.1f, 0f, true,true), // Coche eléctrico con capacidad de 50 litros, inicia con el 10%
        Automovil("Boreal", "BMW", "M8", 80f, 80f * 0.1f, 0f, false,true), // SUV híbrido con capacidad de 80 litros, inicia con el 10%
        Motocicleta("Céfiro", "Derbi", "Motoreta", 15f, 15f * 0.1f, 0f, 500), // Motocicleta de gran cilindrada con capacidad de 15 litros, inicia con el 10%
        Automovil("Dinamo", "Cintroen", "Sor", 70f, 70f * 0.1f, 0f, true,false), // Camioneta eléctrica con capacidad de 70 litros, inicia con el 10%
        Automovil("Eclipse", "Renault", "Espacio", 60f, 60f * 0.1f, 0f, false,false), // Coupé deportivo con capacidad de 60 litros, inicia con el 10%  Motocicleta("Fénix", "Honda", "Vital", 20f, 20f * 0.1f, 0f, 250)
    )

    val carrera = Carrera()...

    carrera.ini
}