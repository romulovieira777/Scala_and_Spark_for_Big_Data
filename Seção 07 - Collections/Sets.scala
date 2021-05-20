// Seção 07 - Collections

// Sets

scala> val s = Set()
s: scala.collection.immutable.Set[Nothing] = Set()

scala> val s = Set(1, 2, 3)
s: scala.collection.immutable.Set[Int] = Set(1, 2, 3)

scala> val s = Set(1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3)
s: scala.collection.immutable.Set[Int] = Set(1, 2, 3)

scala> val s = collection.mutable.Set(1, 2, 3)
s: scala.collection.mutable.Set[Int] = Set(1, 2, 3)

scala> s += 4
res19: s.type = Set(1, 2, 3, 4)

scala> val imuts = collection.mutable.Set(1, 2, 3)
imuts: scala.collection.mutable.Set[Int] = Set(1, 2, 3)

scala> imuts += 4
res20: imuts.type = Set(1, 2, 3, 4)

scala> imuts
res21: scala.collection.mutable.Set[Int] = Set(1, 2, 3, 4)

scala> imuts.add(5)
res22: Boolean = true

scala> imuts
res23: scala.collection.mutable.Set[Int] = Set(1, 5, 2, 3, 4)

scala> imuts.max
res24: Int = 5

scala> imuts.min
res25: Int = 1

scala> val mylist = List(1, 2, 3, 1, 2, 3)
mylist: List[Int] = List(1, 2, 3, 1, 2, 3)

scala> mylist.toSet
res26: scala.collection.immutable.Set[Int] = Set(1, 2, 3)

scala> val mynewset = mylist.toSet
mynewset: scala.collection.immutable.Set[Int] = Set(1, 2, 3)

scala> mynewset
res28: scala.collection.immutable.Set[Int] = Set(1, 2, 3)
