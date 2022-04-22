(ns rotational-cipher
  (:require [clojure.string :as str]))

(defn convert [c n]
  (if (not (Character/isLetter c))
    c
    (let [conversionNum (if (Character/isUpperCase c) 65 97)]
      (char (+ (mod (+ (- (int c) conversionNum) n) 26) conversionNum)))))

(defn rotate [text num]
  (str/join "" (map #(convert % num) text)))