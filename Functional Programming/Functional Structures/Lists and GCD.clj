(def T (Integer/parseInt (read-line)))

(defn biglist []
	(defn this [X Y]
		(if (< (nth X 1) (nth Y 1))
			(list (nth X 0) (nth X 1))
			(list (nth X 0) (nth Y 1))))

	(defn AB [lst1 lst2]
		(for [a lst1 b lst2
			  :when
			  (= (nth a 0) (nth b 0))]
			   (this a b) ))
                    
	(defn big [i t lista lista2]
		(if (= i t)
			(do lista2)
			(do (def lst (partition 2 (map #(Integer/parseInt %) (re-seq #"\d+" (read-line)))))                
                (if (empty? lista2)
                    (do (def lst2 lst))
                    (do (def lst2 (AB lista2 lst))))
                    
				(if (> (count lst) 2)
				    (big (inc i) t (conj lista lst) lst2) 
				    (big (inc i) t (conj lista lst) lst2)))))                    
	(big 0 T '() '()))
    
(def ab (biglist))

(apply println (mapcat list* ab))





