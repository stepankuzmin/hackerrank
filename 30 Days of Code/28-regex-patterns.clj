; https://www.hackerrank.com/challenges/30-regex-patterns

(def rows [
  "riya riya@gmail.com"
  "julia julia@julia.me"
  "julia sjulia@gmail.com"
  "julia julia@gmail.com"
  "samantha samantha@gmail.com"
  "tanya tanya@gmail.com"
  ])

(let
  [
    N (Integer/parseInt (read-line))
    rows (doall (repeatedly N read-line))
  ]
  (doall
    (->> rows
      (map #(clojure.string/split % #"\s"))
      (filter (comp (partial re-matches #"^.*@gmail.com$") second))
      (map first)
      (sort)
      (map println))))
