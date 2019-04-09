fun Int.toRoman(): String {
    val romanMap = mapOf(
        50000 to "Ĺ",
        40000 to "ẊĹ",
        10000 to "Ẋ",
        9000 to "MẊ",
        5000 to "Ṽ",
        4000 to "MṼ",
        1000 to "M",
        900 to "CM",
        500 to "D",
        400 to "CD",
        100 to "C",
        90 to "XC",
        50 to "L",
        40 to "XL",
        10 to "X",
        9 to "IX",
        5 to "V",
        4 to "IV",
        1 to "I"
    )

    var remaining = this
    var romanString = ""

    while (remaining > 0) {
        romanMap.asSequence()
            .first { remaining >= it.key }
            .let {
                remaining -= it.key
                romanString += it.value
            }
    }

    return romanString
}