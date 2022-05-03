(ns beer-song
  (:require [clojure.string :as str]))

(defn verse
  "Returns the nth verse of the song."
  [n]
  (condp = n
    0 (str "No more bottles of beer on the wall, no more bottles of beer.\n"
           "Go to the store and buy some more, 99 bottles of beer on the wall.\n")
    1 (str "1 bottle of beer on the wall, 1 bottle of beer.\n"
           "Take it down and pass it around, no more bottles of beer on the wall.\n")
    (str n  " bottles of beer on the wall, " n " bottles of beer.\n"
         "Take one down and pass it around, "
         (dec n) (if (= (dec n) 1) " bottle" " bottles") 
         " of beer on the wall.\n")))

(defn sing
  "Given a start and an optional end, returns all verses in this interval. If
  end is not given, the whole song from start is sung."
  ([start] (sing start 0))
  ([start end] (str/join "\n" (map verse (reverse (range end (inc start)))))))