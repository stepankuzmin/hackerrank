; https://www.hackerrank.com/challenges/30-arrays
(use '[clojure.string :only (split triml)])

(defn my-reverse [lst] (reduce conj '() lst))

(
        let [
          n_t (read-line)
          n (Integer/parseInt n_t)
        ]

      (
        let [
          arr_temp (read-line)
          arr_t (split arr_temp #"\s+")
          arr (map #(Integer/parseInt %) arr_t)
        ]
        (apply println (my-reverse arr))
      )

)
