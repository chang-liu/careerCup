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
  return True
  
if __name__ == '__main__':
  print checkUnique('')