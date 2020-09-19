#include<bits/stdc++.h>
using namespace std;

struct List
{
  int value;
  List *next;
};
int main()
{
  //type your code here
  int x;
  vector<int> v;
  while(true)
  { 
    cin>>x; 
   if(x<0)
     break;
   v.push_back(x); 
  }
  List *head=NULL;
  List *ref=NULL;
  for(auto x:v)
  {
    List *newNode = new List;
    newNode->value = x;
    newNode->next = NULL;
    
    if(head == NULL)
    {
      head = newNode;
      ref = newNode;
    }
    else
    {
      head->next = newNode;
      head = newNode;
    }
  }
  
  while(ref != NULL)
  {
    cout<<ref->value<<endl;
    ref=ref->next;
  }
  return 0;
}
