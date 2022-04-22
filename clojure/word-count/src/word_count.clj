(ns word-count
  (:require [clojure.string :as str]))

(defn word-count [s]
  (frequencies (re-seq #"\b\w+\b" (str/lower-case s))))

