(ns api.core
  (:require [clojure.pprint :as pp]))

(defn main [opts]
  (pp/pprint opts)
  (println "Hello, World!"))

(main {:name "John Doe"})
