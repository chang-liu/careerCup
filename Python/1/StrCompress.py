# CareerCup 1.5
# Compress string so 'abcc' -> 'a1b1c2' and return the shorter one
#
# @author Chang Liu

def strCompress(string):
  if len(string) == 0:
    return False
  output = []
  last = string[0]
  cnt = 1
  for i in range(1, len(string)):
    if last == string[i]:
      cnt += 1
    else:
      output += [last, cnt]
      last = string[i]
      cnt = 1
  output += [last, cnt]
  output = ''.join(str(x) for x in output)
  # print output
  return output if len(output) < len(string) else string
  
if __name__ == '__main__':
  print strCompress('aaabbbcde')