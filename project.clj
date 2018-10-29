(defproject rc18.workshop "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.10.0-beta4"]
                 [org.clojure/clojurescript "1.10.339"]
                 [reagent "0.8.1"]
                 [com.bhauman/figwheel-main "0.1.9"]
                 [nightlight "RELEASE"]]

  :source-paths ["src" "resources"]

  :aliases {"server" ["run" "-m" "figwheel.main" "-b" "dev" "-r"]
            "ide"    ["run" "-m" "nightlight.core" "--url" "http://localhost:3000"]})
