(ns accumulate)

(defn accumulate [op coll]
  (if-let [val (first coll)]
    (cons (op val) (accumulate op (rest coll)))
    coll))