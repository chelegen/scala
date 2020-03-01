package scala

class Base {
  def studyFor(): Unit = {
    val li = List(1, 2, 3, 4, 5)

    for (
      s <- li
    ) println("first_for: " + s)

    for (
      s <- li
      if s > 2
    ) println("second_for: " + s)

    // for循环中的 yield 会把当前的元素记下来，保存在集合中，循环结束后将返回该集合
    println(
      for (
        s <- li
        if s < 3
      ) yield (s)
    )
  }

  def studyTry() = {
    try {
      Integer.parseInt("dog")
    } catch {
      case e: Exception => println(e)
      case _ => 0 //类似 switch 中的 default
    } finally {
      println("always be printed")
    }
  }

  def studyMatch(num: Int) = {
    num match {
      case 1 => "one"
      case 2 => "two"
      case _ => "other"
    }
  }

  def verMatch(num: Int): Unit = {
    println(studyMatch(num))
  }

  def veriyBase = {
    studyFor()
    studyTry()
    verMatch(1)
    verMatch(4)
  }
}
