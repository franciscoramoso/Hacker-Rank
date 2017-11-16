(def T (Integer/parseInt (read-line)))

(defn doit [i t]
	(if (not= i t)
		(do (def k (last (map #(Integer/parseInt %) (vec (re-seq #"\d+" (read-line))))))
			(def line (map #(Integer/parseInt %) (vec (re-seq #"\d+" (read-line)))))

			(def lstD (distinct line))
			(def mapF (frequencies line))   

			(def final (remove #(< (mapF %) k) lstD))

			(if (empty? final) 
				(println -1)
				(apply println final))
			(doit (inc i) t))))

(doit 0 T)