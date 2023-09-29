players = ["x","y", "z"]
matches = [(m, n) | m <- players, n <- players]

main = print(matches)