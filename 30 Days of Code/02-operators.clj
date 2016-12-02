; https://www.hackerrank.com/challenges/30-operators

(defn read-input [] (read-string (read-line)))
(defn calcPercent [cost, percent] (* cost (/ percent 100)))

(def mealCost (read-input))
(def tipPercent (read-input))
(def taxPercent (read-input))

(def totalCost
  (Math/round
    (+
      mealCost
      (calcPercent mealCost tipPercent)
      (calcPercent mealCost taxPercent))))

(println (str "The total meal cost is " totalCost " dollars."))
