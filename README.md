# sieve

The sieve of Eratosthenes is an algorithm for identifying prime numbers by generating the
integers, in ascending order beginning with 2, and then repeatedly marking the least previously
unmarked number as prime and marking all of its subsequent multiples as composite. The first pass
marks 2 as prime and 4, 6, 8, and all the larger even numbers as composite. The least unmarked
number is 3, so on the second pass we mark it as prime and 6, 9, 12, and so on as composite. Now
the least unmarked number is 5, so on the third pass we mark it as prime and 10, 15, 20, and so
on as composite, and so on. Every prime number eventually appears as the least unmarked one,
and every composite is marked as soon as its least prime factor is encountered.

Main program computes and prints out the frst five hundred prime numbers.




