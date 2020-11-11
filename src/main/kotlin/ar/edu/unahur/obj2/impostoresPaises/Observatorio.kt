package ar.edu.unahur.obj2.impostoresPaises

object Observatorio {
    var paises = mutableListOf<Pais>()

    fun sonLimitrofes(nombre: String, nombre2: String): Boolean {
        val unPais = buscarPais(nombre)
        val otroPais = buscarPais(nombre2)
        return unPais.esLimitrofeDelString(otroPais)
    }

    fun buscarPais(nombre: String) = paises.find{ it.nombre == nombre }!!

    fun agregarPais(pais: List<Pais>) {
        paises.addAll(pais)
        ordenarlosPorPoblacion()
    }


    fun sonPotencialesAliados(pais1: String, pais2: String) =
            buscarPais(pais1).esPotencialAliadoDe(pais2)

    private fun ordenarlosPorPoblacion() { paises.sortBy { it.poblacion } }


    fun paisesConMayorPoblacion() =
            paises.take(5)


    fun listaPorContinentes() =  paises.map { it.continente  }

    //fun continenteMasPoblado():String =
    //      listaPorContinentes()
    // Hay alguna funcion que haga todo junto? debe contar repetidos






}