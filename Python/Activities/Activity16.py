class Car:
    'This class represents a Car'
    def __init__(self,manufacturer,model,make,transmission,color):
        self.manufacturer=manufacturer
        self.model=model
        self.make=make
        self.transmission=transmission
        self.color=color

    def accelerate(self):
        print(self.manufacturer + " " +self.model + "has started moving ")

    def stop(self):
        print(self.manufacturer + " " +self.model + "has stop moving ")    


car1 = Car("Toyota","Corolla","2020","Manual","White")      
car2 = Car("Maruti","Corolla","2020","Manual","White")      
car3 = Car("Suzuki","Corolla","2020","Manual","White")      

car1.accelerate()
car1.stop()