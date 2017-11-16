(defn my-count [lista]
	(defn the-count [x lst]
		(if (empty? lst)
			x
			(the-count (inc x) (rest lst))))
	(the-count 0 lista))
