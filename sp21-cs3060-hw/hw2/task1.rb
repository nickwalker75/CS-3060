if ARGV.length != 2
    puts "ERROR: Incorrect number of arguments"
    exit()
end

file_name = ARGV[0]
string_name = ARGV[1]

outFile = File.open("#{file_name}")
matches = Hash.new(0)
line_num = 0

outFile.each do |line|
    line_num += 1
    if line =~ /#{string_name}/
        matches[line_num] = line.chomp
    end
end

matches.each do |k,v|
    puts "Line #{k}: #{v}"
end

outFile.close