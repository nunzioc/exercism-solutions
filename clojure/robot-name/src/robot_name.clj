(ns robot-name)

(def robot-names (atom #{}))

(defn rand-char []
  (char (+ 65 (rand-int 26))))

(defn gen-name []
  (str (rand-char) (rand-char) (format "%03d" (rand-int 1000))))

(defn robot [] 
  (let [name (gen-name)]
    (if (contains? @robot-names name)
      (robot)
      (do 
        (swap! robot-names conj name)
        (atom {:name name})))))

(defn robot-name [r]
  (when (nil? (@r :name))
    (swap! r assoc :name (@(robot) :name)))
  (@r :name))

(defn reset-name [r] 
  (swap! r assoc :name nil)
  r)