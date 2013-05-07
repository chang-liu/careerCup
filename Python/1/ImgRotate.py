# CareerCup 1.6
# Rotate a imgage by 90 degrees such that [[1, 2], [3, 4]] becomes [[3, 1], [4, 2]]
#
# @author Chang Liu

def imgRotate(imgMatrix):
  if imgMatrix is None:
    print 'Image is empty!'
    return False
  
  for i in range(len(imgMatrix) / 2):
    for j in range(i, len(imgMatrix[0]) - 1 - i):
      tmp = imgMatrix[i][j]
      imgMatrix[i][j] = imgMatrix[len(imgMatrix) - 1 - j][i]
      # print imgMatrix
      imgMatrix[len(imgMatrix) - 1 - j][i] = imgMatrix[len(imgMatrix) - 1 - i][len(imgMatrix[0]) - 1 - j]
      # print imgMatrix
      imgMatrix[len(imgMatrix) - 1 - i][len(imgMatrix[0]) - 1 - j] = imgMatrix[j][len(imgMatrix[0]) - 1 - i]
      # print imgMatrix
      imgMatrix[j][len(imgMatrix[0]) - 1 - i] = tmp
      # print imgMatrix
      
    # for line in imgMatrix:
      # print line
      
  return imgMatrix
  
if __name__ == '__main__':
  a = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]
  # a = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
  # a = [[1, 2], [3, 4]]
  a = imgRotate(a)
  for line in a:
    print line