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
fun main() {
    val vehiculo = Vehiculo("Toyota", "Corola", 50f, 20f, 100f)
    println(vehiculo.obtenerInformacion())

    val auto = Automovil("Ford", "Focus", 41f, 20f, 10450f, true, true)
    println("Autonomía del auto: ${(auto.calcularAutonomia())} km")

    val moto = Motocicleta("Honda", "Sis", 20f, 12f, 17404f, 800)
    println("Autonomía de la moto: ${(moto.calcularAutonomia())} km")
}