# 
def function1
    # ask for then write the 4 lines of text to a file
    puts "Type 4 lines of text"
    aFile = File.new("savedText.txt", "w")

    for i in 0..3 do
        temp = gets.chomp
        aFile.write(temp, " ")

    end

    aFile.close

end

def function2
    # Respond to what file is inputed
    puts "Enter the name of a file"
    line = gets.chomp

    if line =~ /Java/ or line =~ /java/
        puts "The file is not important"
    
    elsif line =~ /Haskell/ or line =~ /haskell/
        puts "The file is not important"

    elsif line =~ /Ruby/ or line =~ /ruby/
        puts "The file superb"

    elsif line =~ /Python/ or line =~ /python/
        puts "The file superb"

    else
        puts "The file is uninterseting"
    end

end

def function3
    # get the power of n
    n = rand(2..11)
    i = 1
    temp = 1

   for i in 1..n
        temp = temp * n
    end

    puts "The #{n}th power of integer #{n} is #{temp}"
 
end

def function4
    # coin function
    puts "pick a number between 50 and 100"
    size = gets.chomp.to_i
    tails = 0.0
    heads = 0.0
    ratio = 0.0

    if size < 50 or size > 100
        print "ERROR: Num out of range"
        exit 0
    end

    size -= 1

    results = Array.new(size)

    for i in 0..size do
        randNum = rand(0..1)
        if randNum == 0
            results[i] = 0
        elsif randNum == 1
            results[i] = 1
        end
    end

    for i in results
        if results[i] == 0  
            tails += 1 
        elsif results[i] == 1
            heads += 1 
        end         
    end

    ratio = tails/heads

    puts "The tails to heads ratio is %.2f" % [ratio]

end

def function5
    # Complete this function
    @unique1 = 0
    @unique2 = 0


    story1 = File.open("story1.txt", "r")
    freq1 = Hash.new(0)
    story1.each do |line|
        words = line.split
        words.each{|w|
        if freq1.has_key?(w)
            freq1[w] = freq1[w] + 1
        else
            freq1[w] = 1
        end
        }
    end

    freq1.sort{|a,b| a[1]<=>b[1]}.each { |elem|
        temp = 0
        if elem[1] == 1
            @unique1 += 1
        end
      }

    story1.close

    story2 = File.open("story2.txt", "r")
    freq2 = Hash.new(0)
    story2.each do |line|
        words = line.split
        words.each{|w|
        if freq2.has_key?(w)
            freq2[w] = freq2[w] + 1
        else
            freq2[w] = 1
        end
        }
    end

    freq2.sort{|a,b| a[1]<=>b[1]}.each { |elem|
        if elem[1] == 1
            @unique2 += 1
        end
      }

    story2.close

    puts "Story 1:"
    puts " - unique words: #{@unique1}"
    puts "Story 2:"
    puts " - unique words: #{@unique2}"


    if story1.length > story2.length

    end


end

# Now call the functions as the following.
function1
function2
function3
function4
function5

