/* here you write your code for Task 2 */
min_list([H|T], Min) :- min_list(T, H, Min).

min_list([], Min, Min).
min_list([H|T], Min0, Min) :- Min1 is min(H, Min0), min_list(T, Min1, Min).