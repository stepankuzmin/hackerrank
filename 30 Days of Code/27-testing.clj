; https://www.hackerrank.com/challenges/30-testing

(defn solve [K times]
  (->> times
    (filter (partial >= 0))
    (count)
    (<= K)))

(do
  (println 5)
  ; YES
  (println 5 4)
  (println -2 0 1 2 3)
  ; NO
  (println 4 3)
  (println -1 0 0 1)
  ; YES
  (println 7 3)
  (println -1 0 1 2 3 4 5)
  ; NO
  (println 6 2)
  (println -2 -1 0 2 3 4)
  ; YES
  (println 8 6)
  (println -1 1 2 3 4 5 6 7)
)
