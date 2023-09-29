Task1:
    ?- findRoute(sanFrancisco, newOrleans).
    newOrleans -> philadelphia -> columbus -> sanFrancisco

    ?- findRoute(houston, columbus).
    columbus -> sanFrancisco -> houston

Task2a:
    ?- myDelete([b, c, d, b, c, b], c, Result), writeToFile(Result).
    give a filename
    |: 'task2a.txt'.

    Result = [b, d, b, c, b] .

    in file: [b,d,b,c,b]

Task2b:
    ?- myGCD(11, 3, Result).
    Result = 1.

    ?- myGCD(12, 3, Result).
    Result = 3.

    [trace] 8 ?- myGCD(12, 3, Result).
    Call: (10) myGCD(12, 3, _6982) ? creep
    Call: (11) 12=3 ? creep
    Fail: (11) 12=3 ? creep
    Redo: (10) myGCD(12, 3, _6982) ? creep
    Call: (11) 12<3 ? creep
    Fail: (11) 12<3 ? creep
    Redo: (10) myGCD(12, 3, _6982) ? creep
    Call: (11) 12>3 ? creep
    Exit: (11) 12>3 ? creep
    Call: (11) myGCD(3, 12, _6982) ? creep
    Call: (12) 3=12 ? creep
    Fail: (12) 3=12 ? creep
    Redo: (11) myGCD(3, 12, _6982) ? creep
    Call: (12) 3<12 ? creep
    Exit: (12) 3<12 ? creep
    Call: (12) _8040 is 12-3 ? creep
    Exit: (12) 9 is 12-3 ? creep
    Call: (12) myGCD(3, 9, _6982) ? Unknown option (h for help)
    Call: (12) myGCD(3, 9, _6982) ? creep
    Call: (13) 3=9 ? creep
    Fail: (13) 3=9 ? creep
    Redo: (12) myGCD(3, 9, _6982) ? creep
    Call: (13) 3<9 ? creep
    Exit: (13) 3<9 ? creep
    Call: (13) _8442 is 9-3 ? creep
    Exit: (13) 6 is 9-3 ? creep
    Call: (13) myGCD(3, 6, _6982) ? creep
    Call: (14) 3=6 ? creep
    Fail: (14) 3=6 ? creep
    Redo: (13) myGCD(3, 6, _6982) ? creep
    Call: (14) 3<6 ? creep
    Exit: (14) 3<6 ? creep
    Call: (14) _8800 is 6-3 ? creep
    Exit: (14) 3 is 6-3 ? creep
    Call: (14) myGCD(3, 3, _6982) ? creep
    Call: (15) 3=3 ? creep
    Exit: (15) 3=3 ? creep
    Call: (15) _6982=3 ? creep
    Exit: (15) 3=3 ? creep
    Exit: (14) myGCD(3, 3, 3) ? creep
    Exit: (13) myGCD(3, 6, 3) ? creep
    Exit: (12) myGCD(3, 9, 3) ? creep
    Exit: (11) myGCD(3, 12, 3) ? creep
    Exit: (10) myGCD(12, 3, 3) ? creep
    Result = 3 .

Task3:
