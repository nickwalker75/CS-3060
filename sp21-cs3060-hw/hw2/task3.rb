require 'benchmark'

def function3A (max)
    fib1, fib2 = 1, 1
    while fib1 <= max
        fib1, fib2 = fib2, fib1 + fib2
    end
end

def function3B(max)
    return max if max < 2
    function3B(max-1) + function3B(max-2)
end

puts Benchmark.measure {
    function3A(35)
}

puts Benchmark.measure {
    (1..35).each {|i| function3B(i)}
}