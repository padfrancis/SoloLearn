fun main(args: Array<String>) { 
    var hours = readLine()!!.toInt() 
    var total: Double = 0.0 
    var days: Int = 0 
    
    if (hours > 24) {
        days = hours / 24 
        total = days * 15.0 + (hours % 24) * 0.5 
    } 
    if (hours in 6..23) { 
        total = 5.0 + (hours - 5) * 0.5 
    }
    if (hours in 0..5) { 
        total = hours * 1.0 
    } 
    
    println(total) 
}