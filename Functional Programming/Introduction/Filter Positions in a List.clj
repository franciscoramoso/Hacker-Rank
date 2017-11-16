(defn solution [s]
(dotimes [i (count s)]
(if (not= (mod i 2) 0)
(println (nth s i)))))