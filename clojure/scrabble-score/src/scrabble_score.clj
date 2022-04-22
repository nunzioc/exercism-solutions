(ns scrabble-score
  (:require [clojure.string :as str]))

(defn score-letter [letter]
  (condp str/includes? (str/lower-case letter)
    "aeioulnrst" 1
    "dg" 2
    "bcmp" 3
    "fhvwy" 4
    "k" 5
    "jx" 8
    "qz" 10))

(defn score-word [word]
  (reduce + (map score-letter word)))