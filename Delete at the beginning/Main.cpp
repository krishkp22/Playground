#include <iostream>
using namespace std;
struct Node
{
  int data;
  Node *next;
};
void insEnd(Node** root, int data) {
	Node *ptr, *temp = new Node;
  	ptr = *root;
  	temp->next = NULL;
  	temp->data = data;
  	if(*root == NULL) *root = temp;
  	else {
   		while(ptr->next != NULL) ptr = ptr->next;
      	ptr->next = temp;
    }
}
void disp(Node *root)
{
  while(root != NULL) {
  	cout<<root->data<<'\n';
    root = root->next;
  }
}
int main() 
{	int data, i = 0;
 	Node *head = NULL;
 cin>>data;
  while(data >= 0){
    insEnd(&head,data);
    cin>>data;
  }
 cout<<"Before deletion:"<<"\n";
 disp(head);
 while(head) {
 	cout<<"After "<<++i<<" deletion:\n";
   	head = head->next;
   	disp(head);
 }
 cout<<"No value to delete";
}
