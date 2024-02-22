package platej
open class Platej(var num:String,var bb:Int) {
    open fun Info()
    {
        when (bb) {
            1 -> println("подождите заказ оплачивается....")
            2-> println("подождите оперция выполняется....")
            3-> println("вы заблокировали свой счет")
            4-> println("вы обнулили счет, ваш баланс: 0 рублей")
            else -> println("неверно ввдено значение")
        }
    }
  open fun Info2(){
      when (bb) {
      1 -> println("введите номер заказа")
      2->println("введите номер счета")
      else->println("упс, что-то пошло не так")
      }
  }
}