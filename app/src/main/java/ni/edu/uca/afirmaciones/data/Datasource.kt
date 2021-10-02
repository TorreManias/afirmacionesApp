package ni.edu.uca.afirmaciones.data

import ni.edu.uca.afirmaciones.R
import ni.edu.uca.afirmaciones.model.Afirmacion

class Datasource {
    fun cargarAfirmaciones() : List<Afirmacion> {
        return listOf<Afirmacion>(
            Afirmacion(R.string.affirmation1, R.drawable.image1),
            Afirmacion(R.string.affirmation2, R.drawable.image2),
            Afirmacion(R.string.affirmation3, R.drawable.image3),
            Afirmacion(R.string.affirmation4, R.drawable.image4),
            Afirmacion(R.string.affirmation5, R.drawable.image5),
            Afirmacion(R.string.affirmation6, R.drawable.image6),
            Afirmacion(R.string.affirmation7, R.drawable.image7),
            Afirmacion(R.string.affirmation8, R.drawable.image8),
            Afirmacion(R.string.affirmation9, R.drawable.image9),
            Afirmacion(R.string.affirmation10, R.drawable.image10)
        )
    }
}