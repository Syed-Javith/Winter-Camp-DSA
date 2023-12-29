## Pivot Index

Given an array of integers nums, calculate the pivot index of this array
The pivot index is the index where the sum of at the numbers strictly to the left of the index is equal to the sum of all the numbers stitctly to the index's right
If the index is on the left eoge of the array, then the left sum is because there are no elements to the latt. It's also applies to the right edge of the array .Return the leftmost pivot index If no such index exists, return-1

## Input

6
1 7 3 6 5 6 

## Output 

3

## Explanation

The pivot index 3
Left sum = nums[0] + nums[1] + nums[2] = 11
Right sum = nums[4] + num[5]  = 11 

## Minimum Number added to make sum not less than 1

Given an array of integers nums, you start with an initial positive value startValue
In each iteration, you calculate the step by step sum of startValue plus elements in nums (from left to right).
Return the minimum positive value of startValue such that the step by step sum is never less than 1.

## Input

5
-32-342

## Output

5
## Explanation

If you choose startValue = 4, in the third iteration your step by
step sum is less than 1.
step by step sum
startValue = 4 | startValue = 5 | nums
(4-3)=1 | (5-3)=2 1-3
(1+2)=3 | (2+2)=4 | 2
(3-3)=0 (4-3)=1 -3
(0+4)=4 (1+4)=5 | 4
(4+2)=6 (5+2)=7 | 2

## Max Altitude 

There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.
You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i and i + 1 for all (0 < i < n). Return the highest altitude of a point.

## Input

5
-5 1 5 0 -7

## Output
 
1

## Explanation

The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.