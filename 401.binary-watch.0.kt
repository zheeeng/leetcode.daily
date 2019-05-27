/*
 * @lc app=leetcode id=401 lang=kotlin
 *
 * [401] Binary Watch
 */
class Solution_readBinaryWatch_0 {
    fun readBinaryWatch(num: Int): List<String> {
        val oneHour = listOf("1", "2", "4", "8")
		val twoHour = listOf("3", "5", "9", "6", "10")
		val threeHour = listOf("7", "11")
        val oneMin = listOf("01", "02", "04", "08", "16", "32")
		val twoMin = listOf("03","05","06","09","10","12","17","18","20","24","33","34","36","40","48")
		val threeMin = listOf("07", "11", "13", "14", "19", "21", "22", "25", "26", "28", "35", "37", "38", "41", "42", "44", "49", "50", "52", "56")
		val fourMin = listOf("15","23","27","29","30","39","43","45","46","51","53","54","57","58")
        val fiveMin = listOf("31", "47", "55", "59")

        return when (num) {
            0 -> listOf<String>("0:00")
            1 -> oneHour.map { h -> h + ":" + "00" } +
                oneMin.map { m -> "0" + ":" + m}
            2 -> twoHour.map { h -> h + ":" + "00" } +
                oneHour.flatMap { h -> oneMin.map { h + ":" + it } } +
                twoMin.map { m -> "0" + ":" + m}
            3 -> threeHour.map { h -> h + ":" + "00" } +
                twoHour.flatMap { h -> oneMin.map { h + ":" + it } } +
                oneHour.flatMap { h -> twoMin.map { h + ":" + it } } +
                threeMin.map { m -> "0" + ":" + m}
            4 -> threeHour.flatMap { h -> oneMin.map { h + ":" + it } } +
                twoHour.flatMap { h -> twoMin.map { h + ":" + it } } +
                oneHour.flatMap { h -> threeMin.map { h + ":" + it } } +
                fourMin.map { m -> "0" + ":" + m}
            5 -> threeHour.flatMap { h -> twoMin.map { h + ":" + it } } +
                twoHour.flatMap { h -> threeMin.map { h + ":" + it } } +
                oneHour.flatMap { h -> fourMin.map { h + ":" + it } } +
                fiveMin.map { m -> "0" + ":" + m}
            6 -> threeHour.flatMap { h -> threeMin.map { h + ":" + it } } +
                twoHour.flatMap { h -> fourMin.map { h + ":" + it } } +
                oneHour.flatMap { h -> fiveMin.map { h + ":" + it } }
            7 -> threeHour.flatMap { h -> fourMin.map { h + ":" + it } } +
                twoHour.flatMap { h -> fiveMin.map { h + ":" + it } }
            8 -> threeHour.flatMap { h -> fiveMin.map { h + ":" + it } }
            else -> listOf<String>()
        }
    }
}
