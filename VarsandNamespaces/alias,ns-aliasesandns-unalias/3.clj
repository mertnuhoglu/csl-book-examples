(alias 'myns 'com.web.tired-of-typing-this.myns) ; <1>

(ns-aliases *ns*) ; <2>
;; {myns #object[clojure.lang.Namespace 0x58d455df
;;  "com.web.tired-of-typing-this.myns"]}

myns/myvar ; <3>
0