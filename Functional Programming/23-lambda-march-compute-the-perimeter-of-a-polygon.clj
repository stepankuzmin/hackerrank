; https://www.hackerrank.com/challenges/lambda-march-compute-the-perimeter-of-a-polygon

(defn read-coordinates []
  (map #(Float/parseFloat %) (clojure.string/split (read-line) #" ")))

(defn square-difference [a b]
  (Math/pow (- a b) 2))

(defn calc [[x_i y_i] [x_j y_j]]
  (Math/sqrt (+ (square-difference x_j x_i) (square-difference y_j y_i))))

(defn shift-head [coordinates]
  (let [[head tail] (split-at 1 coordinates)]
    (concat tail head)))

(defn area [coordinates]
  (->>
    (map calc coordinates (shift-head coordinates))
    (apply +)))

(
  let [
    n (Integer/parseInt (read-line))
    coordinates (doall (repeatedly n read-coordinates))
  ]
  (println (area coordinates))
)
