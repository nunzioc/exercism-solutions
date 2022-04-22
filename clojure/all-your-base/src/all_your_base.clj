(ns all-your-base
  (:require [clojure.string :as str]))

(defn exp [x n]
  (if (zero? n) 1
      (* x (exp x (dec n)))))

(defn convertToBase [num base]
  (if (= num 0)
    nil
    (cons (rem num base) (convertToBase (unchecked-divide-int num base) base))))

(defn convert [startBase nums endBase]
  (cond
    (not-every? (comp not neg?) nums) nil
    (not-every? #(< % startBase) nums) nil
    (not (pos? startBase)) nil
    (= 1 startBase) nil
    (not (pos? endBase)) nil
    (= 1 endBase) nil
    (= nums ()) nil
    :else (let [vals
                (for [[i n] (map-indexed vector (reverse nums))]
                  (* n (exp startBase i)))]
            (if (every? zero? vals) '(0)
                (reverse (convertToBase (reduce + vals) endBase))))))
