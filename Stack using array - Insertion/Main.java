#include<iostream>
using namespace std;
struct stack
{ 
  int d[10];
  int top=-1;
};
int main()
{
  //type your code
  struct stack s;
  int n, i = 0;
  cin>>n;
  while(cin>>s.d[i]) {
  	i++;
    s.top++;
  }
  if(s.top == -1) {
  	cout<<"Stack is empty";
  }
  else if(s.top >= n) {
  	cout<<"Stack Overflow";
  }
  else {
  	cout<<"Stack elements are: \n";
  	while(s.top!=-1)
  	{
    	cout<<s.d[s.top]<<" ";
      	s.top--;
  	}
  }
  return 0;
}