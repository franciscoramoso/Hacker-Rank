(require '[clojure.string :as str])
(def B (map #(Integer/parseInt %) (str/split (read-line) #" ")))
(def E (map #(Integer/parseInt %) (str/split (read-line) #" ")))
(def L (map #(Integer/parseInt %) (str/split (read-line) #" ")))
(def nums (range (first L) (last L) 0.001))
(defn f [x]
    (defn truef [y]
	   (map  #(* %1 (Math/pow y %2)) B E))
    (reduce + (vec (truef x))))
       
(def f-interval (vec (map #(f %) nums)))

(def area (reduce + f-interval))
(def volumen (* Math/PI (reduce + (vec (map #(Math/pow % 2) f-interval)))))

(printf "%.2f"(/ area 1000))
(println)
(printf "%.2f"(/ volumen 1000))
(println)



