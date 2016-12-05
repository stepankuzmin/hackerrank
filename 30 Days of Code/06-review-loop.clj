; https://www.hackerrank.com/challenges/30-review-loop
(require '[clojure.string :as str])

(defn split [string] (str/split string #""))

(defn filter-indexed [func list]
  (keep-indexed #(if (apply func [%1]) %2) list))

(defn filter-string [func string]
  (->> string
    (split)
    (filter-indexed func)
    (str/join "")))

(defn filter-and-group [string]
  (str (filter-string odd? string) " " (filter-string even? string)))

(defn solve [strings]
  (for [string strings]
    (println (filter-and-group string))))

(let
  [
    n_t (read-line)
    n (Integer/parseInt n_t)
  ]
  (dotimes [i n] (println (filter-and-group (read-line))))
)
