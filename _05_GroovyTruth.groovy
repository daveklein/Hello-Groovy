def zero = 0
println "zero evaluates to ${(zero ? 'true' : 'false')}"

def emptyString = ''
println "emptyString evaluates to ${(emptyString ? 'true' : 'false')}"

def falseString = 'false'
println "falseString evaluates to ${(falseString ? 'true' : 'false')}"

def space = ' '
println "space evaluates to ${(space ? 'true' : 'false')}"

def nullObj
println "nullObj evaluates to ${(nullObj ? 'true' : 'false')}"

def emptyList = new ArrayList()
println "emptyList evaluates to ${(emptyList ? 'true' : 'false')}"

def emptyMap = new LinkedHashMap()
println "emptyMap evaluates to ${(emptyMap ? 'true' : 'false')}"





10.times{
  if (5 - it)
    println "5 - $it == true"
  else
    println "5 - $it == false"
}