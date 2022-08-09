package patterns.creational.builder

class RickAndMortyFanBuilder : Builder {
    private var rickAndMortyFan: RickAndMortyFan = RickAndMortyFan()

    override fun reset() {
        this.rickAndMortyFan = RickAndMortyFan()
    }

    override fun setFavoriteCharacter(character: Character) {
        this.rickAndMortyFan.favoriteCharacter = character
    }

    override fun setFavoriteSeason(season: Season) {
        this.rickAndMortyFan.favoriteSeason = season
    }

    override fun setRicksFavoriteGadget(gadget: Gadget) {
        this.rickAndMortyFan.ricksFavoriteGadget = gadget
    }

    override fun setTopBusinessInRickAndMorty(business: Business) {
        this.rickAndMortyFan.topBusinessInRickAndMorty = business
    }

    fun getResult(): RickAndMortyFan {
        return this.rickAndMortyFan
    }
}