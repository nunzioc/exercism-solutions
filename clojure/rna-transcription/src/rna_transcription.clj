(ns rna-transcription
  (:require [clojure.string :as str]))

(defn to-rna [dna]
  {:post [(= (count %) (count dna))]}
  (str/join (map {\G \C, \C \G, \T \A, \A \U} dna)))