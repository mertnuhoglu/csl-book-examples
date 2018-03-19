(defn measure? [measure] ; <1>
  (and measure (re-matches #"[0-9\.]*" measure)))

(defn metric? [[name & measures]] ; <2>
  (and
    name
    (re-matches #"Class\D{1}" name)
    (every? measure? measures)))

(defn header? [[kind & [code]]] ; <3>
  (and
    (#{"Wireless" "Wired"} kind)
    (#{"MXD" "QXD" "CXP"} code)))

(defn spec? [[header & metrics]] ; <4>
  (and
    (header? header)
    (every? metric? metrics)))

(spec? [["Wireless" "MXD" ""] ; <5>
        ["ClassA" "34.97" "" "34.5"]
        ["ClassB" "11.7" "11.4"]])
;; true