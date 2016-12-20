; https://www.hackerrank.com/challenges/string-reductions

(defn uniq-reduce [acc element]
  (if (.contains acc element) acc (conj acc element)))

(let [string (read-line)]
  (->>
    (clojure.string/split string #"")
    (reduce uniq-reduce [])
    (clojure.string/join "")
    (println)))
