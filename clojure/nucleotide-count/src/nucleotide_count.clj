(ns nucleotide-count)

(defn count-of-nucleotide-in-strand [nucleotide strand]
  {:pre [(contains? #{\A \T \C \G} nucleotide)]}
  (count (filter #(= % nucleotide) strand)))

(defn nucleotide-counts [strand]
  (merge {\A 0, \T 0, \C 0, \G 0} (frequencies strand)))