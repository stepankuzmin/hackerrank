; https://www.hackerrank.com/challenges/fp-filter-array

(fn [delim lst]
  (reduce
    (fn [acc item]
      (if (< item delim) (conj acc item) acc))
    []
    lst))
