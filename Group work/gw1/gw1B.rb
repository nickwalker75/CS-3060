aFile = File.new("data.txt", "r")
h = Hash.new(0)
i = 0

aFile.each do |line|
    words = line.split  # split func breaks line in words
    h[words[0]] = words[2] # storing important things in hash h
    i +=1
end

p "number of lines: #{i}"
p "price of desk is: #{h["desk"]}"

# Below write code to find the costliest item
sorted = h.sort_by {|x, y| y.to_i}
last = h.length - 1

puts "The costliest item is #{sorted[last][0]}"
puts "The 2nd costliest item is #{sorted[last - 1][0]}"

aFile.close