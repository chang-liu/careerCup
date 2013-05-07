# CareerCup 1.4
# Replace the SPACE with '%20'
#
# @author Chang Liu

def strReplace(str):
  a = list(str)
  for i in range(len(a)):
    if a[i] is ' ':
      a[i] = '%20'
  return ''.join(a)
  
if __name__ == '__main__':
  print strReplace('helllo world python!');