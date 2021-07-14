package subtask1

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        var a = array[0]
        val b = array[1]
        var i = 1
        while((factorial(i) * factorial(b-i)) != (factorial(b) / a)){
            i++
            if(i > b){
                return null
            }
        }
        return i
    }
    fun factorial(n: Int): Double = if (n < 2) 1.0 else n * factorial(n - 1)
}