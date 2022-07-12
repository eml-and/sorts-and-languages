# O(n*log(n))

def mergesort(the_list) -> list:
    if len(the_list) <= 1:
        return the_list
    else:
        cut = int(len(the_list)/2)
        left_list = the_list[:cut]
        right_list = the_list[cut:]
        print(left_list, right_list)
        print("-----------")
        left_list = mergesort(left_list)
        right_list = mergesort(right_list)
        return merge(left_list, right_list)

def merge(left_list, right_list) -> list:
    new_list = []
    while len(left_list) > 0 and len(right_list) > 0:
        if left_list[0] <= right_list[0]:
            new_list.append(left_list[0])
            del left_list[0]
        else:
            new_list.append(right_list[0])
            del right_list[0]
    while len(left_list) > 0:
        new_list.append(left_list[0])
        del left_list[0]
    while len(right_list) > 0:
        new_list.append(right_list[0])
        del right_list[0]
    return new_list


if __name__ == "__main__":
    the_list = [42, 360, 69, 2012, 12, 99, 5, 2049, 420]
    print(the_list)
    the_list = mergesort(the_list)
    print(the_list)