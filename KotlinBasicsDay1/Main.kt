fun multiply(){
    var numberThree : Int =  10
    var numberFour : Int = 23
    var result = numberThree + numberFour
    print("\nThe result is : $numberThree + $numberFour = $result" )
}
//private void addition(){ ... }
fun addition(number1 : Int, number2 : Int) : Int{
        return number1 + number2
}

fun addition2(n1: Int , n2 : Int) = n1 + n2             //single line functions

fun main(){

    var names = arrayOf("Gauri","Akanksha","Nikhil")    //way 1
    for (eachName in names){
        println("Name : $eachName")
    }

    var numbers = arrayOf(100,200,300)
    for(number in numbers){
        println(number)
    }

    var numbers2 = Array<Int>(5) { index -> index * 10 }   //way 2
    for (eachNumber in numbers2){
        println("Number : $eachNumber")
    }

    for (i in 0..numbers2.size-1){
        println("${numbers2[i]}")
    }
    for (i in numbers2.indices){
        println("${numbers2[i]}")
    }

    var values = IntArray(5){index -> index + 5}    //way 3
    for (i in values){
        println(" i is :$i")
    }

    var numbers3 = 10..15
    for(eachNumber in numbers3){
        println(eachNumber)
    }

    var numbers4 = 20.downTo(10)
    for (n in numbers4){
        println("n is : $n")
    }

    var numbers5 = 10..50

    for(n in numbers5.step(2)){
        println("odd numbers are : $n")
    }
    multiply()
    print("\nThe addition of two numbers is : ${addition2(223,45)}")
    var result2 = addition2(14,45)
    print("\nThe result is : $result2")
    var res = addition(13,24)
    print("\nResult of addition is : $res")
    var number : Int = 20
    var numberOne = 10                  //Type Inference
    var numberTwo = 19.07
    var percentage = 90.0F
    var studentName = "Gauri"

    print("\nThe value of number is : $number")             //String templatesd
    print("\nThe value of numberOne is :$numberOne")
    print("\nThe value of numberTwo is : $numberTwo")
    print("\nWelcome To Bitcode For Android!")

    numberOne++
    numberTwo++
    numberTwo--
    print("\nThe value of numberTwo is : $numberTwo")
    print("\nThe value of numberOne is : $numberOne")
    print("\nThe value of number is is $number")
}