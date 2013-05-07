# CareerCup 1.2
# check if str1 is a permutation of str2
#
# @author Chang Liu

def isPerm(str1, str2):
  return sorted(list(str1)) == sorted(list(str2));
  
if __name__ == '__main__':
  print isPerm('abc', 'abc');
  print isPerm('abc', 'abcd');
  print isPerm('abac', 'absc');
  print isPerm(' ', '');
  print isPerm(' ', ' ');