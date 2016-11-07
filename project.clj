(defproject lightmetal "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.293"]
                 [reagent "0.6.0"]]
  :plugins [[lein-cljsbuild "1.1.4"]
            [lein-figwheel "0.5.8"]]
  :cljsbuild {:builds [{:id "dev"
                        :source-paths ["src/cljs"]
                        :figwheel false
                        ;; compailer option read here
                        ;; https://github.com/clojure/clojurescript/wiki/Compiler-Options
                        :compiler {:optimizations :none
                                   :output-to "resources/public/js/app.js"
                                   :output-dir "resources/public/js/dev/"
                                   :pretty-print true
                                   :source-map-timestamp true}}
                       {:id "prod"
                        :source-paths ["src/cljs"]
                        :compiler {:optimizations :advanced
                                   :output-to "resources/public/js/app.js"
                                   :output-dir "target"
                                   :pretty-print false
                                   :source-map-timestamp true}}]})
