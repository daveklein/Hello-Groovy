def closure = {println "Hello ${it ?: 'World'}"}
closure()

def picky = {Integer a, Double b -> 
  println a
  println b
}

picky(4, 2.5)

  