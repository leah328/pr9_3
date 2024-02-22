import platej.*
fun main(){
    try{
        println("клиенту:")
        var zakaz=Platej("",0)
        println("введите номер своего счета")
        zakaz.num=readLine()!!.toString()
        println("введите какую оперцию вы хотите совершить:\n1-оплатить заказ\n2-перевести деньги на другой счет\n3-заблокировать карту\n4-обнулить счет")
        zakaz.bb =readLine()!!.toInt()
        if (zakaz.bb==3||zakaz.bb==4){zakaz.Info()}
        else {
            var kk=Admin(0,0,"",0)
            kk.bb=zakaz.bb
            println("введите сколько у вас денег на карте")
            kk.kolvo=readLine()!!.toInt()
            zakaz.Info2()
            kk.name=readLine()!!.toString()
            println("введите сумму")
            kk.stoimost=readLine()!!.toInt()
            zakaz.Info()
            kk.Blok()
            kk.Ost()
        }
    }
    catch(e:Exception){println("error")}
}