(ns clj-midje-example.core-test-2
  (:use midje.sweet
        clj-midje-example.multi))

(unfinished get-user-info)

(fact 
  (times-2 2) => 4)

(fact 
  (times-2 [1 2]) => [[1 2] [1 2]])

(fact 
  (times-2 "123") => "123123")

(fact
  (times-2 (get-user-info)) => 6
  (provided (get-user-info) => 3))

(facts
  (times-2 2) => 4
  (times-2 [1 2]) => [[1 2] [1 2]]
  (times-2 "123") => "123123"
  (times-2 (get-user-info)) => 6
  (provided (get-user-info) => 3))