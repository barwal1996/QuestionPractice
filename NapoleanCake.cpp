/*
Problem Statement:
Rahul decided to bake the Napoleon cake. He baked n dry layers first, and then put them on each 
other in one stack(see image), adding some cream. Rahul started with an empty plate, and 
performed the following steps n times:

place a new dry layer of cake on the top of the stack;
after the i-th layer is placed, pour ai units of cream on top of the stack.
When x units of cream are poured on the top of the stack, the top x layers of the cake get wet
 in the cream. If there are fewer than x layers, all layers get wet. If x=0, no layer gets wet.

Help Rahul determine which layers of the cake eventually get wet when the process is over, and
 which don’t.

Input: Each test case contains n integers arr[0], arr[1], … arr[n-1] — where arr[i] is the 
amount of cream poured on the cake after adding ith layer.

Output: Print array of n integers. The i-th of the integers should be equal to 1 if the i-th 
layer is wet, and 0 otherwise. Let’s see an example.

Example Test Case:

Input: n = 6 arr[6] = 0 3 0 0 1 3

Ouput: 1 1 0 1 1 1


*/


#include<stdio.h>
#include<iostream>
using namespace std;
int main(){
    int t; //n=number of layers
    cin>>t; // here t for test cases
    while (t--)
    {
       int n;
        cin >> n;
        int a[n];
        for (int i = 0; i < n; i++)
            cin >> a[i];
        int temp = a[n - 1]; //traversing array from R to L (Top to down)
        int b[n] = {0};
        for (int i = n - 1; i >= 0; i--)
        {
            if (temp != 0 || a[i] != 0)
            {
                b[i] = 1;
                temp = max(temp, a[i]);
                temp--;
            }
            else
            {
                temp = a[i];
            }
        }
        for (int i = 0; i < n; i++)
            cout << b[i] << " ";
        cout << endl;
    }
}