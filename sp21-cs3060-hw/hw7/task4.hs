toDigitList::Int -> [Int]
toDigitList 0 = []
toDigitList n = toDigitList (n `div` 10) ++ [n `mod` 10]

main = do
    print(toDigitList(1325))