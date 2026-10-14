
def calculateElectronicsGST(a ,b):
    return( a+ b)+(a +b) * 18 /100;

def calculateFashionGST( c, d):
    return (c + d) + (c +d) *13 /100

def calculateFoodGST(e):
    return e + e * 7 / 100

def totalBill(a,b,c,d,e):
    return calculateElectronicsGST(a,b) + calculateFashionGST(c ,d) + calculateFoodGST(e)

def calculateDiscountedBill(a ,b,c,d,e):
    total = totalBill(a,b,c,d,e)
    return total - (total * 20 /100)

a = 100
b= 100
c= 100
d = 100
e = 100
total = totalBill(a,b,c,d,e)
discount = total * 20/100
finalBill = calculateDiscountedBill(a ,b,c,d,e)
print("Total after GST =", format(total,".2f"))
print("Discount =" ,format(discount,".2f"))
print("Final Bill after Discount =",format(finalBill,".2f"))
