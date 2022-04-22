(ns atbash-cipher
  (:require [clojure.string :as str]))

(def alphabet "abcdefghijklmnopqrstuvwxyz")
(defn cipher [char]
  (if (str/includes? alphabet (str char)) 
    (nth (reverse alphabet) (str/index-of alphabet char))
    char))

(defn encode [string]
  (str/join " " (map str/join (partition-all 5 (map cipher (re-seq #"\w" (str/lower-case string)))))))