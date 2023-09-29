inDomain([ ], _). /* base case */
inDomain([H|T], ValList) :- 
    member(H, ValList), inDomain(T, ValList).


