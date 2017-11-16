(def n (Integer/parseInt (read-line)))

(defn doit [i]
	(if (not= i n)
		(do (def a (read-line))
				(defn zap [n]
				(if (not= n (count a))
					(do (print (get a (inc n)))
						(print (get a n))				
						(zap (+ n 2)))))
			(zap 0)
			(println "")
			(doit (inc i)))))
(doit 0)