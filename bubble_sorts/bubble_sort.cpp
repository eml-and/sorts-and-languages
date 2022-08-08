// O(n^2)
#include <bits/stdc++.h>
#include <iostream>
using namespace std;

void list_printer(int the_array[], int size){
    int i;
    for (i = 0; i < size; i++)
        cout << the_array[i] << " ";
    cout << endl;
}


void bubble_sort(int the_array[], int size) {
    int i, j;
    for (i = 0; i <= size-1; i++)
        for (j = 0; j <= size-1-i; j++)
            if (the_array[j] > the_array[j+1]) {
                swap(the_array[j+1], the_array[j]);
                list_printer(the_array, size);
            }
}


int main()
{
    int the_list [9] = {42, 360, 69, 2012, 12, 99, 5, 2049, 420}; // which is an array;
    int size = sizeof(the_list) / sizeof(the_list[0]);
    list_printer(the_list, size);
    bubble_sort(the_list, size);
    list_printer(the_list, size);
    return 0;
}