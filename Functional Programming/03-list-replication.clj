; https://www.hackerrank.com/challenges/fp-list-replication

(fn [num lst] (map #(dotimes [n num] (println %)) lst))
