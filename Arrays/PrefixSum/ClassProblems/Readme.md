## Prefix sum

 - Given an array arr[] of size N, find the prefix sum of the array. A prefix sum array is another array prefixSum[] of the same size, such that the value of prefixSum[i] is arr[0] + arr[1] + arr[2] . . . arr[i].

## Input
 
arr[] = {10, 20, 10, 5, 15}

## Output

prefixSum[] = {10, 30, 40, 45, 60}

## Explanation

While traversing the array, update the element by adding it with its previous element.
prefixSum[0] = 10, 
prefixSum[1] = prefixSum[0] + arr[1] = 30, 
prefixSum[2] = prefixSum[1] + arr[2] = 40 and so on.

## Queries

 - Given an integer array nums, handle multiple queries of the following type:
 - Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
 - Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).

## Input

6
-2 0 3 -5 2 -1
[0, 2], [2, 5], [0, 5]

## Output

null 1 -1 -3

## Explanation

NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
 
## Split Array 

 - Given an array nums , split the array into two non null partitions such that the sum of left subarray is greater than right subarray
return the number of such arrays possible

## Input 

4

10 4 -8 7

## Output

2