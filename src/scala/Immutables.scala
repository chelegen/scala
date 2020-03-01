package scala

class Immutables {
  /**
   * list
   */
  def walkthru(l: List[Int]): String = {
    if (l.isEmpty) ""
    else l.head.toString + " " + walkthru(l.tail)
  }

  def verifyList() = {
    println("\n_________________________verify list___________")
    val a = List(1, 2, 3, 4, 5)
    println(a)
    val b = 0 :: a //连接操作符 => 成员::List
    println(b)
    val c = a ::: b
    println(c)
    val d = walkthru(a)
    println(d)
    val e = a.filter(x => x % 2 == 1)
    println(e)
    val str = "99 Red Balloons".toList
    println(str)
    println(str.filter(x => Character.isDigit(x)))
    println(str.takeWhile(x => x != 'B')) // 返回False的时候takeWhile停止
  }

  /**
   * list-map
   */
  def verifyListMap() = {
    println("\n_________________________verify list-map___________")
    //    val c = List('x','y','z')
    val c = "x" :: "y" :: "z" :: Nil
    //    println(c.map(x => x.toUpperCase()))
    println(c.map(_.toUpperCase()))

    val a = List(1, 2, 3, 4, 5, 6)
    println(a.filter(_ % 2 == 1))
    println(a.filter(_ % 2 == 1).map(_ + 10))

    val q = List(List(1, 2, 3), List(4, 5, 6))
    println(q.map(x => x.filter(_ % 2 == 0)))
    println(q.map(_.filter(_ % 2 == 0))) //返回值类型跟原来的List一样
    println(q.flatMap(_.filter(_ % 2 == 0))) //返回值类型是一个List
  }

  /**
   * reduceLeft & foldLeft
   * 函数作为参数，函数参数 => 返回值
   */
  def verifyLeft() = {
    println("\n_________________________verify left___________")
    //    reduceLeft(op: (T, T) => T)
    val a = List(1, 2, 3, 4, 5)
    println(a.reduceLeft((x, y) => x + y))
    println(a.reduceLeft(_ + _))

    //    foldLeft(z : U)(op: (U, T) => U)
    println(a.foldLeft(0)(_ + _))
  }

  /**
   * Range
   * 整数序列
   */
  def verifyRange() = {
    println("\n_________________________verify range___________")
    val a = 1 to 10
    println(a)
    println(a.toList)
    val b = 1 to 10 by 2
    println(b)
    println(b.toList)

    val c = 1 until 10
    println(c.toList)
    /*
    to包含后边界，until不包含
     */
  }


  /**
   * Stream is a lazy List
   * 惰性求值的列表:
   * 使用的时候才会处理，避免内存溢出
   */
  def verifyStream() = {
    println("\n_________________________verify stream___________")
    val a = 1 #:: 2 #:: 3 #:: Stream.empty
    println(a)

    val stream = (1 to 1000000).toStream
    println(stream)
    println(stream.head)
    println(stream.tail)
  }


  /**
   * Tuple 元组
   */
  //  1.长度, 2.元素求和, 3.元素平方和
  def sumSq(in: List[Int]): (Int, Int, Int) =
    in.foldLeft((0, 0, 0))((t, v) => (t._1 + 1, t._2 + v, t._3 + v * v))

  def verifyTuple() = {
    println("\n_________________________verify tuple___________")
    val a = (1, 2)
    println(a)
    val b = 1 -> 2
    println(b)
    val c = (1, "Alice", "Math", 95.5)
    println(c)
    println("1: " + c._1 + "\t" + "2: " + c._2 + "\t" + "3: " + c._3 + "\t\t" + "4: " + c._4)

    val arr = List(1, 2, 3, 4, 5)
    println(sumSq(arr))
  }

  /**
   * Map[K,V]
   * map的基础操作
   */
  def verifyMap() = {
    println("\n_________________________verify map___________")
    val m = Map(1 -> "David", 2 -> "Alice", 3 -> "Elwood")
    println(m)
    println(m(1))

    /**
     * value = map(key)
     */

    //    contains(key) 判断元素在不在map里
    println(m.contains(4))

    //    返回值为Set() => 返回所有的key
    println(m.keys)
    //    如上
    println(m.values)

    //    添加元素
    val n = m + (8 -> "Archer")
    println(n)

    //    删除元素
    val o = m - 1
    println(o)

    //    添加多个元素
    val z = m ++ List(6 -> "test", 7 -> "aaa")
    println(z)

    //    删除多个
    var x = z -- List(1, 6, 7)
    println(x)

    var y = z ++ List(11 -> "eleven", 12 -> "twelve") -- List(1, 2, 3, 6, 7)
    println(y)
  }

  def verifyImmutables() = {
    verifyList()
    verifyMap()
    verifyLeft()
    verifyRange()
    verifyStream()
    verifyTuple()
    verifyMap()
  }
}
