Task 1 I/O:

foo([12, 15, 18, 65, 74])

0
0
0
2
2

Task 2 I/O:

randMatrix = genRandomMatrix(3)
printMatrix(randMatrix)

[12, 18, 19]
[11, 18, 13]
[15, 10, 18]


randMatrix = genRandomMatrix(15)
printMatrix(randMatrix)

[16, 12, 10, 16, 10, 20, 11, 20, 15, 11, 14, 15, 11, 12, 10]
[10, 20, 13, 12, 16, 19, 19, 13, 16, 13, 15, 19, 15, 18, 20]
[17, 16, 19, 17, 13, 18, 16, 13, 12, 11, 13, 14, 15, 18, 19]
[17, 15, 11, 10, 16, 12, 18, 10, 20, 13, 17, 12, 13, 14, 12]
[14, 16, 10, 16, 15, 10, 14, 14, 20, 14, 16, 18, 13, 13, 16]
[12, 15, 19, 16, 17, 19, 20, 10, 11, 19, 11, 11, 11, 20, 20]
[14, 14, 18, 12, 12, 12, 16, 18, 17, 15, 17, 14, 12, 17, 12]
[10, 19, 15, 17, 18, 10, 12, 12, 10, 12, 12, 16, 11, 17, 19]
[13, 20, 15, 18, 11, 17, 18, 18, 19, 13, 16, 13, 16, 17, 11]
[16, 17, 19, 10, 18, 17, 18, 14, 17, 18, 10, 11, 11, 14, 18]
[17, 19, 18, 14, 20, 12, 19, 14, 17, 13, 10, 19, 16, 17, 12]
[11, 16, 15, 14, 19, 11, 10, 15, 16, 19, 18, 20, 16, 10, 19]
[12, 16, 16, 14, 18, 17, 16, 15, 11, 18, 13, 16, 15, 13, 12]
[13, 12, 14, 16, 12, 13, 11, 10, 11, 14, 19, 14, 10, 18, 14]
[15, 19, 17, 16, 17, 16, 15, 19, 14, 16, 13, 12, 14, 11, 16]


randMatrix = genRandomMatrix(10, 15)
printMatrix(randMatrix)

[17, 15, 20, 20, 10, 10, 18, 20, 17, 13, 16, 16, 17, 12, 17]
[20, 15, 17, 11, 18, 15, 17, 19, 13, 13, 15, 20, 19, 20, 20]
[14, 20, 19, 13, 12, 14, 10, 19, 20, 10, 12, 20, 16, 16, 14]
[18, 16, 10, 17, 19, 16, 18, 17, 15, 14, 20, 20, 11, 15, 17]
[10, 15, 19, 13, 11, 20, 10, 13, 13, 20, 10, 16, 11, 10, 17]
[15, 13, 12, 13, 12, 10, 12, 20, 13, 20, 18, 14, 19, 10, 12]
[16, 13, 10, 14, 13, 10, 12, 15, 20, 12, 18, 18, 17, 12, 16]
[20, 20, 12, 15, 14, 16, 16, 15, 14, 16, 14, 15, 12, 11, 14]
[17, 17, 11, 19, 20, 16, 14, 10, 20, 18, 11, 18, 19, 10, 18]
[15, 19, 18, 10, 13, 18, 20, 17, 18, 14, 18, 12, 17, 11, 19]

Task 3 answer:
a) the code block runbs 50 times, This is because the iterator i goes up by 2 and the loop is run 100 time 100/2 = 50
b) changed i = i + 2 -> i += 1