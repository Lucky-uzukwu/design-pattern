package patterns.creational.builder

interface Builder {
    fun reset()
    fun setFavoriteCharacter(character: Character)
    fun setFavoriteSeason(season: Season)
    fun setRicksFavoriteGadget(gadget: Gadget)
    fun setTopBusinessInRickAndMorty(business: Business)
}