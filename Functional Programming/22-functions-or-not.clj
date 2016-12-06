; https://www.hackerrank.com/challenges/functions-or-not

(defn get-duplicate-indices [collection]
  (->> collection
    (map-indexed list)
    (group-by second)
    (filter (comp #(> % 1) count second))
    (map (comp #(map first %) second))))

(defn select-indices [indices collection]
  (map #(nth collection %) indices))

(defn is-function [xs ys]
  (->> xs
    (get-duplicate-indices)
    (map #(select-indices % ys))
    (map #(apply = %))
    (every? identity)))
