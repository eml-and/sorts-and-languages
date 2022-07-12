# O(n*log(n)) on average

def divide(array: list, start, end):
    pivot = array[start]
    smaller = start+1
    larger = end
    while True:
        while smaller <= larger and array[larger] >= pivot:
            larger -= 1
        while smaller <= larger and array[larger] <= pivot:
            smaller += 1
        if smaller <= larger:
            array[smaller], array[larger] = array[larger], array[smaller]
        else:
            break
    array[start], array[larger] = array[larger], array[start]
    print(array)
    print("-----------")
    return larger


def quick_sort(array: list, start, end):
    if start >= end:
        return
    pivot = divide(array, start, end)
    quick_sort(array, start, pivot-1)
    quick_sort(array, pivot+1, end)


if __name__ == "__main__":
    the_list = [42, 360, 69, 2012, 12, 99, 5, 2049, 420]
    print(the_list)
    quick_sort(the_list, 0, len(the_list)-1)
    print(the_list)

    
