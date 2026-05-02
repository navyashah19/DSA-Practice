/*
Problem: Pascal's Triangle
Platform: LeetCode
Difficulty: Easy
Topics: Array, Dynamic Programming

----------------------------------
Problem Statement:
----------------------------------
Given an integer numRows, return the first numRows of Pascal's Triangle.

In Pascal's Triangle:
- Each number is the sum of the two numbers directly above it.

Example:
        1
       1 1
      1 2 1
     1 3 3 1
    1 4 6 4 1

----------------------------------
Example 1:
----------------------------------
Input: numRows = 5
Output:
[[1],
 [1,1],
 [1,2,1],
 [1,3,3,1],
 [1,4,6,4,1]]

----------------------------------
Example 2:
----------------------------------
Input: numRows = 1
Output: [[1]]

----------------------------------
Approach:
----------------------------------
1. Create a List to store all rows of Pascal's Triangle.
2. Loop from 0 to numRows - 1 to generate each row.
3. For each row:
   - First element and last element are always 1.
4. For middle elements:
   - value = element above + element above-left
   - ans[i-1][j] + ans[i-1][j-1]
5. Add each row to the result list.

----------------------------------
Time Complexity: O(n²)
Space Complexity: O(n²)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            ans.add(new ArrayList<>());

            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    ans.get(i).add(1);
                } 
                else {
                    int val = ans.get(i-1).get(j) + ans.get(i-1).get(j-1);
                    ans.get(i).add(val);
                }
            }
        }

        return ans;
    }
}
