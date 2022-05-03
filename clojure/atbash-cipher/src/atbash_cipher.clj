(ns atbash-cipher
  (:require [clojure.string :as str]))

(def alphabet "abcdefghijklmnopqrstuvwxyz")
(defn cipher [char]
  (if (str/includes? alphabet (str char)) 
    (nth (reverse alphabet) (str/index-of alphabet char))
    char))

(defn encode [string]
<<<<<<< HEAD
  (->> string
       (str/lower-case)
       (re-seq #"\w")
       (map cipher)
       (partition-all 5)
       (map str/join)
       (str/join " ")))
=======
  (str/join " " (map str/join (partition-all 5 (map cipher (re-seq #"\w" (str/lower-case string)))))))
>>>>>>> 8f817ca (atbash)
