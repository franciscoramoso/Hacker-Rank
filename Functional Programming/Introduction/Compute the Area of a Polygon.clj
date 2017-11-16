(def n (Integer/parseInt (read-line)))

(defn area [rec]
	(def points (conj rec (last rec)))
	(defn this [a b c d] (- (* a d) (* b c)))
	(defn the-sum [i acc]
		(if (= i (count rec))
			(do acc)
			(do (the-sum (inc i) (+ acc 
				(this (nth (nth points i) 0) (nth (nth points i) 1) 
					(nth (nth points (inc i)) 0) (nth (nth points (inc i)) 1)))))))
	(Math/abs (/ (the-sum 0 0.0) 2)))

(defn make-figure [y]
	(defn the-figure [x lst]
		(if (= x y)
			(do lst)
			(do (def v (map #(Integer/parseInt %) (vec (re-seq #"\d+" (read-line)))))
				(the-figure (inc x) (conj lst v)))))
   (the-figure 0 '()) )
		       
(print (area (make-figure n)))