; https://www.hackerrank.com/challenges/string-mingling

(defn mingle [P Q]
  (clojure.string/join #"" (map str P Q)))

(let [P (read-line) Q (read-line)]
  (println (mingle P Q)))
