(def T (Integer/parseInt (read-line)))
(dotimes [i T]
	(def n (Integer/parseInt (read-line)))

	(defn make-lists [y]
		(defn the-lists [x lst1 lst2]
			(if (= x y)
				(do (list lst1 lst2))
				(do (def v (map #(Integer/parseInt %) (vec (re-seq #"\d+" (read-line)))))
					(the-lists (inc x) (conj lst1 (nth v 0)) (conj lst2 (nth v 1))))))
	   (the-lists 0 '() '()))

	(def listas (make-lists n))
	(if (= (count (nth listas 1)) (count (distinct (nth listas 0))))
	(do (println "YES"))
	(do (println "NO"))))