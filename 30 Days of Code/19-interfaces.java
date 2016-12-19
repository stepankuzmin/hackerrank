// https://www.hackerrank.com/challenges/30-interfaces

interface AdvancedArithmetic{
   int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {
    @Override
    public int divisorSum(int n) {
      return java.util.stream.IntStream.rangeClosed(1, n)
        .filter((i) -> n % i == 0)
        .reduce(0, (acc, i) -> acc + i);
    }
}
