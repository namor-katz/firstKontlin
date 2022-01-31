package com.katzendorn.okb.first

//дурное какое-то объявление. а если у меня 100 полей в родительском классе, 500 методов, вычисляемые поля, и по столько же у дочерних?
//я всё равно всё должен толкать в один файл как хомяк?
sealed class Wrestler(val clothes: Boolean, val isOlimpyc: Boolean, val isExistFight: Boolean, val isSparring: Boolean, ) {
    open fun baseThrow(thro : String){
        println(thro)
    }

    class Sambo(val MotherCountry: String = "USSR", clothes: Boolean = true, val level : String) :
        Wrestler(clothes, isOlimpyc = false, isExistFight = true, isSparring = true){
            var rate = 0;
            init {
                rate + (0..10).random()
            }
        fun thr(wrestler: Wrestler){
            if(wrestler is Sambo){
                if(rate > wrestler.rate){
                    println("победа броском")//TODO случайный бросок
                }else{
                    println("☹ пойду есть рис с сумоистом. может, у него есть сакэ")
                }
            }else if (wrestler is Aikido){
                if(wrestler.belt == "black"){
                    println("как понять боккэн? я так не играю")
                }else{
                    println("бросок")
                }
            }else {
                println("попытка...")
                println("попытка...")
                println("перевод в партер, победа рычагом локтя.")
            }
        }
    }

    class Sumo(val MotherCountry: String = "Japan", clothes: Boolean = false, val weight: Int, val name: String) :
            Wrestler(clothes, isOlimpyc = false, isExistFight = false, isSparring = true){
        val technic: Int
        val coeff = 15  //TODO переделать на константу.
        init { technic = (0..10).random() * coeff }
        //коронный приём, два якодзуны сталкиваются животами. побеждает более тяжёлый, каждый уровень техники это + 15кг веса
        fun putOfRing(sumo: Wrestler){
            if(sumo is Sumo) {
            if((weight + technic) > (sumo.weight + sumo.technic)) {
                println("выбросил за ринг!")
            } else println("неполучилос ☹")
        } else{
                println("а как бороться? \uD83D\uDE33 что это за мелкий гайдзин?! я пошёл есть рис.")}
        }
    }

    class Aikido(val MotherCountry: String = "Japan", clothes: Boolean = true, val belt: String) :
            Wrestler(clothes, isOlimpyc = false, isExistFight = false, isSparring = false){
        fun attack(wrestler: Wrestler): Int {
            if (!isExistFight) {
                println("мы не соревнуемся. это слишком опасно.")//бывают исключения, но не сегодня.
            }
            return -1;
        }
    }
}