String.metaClass.sayHi = {println 'Hello Groovy!'}

def s = ''

s.sayHi()

println String.metaClass.class.name