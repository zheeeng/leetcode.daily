/*
 * @lc app=leetcode id=290 lang=golang
 *
 * [290] Word Pattern
 */
import (
    "strings"
)
func travel(items []interface{}) chan int {
    nextId := 0
    c := make(chan int)
    s := make(map[interface{}]int)
    go func () {
        defer close(c)
        for _, item := range items {
            if id, ok := s[item]; ok {
                c <- id
            } else {
                s[item] = nextId
                c <- nextId
                nextId++
            }
        }
    } ()
    return c
}
func wordPattern(pattern, str string) bool {
    chunks := strings.Split(str, " ")

    l1 := len(pattern)
    l2 := len(chunks)

    if l1 != l2 {
        return false
    }

    items1 := make([]interface{}, l1)
    items2 := make([]interface{}, l2)

    for i, d := range pattern {
        items1[i] = d
    }
    for i, d := range chunks {
        items2[i] = d
    }

    c1 := travel(items1)
    c2 := travel(items2)

    for id1 := range c1 {
        id2 := <- c2
        if id1 != id2 {
            return false
        }
    }
    return true
}
