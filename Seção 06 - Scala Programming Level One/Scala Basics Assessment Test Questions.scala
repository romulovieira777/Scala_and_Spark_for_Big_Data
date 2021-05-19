// Seção 06 - Scala Programming: Level One

// Scala Basics Assessment Test Questions


// 1. What is 2 to the power of 5 ?

scala> math.pow( 2, 5 )
res39: Double = 32.0


// 2. What is the remainder of 180 divided by 7?

scala> 180 % 7
res2: Int = 5


// 3. Given variable pet_name = "Sammy", use string interpolation to print out
// "My dog's name is Sammy."

scala> val pet_name = "Sammy"
pet_name: String = Sammy

scala> "My dog's name is " + pet_name
res3: String = My dog's name is Sammy

scala> s"my dog's na is $pet_name"
res8: String = my dog's na is Sammy


// 4. Use scala to find out if the letter sequence "xyz" is contained in:
// "sadfjshfjyuyxyzjkfuidkjklhasyysdfk"

scala> val my_string = "sadfjshfjyuyxyzjkfuidkjklhasyysdfk"
my_string: String = sadfjshfjyuyxyzjkfuidkjklhasyysdfk

scala> my_string.indexOf("xyz")
res4: Int = 12

scala> my_string contains "xyz"
res9: Boolean = true


// 5. What is the difference between a value and a variable?

/* 

Value é uma unidade de armazenamento imutável, o que significa que vocẽ pode atribuir dados. (val).

Variable é uma unidade de armazenamento mutável, o que significa que os dados pode ser atribuídos não
apenas à definição, mas pode ser atribuído mais tarde. (var).

*/

// 6. Given the tuple (1,2,3,(4,5,6)) retrieve the number 6.

scala> my_tuple
res10: (Int, Int, Int, (Int, Int, Int)) = (1,2,3,(4,5,6))

scala> my_tuple._4
res11: (Int, Int, Int) = (4,5,6)

scala> my_tuple._4._3
res12: Int = 6

scala> val next = my_tuple._4
next: (Int, Int, Int) = (4,5,6)

scala> next
res14: (Int, Int, Int) = (4,5,6)

scala> next._3
res15: Int = 6