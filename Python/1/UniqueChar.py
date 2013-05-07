# CareerCup 1.1
# String with unique chars
#
# @author Chang Liu

def checkUnique(inputString):
  ht = {}
  for c in inputString:
    if c in ht:
      return False
    ht[c] = True
    
  return True

def checkUniqueNoDataStruct(inputString):
  for i in range(0, len(inputString)):
    for j in range(i+1, len(inputString)):
      if inputString[i] == inputString[j]:
        return False
        
  return True
  
if __name__ == '__main__':
  print checkUnique('')
  print checkUniqueNoDataStruct('abck.s')