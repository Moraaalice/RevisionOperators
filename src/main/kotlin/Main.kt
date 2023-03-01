fun main(){
    addition(4,10,20)
    subtract(345,789)
    multiplication(45,78)
    modulus(89,45)
    division(500,10)
    age(26)
    age2(24)
    num(56,67)
    values(56,67)

}
fun addition(x:Int,y:Int,z:Int){
    var add = x+y+z
    println(add)
}
fun subtract(q:Int,w:Int,):Int{
    var sub = q-w
    return sub
}
fun multiplication(r:Int,t:Int){
    var multiply = r*t
    println(multiply)
}
fun modulus(h:Int,v:Int){
    var mod = h%v
    println(mod)
}
fun division (xy:Int,yz:Int){
    var divide = xy/yz
    println(divide)
}
fun age (y:Int){
    var march = y
    ++march
    println(march)
}
fun age2(rt:Int):Int{
    var may = rt
    --may
    return may
}
fun num(num1:Int,num2:Int):Boolean{
    var numb = num1<num2
    return numb
}
fun values(numb1:Int,numb2:Int){
    var numb3 = numb1>numb2
    println(numb3)

}