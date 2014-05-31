(defproject viebel-game "0.1.0-SNAPSHOT"
  
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2202"]
                 [org.clojure/google-closure-library "0.0-20130212-95c19e7f0f5f"];why?
                 [im.chit/purnam "0.4.3"]
                 [im.chit/gyr "0.3.1"]
                 [org.clojure/core.async "0.1.267.0-0d7780-alpha"]]

  :plugins [[lein-cljsbuild "1.0.3"]]

  :source-paths ["src"]

  :cljsbuild { 
    :builds [{:id "viebel-game"
              :source-paths ["src"]
              :compiler {
                :output-to "viebel_game.js"
                :output-dir "out"
                :optimizations :none}}]})