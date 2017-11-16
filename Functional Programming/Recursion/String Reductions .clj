(def a (read-line))
(def b (distinct a))

(defn doit [i]
	(if (not= i (count b))
			(do (print (nth b i))
				(doit (inc i)))))
(doit 0)
