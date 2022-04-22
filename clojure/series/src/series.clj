(ns series)

(defn slices [string length]
  (if (zero? length) [""]
    (for [end (range length (inc (count string)))
         :let [begin (- end length)]]
     (subs string begin end))))
