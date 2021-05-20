// Seção 07 - Collections

// List

scala> val evens = List( 2, 4, 6, 8, 10 )
evens: List[Int] = List(2, 4, 6, 8, 10)

scala> List( 1, 2.2, true )
res0: List[AnyVal] = List(1, 2.2, true)

scala> evens( 0 )
res1: Int = 2

scala> evens( 4 )
res2: Int = 10

scala> evens.head
res3: Int = 2

scala> evens.tail
res4: List[Int] = List(4, 6, 8, 10)

scala> val my_list = List( List( 1, 2, 3 ), List( 4, 5, 6 ))
my_list: List[List[Int]] = List(List(1, 2, 3), List(4, 5, 6))

scala> val my_list = List(("a", 1), ("b", 2), ("c", 3))
my_list: List[(String, Int)] = List((a,1), (b,2), (c,3))

scala> val my_list = List(3, 6, 1, 7, 10)
my_list: List[Int] = List(3, 6, 1, 7, 10)

scala> my_list.sorted
res5: List[Int] = List(1, 3, 6, 7, 10)

scala> my_list.size
res6: Int = 5

scala> my_list.max
res7: Int = 10

scala> my_list.min
res8: Int = 1

scala> my_list.sum
res9: Int = 27

scala> my_list.product
res10: Int = 1260

scala> val x = List(1, 2, 3, 4)
x: List[Int] = List(1, 2, 3, 4)

scala> x.drop(2)
res11: List[Int] = List(3, 4)

scala> x.takeRight(1)
res12: List[Int] = List(4)

scala> x.takeRight(3)
res13: List[Int] = List(2, 3, 4)

scala> val x = List(1, 2, 3, 4, 5, 6, 7, 8)
x: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8)

scala> x slice(0, 3)
res14: List[Int] = List(1, 2, 3)

scala> x slice(3, 6)
res15: List[Int] = List(4, 5, 6)
