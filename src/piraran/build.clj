(ns piraran.build
  (:require [clojure.java.io :as io]
            [hiccup2.core :as h]
            [piraran.views.press :as press-page]))

(defn compile-press-page [lang]
  (let [html-content (h/html (press-page/main {:lang lang}))]
    #_(io/make-parents "dist/press.html")
    ;; FIXME spit to dist
    (spit (format "press-%s.html" (name lang))
          html-content)))

(defn -main []
  (compile-press-page :en)
  (compile-press-page :es))
