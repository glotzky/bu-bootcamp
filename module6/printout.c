#include <stdio.h> 
 
int main() { 
    int    count  = 7; 
    double ratio  = 3.14159; 
    char   letter = 'G'; 
 
    printf("Count:  %d\n",      count);    /* integer */ 
    printf("Ratio:  %.3f\n",    ratio);    /* float, 3 decimal places */ 
    printf("Letter: %c\n",      letter);   /* single character */ 
    printf("Hex:    %x\n",      count);    /* integer in hexadecimal: 7 */ 
    printf("Width:  %8d\n",     count);    /* right-aligned in 8 characters */ 
    printf("%s\n", "a string");            /* string */ 
 
    return 0;
} 