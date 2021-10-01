package ni.edu.uca.afirmaciones.data

import ni.edu.uca.afirmaciones.R
import ni.edu.uca.afirmaciones.model.Afirmacion

class Datasource {
    fun cargarAfirmaciones() : List<Afirmacion> {
        return listOf<Afirmacion>(
            Afirmacion((R.string.affirmation1)),
            Afirmacion(R.string.affirmation2),
            Afirmacion(R.string.affirmation3),
            Afirmacion(R.string.affirmation4),
            Afirmacion(R.string.affirmation5),
            Afirmacion(R.string.affirmation6),
            Afirmacion(R.string.affirmation7),
            Afirmacion(R.string.affirmation8),
            Afirmacion(R.string.affirmation9),
            Afirmacion(R.string.affirmation10)
        )
    }
}