// Seção 07 - Collections

// Maps

scala> val mymap = Map(("a", 1), ("b", 2), ("c", 3))
mymap: scala.collection.immutable.Map[String,Int] = Map(a -> 1, b -> 2, c -> 3)

scala> mymap("a")
res29: Int = 1

scala> mymap("c")
res30: Int = 3

scala> mymap get "a"
res31: Option[Int] = Some(1)

scala> val mymutmap = collection.mutable.Map(("x", 1), ("y", 2), ("z", 3))
mymutmap: scala.collection.mutable.Map[String,Int] = Map(z -> 3, y -> 2, x -> 1)

scala> mymutmap += ("newkey" -> 999)
res32: mymutmap.type = Map(z -> 3, y -> 2, x -> 1, newkey -> 999)

scala> mymutmap
res33: scala.collection.mutable.Map[String,Int] = Map(z -> 3, y -> 2, x -> 1, newkey -> 999)

scala> mymutmap += ("brandnew" -> 12)
res34: mymutmap.type = Map(z -> 3, y -> 2, x -> 1, brandnew -> 12, newkey -> 999)

scala> mymutmap
res36: scala.collection.mutable.Map[String,Int] = Map(z -> 3, y -> 2, x -> 1, brandnew -> 12, newkey -> 999)

scala> mymap
res37: scala.collection.immutable.Map[String,Int] = Map(a -> 1, b -> 2, c -> 3)

scala> mymap.keys
res38: Iterable[String] = Set(a, b, c)

scala> mymap.values
res39: Iterable[Int] = MapLike.DefaultValuesIterable(1, 2, 3)

scala> mymutmap += ("new1" -> 123)
res40: mymutmap.type = Map(z -> 3, y -> 2, x -> 1, brandnew -> 12, newkey -> 999, new1 -> 123)

scala> mymutmap.keys
res41: Iterable[String] = Set(z, y, x, brandnew, newkey, new1)

scala> mymutmap.values
res42: Iterable[Int] = HashMap(3, 2, 1, 12, 999, 123)
