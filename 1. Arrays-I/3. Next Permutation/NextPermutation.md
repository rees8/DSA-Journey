## Problem Statement

A permutation of an array of integers is an arrangement of its members into a sequence or linear order.</br>
For example, for `arr = [1,2,3]`, the following are all the permutations of `arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].`</br>

The next permutation of an array of integers is the next lexicographically greater permutation of its integer.</br> 
More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container.</br>

If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).</br>
For example, the next permutation of `arr = [1,2,3]` is `[1,3,2]`.</br>
Similarly, the next permutation of `arr = [2,3,1]` is `[3,1,2]`.</br>
While the next permutation of `arr = [3,2,1]` is `[1,2,3]` because `[3,2,1]` does not have a lexicographical larger rearrangement.</br>

Given an array of integers `nums`, find the next permutation of `nums`.</br>

The replacement must be `in place` and use only constant extra memory.</br>

## Examples

- Example 1:
  - Input: nums = [1,2,3]
  - Output: [1,3,2]

- Example 2:
  - Input: nums = [3,2,1]
  - Output: [1,2,3]

- Example 3:
  - Input: nums = [1,1,5]
  - Output: [1,5,1]

## Constraints:
- `1 <= nums.length <= 100`
- `0 <= nums[i] <= 100`

---
### Link to the problem: [Solve problem](https://leetcode.com/problems/next-permutation/description/)
