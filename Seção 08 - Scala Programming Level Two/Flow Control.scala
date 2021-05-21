// Scala Programming: Level Two

// Flow Control

if(true){
	println("I will print if True")
}


if(3 == 3){
	println("3 is equal to 3")
}


val x = "Hello"

if(x.endsWith("o")){
	println("The value of x ends with o")
}


val z = "Hello"

if(z.endsWith("o")){
	println("The value of z ends with o")
} else {
	println("The value os z does not end with o")
}


val person = "George"

if(person == "Sammy"){
	println("Welcome Sammy")
} else if(person == "George"){
	println("Welcome George!")
} else {
	println("What is your name?")
}


// Operador and
println((1 == 2) && (2 == 2))


// Operador or
println((1 == 2) || (2 == 2))


// Operador not !
println(!(1 == 1))
