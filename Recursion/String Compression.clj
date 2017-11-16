(def line (read-line))

(defn string-compress [s]
	(defn tha-shit [n i]
		(if (> (+ n 2) (count s))
			(do (if (not= i 1)
					(do (print (nth s n)) (print i))
					(do (print (nth s n)))))
			(do (if (= (nth s n) (nth s (inc n)))
					(do (tha-shit (inc n) (inc i)))
					(do (if (not= i 1)
							(do (print (nth s n)) (print i))
							(do (print (nth s n))))
						(tha-shit (inc n) 1))))))
	(tha-shit 0 1))

(string-compress line)
