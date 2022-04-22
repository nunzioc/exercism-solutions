(ns interest-is-interesting)

(defn interest-rate
  "The interest rate based on current balance"
  [balance]
  (condp > balance
    0 -3.213
    1000 0.5
    5000 1.621
    2.475))

(defn abs [n] (if (neg? n) (- n) n))

(defn annual-balance-update
  "TODO: add docstring"
  [balance]
  (+ balance (* (abs balance) 0.01M (bigdec (interest-rate balance)))))

(defn amount-to-donate
  "TODO: add docstring"
  [balance tax-free-percentage]
  (def balance 550.25)
  (def tax-free-percentage 2.5)
  (if (pos? balance)
    (int (* balance 0.01 tax-free-percentage 2))
    0))