package com.katzendorn.okb.first

fun main(){
    val sumoist = Wrestler.Sumo(weight = 150, name = "Минамото");
    val sumoist2 = Wrestler.Sumo(weight = 155, name = "Торанага");
    println("битва двух якодзун началась!")
    println("${sumoist.weight}-киллограмовый ${sumoist.name} с уровнем ${sumoist.technic} атакует " +
            "${sumoist2.weight}-килограммового ${sumoist2.name} с уровнем ${sumoist2.technic}")
    sumoist.putOfRing(sumoist2);
    println("битва двух якодзун завершена!")

    val sambist = Wrestler.Sambo(level = "МС")
    val sambist2 = Wrestler.Sambo(level = "MC")
    sambist.thr(sambist2)

    sumoist.putOfRing(sambist)
    sambist.thr(sumoist)

    val aikido = Wrestler.Aikido(belt = "grey");
    aikido.attack(sumoist);
    sumoist.putOfRing(aikido);
}