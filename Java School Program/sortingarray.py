# bubble sort 
l1 = [91,79,11,22,66,10]
for i in range(0,len(l1)-1):
    for j in range(0,(len(l1)-i-1)):
        if l1[j]>l1[j+1]:
            x = l1[j]
            l1[j]=l1[j+1]
            l1[j+1]=x
print(l1)

# selection sort
