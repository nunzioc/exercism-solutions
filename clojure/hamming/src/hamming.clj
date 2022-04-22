(ns hamming)

(defn distance [s1 s2] 
  (when (= (count s1) (count s2))
    (count (filter true? (map not= s1 s2)))))