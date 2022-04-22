(ns atbash-cipher
  (:require [clojure.string :as str]))

(def alphabet "abcdefghijklmnopqrstuvwxyz")
(defn cipher [char]
  (if (str/includes? alphabet (str char)) 
    (nth (reverse alphabet) (str/index-of alphabet char))
    char))

(defn encode [string]
  (->> string
       (str/lower-case)
       (re-seq #"\w")
       (map cipher)
       (partition-all 5)
       (map str/join)
       (str/join " ")))