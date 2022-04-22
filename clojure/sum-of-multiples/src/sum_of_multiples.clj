(ns sum-of-multiples)

(defn multiples [n m]
  (filterv #(= (mod % m) 0) (range n)))

(defn sum-of-multiples [multiple-list num]
  (reduce + (set (mapcat (partial multiples num) multiple-list))))