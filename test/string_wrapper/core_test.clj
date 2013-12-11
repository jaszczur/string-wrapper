(ns string-wrapper.core-test
  (:require [clojure.test :refer :all]
            [string-wrapper.core :refer :all]))

(defn wrap-string [s width]
  "")

(defn assert-wrapped [s width expected]
  (is (= expected (wrap-string s width))))

(deftest a-test
  (testing "null"
    (assert-wrapped nil 1 "")))
