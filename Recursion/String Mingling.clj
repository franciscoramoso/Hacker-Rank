(def a (read-line))
(def b (read-line))

(defn zip [n]
	(if (= n (count a))
		(do "")
		(do (print (get a n))
			(print (get b n) )
			(zip (inc n)))))
(zip 0)