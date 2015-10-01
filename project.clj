(defproject algorithms "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.nrepl "0.2.5"]
                 ]
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :main ^:skip-aot algorithms.core
  :target-path "target/%s"
  :plugins [[cider/cider-nrepl "0.7.0"]]
  :profiles {:uberjar {:aot :all}})
