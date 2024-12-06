fun main(args: Array<String>) {
    val s1 = readLine()!!
    
    for(s in s1) {
        
        if (s.isLowerCase()) {
            print(s.toUpperCase())
        } else { 
            print(s.toLowerCase())
        }
    }
}