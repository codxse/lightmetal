(ns lightmetal.intro
  (:require [reagent.core :as reagent]))

(enable-console-print!)

(def intro-state (reagent/atom {:text "Hello world! from intro"}))

(defn -main []
  [:div.contaner
   [:h1 (@intro-state :text)]])

(reagent/render
  [-main]
  (js/document.getElementById "intro-app"))