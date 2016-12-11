class Student < Person

  def initialize(firstName, lastName, id, scores)
    super(firstName, lastName, id)
    @scores = scores
  end

  def calculate()
    avg = @scores.reduce(&:+) / @scores.length
    grade = case avg
      when 90..100 then 'O'
      when 80..89 then 'E'
      when 70..79 then 'A'
      when 55..69 then 'P'
      when 40..54 then 'D'
      when 0..39 then 'T'
    end

    print("\nGrade: #{grade}")
  end

end
