(ns roman-numerals
  (:require [clojure.string :as str]))


(defn ones [num]
  (condp = (mod num 10)
    1 "I"
    2 "II"
    3 "III"
    4 "IV"
    5 "V"
    6 "VI"
    7 "VII"
    8 "VIII"
    9 "IX"
    ""))

(defn tens [num]
  (condp = (mod (quot num 10) 10)
    1 "X"
    2 "XX"
    3 "XXX"
    4 "XL"
    5 "L"
    6 "LX"
    7 "LXX"
    8 "LXXX"
    9 "XC"
    ""))

(defn hundreds [num]
  (condp = (mod (quot num 100) 10)
    1 "C"
    2 "CC"
    3 "CCC"
    4 "CD"
    5 "D"
    6 "DC"
    7 "DCC"
    8 "DCCC"
    9 "CM"
    ""))

(defn thousands [num]
  (condp = (mod (quot num 1000) 10)
    1 "M"
    2 "MM"
    3 "MMM"
    ""))

(defn numerals [num]
  (str/join ((juxt thousands hundreds tens ones) num)))
