package org.kotlinlang.play

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import martaranowicz.com.ui.theme.HomeWork2Theme

fun <T> isPalindrome(list: List<T>): Boolean {
    val reversed = list.reversed()
    return list == reversed
}

fun main() {
    val list1 = listOf("la", "la", "la")
    val deleteDuplicate = list1.groupingBy { it }.eachCount()
    println(deleteDuplicate.filterValues { it > 1 })

    val list2 = listOf(listOf(1, 2), listOf(3, 4), listOf(5, 6))
    val flattenedList = list2.flatten()
    println(flattenedList)

    val list3 = listOf('a', 'l', 'a')
    val isPal = isPalindrome(list3)
    println(isPal)


    val list4 = listOf('a', 'l', 'a')

    if (list4 == list4.reversed()) { // jeśli odwrócona lista jest równa oryginalnej liście
            println("$list4 is a palindrome") // drukuj, że oryginalna lista jest palindromem
    } else {
            println("$list4 is not a palindrome") // drukuj, że oryginalna lista nie jest palindromem
        }
    }



