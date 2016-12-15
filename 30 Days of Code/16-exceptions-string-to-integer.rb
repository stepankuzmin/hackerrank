# https://www.hackerrank.com/challenges/30-exceptions-string-to-integer

S = gets.strip
begin
   I = Integer(S)
   puts I
 rescue Exception
   puts "Bad String"
 end
