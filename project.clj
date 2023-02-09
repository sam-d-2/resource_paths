(defproject resource-paths "0.1.0-SNAPSHOT"
  :description "Get all the resource paths that match a regex."
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :main resource_paths.core
  :aot [resource_paths.core]
  :target-path "target/%s")
