# RULES FOR REVERSING AN ARRAY 
# Swapping :- i <-> n-i-1 (n = length of array , i = number of iteration)
# loop from 0 to greatest integer of (length/2)


arr = [89,12,99,11,120,63,219]
n = len(arr)
i = 0 
while (i<int(n/2)):
    var = arr[n-(i+1)]
    arr[-(i+1)]=arr[i]
    arr[i]=var
    i+=1
print(arr)