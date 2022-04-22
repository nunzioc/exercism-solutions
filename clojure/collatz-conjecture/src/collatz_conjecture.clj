(ns collatz-conjecture)


(defn- collatz-loop [num steps]
  (cond
    (= 1 num) steps
    (even? num) (collatz-loop (/ num 2) (inc steps))
    (odd? num) (collatz-loop (+ 1 (* 3 num)) (inc steps))))

(defn collatz [num]
  (collatz-loop num 0))