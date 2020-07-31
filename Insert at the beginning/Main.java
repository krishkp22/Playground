#include <iostream>
using namespace std;
struct Node
{
  int data;
  Node *next;
};
void insbeg(Node** root,int data)
{
  Node *ptr,*temp=new Node;
  temp->data=data;
  temp->next=*root;
  *root=temp;
}
void disp(Node *root)
{
  while(root != NULL) {
  	cout<<root->data<<'\n';
    root = root->next;
  }
}
int main() 
{	int data;
 	Node *head = NULL;
 cin>>data;
  while(data >= 0){
    insbeg(&head,data);
    cin>>data;
  }
 disp(head);
}