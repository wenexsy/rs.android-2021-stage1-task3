package subtask2

import kotlin.math.sqrt

class SquareDecomposer {


    fun decomposeNumber(number: Int): Array<Int>? {
        var numpow = number * number
        var res = mainFun(numpow,  number - 1)
        return res
    }

    fun mainFun(orignum: Int, countnum: Int): Array<Int>?{
        for( n in countnum downTo 1 ) {
            var descnum = orignum - (n * n)
            if(0 == descnum) {
                return arrayOf(n)
            }
            if(0 > descnum ) {
                return null
            }
            var square = sqrt(descnum.toDouble()).toInt()
            if(square >= n) {
                square = n - 1
            }
            var cycle  = mainFun(descnum, square)

            if(cycle  !== null) {
                return cycle + arrayOf(n)
            }

        }
        return null
    }
}