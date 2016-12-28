; https://www.hackerrank.com/challenges/30-bitwise-and

(defn solve [N K]
  (let
    [
      S (range 1 (inc N))
      ab (for
        [
          a S
          b S
          :when (< a b)
          :let [ab (bit-and a b)]
          :while (< ab K)
        ]
        ab
      )
    ]
    (apply max ab)))

(defn parse [string]
  (map #(Integer/parseInt %) (clojure.string/split string #"\s")))

(let
  [
    T (Integer/parseInt (read-line))
    test-cases (map parse (doall (repeatedly T read-line)))
  ]
  (doall
    (map #(println (apply solve %)) test-cases)))
