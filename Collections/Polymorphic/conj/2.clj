(conj [1 "a" :c] \x) ; <1>
;; [1 "a" :c \x]

(conj (range 3) 99)  ; <2>
;; (99 0 1 2)

(conj {:a 1} [:b 2]) ; <3>
;; {:a 1 :b 2}