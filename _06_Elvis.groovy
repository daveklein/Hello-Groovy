def name
println "Hello ${name ?: 'Friend'}"

def a = name ?: 'Anonymous'
println a

class Company {
  Person ceo
}
class Person {
  Address office
}
class Address {
  String city
}

def acme = new Company(ceo:new Person(office:new Address(city:'Madison')))
println acme?.ceo?.office?.city



