package patterns.creational.builder

import patterns.creational.builder.enums.Business
import patterns.creational.builder.enums.Character
import patterns.creational.builder.enums.Gadget
import patterns.creational.builder.enums.Season

interface Builder {
    fun reset()
    fun setFavoriteCharacter(character: Character)
    fun setFavoriteSeason(season: Season)
    fun setRicksFavoriteGadget(gadget: Gadget)
    fun setTopBusinessInRickAndMorty(business: Business)
}