foo :: [Char] -> Int
foo [] = 0
foo (h:t) =  1 + (foo t)

main = do 
    print(foo ['a', 'b', 'c', 'd'])