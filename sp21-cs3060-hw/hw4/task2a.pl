myDelete([H|T], A, Result) :-
    H = A, Result = T.
myDelete([H|T], A, Result) :-
    myDelete(T, A, Result1), 
    append([H], Result1, NewList), 
    Result = NewList. 

read_filename(X) :-
    write('give a filename'), nl, read(X).
writeToFile(X) :-
    read_filename(F),
    open(F, write, Stream),
    write(Stream, X),
    close(Stream).