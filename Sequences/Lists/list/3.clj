(-> () (conj 1)) ; <1>
;; (1)

(-> () (conj 1) (conj 2))
;; (2 1)

(-> () (conj 1) (conj 2) (conj 3)) ; <2>
;; (3 2 1)