package scala

class EvaluationStrategy {
  /**
   * 两种方式：
   * · call by value —— 对函数实参求值，且只求值一次
   * · call by name —— 函数实参每次在函数体内被用到才会求值（形参以 => 开头）
   */

  // x: call by value / y: call by name
  def bar(x: Int, y: => Int): Int = 1

  def loop(): Int = loop

  def verifyES() = {
    println(bar(1, loop()))
    println(loop(), 1)
  }
}
