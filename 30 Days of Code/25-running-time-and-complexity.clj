; https://www.hackerrank.com/challenges/30-running-time-and-complexity

(defn primes-in-range [collection]
  (loop
    [
      head (first collection)
      tail (rest collection)
      primes []
    ]
    (if (empty? tail)
      (conj primes head)
      (recur
        (first tail)
        (rest (doall (filter #(not= 0 (rem % head)) tail)))
        (conj primes head)))))

(defn not-divisible-by [collection n]
  (loop
    [
      head (first collection)
      tail (rest collection)
    ]
    (cond
      (= 0 (rem n head)) false
      (empty? tail) true
      :else (recur (first tail) (rest tail)))))

(defn is-prime [primes n]
  (or (.contains primes n) (not-divisible-by primes n)))

(defn read-integer []
  (Integer/parseInt (read-line)))

(let
  [
    N (read-integer)
    integers (doall (repeatedly N read-integer))
    largest (apply max integers)
    limit (Math/ceil (Math/sqrt largest))
    primes (cons 2 (primes-in-range (range 3 limit 2)))
  ]
  (doall
    (map
      #(if (and (>= % 2) (is-prime primes %))
        (println "Prime")
        (println "Not prime"))
      integers)))
