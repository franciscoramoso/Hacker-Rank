 (fn [num lst]
 (mapcat list* (map #(repeat num %) lst)))
 