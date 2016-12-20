; https://www.hackerrank.com/challenges/eval-ex

(defn factorial [n] (reduce * 1 (rest (range (inc n)))))

(defn solve [x]
 (reduce
  (fn [acc i] (+ acc (/ (Math/pow x i) (factorial i))))
  1
  (rest (range 10))))

(dotimes [i (Integer/parseInt (read-line))]
 (let [x (Float/parseFloat (read-line))]
  (->> x
   (solve)
   (format "%.4f")
   (println))))
