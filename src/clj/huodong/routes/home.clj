(ns huodong.routes.home
  (:require [huodong.layout :as layout]
            [compojure.core :refer [defroutes GET]]
            [ring.util.http-response :as response]
            [clojure.java.io :as io]))

(defn home-page []
  (layout/render "home.html"))

(defn login-page []
  (layout/render "login.html"))

(defn about-page []
  (layout/render "about.html"))

(defn events-page []
  (layout/render "events.html"))

(defroutes home-routes
  (GET "/" [] (home-page))
  (GET "/login" [] (login-page))
  (GET "/about" [] (about-page))
  (GET "/events" [] (events-page)))
