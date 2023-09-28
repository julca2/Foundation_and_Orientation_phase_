class Sharpie:
    color = ''
    width = ''
    inkAmount = 100

    def __init__(self, color: str, width: int):
        self.color = color
        self.width = width
        self.inkAmount = 100

    def use(self):
        self.inkAmount = self.inkAmount-10


sharpie = Sharpie('Blue', 5)

print(sharpie.inkAmount)
sharpie.use()
print(sharpie.inkAmount)
