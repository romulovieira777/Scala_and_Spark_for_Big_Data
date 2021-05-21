// Scala Programming: Level Two

// Scala Programming Assessment Test

/*
Create Functions to solve the following questions!
The questions are named and the followed by a description.
*/

/* 
1.) Check for Single Even:
Write a function that takes im an integer and returns a Boolean indicating whether
or not it is even. See if you can write this in ine line!
*/

def checkEven(num: Int): Boolean = {
	return num % 2 == 0
}
println(checkEven(4))
println(checkEven(3))


def checkEven(num: Int) = num % 2 == 0

println(checkEven(4))
println(checkEven(3))


/*
2.) Check for Evens in a List:
Write a function that returns True if there is an even number inside of a List,
otherwise, retur False.
*/

def checkList(numbers: List[Int]): Boolean = {
	for(n <- numbers){
		if(n % 2 == 0){
			return true
		}
	}
	return false
}

val evensample = List(1, 2, 3, 4, 5)
val oddsample = List(1, 3, 5, 7)

println(checkList(evensample))
println(checkList(oddsample))


/*
3.) Lucky Number Seven:
Take in a list of integers and calculate their sum. However, sevens are lucky
and they should be counted twice, meaning their value is 14 for the sum.
Assume the list isn't empty.
*/

def lucky(nums: List[Int]): Int = {
	var output = 0
	for(n <- nums){
		if(n == 7){
			output = output + 14
		} else {
			output = output + n
		}
	}
	return output
}

val numbers = List(1, 2, 3, 7)
println(lucky(numbers))


/*
4.) Can you Balance?
Give a non-empty list of integers, return true if there is a place to
split the list so that the sum of the numbers on one side is equal to the
sum of the nymbers on the other side. For example, give the list (1, 5, 3, 3)
would return true, you can split it in the middle. Another example (7, 3, 4)
would return true 3 + 4 = 7. Remember you just need to return the boolean,
not the split index point.
*/

def balanceCheck(mylist: List[Int]): Boolean = {
	var firsthalf = 0
	var secondhalf = 0

	secondhalf = mylist.sum

	for(i <- Range(0, mylist.length)){
		firsthalf = firsthalf + mylist(i)
		secondhalf = secondhalf - mylist(i)

		if(firsthalf == secondhalf){
			return true
		}
	}
	return false
}

val ballist =  List(1, 2, 3, 4, 10)
val ballist2 = List(2, 3, 3, 2)
val unballist = List(10, 20, 70)

println(balanceCheck(ballist))
println(balanceCheck(ballist2))
println(balanceCheck(unballist))


/*
5.) Palindrome Check.
Give a String, return a boolean indicating whether or no it is a palindrome.
(Spelled the same forwards and backwards). Try exploring methods to help you.
*/

def palindromeCheck(st: String): Boolean = {
	return (st == st.reverse)
}
println(palindromeCheck("abccba"))
println(palindromeCheck("Hello"))
