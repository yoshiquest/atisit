(defproject atisit "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/core.async "0.2.374"]
                 [seesaw "1.4.5"]]
  :main ^:skip-aot atisit.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
