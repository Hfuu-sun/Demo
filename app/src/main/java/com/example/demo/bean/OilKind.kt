package com.example.demo.bean

data class OilKind(
    val tag: Int,
    val name: String
){
    companion object{
        fun mockData(): List<OilKind>{
            return  listOf(
                OilKind(92,"92号汽油"),
                OilKind(95,"95号汽油"),
                OilKind(98,"98号汽油")
            )
        }
    }
}