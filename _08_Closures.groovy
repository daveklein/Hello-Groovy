class ClassOne {
  def name
  def c = {println "Hello $name"}
  def handOffClosure(){return c}
  def changeName = {name = it}
}

class ClassTwo {
  void callMeAClosure(closure){closure.call()}
}

def c1 = new ClassOne(name:'Fred')
def c2 = new ClassTwo()

def closure = c1.handOffClosure()
closure()

c1.changeName('Joe')
c2.callMeAClosure(closure)

