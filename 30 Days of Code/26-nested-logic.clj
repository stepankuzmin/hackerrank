; https://www.hackerrank.com/challenges/30-nested-logic

(defn calculate-fine [[Da Ma Ya] [De Me Ye]]
  (cond
    (> Ya Ye) 10000
    (and (= Ya Ye) (> Ma Me)) (* 500 (- Ma Me))
    (and (= Ya Ye) (= Ma Me) (> Da De)) (* 15 (- Da De))
    :else 0))

(defn read-date []
  (->>
    (clojure.string/split (read-line) #" ")
    (map #(Integer/parseInt %))))

(let
  [
    DateA (read-date)
    DateE (read-date)
    fine (calculate-fine DateA DateE)
  ]
  (println fine))
