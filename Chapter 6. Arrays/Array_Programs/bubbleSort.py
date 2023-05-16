# bubble sort 
# [90,333,120,5,12,9,1]
#[1, 5, 9, 12, 90, 120 , 333]
# var = |120|
# l[k]=l[k+1]
# l[k+1]=var
def ascendingOrder (l):
    n = len(l)
    for i in range(0,n-1):
        for k in range(0,n-i-1):
            if (l[k]>l[k+1]):
                var = l[k]
                l[k]=l[k+1]
                l[k+1]=var
    return l

def descendingOrder(l):
    n = len(l)
    for i in range(0,n-1):
        for k in range(0,n-i-1):
            if (l[k]<l[k+1]):
                var = l[k]
                l[k]=l[k+1]
                l[k+1]=var
    return l

l1 = [90,333,120,5,12,9,1]
print(descendingOrder(l1))