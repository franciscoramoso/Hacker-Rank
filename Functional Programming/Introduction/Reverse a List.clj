(defn my-reverse [lista]
	(defn the-reverse [lst lst2]
		(if (empty? lst2)
		lst
		(the-reverse (conj lst (first lst2)) (rest lst2))))
	(the-reverse '() lista))