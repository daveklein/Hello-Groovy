class Department {
  String name
  String toString(){name}
}
class Employee {
  String name
  Department dept
  String toString(){name}
}

def hr = new Department(name:'Human Resources')
def it = new Department(name:'Information Technology')
def sales = new Department(name:'Sales')
def employees = [
  new Employee(name:'Anne', dept:it),
  new Employee(name:'Bill', dept:sales),
  new Employee(name:'Carl', dept:hr),
  new Employee(name:'Dena', dept:hr),
  new Employee(name:'Eric', dept:it),
  new Employee(name:'Fred', dept:it),
  new Employee(name:'Gina', dept:sales),
  new Employee(name:'Hank', dept:sales),
  new Employee(name:'I-Lin', dept:hr),
  new Employee(name:'Joe', dept:sales),
  new Employee(name:'Kate', dept:it)
]

employees.each{println "$it.name in $it.dept"}

def empMap = employees.groupBy{it.dept}
empMap.each{key, val -> 
  println key
  println "==========="
  val.each{println it}
  println " "
}
