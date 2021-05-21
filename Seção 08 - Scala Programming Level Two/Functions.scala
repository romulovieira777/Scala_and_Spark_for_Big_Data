// Scala Programming: Level Two

// Functions

def simple(): Unit = {
	println("Simple print")
}

simple()


def adder(number_01: Int, number_02: Int): Int = {
	return number_01 + number_02
}

adder(4, 5)


def greetName(name: String): String = {
	return s"Hello $name"
}

val fullgreet = greetName("Jose")
println(fullgreet)


def isPrime(numcheck: Int): Boolean = {
	for(n <- Range(2, numcheck)){
		if(numcheck % n == 0){
			return false
		}
	}
	return true
}
println(isPrime(10))  // false
println(isPrime(23))  // true


val numbers = List(1, 2, 3, 7)

def check(num: List[Int]): Lis[Int] = {
	return nums
}
println(check(numbers))
