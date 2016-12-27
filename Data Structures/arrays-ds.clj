; https://www.hackerrank.com/challenges/arrays-ds

(defn my-reverse [collection]
  (cond
    (= collection nil) nil
    :else (cons (last collection) (my-reverse (butlast collection)))))

(let
  [
    N (Integer/parseInt (read-line))
    collection (clojure.string/split (read-line) #"\s")
  ]
  (->> collection
    (my-reverse)
    (clojure.string/join " ")
    (println)))
