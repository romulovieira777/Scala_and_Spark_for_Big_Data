// Seção 07 - Collections

// Arrays

scala> val arr = Array(1, 2, 3)
arr: Array[Int] = Array(1, 2, 3)

scala> val arr = Array("a", "b", "C")
arr: Array[String] = Array(a, b, C)

scala> Array.range(0, 10)
res16: Array[Int] = Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

scala> val arr = Array(1, 2.2, true)
arr: Array[AnyVal] = Array(1, 2.2, true)

scala> Array.range(0, 10, 2)
res17: Array[Int] = Array(0, 2, 4, 6, 8)

scala> Range(0, 5)
res18: scala.collection.immutable.Range = Range 0 until 5
