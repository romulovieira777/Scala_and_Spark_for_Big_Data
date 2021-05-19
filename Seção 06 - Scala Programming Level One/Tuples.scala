// Seção 06 - Scala Programming: Level One

// Tuples

cala> ( 1, 2.2, "Hello")
res34: (Int, Double, String) = (1,2.2,Hello)

scala> val my_tup = ( 1, 2 , "Hello", 23.2, true )
my_tup: (Int, Int, String, Double, Boolean) = (1,2,Hello,23.2,true)

scala> ( 3, 1, ( 2, 3 ))
res35: (Int, Int, (Int, Int)) = (3,1,(2,3))

scala> my_tup
res36: (Int, Int, String, Double, Boolean) = (1,2,Hello,23.2,true)

scala> my_tup._3
res37: String = Hello

scala> my_tup._5
res38: Boolean = true