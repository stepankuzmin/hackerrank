; https://www.hackerrank.com/challenges/rotate-string

(defn shift-head [string]
  (let [[head tail] (split-at 1 string)]
    (clojure.string/join #"" (concat tail head))))

(defn rotate [string]
  (let [length (count string)]
    (loop [i 0 current-string string rotated-strings []]
      (if (= i length)
        (clojure.string/join #" " rotated-strings)
        (let [rotated-string (shift-head current-string)]
          (recur (inc i) rotated-string (conj rotated-strings rotated-string)))))))

(let
  [
    N (Integer/parseInt (read-line))
    strings (doall (repeatedly N read-line))
  ]
  (doall (map (comp println rotate) strings))
)
