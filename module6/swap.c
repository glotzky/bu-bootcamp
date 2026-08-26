#include <stdio.h> 

void swap(int *a, int *b) { 
    int temp = *a;   /* save the value at a */ 
    *a = *b;         /* put b's value into a's location */ 
    *b = temp;       /* put saved value into b's location */ 
}

void broken_swap(int a, int b){
    /* Function receives copies because a and b are missing & which 
    indicates they are passed as values*/
    int temp = a;
    a = b;
    b = temp;
}

int main() { 
    int x = 17; 
    int y = 212; 

    printf("Before: x = %d, y = %d\n", x, y); 

    swap(&x, &y); 

    printf("After:  x = %d, y = %d\n", x, y); 

    printf("Before: x = %d, y = %d\n", x, y); 

    broken_swap(x, y); 

    printf("After Broken Swap:  x = %d, y = %d\n", x, y); 

    return 0;
}