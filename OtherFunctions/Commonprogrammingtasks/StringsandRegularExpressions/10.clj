(def s "Why was 12 afraid of 14? Because 14 ate 18.")
(s/replace s #"\d+" #(str (/ (Integer/valueOf %) 2))) ; <1>
;; "Why was 6 afraid of 7? Because 7 ate 9."