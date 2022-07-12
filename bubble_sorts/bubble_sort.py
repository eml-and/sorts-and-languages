# O(n^2)
the_list = [42, 360, 69, 2012, 12, 99, 5, 2049, 420]

print(the_list)
for i in range(len(the_list)):
    for j in range(i+1, len(the_list)):
        if the_list[i] > the_list[j]:
            the_list[i], the_list[j]  = the_list[j], the_list[i]
            print(the_list)
    print("-----------")
