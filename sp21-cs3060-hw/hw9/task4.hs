data Tree a = Leaf a | BinaryTree (Tree a) a (Tree a) deriving (Show)
