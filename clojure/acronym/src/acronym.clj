(ns acronym
  (:require [clojure.string :as str]))

(defn acronym [string]
  ((comp str/upper-case str/join)
   (re-seq #"(?<=[ -])\w|(?<![A-Z])[A-Z]" string)))