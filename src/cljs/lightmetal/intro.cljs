(ns lightmetal.intro
  (:require [reagent.core :as reagent]))

(enable-console-print!)

(def app-state (reagent/atom {:text "Hello world! from intro"}))

(defn -main []
  [:div.contaner
   [:h1 (@app-state :text)]])

(reagent/render
  [-main]
  (js/document.getElementById "app"))