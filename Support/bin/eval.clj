#!/usr/bin/env cake eval-file
(require '[clojure.java.io :as io])
(load-file (str (io/file (cake/*env* "TM_BUNDLE_SUPPORT") "utils.clj")))
(in-ns 'textmate)
(display-last-eval (get-selected-sexprs))
