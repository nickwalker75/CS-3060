hasDirectConn(newOrleans, chicago).
hasDirectConn(philadelphia, newOrleans).
hasDirectConn(columbus, philadelphia).
hasDirectConn(sanFrancisco, columbus).
hasDirectConn(detroit, sanFrancisco).
hasDirectConn(toledo, detroit).
hasDirectConn(houston, sanFrancisco).

findRoute(X,Y) :-
    findRoute2(X,Y), write(' -> '), write(X).
findRoute2(X, Y) :- 
    hasDirectConn(X, Y), write(Y). 
findRoute2(X, Y) :-        
    hasDirectConn(X, Z), findRoute2(Z, Y), write(' -> '), write(Z).
