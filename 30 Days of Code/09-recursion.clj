; https://www.hackerrank.com/challenges/30-recursion

(defn factorial [n]
  (loop [i n acc 1]
    (if (= i 0)
      acc
      (recur (dec i) (* acc i)))))

(let [n (Integer/parseInt (read-line))]
  (println (factorial n)))
