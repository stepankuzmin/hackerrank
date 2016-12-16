# https://www.hackerrank.com/challenges/30-more-exceptions

class Calculator
    def power(n, p)
        raise RangeError, 'n and p should be non-negative' if n < 0 or p < 0
        n ** p
    end
end
