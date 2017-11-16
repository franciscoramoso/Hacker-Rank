(let [[a b] (map read-string (re-seq #"\d+" (read-line)))] ;le la linea y la pasa a A y B

(defn gcd [x y]
	(if (= x y) 
	    (do x) 
	    (do (if (and (> x y) (not= x y))	    		
		        (do (gcd (- x y) y))
		        (do (gcd x (- y x)))))))

(print (gcd a b)))
