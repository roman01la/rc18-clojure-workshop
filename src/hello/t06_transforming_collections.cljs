(ns hello.t06-transforming-collections)

;; Clojure provides a rich set of functions to manipulate collections.

;; map/filter/reduce

(map inc [1 2 3]) ;; [1, 2, 3].map(n => n + 1)
(filter odd? [1 2 3]) ;; [1, 2, 3].filter(n => n % 2)
(reduce + 0 [1 2 3]) ;; [1, 2, 3].reduce((sum, n) => n + sum, 0)


;; ### Creating collections
;;

;; These functions can create infinite sequences of values.
;; Normally an infinite sequence won't evaluate immediately,
;; because collections in Clojure are lazy.

(range 5 10)
(repeat 10 1)


;; ### Transforming collection types
;;

(into [] (list 1 2 3)) ;; [1 2 3]

(into {} [[:a 1] [:b 2]]) ;; {:a 1, :b 2}

(into #{} [1 2 3 4 4]) ;; #{1 2 3 4}


;; ### Exercise
;;

;; Given a list of bank accounts
;; where an account has a log of transactions
;; compute current account balance.

;; Output a list of strings where every string is: "$first-name $last-name: $balance"

(def accounts
  [{:first-name "Derek"
    :last-name "Redmond"
    :transactions [188 289 -168 867 -493 -410 942 686 834 -867]}
   {:first-name "Tiya"
    :last-name "Everett"
    :transactions [778 -241 -90 -345 560 615 -603 -236 435 -90]}
   {:first-name "Mathilda"
    :last-name "Donald"
    :transactions [963 -848 320 -456 128 769 -740 -349 -790 -849]}
   {:first-name "Taran"
    :last-name "Barrera"
    :transactions [338 -670 -842 582 -446 -826 85 878 869 -345]}])

(comment
  ;; This should be the result
  '("Derek Redmond: 1868"
    "Tiya Everett: 783"
    "Mathilda Donald: -1852"
    "Taran Barrera: -377"))
