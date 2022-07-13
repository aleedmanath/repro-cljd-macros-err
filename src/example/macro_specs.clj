(ns example.macro-specs
  (:require [clojure.spec.alpha :as s]))

(s/def ::example string?)

(defn conform
  [input spec-key]
  (let [ret (s/conform spec-key input)]
    (if (= ret :clojure.spec.alpha/invalid)
      (throw (ex-info "Cannot conform declaration." (s/explain-data spec-key input)))
      ret)))
