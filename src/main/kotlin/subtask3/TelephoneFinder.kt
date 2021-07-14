package subtask3

class TelephoneFinder {

    // TODO: Complete the following function
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        var arr1 = mutableListOf<String>()

        for (i in 0 until number.length){
            var numlist = numconvert(number[i].toString().toIntOrNull())
            if (numlist.isNullOrEmpty()){
                return null
            }
            for (x in numlist){
                var change = number.substring(0, i) + x + number.substring(i + 1)
                arr1.add(change)
            }
        }
        println(arr1)
        return arr1.toTypedArray()
    }

    fun numconvert(num: Int?) =
        when (num) {

            1 -> listOf("2","4")
            2 -> listOf("1","3","5")
            3 -> listOf("2","6")
            4 -> listOf("1","5","7")
            5 -> listOf("2","4","6","8")
            6 -> listOf("3","5","9")
            7 -> listOf("4","8")
            8 -> listOf("0","5","7","9")
            9 -> listOf("6","8")
            0 -> listOf("8")
            else -> null

        }
}