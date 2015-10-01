(ns algorithms.insertionsort)

(def to-sort [19 6 2 1 9 10 12 0 2 45 1])
(def to-sort-l '(19 6 2 1 9 10 12 0 2 45 1))

(defn sort [target]
  (sort-acc target []))

(defn sort-acc [target acc]
  (if (seq target)
    (sort-acc (rest target) (sorted-insert acc (first target)))
    acc))

(defn sorted-insert [list to-add]
  (let [[lo hi] (split-with (partial > to-add) list)]
    (concat lo [to-add] hi)))