myGCD(A, B, C) :-
    A = B, C = A.

myGCD(A, B, C) :-
    A < B, B1 is B - A, myGCD(A, B1, C).

myGCD(A, B, C) :-
    A > B, myGCD(B, A, C).