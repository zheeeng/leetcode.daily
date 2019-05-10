/*
 * @lc app=leetcode id=706 lang=kotlin
 *
 * [706] Design HashMap
 */
class MyHashMap() {
    /** Initialize your data structure here. */
    val m = mutableMapOf<Int, Int>()

    /** value will always be non-negative. */
    fun put(key: Int, value: Int) {
        m.put(key, value)
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    fun get(key: Int): Int {
        return m.getOrDefault(key, -1)
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    fun remove(key: Int) {
        m.remove(key)
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * var obj = MyHashMap()
 * obj.put(key,value)
 * var param_2 = obj.get(key)
 * obj.remove(key)
 */
