; https://www.hackerrank.com/challenges/30-conditional-statements

(use '[clojure.string :only (split triml)])

(
  let [
    N_t (read-line)
    N (Integer/parseInt N_t)
    text (cond
      (or
        (odd? N)
        (and (even? N) (.contains (vec (range 6 21)) N))
      ) "Weird"
      (or
        (and (even? N) (.contains (vec (range 2 6)) N))
        (and (even? N) (> N 20))
      ) "Not Weird"
    )
  ]
  (println text)
)
