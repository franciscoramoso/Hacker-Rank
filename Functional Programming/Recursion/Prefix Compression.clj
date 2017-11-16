(def a (read-line))
(def b (read-line))

(defn printS [n s] (if (not= (get s n) nil)
		(do (print (get s n))
			(printS (inc n) s))))

(defn repnum [n] (if (and (= (get a n) (get b n)) (not= (get a n) nil))
			(do (inc (repnum (inc n))))
			(do 0)))

(if (= a b) 
	(do (print (count a) "") (println a)
	    (println 0)
	    (println 0))

	(do	(def n (repnum 0))
		(print n "") (dotimes [i n] (print (get a i))) (println)
		(print (- (count a) n) "") (printS n a) (println)
		(print (- (count b) n) "") (printS n b) (println)))



