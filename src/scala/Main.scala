package scala

object Main {

  def main(args: Array[String]): Unit = {
    // 基础知识
    val base = new Base
//    base.veriyBase

    // 函数
    val method = new Method
//    method.verifyMethod

    // 求值策略
    val evaluationStrategy = new EvaluationStrategy
//    evaluationStrategy.verifyES

    // 柯里化
    val curried = new Curried
//    curried.verifyCurried

    // 递归
    val recursive = new Recursive
//    recursive.verifyRecursive()

    // 集合类
    val immutables = new Immutables
    immutables.verifyImmutables()
  }
}
