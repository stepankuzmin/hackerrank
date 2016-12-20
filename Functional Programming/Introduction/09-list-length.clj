; https://www.hackerrank.com/challenges/fp-list-length

(fn [lst]
  (reduce (fn [acc i] (inc acc)) 0 lst))
