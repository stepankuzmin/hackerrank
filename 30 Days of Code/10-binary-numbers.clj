; https://www.hackerrank.com/challenges/30-binary-numbers

(defn dec-to-bin [number]
  (loop [n number reminders ""]
    (let [quotient (quot n 2) reminder (rem n 2)]
      (if (= quotient 0)
        (str reminder reminders)
        (recur quotient (str reminder reminders))))))

(defn maximum-number-of-consecutive [string]
  (->> (clojure.string/split string #"0")
    (reduce #(max %1 (count %2)) 0)))

(let [n (Integer/parseInt (read-line))]
  (->> n
    (dec-to-bin)
    (maximum-number-of-consecutive)
    (println)))
