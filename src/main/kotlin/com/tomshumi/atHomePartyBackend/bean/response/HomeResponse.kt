package com.tomshumi.atHomePartyBackend.bean.response

import com.tomshumi.atHomePartyBackend.bean.dto.HomeDto
import com.tomshumi.atHomePartyBackend.bean.entity.DrinkRecord
import com.tomshumi.atHomePartyBackend.bean.entity.PickupDrinkRecord

data class HomeResponse(
    var pickupDrinkList: List<PickupDrinkRecord>,
    var beerRankingList: List<DrinkRecord>,
    var chuhighRankingList: List<DrinkRecord>,
    var sakeRankingList: List<DrinkRecord>,
    var wineRankingList: List<DrinkRecord>
) {
    constructor(dto: HomeDto)
            : this(dto.pickupDrinkList!!, dto.beerRankingList!!,
                    dto.chuhighRankingList!!, dto.sakeRankingList!!, dto.wineRankingList!!)
}