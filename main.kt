import platej.*
fun main(){
    try{

        println("введите какую оперцию ввы хотите совершить:\n1-оплатить заказ\n2-перевести деньги на другой счет")
        var zakaz=Platej(0,"",0,0,0)
        zakaz.bb =readLine()!!.toInt()
        println("введите номер заказа/счета")
        zakaz.inf=readLine()!!.toString()
        println("введите номер своего счета")
        zakaz.num=readLine()!!.toInt()
        println("введите сколько у вас денег на карте")
        zakaz.kolvo=readLine()!!.toInt()
        println("введите сколько стоит заказ")
        zakaz.stoimost=readLine()!!.toInt()


    }
    catch(e:Exception){println("error")}

}