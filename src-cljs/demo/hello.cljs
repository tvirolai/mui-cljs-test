(ns demo.hello
  (:require [reagent-material-ui.icons.sentiment-very-satisfied :refer [sentiment-very-satisfied]]
            [reagent.core :as reagent]))

(defn foo []
  "Howdy")

(defn basic-element []
  (reagent/create-element
   (reagent/reactify-component (fn []
                                 [:div
                                  [:h2 "Foo"]]))
   #js{}))

(defn test-element []
  (reagent/create-element
   (reagent/reactify-component (fn []
                                 [:div
                                  [:h2 "Kikka"
                                   [sentiment-very-satisfied]]]))
   #js{}))
