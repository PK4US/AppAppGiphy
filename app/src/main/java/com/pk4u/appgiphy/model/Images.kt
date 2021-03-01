package com.pk4u.appgiphy

import com.squareup.moshi.Json

data class Images(
    @field:Json(name = "480w_still")
    val fixedHeightSmallStill: FixedHeightSmallStill
)