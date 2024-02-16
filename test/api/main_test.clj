(ns api.main-test
  (:require [clojure.test :as t]
            [api.core :as core]))

(t/deftest hello
  (t/testing "math works"
    (t/is (= 2 (+ 1 1)))))
