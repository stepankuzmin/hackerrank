// https://www.hackerrank.com/challenges/30-generics

class Solution {
    public static <E> void printArray(E[] collection) {
      for (E element : collection) {
        System.out.println(element);
      }
    }
}
