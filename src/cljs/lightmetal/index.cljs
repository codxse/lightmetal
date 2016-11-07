(ns lightmetal.index
  (:require [reagent.core :as reagent]))

(enable-console-print!)

(def app-state (reagent/atom {:text "Hello world! from index"}))

(defn -main []
  [:div.container
   [:h1 (@app-state :text)]])

(reagent/render
  [-main]
  (js/document.getElementById "app"))