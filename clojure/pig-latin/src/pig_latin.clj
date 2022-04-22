(ns pig-latin
  (:require [clojure.string :as str]))

(defn- rule1 [w]
  (when
    (re-find #"^[aeiou]|xr|yt" w) (str w "ay")))

(defn- rule2 [w]
  (when-let
   [match (re-find #"^thr?|s?ch|.?qu|[bcdfgjklmnpqrstvwxyz]" w)]
    (str (subs w (count match)) match "ay")))

(defn translate [phrase]
  (->> (str/split phrase #" ")
      (map #(or (rule1 %) (rule2 %)))
      (str/join " ")))