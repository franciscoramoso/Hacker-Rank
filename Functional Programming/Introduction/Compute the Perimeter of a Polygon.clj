(def n (Integer/parseInt (read-line)))

(defn make-figure [y]
	(defn the-figure [x lst]
		(if (= x y)
			(do lst)
			(do (def v (map #(Integer/parseInt %) (vec (re-seq #"\d+" (read-line)))))
				(the-figure (inc x) (conj lst v)))))
		(the-figure 0 '()))

(defn perimetro [rec]
	(def points (conj rec (last rec)))
	(defn distance [a b c d] (Math/sqrt (+ (Math/pow (Math/abs (- b d)) 2) (Math/pow (Math/abs (- a c)) 2))))
	(defn the-sum [i acc]
		(if (= i (count rec))
			(do acc)
			(do (the-sum (inc i) (+ acc 
				(distance (nth (nth points i) 0) (nth (nth points i) 1) 
					(nth (nth points (inc i)) 0) (nth (nth points (inc i)) 1)))))))
	(the-sum 0 0))


(print (perimetro (make-figure n)))