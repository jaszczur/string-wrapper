(ns string-wrapper.core-test
  (:require [clojure.test :refer :all]
            [string-wrapper.core :refer :all]))

(defn wrap-string [s width]
  (if (empty? s)
    ""
    (interpose \n s)))

(defn assert-wrapped [s width expected]
  (is (= expected (wrap-string s width))))

(deftest a-test
  (testing "null"
    (assert-wrapped nil 1 ""))
  (testing "empty string"
    (assert-wrapped "" 1 ""))
  (testing "one char"
    (assert-wrapped "x" 1 "x"))

  (testing "two chars"
    (assert-wrapped "xx" 1 "x\nx")))

