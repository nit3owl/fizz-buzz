for i in xrange(1, 101):
    result = ''
    if i % 3 == 0:
        result = 'Fizz'
    if i % 5 == 0:
        result += 'Buzz'
    print result or i
