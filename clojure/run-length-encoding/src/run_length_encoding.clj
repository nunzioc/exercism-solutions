(ns run-length-encoding)


(defn run-length-encode
  "encodes a string with run-length-encoding"
  [plain-text]
  (->> plain-text
       (partition-by identity)
       (map (juxt count first))
       (flatten)
       (filter (partial not= 1))
       (apply str)))

(defn run-length-decode
  "decodes a run-length-encoded string"
  [cipher-text]
  (->> cipher-text
       (partition-by #(if (Character/isDigit %) true %))
       (map #(if (Character/isDigit (first %)) (Integer/parseInt (apply str %)) (first %)) )
  (reduce #(if (number? (first %1)) (cons (repeat (first %1) %2) (rest %1)) (cons %2 %1)) [])
       (reverse)
       (flatten)
       (apply str)))
