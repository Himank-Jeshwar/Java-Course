# selection sort 
l1 = [67,9,12,99,16,222,10,2]
# iter 1 = [2,9,12,99,16,222,10,67] i = 0 , j = 1 , smallest = 2
# iter 2 = [2,9,12,99,16,222,10,67] i = 1 , j = 2 ,smallest = 9
# iter 3 = [2,9,10,99,16,222,12,67] i = 2 , j = 3 , smallest = 10
# iter 4 = [2,9,10,12,16,222,99,67] i = 3 , j = 4 , smallest = 12
# iter 5 = [2,9,10,12,16,222,99,67] i = 4 , j = 5 , smallest = 16
# iter 6 = [2,9,10,12,16,67,99,222] i = 5 , j = 6 , smallest = 67
# iter 7 = [2,9,10,12,16,67,99,222] 

for i in range (0,len(l1)-1):
    smallest = i 
    for j in range (i+1,len(l1)):
        if (l1[j]<l1[smallest]):
            smallest = j
    temp = l1[smallest]
    l1[smallest]=l1[i]
    l1[i]=temp

print(l1)
