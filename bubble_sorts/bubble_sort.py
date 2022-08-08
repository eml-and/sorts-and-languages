# O(n^2)
the_list = [42, 360, 69, 2012, 12, 99, 5, 2049, 420]
swapped = False
print(the_list)
for i in range(len(the_list)-1):
    for j in range(0, len(the_list)-i-1):
        if the_list[j] > the_list[j+1]:
            print("-----------")
            swapped = True
            the_list[j], the_list[j+1]  = the_list[j+1], the_list[j]
            print(the_list)
    if not swapped:
        break

