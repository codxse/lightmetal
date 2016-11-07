(ns lightmetal.index
  (:require [reagent.core :as reagent]))

(enable-console-print!)

(def index-state (reagent/atom {:text "Hello world! from index"}))

(defn -main []
  [:div.container
   [:h1 (@index-state :text)]])

(reagent/render
  [-main]
  (js/document.getElementById "index-app"))