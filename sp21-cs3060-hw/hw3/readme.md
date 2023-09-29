Complete the template prolog files (task1, task2, and task3).
Edit this README file to mention the following: (a) how to run your program, (b) input (if any), (c) Sample test results for each of the tasks.

task1:

- Facts
  ?- male(chris).
  true.

  ?- female(jo).
  false.

  ?- female(kennedy).
  true.

  ?- older(chris, jo).
  true.

- Rules
  ?- brother(jo, chris).
  true.

  ?- sister(jo, chris).
  false.

task2:

- Min lists
  ?- min_list([-1, -5, -12, 0, 14, 12], Min).
  Min = -12.

  ?- min_list([-1, 0, 14, 12], Min).
  Min = -1.

task3:

- Two hop route
  ?- hasConn(detroit, chicago).
  true .

- One hop route
  ?- hasConn(newOrleans, chicago).
  true .

- No route
  ?- hasConn(columbus, toledo).
  false.
