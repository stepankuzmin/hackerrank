; https://www.hackerrank.com/challenges/lambda-march-compute-the-area-of-a-polygon

(defn read-coordinates []
  (map #(Float/parseFloat %) (clojure.string/split (read-line) #" ")))

(defn calc [[x_i y_i] [x_j y_j]]
  (- (* x_i y_j) (* x_j y_i)))

(defn shift-head [coordinates]
  (let [[head tail] (split-at 1 coordinates)]
    (concat tail head)))

(defn area [coordinates]
  (->> (map calc coordinates (shift-head coordinates))
    (apply +)
    (* 0.5)
    (Math/abs)))

(
  let [
    n (Integer/parseInt (read-line))
    coordinates (doall (repeatedly n read-coordinates))
  ]
  (println (area coordinates))
)
