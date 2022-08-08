// O(n*log(n))
#include <bits/stdc++.h>
#include <iostream>
using namespace std;

void list_printer(int the_array[], int size){
    for (int i = 0; i < size; i++)
        cout << the_array[i] << " ";
    cout << endl;


int merge_sort(int *the_array) {
    int len_array = sizeof(the_array) / sizeof(int)
    if (len_array <= 1) {
        return the_array
    }
    else {
        int cutting_point = (int) len_array/2
        int len_1 = cutting_point;
        int len_2 = len_array - cutting_point;
        int Left [len_1];
        int Right [len_2];
        // populate sub-arrays
        for (int i=0; i < len_1, i++) {
            Left[i] = the_array[i];
            }
        for (int j=0; j < len_2, j++) {
            Right[j] = the_array[cutting_point + j];
            }
        list_printer(Left, len_1);
        list_printer(Right, len_2);
        }
        Left = merge_sort(Left);
        Right = merge_sort(Right);
        return merge(Left, Right)


int merge(int *Left, int *Right) {
        // pointers for indices
    int i, j, k;
    i = 0;
    j = 0;
    int len_1 = sizeof(Left) / sizeof(int)
    int len_2 = sizeof(Right) / sizeof(int)

    while(i < len_1 && j < len_2) {
        if (Left[i] <= Right[j])
        the_array[k] 



}


int main() {
    int the_list [9] = {42, 360, 69, 2012, 12, 99, 5, 2049, 420}; // which is an array;
    int size = sizeof(the_list) / sizeof(the_list[0]);
}