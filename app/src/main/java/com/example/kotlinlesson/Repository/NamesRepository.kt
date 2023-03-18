package com.example.kotlinlesson.Repository

import com.example.kotlinlesson.Model.NameModel

class NamesRepository {
    private var TextList = mutableListOf<NameModel>()

    fun getListOfText(): MutableList<NameModel> {
        TextList.add(NameModel("12 Angry Men"))
        TextList.add(NameModel(" Banlieue 13 - Ultimatum"))
        TextList.add(NameModel("16 Blocks"))
        TextList.add(NameModel("21 Grams"))
        TextList.add(NameModel("OK"))
        TextList.add(NameModel(" L'immortel"))
        TextList.add(NameModel("50 First Dates"))
        TextList.add(NameModel("Non-Authoritative Information"))
        TextList.add(NameModel("No Content"))
        TextList.add(NameModel("Partial Content"))
        TextList.add(NameModel("The 6-th Day"))
        TextList.add(NameModel("Multiple Choices"))
        TextList.add(NameModel("Moved Permanently"))
        return TextList
    }
}