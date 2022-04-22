(ns bob
  (:require [clojure.string :as str]))

(defn- question? [s]
  (some? (re-find #"\?\s*$" s)))

(defn- yelling? [s]
  (and
   (some? (re-find #"[A-Z]{2,}" s))
   (nil? (re-find #"[a-z]" s))))

(defn response-for [s]
  (cond
    (and (question? s) (yelling? s)) "Calm down, I know what I'm doing!"
    (question? s) "Sure."
    (yelling? s) "Whoa, chill out!"
    (str/blank? s) "Fine. Be that way!"
    :else "Whatever."))