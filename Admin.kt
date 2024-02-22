import platej.*
open class Admin(var bb:Int, var kolvo: Int, var name: String, var stoimost:Int){
   open fun Blok(){
        if (bb==1||bb==2) {
            if (stoimost > kolvo) {
                println("~админу:\nна балансе недостаточно средств для этой операции, заблокировать счет?\n1-да\n2-нет")
                var c: Int
                c = readLine()!!.toInt()
                when (c) {
                    1 -> {println("~вы заблокировали счет пользователя, он больше не сможет использовать карту")
                        println("клиенту:")
                        println("ваш счет заблокирован")
                        }
                    2 -> println("~вы не заблокировали счет, текущая оперция не будет выполнена, но пользователь сможет пользоваться картой дальше")
                    else -> println("неверно введено значение")
                }
            }
        }
    }
  open fun Ost(){
   var ost: Int
      if (bb==1||bb==2) {
          if (stoimost <= kolvo) {
              ost=kolvo-stoimost
              when(bb){
                  1->println("оплата заказа $name прошла успешно\nбаланс: $ost")
                  2->println("перевод на счет $name прошел успешно\nбаланс: $ost")
              }
          }
      }
  }
}
