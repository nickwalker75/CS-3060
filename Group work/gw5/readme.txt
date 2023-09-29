Task 1a:
?- match(X,Y).
X = tiger,
Y = lion ;
X = tiger,
Y = panther ;
X = tiger,
Y = bear ;
X = lion,
Y = tiger ;
X = lion,
Y = panther ;
X = lion,
Y = bear ;
X = panther,
Y = tiger ;
X = panther,
Y = lion ;
X = panther,
Y = bear ;
X = bear,
Y = tiger ;
X = bear,
Y = lion ;
X = bear,
Y = panther ;

there were 12 matches possible


Task 1b:
?- match(X,Y).
X = lion,
Y = tiger ;
X = lion,
Y = panther ;
X = panther,
Y = tiger ;
X = bear,
Y = tiger ;
X = bear,
Y = lion ;
X = bear,
Y = panther ;

there are 6 matches possible


Task 1c:
In version one we get every variation because were looking for all possible matches when comparing X and Y.
In version 2 we get every combination only once because when we compare X and Y it's only true when X comes before Y alphabetically.


Task 1d:
It outputs all the matches to a file instead of to the terminal


Task 2:
ggrandpa -- sr -- jr1 -- little
X = little ;

Task 3:
?- different([3,4,5,7,4,9]).
false.

Task 4:
?- inDomain([3,4,5,7,4,9], [1,2,3,4,5,6,7,8,9]).
true ;
