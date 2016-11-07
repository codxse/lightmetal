(defproject lightmetal "0.1.0-SNAPSHOT"
  :description "Biolerplate for clojure as backend server and clojurescript as frontend"
  :url "https://github.com/codxse/lightmetal"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths ["src/clj"]
  :main lightmetal.core
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/core.async "0.2.395"]
                 [org.clojure/clojurescript "1.9.293"]
                 [reagent "0.6.0"]]
  :plugins [[lein-cljsbuild "1.1.4"]
            [lein-figwheel "0.5.8"]]
  ;; Figwheel server side configuration
  ;; https://github.com/bhauman/lein-figwheel#figwheel-server-side-configuration
  :figwheel {:css-dirs ["resources/public/css"]
             :ring-handler lightmetal.core/handler}
  :cljsbuild {:builds [{:id "dev"
                        :source-paths ["src/cljs"]
                        :figwheel true
                        ;; compailer option read here
                        ;; https://github.com/clojure/clojurescript/wiki/Compiler-Options
                        :compiler {:optimizations :none
                                   :source-map true
                                   :output-to "resources/public/js/app.js"
                                   :output-dir "resources/public/js/dev/"
                                   :pretty-print true}}
                       {:id "prod"
                        :source-paths ["src/cljs"]
                        :compiler {:optimizations :advanced
                                   :output-to "resources/public/js/app.js"
                                   :output-dir "target"
                                   :pretty-print false}}]})


