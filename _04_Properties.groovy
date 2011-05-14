class IceCream {
    String flavor
    void setFlavor(val){
        println "Setting flavor"
        flavor = val
    }
}

def ic = new IceCream()
ic.flavor = 'Chocolate'
println "My ice cream is $ic.flavor"