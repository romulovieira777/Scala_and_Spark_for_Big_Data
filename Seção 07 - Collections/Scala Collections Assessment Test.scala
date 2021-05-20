// Seção 07 - Collections

// Scala Collections Assessment Test

/* 

Collections Assessment Test 
Answer the following questions with your new skills!
*/

/* 

1.) Can you figure out what method you can use to find out if the list:
List(1,2,3,4,5) contains the number 3? 

*/

scala> val mylista = List(1, 2, 3, 4, 5)
mylista: List[Int] = List(1, 2, 3, 4, 5)

scala> mylista contains 3
res44: Boolean = true

scala> mylista.contains(3)
res45: Boolean = true


// 2.) How can you add all the elements of the previous list?

scala> mylista.sum
res46: Int = 15


// 3.) Create an Array of all the odd numbers from 0 to 15

scala> Array.range(1, 16, 2)
res51: Array[Int] = Array(1, 3, 5, 7, 9, 11, 13, 15)


// 4.) What are the unique elements in the list: List(2,3,1,4,5,6,6,1,2)?

scala> val mylist = List(2, 3, 1, 4, 5, 6, 6, 1, 2)
mylist: List[Int] = List(2, 3, 1, 4, 5, 6, 6, 1, 2)

scala> mylist.toSet
res52: scala.collection.immutable.Set[Int] = Set(5, 1, 6, 2, 3, 4)


/*

5.) Create a mutable map that maps together Names to Ages.
It should have the following key value pairs:
Sammy, 3
Frankie, 7
John, 45

Now do the following:

5a) Print out all the keys

5b) Add the key value pair ("Mike",27)

*/

scala> val manes = collection.mutable.Map(("Sammy", 3), ("Frankie", 7), ("John", 45))
manes: scala.collection.mutable.Map[String,Int] = Map(Sammy -> 3, Frankie -> 7, John -> 45)

scala> manes
res54: scala.collection.mutable.Map[String,Int] = Map(Sammy -> 3, Frankie -> 7, John -> 45)

scala> manes.keys
res56: Iterable[String] = Set(Sammy, Frankie, John)

scala> manes.values
res57: Iterable[Int] = HashMap(3, 7, 45)

scala> manes += ("Mike" -> 27)
res58: manes.type = Map(Sammy -> 3, Mike -> 27, Frankie -> 7, John -> 45)
