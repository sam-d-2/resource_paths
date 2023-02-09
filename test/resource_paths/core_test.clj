(ns resource-paths.core-test
  (:require [clojure.test :refer :all]
            [resource-paths.core :refer :all]))


                                        ; Resource match
                                        ;resources/public/main.css
; dirmatch "public/*.css" matches 
(deftest match-directories
  (testing "Directory match"
    (is (=  #{"public/main.css"}
            (resource-match #{"public/*.css"})))))
