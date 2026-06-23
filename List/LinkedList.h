#include<iostream>
using namespace std;

class Node
{
    public : int num;
          Node *next;
};

class LinkedList
{
    Node *head;

public :
        LinkedList();
        void addatbegin(int);
        void addatmid(int,int);
        void addatend(int);
        void travarsal();
        void listcount();
        void delatbegin();
        void delatmid(int);
        void delatend();

};
