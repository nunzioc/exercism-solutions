(ns strain)

(defn retain [pred seq]
  (reduce (fn [acc val]
            (if (pred val) (conj acc val) acc))
          [] seq))
(retain even? [1 2 3])

(defn discard [pred seq]
  (reduce (fn [acc val]
            (if (not (pred val)) (conj acc val) acc))
          [] seq))
