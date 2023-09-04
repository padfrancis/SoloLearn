fun shippingCost(amount: Double, international: Boolean): Double {
    if (international == false){
        if (amount >= 75.0){
          return amount*0.0  
        }
        else if (amount < 75.0){
          return 0.10*amount
        }
        
        
    }
     
    else if (international == true) {
        if ((amount*0.15) > 50.0) {
            return 50.0
        }
        else {return 0.15*amount}

    }
    return 0.0
}
fun main(args: Array<String>) {
    val total = readLine()!!.toDouble()
    val international = readLine()!!.toBoolean()    
    println(shippingCost(total, international))
}