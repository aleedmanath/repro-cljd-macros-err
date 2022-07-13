# cljd macro error testing

Run
```
clj -M -m cljd.build watch
```

By default ClojureDart does not print full compiler exception.
But here is what is the error that pops up when that is changed locally:

```clj
error {
 :cause Invalid token: ::spec/example
 :via
 [{:type clojure.lang.ExceptionInfo
   :message Error while host-compiling (ns example.main (:require [example.macros-shim :as m]) (:host-ns (:require [example.macros :as m])))
   :data #:cljd.compiler{:emit-stack [(ns example.main (:require [example.macros-shim :as m]) (:host-ns (:require [example.macros :as m])))]}
   :at [cljd.compiler$host_eval invokeStatic compiler.cljc 2905]}
  {:type clojure.lang.Compiler$CompilerException
   :message Syntax error reading source at (example/macros.clj:7:41).
   :data #:clojure.error{:phase :read-source, :line 7, :column 41, :source example/macros.clj}
   :at [clojure.lang.Compiler load Compiler.java 7643]}
  {:type java.lang.RuntimeException
   :message Invalid token: ::spec/example
   :at [clojure.lang.Util runtimeException Util.java 221]}]
```
