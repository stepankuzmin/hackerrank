; https://www.hackerrank.com/challenges/fp-sum-of-odd-elements

(fn [lst]
  (->> lst
    (filter odd?)
    (reduce + 0)))
