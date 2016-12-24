; https://www.hackerrank.com/challenges/30-running-time-and-complexity

; (def rem-not-0
;   (memoize (fn [a b]
;     (not= 0 (rem a b)))))

; (defn primes-in-range [collection]
;   (loop
;     [
;       head (first collection)
;       tail (rest collection)
;       primes []
;     ]
;     (if (empty? tail)
;       (conj primes head)
;       (recur
;         (first tail)
;         (rest (doall (filter #(rem-not-0 % head) tail)))
;         (conj primes head)))))

(defn primes-in-range [max]
  (let [enqueue (fn [sieve n factor]
                  (let [m (+ n (+ factor factor))]
                    (if (sieve m)
                      (recur sieve m factor)
                      (assoc sieve m factor))))
        next-sieve (fn [sieve candidate]
                     (if-let [factor (sieve candidate)]
                       (-> sieve
                         (dissoc candidate)
                         (enqueue candidate factor))
                       (enqueue sieve candidate candidate)))]
    (cons 2 (vals (reduce next-sieve {} (range 3 max 2))))))

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

(defn read-integer []
  (Integer/parseInt (read-line)))

(defn is-prime [primes n]
  (or (.contains primes n) (not-divisible-by primes n)))

(let
  [
    N (read-integer)
    integers (doall (repeatedly N read-integer))
    largest (apply max integers)
    limit (Math/ceil (Math/sqrt largest))
    primes (primes-in-range limit)
  ]
  (doall
    (map
      #(if (and (is-prime primes %) (>= % 2))
        (println "Prime")
        (println "Not prime"))
      integers)
  )
)
