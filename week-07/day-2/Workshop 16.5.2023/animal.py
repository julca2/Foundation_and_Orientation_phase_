class Animal:
    hunger = 50
    thirst = 50

    def eat(self):
        Animal.hunger = self.hunger-1

    def drink(self):
        Animal.thirst = self.thirst-1

    def play(self):
        Animal.thirst = self.thirst+1
        Animal.hunger = self.hunger+1


dog = Animal

print(dog.hunger)
print(dog.thirst)
print('----------------------')
dog.eat(dog)

print(dog.hunger)
print(dog.thirst)
print('----------------------')
dog.play(dog)

print(dog.hunger)
print(dog.thirst)
print('----------------------')