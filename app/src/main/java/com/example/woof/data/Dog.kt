package com.example.woof.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.woof.R

data class Car(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val topspeed: Int,
    @StringRes val details: Int
)

val cars = listOf(
    Car(R.drawable.aventador, R.string.lamborghini_1, 349, R.string.lambo_description_1),
    Car(R.drawable.centenario, R.string.lamborghini_2, 349, R.string.lambo_description_2),
    Car(R.drawable.countach, R.string.lamborghini_3, 355, R.string.lambo_description_3),
    Car(R.drawable.gallardo, R.string.lamborghini_4, 325, R.string.lambo_description_4),
    Car(R.drawable.huracan, R.string.lamborghini_5, 341, R.string.lambo_description_5),
    Car(R.drawable.reventon, R.string.lamborghini_6, 330, R.string.lambo_description_6),
    Car(R.drawable.sesto, R.string.lamborghini_7, 355, R.string.lambo_description_7),
    Car(R.drawable.sian, R.string.lamborghini_8, 349, R.string.lambo_description_8),
    Car(R.drawable.veneno, R.string.lamborghini_9, 356, R.string.lambo_description_9)
)
