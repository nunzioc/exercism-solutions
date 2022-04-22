(ns triangle)

(defn is-valid? [a b c]
  (and 
   (> (+ a b c) 0)
   (>= (+ a b) c)
   (>= (+ b c) a)
   (>= (+ c a) b)))

(defn equilateral? [a b c]
 (and (is-valid? a b c) (= a b c)))

(defn isosceles? [a b c]
  (and
   (is-valid? a b c)
   (not (distinct? a b c))))

(defn scalene? [a b c]
  (and (is-valid? a b c) (distinct? a b c)))