def minimum(l):
    '''Takes an array as the argument.'''
    try:
        min = l[0]
        for x in range (0,len(l)):
            if l[x]<min:
                min = l[x]
        return min
    except TypeError:
        print("The argument must be an array !")

def maximum(l):
    '''Takes an array as the argument.'''
    try:
        max = l[0]
        for k in range(0,len(l)):
            if l[k]>max:
                max = l[k]
        return max
    except TypeError:
        print("The argument must be an array !")
def total(l):
    '''Takes an array as the argument.'''
    try:
        sum = 0
        for i in range (0,len(l)):
            sum+=l[i]
        return sum
    except TypeError:
        print("The argument must be an array !")

class Array:
    
    def __init__(self,arr):
        try:
            self.arr = list(arr) 
        except TypeError:
            print("TypeError : The argument must be a ARRAY !")
            exit()
    
    def greater(self):
        max = self.arr[0]
        for i in range (0,len(self.arr)):
            if self.arr[i]>max:
                max = self.arr[i]
        return max
    def smaller(self):
        min = self.arr[0]
        for x in range (0,len(self.arr)):
            if self.arr[x]<min:
                min = self.arr[x]
        return min
    def ascendingOrder(self):
        sortedArray = []
        originalArray = self.arr
        for k in range (0,len(originalArray)):
            sortedArray.append(minimum(originalArray))
            originalArray.remove(minimum(originalArray))
        return sortedArray

    def descendingOrder(self):
        reversedArray = []
        originalArray = self.arr
        for i in range(0,len(originalArray)):
            reversedArray.append(maximum(originalArray))
            originalArray.remove(maximum(originalArray))
        return reversedArray
    
    def rmIndex(self,index):
        originalArray = self.arr
        originalArray.pop(index)
        return originalArray
    
    def removeElement(self,el):
        originalArray = self.arr
        if el in originalArray:
            originalArray.remove(el)
            return originalArray
        else:
            return f"ElementNotFoundError : {el} is not present in the array."
    
    def addAtEnd(self,el):
        originalArray = self.arr
        originalArray.append(el)
        return originalArray
    
    def addAtIndex(self,index):
        originalArray = self.arr
        originalArray.insert(index)
        return originalArray
    
    def indexOf(self,el):
        '''Returns the index of the first occurence of the element.'''
        originalArray = self.arr
        if el in originalArray:
            for i in range(0,len(originalArray)):
                if originalArray[i]==el:
                    index = i
                    break
        return index  

    def elementAtIndex(self,index):
        '''Returns the elements by the given index.'''
        originalArray = self.arr
        for i in range(0,len(originalArray)):
            if i == index:
                element = originalArray[i]
        return element 

    def length(self):
        len = 0
        for i in self.arr:
            len+=1
        return len
    
    def __str__(self):
        return str(self.arr)
class String:
    def __init__(self,_str):
        self.str = str(_str)
        self.smallLetters = ["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"," "]
        self.captialLetters = ["A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"," "]
    def upperCase(self):
       upperString=""
       for o in range(0,len(self.str)): # loop for iterating the string
           for i in range(0,len(self.smallLetters)): # loop for iterating the word list of smallLetters
                if self.str[o]==self.smallLetters[i] or self.str[o] in self.captialLetters[i]:
                   upperString+=self.captialLetters[i]
       return upperString
               
    def lowerCase(self):
        lowerString = ""
        for i in range(0,len(self.str)):
            for k in range(0,len(self.captialLetters)):
                if self.str[i]==self.captialLetters[k] or self.str[i] in self.smallLetters[k]:
                    lowerString+=self.smallLetters[k]
        return lowerString        

    def equalTo(self,str2):
        if self.str==str2:
            return True
        else:
            return False  

    def equalsIgnoreCase(self,str2):
        str1 = self.str.upper()
        if str1==str2.upper():
            return True
        else:
            return False
    
    def replaceWord(self,oldWord,newWord):
        newString = ""
        oldWord = str(oldWord)
        newWord = str(newWord)
        if oldWord in self.str:
            pass

    def __str__(self):
        return self.str
str1 = String("hello IS a word")
# print(str1.upperCase())
print(str1.lowerCase())
