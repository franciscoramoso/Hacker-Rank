(use '[clojure.string :only (split triml)])

(
        let [
          n_t (read-line) 
          n (Integer/parseInt n_t) 
        ]

      (
        loop [a0 n]
        (when (> a0 0)

          (
            let [
              x_t (read-line) 
              x (Float/parseFloat x_t) 
            ]


	;///////////////// la funcion
           (defn expansion-of-e [y]
			(defn the-sum [i acc]
				(if (= i 9)
					acc
					(the-sum (inc i) (+ acc (/ (Math/pow y (+ i 1)) (reduce * (range 1 (inc (+ i 1)))))))))
			(the-sum 0 1))

			(printf "%.4f" (expansion-of-e x))
			(println)
	;/////////////////


          )

        (recur (- a0 1) ) )
      )

)
