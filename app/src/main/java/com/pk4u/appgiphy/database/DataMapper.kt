package com.pk4u.appgiphy.database

import com.pk4u.appgiphy.Data
import com.pk4u.appgiphy.FixedHeightSmallStill
import com.pk4u.appgiphy.Images


fun DataEntity.toData() = Data(
    Images(FixedHeightSmallStill(this.images, "320", "420")),
    this.title,
    this.type,
    this.username
)

fun List<DataEntity>.toDataList() = this.map { it.toData() }

fun Data.toDataEntity() = DataEntity(
    images = this.images.fixedHeightSmallStill.url,
    title = this.title,
    type = this.type,
    username = this.username
)

fun List<Data>.toDataEntityList() = this.map { it.toDataEntity() }