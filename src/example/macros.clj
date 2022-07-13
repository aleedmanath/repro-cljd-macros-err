(ns example.macros
  (:require [example.macro-specs :as spec]))

;; (s/def ::example string?)

(defn example [s]
  (let [s (spec/conform s ::spec/example)]
    (println s)
   `(identity (str "example:" ~s))))
