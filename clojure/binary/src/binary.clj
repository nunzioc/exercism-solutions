(ns binary
  (:require [clojure.string :as str]))

(defn to-decimal [s]
  (if (re-find #"[^01]" s) 0
      (->> (seq s)
           (reverse)
           (map-indexed #(* (Character/digit %2 10) (Math/pow 2 (double %1))))
           (reduce +)
           (int))))