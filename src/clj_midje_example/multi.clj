(ns clj-midje-example.multi)

(defmulti times-2 class)

(defmethod times-2 String [a]
  (apply str (repeat 2 a)))

(defmethod times-2 clojure.lang.PersistentVector [a]
  (vec (repeat 2 a)))

(defmethod times-2 :default [a]
  (* 2 a))