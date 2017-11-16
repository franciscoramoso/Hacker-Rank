(def x (Integer/parseInt (read-line)))

(defn fibonacci [x]
	(if (and (not= x 0) (not= x 1))
		(do (+ (fibonacci (dec x )) (fibonacci (- x 2))))
		(do x)))
(print (fibonacci (dec x)))