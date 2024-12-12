import java.util.Scanner
import java.util.regex.Pattern

fun inputVarInt(): Int {
    val sc = Scanner(System.`in`)
    var x = 0
    var str: String
    for (n in 1..100) {
        str = sc.nextLine()
        if (Pattern.matches("[0-9]+", str)) {
            x = str.toIntOrNull()!!
            if(x==0){
                print("Введите любое натуральное число: ")
                continue
            }
            else{
                break
            }

        } else {
            print("Введите любое натуральное число: ")
        }
    }
    return x
}

fun nodCalcEuclid (a: Int, b: Int): Int {
    var temp: Int
    var x: Int = a
    var y: Int = b
    while (y!=0){
        temp = x%y
        x = y
        y = temp
    }
    return x
}

fun nokCalc (x: Int, y: Int, nod: Int): Int {
    return (x*y)/nod
}

fun main() {
    print("a = ")
    val a: Int = inputVarInt()
    print("b = ")
    val b: Int = inputVarInt()
    println("\nВведённые числа:\na=$a\nb=$b\n")
    val nod: Int = nodCalcEuclid(a, b)
    val nok: Int = nokCalc(a, b, nod)
    println("НОД по Евклиду (методом деления): $nod")
    println("НОК: $nok")
}