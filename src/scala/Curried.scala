package scala

class Curried {
  //  def add(x: Int, y: Int) = x + y // 非柯里化语法
  //  def add(x: Int)(y: Int) = x + y // 柯里化语法

  /**
   * 柯里化函数：把具有多个参数的函数转换为一条函数链，每个节点上是单一参数
   */
  def curriedAdd(a: Int)(b: Int) = a + b

  val addOne = curriedAdd(1) _ // 相当于重新定义了一个 ( 1 + ? ) 的函数

  def verifyCurried() = {
    println(curriedAdd(1)(2))
    println(addOne(3))
  }
}
