package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R

data class PetModel(
    val name: String,
    val pic: Int,
    val age: String,
    val gender: String,
    val longDesc: Int = R.string.lorem_ipsum,
) {
    companion object {
        fun getPetList(): ArrayList<PetModel> {
            return arrayListOf(
                PetModel(
                    "Ghost",
                    R.drawable.dog,
                    "5",
                    "Male",
                ),
                PetModel(
                    "Lucy",
                    R.drawable.parrot,
                    "2",
                    "Male",
                ),
                PetModel(
                    "Summer",
                    R.drawable.cat1,
                    "3",
                    "Female",
                ),
                PetModel(
                    "Lady",
                    R.drawable.lady,
                    "8",
                    "Female",
                ),
            )
        }
    }
}