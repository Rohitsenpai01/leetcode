#include<iostream>
#include <vector>
using namespace std;

void binarysearch(vector <int> &ar , int  n )
{
    int mid , st = 0 , end = ar.size();
    while(st <= end)
    {
        mid = st + (end -st) / 2;
        if (ar[mid] == n)
        {
            cout<<"element found";
            return;
        }else if(ar[mid] < n)
        {
            st =mid +1;
        }else
        {
            end = mid- 1;
        }
    }
    return;
}

int main()
{
   int n;
   cout<<"Enter size of the array :";
   cin>>n;
   vector<int> arr(n);
   cout<<"enter array elements : ";
   for(int i = 0 ; i < n; i++){
        cin>>arr[i];
   }
   cout<<"enter element to find : ";
   cin>>n;

   binarysearch(arr , n);
   
}
