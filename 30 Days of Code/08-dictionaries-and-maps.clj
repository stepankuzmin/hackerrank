; https://www.hackerrank.com/challenges/30-dictionaries-and-maps

(defn strings-to-hashmap [records]
  (->> records
    (map #(clojure.string/split % #" "))
    (apply concat)
    (apply hash-map)))

(defn format-number [phonebook name]
  (let [number (get phonebook name)]
    (if (nil? number)
      "Not found"
      (str name "=" number))))

(
  let [
    n_t (read-line)
    n (Integer/parseInt n_t)
    records (doall (repeatedly n read-line))
    phonebook (strings-to-hashmap records)
  ]
  (doseq [name (line-seq (java.io.BufferedReader. *in*))]
    (->> name
      (format-number phonebook)
      (println)))
)
