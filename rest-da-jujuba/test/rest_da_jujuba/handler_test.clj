(ns rest-da-jujuba.handler-test
  (:require [clojure.test :refer :all]
            [ring.mock.request :as mock]
            [rest-da-jujuba.handler :refer :all]))

(deftest test-app
  (testing "main route"
    (let [response (app (mock/request :get "/"))]
      (is (= (:status response) 200))
      (is (= (:body response) "Hello World"))))
  (testing "not-found route"
    (let [response (app (mock/request :get "/invalid"))]
      (is (= (:status response) 404))))

  (testing "name route"
    (let [response (app (mock/request :get "/hello/julia"))]
      (is (= (:status response) 200))
      (is (= (:body response) "Hello Julia")))))

(->> [1 2 3 4 54]
  (filter even?)
  (map inc)
  (reduce +))



(1 2 3 4 54)
{:a 1 :b 2}
