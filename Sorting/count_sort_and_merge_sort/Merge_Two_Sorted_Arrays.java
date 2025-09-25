package Sorting.count_sort_and_merge_sort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Problem Description:
 * Given two sorted integer arrays A and B, merge B and A as one sorted array and return it as an output.
 * 
 * Note: A linear time complexity is expected and you should avoid use of any library function.
 * 
 * Problem Constraints:
 * -2×10^9 <= A[i], B[i] <= 2×10^9
 * 1 <= |A|, |B| <= 5×10^4
 * 
 * Input Format:
 * First Argument is a 1-D array representing A.
 * Second Argument is also a 1-D array representing B.
 * 
 * Output Format:
 * Return a 1-D vector which you got after merging A and B.
 * 
 * Example Input:
 * Input 1:
 *   A = [4, 7, 9]
 *   B = [2, 11, 19]
 * 
 * Input 2:
 *   A = [1]
 *   B = [2]
 * 
 * Example Output:
 * Output 1:
 *   [2, 4, 7, 9, 11, 19]
 * 
 * Output 2:
 *   [1, 2]
 * 
 * Example Explanation:
 * Explanation 1: Merging A and B produces the output as described above.
 * Explanation 2: Merging A and B produces the output as described above.
 */

public class Merge_Two_Sorted_Arrays {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> solve(final List<Integer> A, final List<Integer> B) {
      
      //solution 1
      //7667 ns

      ArrayList<Integer> merged = new ArrayList<>();
      int i = 0, j = 0;
      while (i < A.size() && j < B.size()) {
        if(A.get(i) <= B.get(j)) {
          merged.add(A.get(i));
          i++;
        } else {
          merged.add(B.get(j));
          j++;
        }
      }
      if(merged.size() != A.size() + B.size()){      
        while(i < A.size()) {
          merged.add(A.get(i));
          i++;
        }
        while(j < B.size()) {
          merged.add(B.get(j));
          j++;
        }
      }
      return merged;
      
      //solution 2
      //6124417 ns

      // return Stream.concat(A.stream(), B.stream())
      //              .sorted()
      //              .collect(Collectors.toCollection(ArrayList::new));
    
    }
}