/*
 * @lc app=leetcode id=345 lang=golang
 *
 * [345] Reverse Vowels of a String
 */
func isVowel(c rune) bool {
    if c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' {
        return true
    }
    return false
}
func reverseVowels(s string) string {
    i := 0
    j := len(s) - 1

    runes := []rune(s)

    for i < j {
        if isVowel(runes[i]) {
            for !isVowel(runes[j]) {
                j--
            }
            if i == j {
                break
            }
            runes[i], runes[j] = runes[j], runes[i]
            j--
        }
        i++
    }
    return string(runes)
}
