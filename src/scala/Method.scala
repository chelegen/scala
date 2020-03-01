package scala

class Method {
  // 匿名函数
  // (参数列表) => {函数体}
  val sum1 = (a: Int, b: Int) => a + b

  // 函数
  def sum2(a: Int, b: Int) = a + b

  // 高阶函数1
  // 接收参数为两个Int型的函数
  def operate(f: (Int, Int) => Int) = {
    f(2, 4)
  }

  // 高阶函数2
  def greeting1() = (name: String) => {
    "hello" + " " + name
  }

  def greeting2() = (name: String) => s"hello ${name}"

  def verifyMethod(): Unit = {
    println(sum1(3, 4))
    println(sum2(3, 4))
    println(operate(sum2))
    println(greeting1()("world"))
    println(greeting2()("scala"))
  }
}
