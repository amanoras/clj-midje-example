(defproject clj-midje-example "0.1.0-SNAPSHOT"
  :description "An example of using Midje for unit testing."
  :url "https://github.com/amanoras/clj-midje-example"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]]
  :profiles {
  	:dev {
  	  :dependencies [[midje "1.4.0"]]
  	  :plugins [[lein-midje "2.0.0-SNAPSHOT"]]}})
