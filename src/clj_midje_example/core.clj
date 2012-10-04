(ns clj-midje-example.core)

(defn times-2 [a]
  (cond
    (= (type a) java.lang.Long) (* 2 a)
    (= (type a) clojure.lang.PersistentVector) (vec (repeat 2 a))
    (= (type a) java.lang.String) (apply str (repeat 2 a))))