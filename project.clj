(defproject workflo/conformity "0.4.1-SNAPSHOT"
  :description "An experimental fork of https://github.com/rkneufeld/conformity with minor modifications."
  :url "http://github.com/workfloapp/conformity"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.5.1"]
                                  [com.datomic/datomic-free "0.9.4815.12"]
                                  [org.clojure/tools.namespace "0.2.3"]]
                   :source-paths ["dev"]}})
