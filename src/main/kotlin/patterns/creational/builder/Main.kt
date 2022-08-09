package patterns.creational.builder

import patterns.creational.builder.enums.Business
import patterns.creational.builder.enums.Character
import patterns.creational.builder.enums.Gadget
import patterns.creational.builder.enums.Season

fun main() {

    val rickAndMortyFan = RickAndMortyFanBuilder()

    rickAndMortyFan.setRicksFavoriteGadget(gadget = Gadget.GWENDOLYN)
    rickAndMortyFan.setFavoriteSeason(season = Season.FIVE)
    rickAndMortyFan.setTopBusinessInRickAndMorty(business = Business.BLIPS_AND_CHTZ)
    rickAndMortyFan.setFavoriteCharacter(character = Character.SUMMER)

    System.out.println(rickAndMortyFan.getResult().toString())
}