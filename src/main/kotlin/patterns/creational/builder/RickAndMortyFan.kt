package patterns.creational.builder

import patterns.creational.builder.enums.Business
import patterns.creational.builder.enums.Character
import patterns.creational.builder.enums.Gadget
import patterns.creational.builder.enums.Season

data class RickAndMortyFan(
    var favoriteCharacter: Character? = null,
    var favoriteSeason: Season? = null,
    var ricksFavoriteGadget: Gadget? = null,
    var topBusinessInRickAndMorty: Business? = null
)
