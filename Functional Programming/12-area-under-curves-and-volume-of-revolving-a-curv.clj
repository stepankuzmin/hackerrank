; https://www.hackerrank.com/challenges/area-under-curves-and-volume-of-revolving-a-curv
(require '[clojure.string :as str])

(defn read-input []
  (let [input (read-line)]
    (map #(Integer/parseInt %) (str/split input #" "))))

(def as (read-input))
(def bs (read-input))
