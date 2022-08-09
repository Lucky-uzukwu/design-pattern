package patterns.creational.builder

data class RickAndMortyFan(
    var favoriteCharacter: Character? = null,
    var favoriteSeason: Season? = null,
    var ricksFavoriteGadget: Gadget? = null,
    var topBusinessInRickAndMorty: Business? = null
)
