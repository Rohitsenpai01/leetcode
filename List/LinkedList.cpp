#include "LinkedList.h"

LinkedList :: LinkedList()
{
    head = NULL;
}

void LinkedList :: addatbegin(int data)
{
    Node *newnode;
    newnode = new Node;
    if(newnode == NULL)
    {
        cout<<"\nNo node created";
        return;
    }
    else
    {
        newnode->num = data;
        newnode->next = NULL;
    }

    if(head == NULL)
    {
        head = newnode;
    }
    else
    {
        newnode->next = head;
        head = newnode;
    }
}

void LinkedList :: addatend(int data)
{
    Node *newnode,*current;
    newnode = new Node;
    if(newnode == NULL)
    {
        cout<<"\nNo node created";
        return;
    }
    else
    {
        newnode->num = data;
        newnode->next = NULL;
    }

    if(head == NULL)
    {
        head = newnode;
    }
    else
    {
        current = head;
        while(current->next != NULL)
        {
            current = current->next;
        }

        current->next = newnode;
    }
}

void LinkedList :: delatbegin(){
    Node * temp;
    if(head == NULL){
        cout<<"\nList is empty";
        return;
    }
    else{
        temp = head;
        head = head->next;
        delete temp;
    }
}

void LinkedList :: delatend(){
    Node * current, * previous;
    if(head == NULL){
        cout<<"\nList is empty";
        return;
    }
    else if(head->next == NULL){
        delete head;
        head = NULL;
    }
    else{
        current = head;
        while(current->next != NULL){
            previous = current;
            current = current->next;
        }
        previous->next = NULL;
        delete current;
    }
}

void LinkedList :: travarsal()
{
    Node *current;
    if(head == NULL)
    {
        cout<<"\nList is empty";
        return;
    }
    else
    {
        current = head;
        while(current != NULL)
        {
            cout<<"\t"<<current->num;
            current = current->next;
        }
    }
}

int main(){
    LinkedList List;
    List.addatbegin(10);
    List.addatbegin(20);
    List.addatend(30);
    List.travarsal();
    cout<<"\n";
    List.delatbegin();
    List.travarsal();
    cout<<"\n";
    List.delatend();
    List.travarsal();
    return 0;
}