package scala

class Recursive {
  /**
   * 递归
   */
  def factorial1(n: Int): Int = {
    if (n <= 0) 1
    else n * factorial1(n - 1)
  }

  /**
   * 尾递归 (Tail Recursive)
   * 所有递归形式的调用出现在函数的末尾
   * 当编译器检测到一个函数调用是尾递归，它就覆盖当前的活动记录而不是在栈中去创建一个新的
   */
  @annotation.tailrec // 告诉编译器要进行尾递归优化，不写的话不会主动优化
  final def factorial2(n: Int, m: Int): Int =
    if (n <= 0) m
    else factorial2(n - 1, m * n)

  def verifyRecursive() = {
    println(factorial1(5))
    println(factorial2(5, 1))
  }
}

