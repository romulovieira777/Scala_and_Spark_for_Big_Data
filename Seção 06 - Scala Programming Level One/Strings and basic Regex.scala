// Seção 06 - Scala Programming: Level One

// Strings and basic Regex

scala> println("Hello")
Hello

scala> val farewell = "good" + "bye"
farewell: String = goodbye

scala> "Good" + "bye"
res13: String = Goodbye

scala> "Dance" * 5
res14: String = DanceDanceDanceDanceDance

scala> "Dance " * 5
res15: String = "Dance Dance Dance Dance Dance "

scala> val st = "Hello"
st: String = Hello

scala> st
res16: String = Hello

scala> st.
     | length
res17: Int = 5

scala> st.length()
res18: Int = 5

scala> val name = "Jose"
name: String = Jose

scala> name
res19: String = Jose

scala> val greet = s"Hello ${name}"
greet: String = Hello Jose

scala> val greet = s"Hello $name"
greet: String = Hello Jose

scala> val greet = f"Hello $name"
greet: String = Hello Jose

scala> val greet = "Hello $name"
greet: String = Hello $name

scala> printf("A string %s , an integer %d , a float %f" , "Hi", 10, 12.345)
A string Hi , an integer 10 , a float 12,345000

scala> printf("A float %1.2f",1.2345)
A float 1,23

scala> printf("A float %1.2f",1.2395)
A float 1,24

scala> val st = "This is a long string"
st: String = This is a long string

scala> st.charAt(0)
res23: Char = T

scala> st.charAt(3)
res24: Char = s

scala> st.indexOf("a")
res25: Int = 8

scala> st slice (0, 4)
res26: String = This

scala> st slice ( 10, 11 )
res27: String = l

scala> st slice ( 10, 14 )
res28: String = long

scala> val st = "term 1 term2 term3"
st: String = term 1 term2 term3

scala> st matches "term1 term2 term3"
res30: Boolean = false

scala> st matches "term1"
res31: Boolean = false

scala> st contains "term 1"
res32: Boolean = true

scala> st contains "term4"
res33: Boolean = false