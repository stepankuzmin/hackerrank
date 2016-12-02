; https://www.hackerrank.com/challenges/fp-filter-positions-in-a-list

(fn [lst]
  (keep-indexed #(if (odd? %1) %2) lst))
