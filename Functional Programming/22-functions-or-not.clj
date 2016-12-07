; https://www.hackerrank.com/challenges/functions-or-not

(defn read-pair []
  (map #(Integer/parseInt %) (clojure.string/split (read-line) #" ")))

(defn is-function [pairs]
  (->> pairs
    (group-by first)
    (filter (comp #(> % 1) count second))
    (map (comp (partial map second) second))
    (map #(apply = %))
    (every? identity)))

(
  let [T (Integer/parseInt (read-line))]
  (dotimes [i T]
    (
      let [
        N (Integer/parseInt (read-line))
        pairs (doall (repeatedly N read-pair))
      ]
      (if (is-function pairs) (println "YES") (println "NO"))
    )
  )
)
