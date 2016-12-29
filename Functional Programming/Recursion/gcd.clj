; https://www.hackerrank.com/challenges/functional-programming-warmups-in-recursion---gcd

(let
  [
    f (fn [a b]
        (loop [x a y b]
          (cond
            (= x y) x
            (> x y) (recur (- x y) y)
            (< x y) (recur x (- y x))
          )))
    [m n] (map read-string (re-seq #"\d+" (read-line)))
  ]
  (println (f m n)))
