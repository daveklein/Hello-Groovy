interface SomeInterface {
  String saySomething()
  void doSomething(String val)
}

class ClassToTest {
  SomeInterface si //normally would be injected or something
    
  void doBizLogic(){
    String something = si.saySomething()
    si.doSomething(something)
  }
}

def ctt = new ClassToTest()
ctt.si = [saySomething:{"Hello world"},
          doSomething:{println it}] as SomeInterface
ctt.doBizLogic()