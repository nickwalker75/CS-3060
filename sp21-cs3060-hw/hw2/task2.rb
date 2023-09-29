def stringInfo (arr)
    # a) use each method to print the length of every element in array
    arr.each do |ele|
        print "#{ele.length} "
    end
    puts
    puts
    
    # b) use select method to to find all strings whos length is a multiple of 3
    puts "These strings are multiples of 3:"
    arr.select { |ele| if(ele.length % 3 == 0) then puts "- #{ele}" end}
    puts

    # c) use map method to build new array with all caps versions on strings
    arrCap = arr.map { |string| string.upcase }
    puts "All uppercase array:"
    puts arrCap
    puts
    
    # d) use inject methiod to find the sum of length of all strings
    stringTotal = arr.inject(0) { |sum, length| sum + length.to_i }
    puts "The total length is #{stringTotal} characters"

end

sampleArr = [ ]

# test function
(0..10).each do |i|
    string_length = rand(5..15)
    sampleArr[i] = rand(36**string_length).to_s(36)
end

stringInfo(sampleArr)