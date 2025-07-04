#include<iostream>
using namespace std;


int main(){
   int n;
    int val = 1;
       int sum = 0;

    cout<<"Enter a number :";
    cin>>n;

    //check no is less than 1
    if(n<1){
        cout<<"number is not nature Number";
        return 0;
    }

    //process
   // n= 3;
  //  1 ,2 ,3 = 6
  
//   while(val <= n){
//     sum = sum+val;
//     val = val +1;
//   }

for(int val = 1 ; val <=n; val++){
    sum = sum+val;
}

  cout<<"sum is "<<sum;



    return 0;
}



