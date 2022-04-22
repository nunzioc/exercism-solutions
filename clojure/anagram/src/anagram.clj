(ns anagram
  (:require [clojure.string :as str]))

(defn anagram? [word1 word2]
  (let [[w1 w2] (map str/lower-case [word1 word2])]
    (and
     (not= w1 w2)
     (= (sort w1) (sort w2)))))

(defn anagrams-for [word prospect-list]
  (filter #(anagram? % word) prospect-list))