isPerSquare::Int -> Bool
isPerSquare n = sq * sq == n
    where sq = floor$sqrt$(fromIntegral n::Double)

foo::[Int] -> Int
foo [] = 0
foo (h:t) = fromEnum (isPerSquare h) + foo t


main = do
    print(foo[34,9,80,16,225,15,1000])