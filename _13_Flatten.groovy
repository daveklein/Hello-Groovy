def list = [3, 6, 2, 9, 4, 1]
list << [8, 2, 5, 4, 7, 0]

if (list.contains(7))
  println "Found it!"
else
  println "Can't find it."

list = list.flatten()  

list.sort()
println list

list.unique()
println list




