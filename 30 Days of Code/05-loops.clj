; https://www.hackerrank.com/challenges/30-loops

(use '[clojure.string :only (split triml)])

(defn calc-and-print [n i] (println (str n " x " i " = " (* n i))))

(
  let [
    n_t (read-line)
    n (Integer/parseInt n_t)
  ]
  (dotimes [i 10] (let [j (inc i)] (calc-and-print n j)))
)
