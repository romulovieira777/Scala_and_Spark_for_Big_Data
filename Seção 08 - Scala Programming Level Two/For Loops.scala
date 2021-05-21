// Scala Programming: Level Two

// For Loops

for(item <- List(1, 2, 3)){
	println(item)
}


for(num <- Array.range(0, 5)){
	println(num)	
}


for(num <- Set(1, 2, 3)){
	println(num)	
}


for(num <- Range(0, 10)){
	if(num % 2 == 0){
		println(s"$num is even")
	} else {
		println(s"$num is odd")
	}
}


val name = List("John", "Abe", "Cindy", "Cat")

for(name <- name){
	if(name.startsWith("C")){
		println(s"$name starts with a C")
	}
}
