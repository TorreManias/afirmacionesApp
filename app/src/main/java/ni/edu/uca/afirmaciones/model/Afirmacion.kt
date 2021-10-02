package ni.edu.uca.afirmaciones.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Afirmacion(
    @StringRes val idString: Int,
    @DrawableRes val imageResourceId: Int) {

}