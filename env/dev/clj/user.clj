(ns user
  (:require [luminus-migrations.core :as migrations]
            [huodong.config :refer [env]]
            [mount.core :as mount]
            [huodong.core :refer [start-app]]))

(defn start []
  (mount/start-without #'huodong.core/repl-server))

(defn stop []
  (mount/stop-except #'huodong.core/repl-server))

(defn restart []
  (stop)
  (start))

(defn reset-db []
  (migrations/migrate ["reset"] {:database-url (:config-database-url env)}))

(defn migrate []
  (migrations/migrate ["migrate"] (select-keys env [:database-url])))

(defn rollback []
  (migrations/migrate ["rollback"] (select-keys env [:database-url])))

(defn create-migration [name]
  (migrations/create name (select-keys env [:database-url])))


