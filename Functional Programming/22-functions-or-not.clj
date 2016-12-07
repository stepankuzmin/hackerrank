; https://www.hackerrank.com/challenges/functions-or-not

(defn get-duplicates-indices [collection]
  (->> collection
    (map-indexed list)
    (group-by second)
    (filter (comp #(> % 1) count second))
    (map (comp #(map first %) second))))

(defn select-by-indices [indices collection]
  (map #(nth collection %) indices))

(defn is-function [xs ys]
  (->> xs
    (get-duplicates-indices)
    (map #(select-by-indices % ys))
    (map #(apply = %))
    (every? identity)))

(is-function [:a :b :a :c :b] [1 2 1 3 2])
