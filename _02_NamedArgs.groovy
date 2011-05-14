class Person {
    String first
    String last
    Integer age
}
def p1 = new Person(first:'John', last:'Doe', age:40)
println "$p1.first $p1.last"
println "Mr. $p1.last is $p1.age"

