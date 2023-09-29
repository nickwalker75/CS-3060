/* here you write your code for Task 1 */
loves(chris,abby).   loves(jo,kennedy).
loves(mark,racheal). loves(steven, racheal).

male(mark).   male(jo). 
male(chris).  male(steven).

female(abby). female(kennedy).
female(racheal).

realated(jo, chris).
realated(racheal, kennedy).

older(chris, jo).

jealous(X,Y):- loves(X,Z),  loves(Y,Z).
brother(X,Y):- realated(X,Y), male(X), male(Y).
sister(X,Y):- realated(X,Y), female(X), female(Y).
olderBrother(X,Y):- brother(X,Y), older(X,Y).
