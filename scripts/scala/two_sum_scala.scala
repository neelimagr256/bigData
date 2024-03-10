Question:


Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]

 
Constraints:
2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 
Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?



import scala.collection.immutable.Map
object HelloWorld {
   def main(args: Array[String]) {
      println("Hello, world!")
      val ind1 = twoSum(Array(5, 2, 3), 7)
   }
   
   def twoSum(nums: Array[Int], target: Int): Array[Int] = {
     var mp = scala.collection.mutable.Map[Int, Int]()
        for(i<- 0 to nums.length-1) {
            mp(nums(i))= i
        }
        var index_1 = -1
        var index_2 = -1
        breakable {
            for (i<- 0 to nums.length-2) {
                val bal = target - nums(i)
                val find = mp getOrElse (bal, -1)
                if (find != -1 && find != i) {
                    index_1 = i
                    index_2 = find
                    break;
                }    
            }
        }
        Array(index_1, index_2)

    }
}

Leetcode code - 
import scala.util.control.Breaks._
object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        var mp = scala.collection.mutable.Map[Int, Int]()
        for(i<- 0 to nums.length-1) {
            mp(nums(i))= i
        }
        var index_1 = -1
        var index_2 = -1
        breakable {
            for (i<- 0 to nums.length-2) {
                val bal = target - nums(i)
                val find = mp getOrElse (bal, -1)
                if (find != -1 && find != i) {
                    index_1 = i
                    index_2 = find
                    break;
                }    
            }
        }
        Array(index_1, index_2)
    }
}


