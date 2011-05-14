ArrayList.metaClass.getThird = {
  if (delegate.size > 2)
    return delegate[2]
  else 
    return null
}

def list = ['apple','orange','banana','pear']

println "The third item in the list is ${list.third}"