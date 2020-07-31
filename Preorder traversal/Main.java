// C++ program to demonstrate insertion 
// in a BST recursively. 
#include <iostream> 
using namespace std; 

class BST 
{ 
	int data; 
	BST *left, *right; 

	public: 
	
	// Default constructor. 
	BST(); 
	
	// Parameterized constructor. 
	BST(int); 
	
	// Insert function. 
	BST* Insert(BST *, int); 
	
	// Inorder traversal. 
	void Preorder(BST *); 
}; 

// Default Constructor definition. 
BST :: BST() : data(0), left(NULL), right(NULL){} 

// Parameterized Constructor definition. 
BST :: BST(int value) 
{ 
	data = value; 
	left = right = NULL; 
} 

// Insert function definition. 
BST* BST :: Insert(BST *root, int value) 
{ 
	if(!root) 
	{ 
		// Insert the first node, if root is NULL. 
		return new BST(value); 
	} 

	// Insert data. 
	if(value > root->data) 
	{ 
		// Insert right node data, if the 'value' 
		// to be inserted is greater than 'root' node data. 
		
		// Process right nodes. 
		root->right = Insert(root->right, value); 
	} 
	else
	{ 
		// Insert left node data, if the 'value' 
		// to be inserted is greater than 'root' node data. 
		
		// Process left nodes. 
		root->left = Insert(root->left, value); 
	} 
	
	// Return 'root' node, after insertion. 
	return root; 
} 

// Inorder traversal function. 
// This gives data in sorted order. 
void BST :: Preorder(BST *root) 
{ 
	if(!root) 
	{ 
		return; 
	} 
	 
	cout << root->data<<" "; 
  	Preorder(root->left);
	Preorder(root->right); 
} 

// Driver code 
int main() 
{ 
	BST b, *root = NULL; 
	int val;
  cin>>val;
  root=b.Insert(root,val);
  while(val>=0)
  {
    cin>>val;
    if(val>0)
      b.Insert(root,val);
  }
  cout<<"Preorder Traversal:"<<endl;
  b.Preorder(root);
	return 0; 
} 
