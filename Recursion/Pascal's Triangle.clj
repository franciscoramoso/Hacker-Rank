(def x (Integer/parseInt (read-line)))
(defn combinatorial [n r] 
(/ (reduce *' (range 1 (inc n)))
    (*' (reduce *' (range 1 (inc (- n r)))) (reduce *' (range 1 (inc r))))))

(defn doble-for [i j x]
	(if (not= i x)
	(do (if (not= j i)
			(do  (print (combinatorial i j) "")
				(doble-for i (inc j) x))
			(do (print 1)
				(println)
				(doble-for (inc i) 0 x))))))

(doble-for 0 0 x)