(fn [lst]
(map #(max % (- %)) lst))