(ns space-age)


(def seconds-in-year 31557600)

(defn on-mercury [s]
  (/ s (* seconds-in-year 0.2408467)))

(defn on-venus [s]
  (/ s (* seconds-in-year 0.61519726)))

(defn on-earth [s]
  (/ s seconds-in-year))

(defn on-mars [s] 
 (/ s (* seconds-in-year  1.8808158)))

(defn on-jupiter [s] 
 (/ s (* seconds-in-year 11.862615)))

(defn on-saturn [s] 
 (/ s (* seconds-in-year 29.447498)))

(defn on-uranus [s] 
 (/ s (* seconds-in-year 84.016846)))

(defn on-neptune [s] 
 (/ s (* seconds-in-year 164.79132)))
