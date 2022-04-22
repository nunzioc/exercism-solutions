(ns pangram
  (:require [clojure.string :as str])
  (:require [clojure.set :as set]))

(defn pangram? [word]
  (set/subset? (set "abcdefghijklmnopqrstuvqxyz") (set (str/lower-case word))))