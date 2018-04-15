(ns rest-da-jujuba.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [clojure.string :as string]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defroutes app-routes
  (GET "/" [] "Hello World")
  (GET "/hello/:nome" [nome]
       (str "Hello " (string/capitalize nome)))
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))



(def juju "julia")
(defn dani [camilla zalba]
  "dani = camilla + zalba"
  (if (> camilla zalba)
    (+ camilla zalba)
    juju))
