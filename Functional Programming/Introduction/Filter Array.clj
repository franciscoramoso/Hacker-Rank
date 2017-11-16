 (fn[n lst]
   (remove #(> % (dec n)) lst))
