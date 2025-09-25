package Sorting.count_sort_and_merge_sort;

import java.util.ArrayList;
import java.util.Arrays;

public class Client {
  public static void main(String[] args) {
    ArrayList<Integer> A = new ArrayList<>(Arrays.asList(-4, 3));
    ArrayList<Integer> B = new ArrayList<>(Arrays.asList(-2, -2, 3, 4));
    Merge_Two_Sorted_Arrays merger = new Merge_Two_Sorted_Arrays();
    ArrayList<Integer> merged = merger.solve(A, B);
    System.out.println(merged);
  }
}
