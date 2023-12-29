# Intersection of 2 Sorted Arrays

 - Find the intersection of two sorted arrays or in other words, given
2 sorted arrays, find all the elements which occur in both the
arrays.
## Input Format
 - The first line contains T, the number of test cases. Following T lines contain:
 - Line 1 contains N1, followed by N1 integers of the first array
 - Line 2 contains N2, followed by N2 integers of the second array

## Output Format
 - The intersection of the arrays in a single line

```
        i = 0 // i for first array
        j = 0 // j for first array
        intersectionList = []
        while i < A.length - 1 && j < B.length - 1:

        if A[i] < B[j]:
        i++
        else if A[i] > B[j]:
        j++

        else if A[i] == B[j]:

        intersectionList.add(A[i])
        i++
        j++
```

# Pair With Difference

Given an array A of sorted integers and another non negative
integer k, find if there exists 2 indices i and j such that A[i] - A[j] =
k, i != j.

## Input Format

 - First line is number of test cases T. Following T lines contain:
 - N, followed by N integers of the array
 - The non-negative integer k

## Output format

 - Print 1 if such a pair exists and 0 if it doesn’t.

# Reverse

Write a program that reverses a string.
 - The input string is given as an array of characters s.
 - You must do this by modifying the input array in-place with O(1) without extra memory.

# Squares of a Sorted Array
 - Given an integer array nums sorted in non-decreasing order,return an array of the squares of each number sorted in non-
decreasing order.

## Input:
5
-4 -1 0 3 10

## Output:

0 1 9 16 100