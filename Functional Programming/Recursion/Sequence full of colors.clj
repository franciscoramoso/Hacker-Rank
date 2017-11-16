(def T (Integer/parseInt (read-line)))

(defn doit [i t]
    (if (not= i t) 
    	(do (def line (read-line))
			(def mapF (frequencies line)) 
			        
            (def rG (clojure.string/replace line #"Y|B" ""))
            (def yB (clojure.string/replace line #"R|G" ""))

			(defn c1-c2 [mapF] 
				(and 
                (= (mapF \R) (mapF \G))
				(= (mapF \Y) (mapF \B))))

            (defn c3-c4 [s]	
            	(if (empty? s)
            		(do true)
            		(do (if (odd? (count s))
            				(do false)
            				(do (defn check [st]
									(defn truecheck [i]
										(if (< (inc i) (count st))
											(do (if (not= (nth st i) (nth st (inc i)))
												(truecheck (+ i 2))
												false))
											(do true)))
									(truecheck 0))
									(check s))))))

			(if (and (c1-c2 mapF) (c3-c4 rG) (c3-c4 yB))
			    (println "True")
			    (println "False"))

		        (doit (inc i) t))))
(doit 0 T)