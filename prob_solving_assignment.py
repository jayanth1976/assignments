def sol(l):
  odd,even = 0,0
  for i in l:
    if i&1 : 
      odd+=1
    else : 
      even+=1
  if odd % 4 == 2:
      print("Bob")
  elif odd%4 == 3:
      print("Alice")
  elif odd%4 == 0:
      print("Alice")
  elif even%2 == 1:
      print("Alice")
  else:
      print("Bob")
  
l=list(map(int,input().split()))
sol(l)