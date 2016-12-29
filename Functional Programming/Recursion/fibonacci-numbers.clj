; https://www.hackerrank.com/challenges/functional-programming-warmups-in-recursion---fibonacci-numbers

(defn fib [n]
  (cond
    (= n 1) 0
    (= n 2) 1
    :else (+ (fib (- n 1)) (fib (- n 2)))
  )
)

(let [n (Integer/parseInt (read-line))]
  (println (fib n)))
