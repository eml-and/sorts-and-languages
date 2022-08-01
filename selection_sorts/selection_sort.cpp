// O(n^2)
#include <bits/stdc++.h>
#include <iostream>
using namespace std;

void list_printer(int the_array[], int size){
    for (int i = 0; i < size; i++)
        cout << the_array[i] << " ";
    cout << endl;
}

void selection_sort(int the_array[], int size) {
    int j, i, k;
    for (j = 0; j < size; j++) {
        k = j;
        for (i = j; i < size; i++) 
            if (the_array[i] < the_array[k]) {
                k = i;
            }
        swap(the_array[j], the_array[k]);
        list_printer(the_array, size);
    }
            
}


int main()
{
    int the_list [9] = {42, 360, 69, 2012, 12, 99, 5, 2049, 420}; // which is an array;
    int size = sizeof(the_list) / sizeof(the_list[0]);
    list_printer(the_list, size);
    selection_sort(the_list, size);
    list_printer(the_list, size);
    return 0;
}