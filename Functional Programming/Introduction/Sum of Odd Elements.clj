(defn sumOdd [lista]
	(defn the-sum [i acc]
		(if (= i (count lista))
			(do acc)
			(do (if (not= (mod (nth lista i) 2) 0)
					(the-sum (inc i) (+ acc (nth lista i)))
					(the-sum (inc i) acc)))))
	(the-sum 0 0))