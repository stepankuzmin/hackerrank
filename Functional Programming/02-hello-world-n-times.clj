; https://www.hackerrank.com/challenges/fp-hello-world-n-times

(fn [n]
  (loop [i 0]
    (when (< i n)
      (println "Hello World")
      (recur (+ i 1))
    )
  )
)
