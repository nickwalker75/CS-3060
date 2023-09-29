data Suit = Spades | Hearts deriving (Show)
data Rank = Ten | Jack | Queen | King | Ace deriving (Show)

type Card = (Rank,Suit)

myCount::Eq p => [p] -> p -> Int
myCount [] e = 0
myCount (h:t) e | e == h = 1 + myCount t e
    |otherwise = myCount t e
