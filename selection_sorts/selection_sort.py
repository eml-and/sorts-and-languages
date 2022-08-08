# O(n^2)
the_list = [42, 360, 69, 2012, 12, 99, 5, 2049, 420]

print(the_list)
print("-----------")
k = 0
for j in range(len(the_list)):
    k = j
    for i in range(j, len(the_list)):
        if the_list[i] < the_list[k]:
            k = i
    the_list[k], the_list[j] = the_list[j], the_list[k]
    print(the_list)
    print("-----------")


    
