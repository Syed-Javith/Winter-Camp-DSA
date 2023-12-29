# LargestAvgSubArray

You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 105 will be accepted.

## Input

6 <br>
1 12 -5 -6 50 3 <br>
4

## Output

12.75000

## Explanation
 
Maximum average is (12-5-6+50)/4 = 51/4 = 12.75

<img src="https://github.com/Syed-Javith/Winter-Camp-DSA/blob/master/Arrays/SlidingWindow/TestProblems/image%20(1).png"/>

# LargestSumSubArray

Given an integer array nums and an integer k, find the sum of the subarray with the largest sum whose length is k.

## Input

7
3 -1 4 12 -8 5 6
4

## Output

18

<img src="https://github.com/Syed-Javith/Winter-Camp-DSA/blob/master/Arrays/SlidingWindow/TestProblems/image%20(2).png" />

# MinLengthOfSumGreaterThanK

Given an array, find the minimum length of the subarray whose sum greater than or equal to K.

# MultipleOneFlipped

Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

## Input

nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2

## Output

6

## Explanation

[1,1,1,**0**, **0**,1,1,1,1,1,1] Bolded numbers were flipped from 0 to 1, The longest subarray is underlined

<img src="https://github.com/Syed-Javith/Winter-Camp-DSA/blob/master/Arrays/SlidingWindow/TestProblems/image.png"/>

# VowelsSliding

 - Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
 - Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

## Input
 
s = "abciiidef", k = 3

## Output
 
3

<img src="https://github.com/Syed-Javith/Winter-Camp-DSA/blob/master/Arrays/SlidingWindow/TestProblems/image%20(3).png"/>

## Explanation 

The substring "iii" contains 3 vowel letters.