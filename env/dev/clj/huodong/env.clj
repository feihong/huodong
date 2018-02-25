(ns huodong.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [huodong.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[huodong started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[huodong has shut down successfully]=-"))
   :middleware wrap-dev})
