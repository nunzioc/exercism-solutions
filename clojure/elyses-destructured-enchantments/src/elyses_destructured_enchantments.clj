(ns elyses-destructured-enchantments)
(def deck [0 1 2 3 4])
(defn first-card
  "Returns the first card from deck."
  [[first]]
  first)
(first-card deck)

(defn second-card
  "Returns the second card from deck."
  [[_ second]]
  second
)

(defn swap-top-two-cards
  "Returns the deck with first two items reversed."
  [[first second & rest]]
  (concat [second first] rest)
)

(defn discard-top-card
  "Returns a vector containing the first card and
   a vector of the remaining cards in the deck."
  [[first & rest]]
  [first rest]
)

(def face-cards
  ["jack" "queen" "king"])

(defn insert-face-cards
  "Returns the deck with face cards between its head and tail."
  [[first & rest]]
  (if (nil? first)
    face-cards
    (concat [first] face-cards rest)))