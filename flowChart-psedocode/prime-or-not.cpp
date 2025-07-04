#include<iostream>
using namespace std;
int main(){
    int n;
    int div = 2;

    cout<<"Enter a number :";
    cin>>n;

    //ckeck condition
    if(n <=1){
        cout<<"number is not prime";
        return 0;
    }


    //check number
        
     while(div<n){
        
         if(n%div == 0){

          cout<<"number is not prime";
        // exit(0);
         return 0;  
         }

         div = div+1;
     }

    cout<<"number is prime";



    return 0;
}


















// #include<iostream>
// using namespace std;

// int main() {
//     int n;
//     cout << "Enter a number: ";
//     cin >> n;

//     // Handle edge case
//     if (n <= 1) {
//         cout << "Number is not prime";
//         return 0;
//     }

//     bool isPrime = true;
//     int div = 2;

//     while (div < n) {
//         if (n % div == 0) {
//             isPrime = false;
//             break;  // No need to check further
//         }
//         div++;
//     }

//     if (isPrime) {
//         cout << "Number is prime";
//     } else {
//         cout << "Number is not prime";
//     }

//     return 0;
// }
