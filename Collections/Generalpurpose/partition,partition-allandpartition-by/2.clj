(partition 3 (range 10))          ; <1>
;; ((0 1 2) (3 4 5) (6 7 8))
(partition-all 3 (range 10))      ; <2>
;; ((0 1 2) (3 4 5) (6 7 8) (9))