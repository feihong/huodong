(ns huodong.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[huodong started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[huodong has shut down successfully]=-"))
   :middleware identity})
