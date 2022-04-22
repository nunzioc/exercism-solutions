(ns etl
  (:require [clojure.string :as str]))

(defn transform [source]
  (into {}
        (for [score (keys source)
              letter (get source score)]
                [(str/lower-case letter) score])))

