foo::[Int] -> [Int]
foo [] = []
foo (h:t) = if h `mod` 3 == 0 then
    h:foo t else if h `mod` 5 == 0 then
    h:foo t else foo t
    
main = do
    print(foo[34, 2, 12, 25, 15, 32, 20])