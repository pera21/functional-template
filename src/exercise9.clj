(ns exercise9)

(defn word-count 
  "Returns a map where each key is a distinct word in a given sentence and each value is the number of occurences of that word in the sentence."
  [x]
  (frequencies (
    clojure.string/split (
      clojure.string/replace 
        (apply str 
          (filter (fn [c] (or (Character/isLetterOrDigit c) (= c \space))) 
          (clojure.string/lower-case x)
          )
        ) 
      #"  " " ") 
    #" ")
  )
)




