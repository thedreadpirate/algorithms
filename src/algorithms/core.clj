(ns algorithms.core
  (:require
    [cider.nrepl :refer (cider-nrepl-handler)]
    [clojure.tools.nrepl.server :as nrepl-server])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (nrepl-server/start-server :port 7888 :handler cider-nrepl-handler)
  (println "Hello, World!"))
