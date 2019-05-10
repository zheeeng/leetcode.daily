/*
 * @lc app=leetcode id=705 lang=kotlin
 *
 * [705] Design HashSet
 */
class MyHashSet() {
    /** Initialize your data structure here. */
    val s = mutableSetOf<Int>()

    fun add(key: Int) {
        s.add(key)
    }

    fun remove(key: Int) {
        s.remove(key)
    }

    /** Returns true if this set contains the specified element */
    fun contains(key: Int): Boolean {
        return s.contains(key)
    }
}
/**
 * Your MyHashSet object will be instantiated and called as such:
 * var obj = MyHashSet()
 * obj.add(key)
 * obj.remove(key)
 * var param_3 = obj.contains(key)
 */
