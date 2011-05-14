def fruits = ['apple', 'orange', 'banana', 'peach', 'mango']

fruits.each{println "I like ${it}s"}

fruits.eachWithIndex{fruit, i -> println "Fruit #$i is a $fruit"}

println fruits.find{it.contains('n')}

println fruits.findAll{it.contains('n')}

