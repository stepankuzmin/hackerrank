; https://www.hackerrank.com/challenges/30-2d-arrays
(use '[clojure.string :only (split triml)])

(defn take3 [n] (range n (+ n 3)))

(defn get-hourglass-coordinates [x y]
  (concat
    (map (partial list y) (take3 x))
    (list (list (inc y) (inc x)))
    (map (partial list (+ 2 y)) (take3 x))
  ))

(defn get-hourglass [matrix x y]
  (map (partial apply aget matrix) (get-hourglass-coordinates x y)))

(defn get-coordinates [x y]
  (apply concat (for [xi (range x y) :let [yi (range x y)]]
    (map (partial list xi) yi))))

(
  let [
    arr (for [arr_temp (range 6)]
      (map #(Integer/parseInt %) (split (read-line) #"\s+")))
    matrix (to-array-2d arr)
  ]
  (->> (get-coordinates 0 4)
    (map (partial apply get-hourglass matrix))
    (map (partial apply +))
    (apply max)
    (println)))
