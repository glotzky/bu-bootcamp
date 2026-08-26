#include <stdio.h> 

int add(int a, int b) { 
  return a + b; 
} 

int multiply(int a, int b) {
    return a * b;
}

void print_math(int a, int b){
    int sum = add(a,b);
    int product = multiply(a,b);

    printf("Sum: %d\n", sum);
    printf("Product: %d\n", product);
}

int main() { 
    int firstNumber, secondNumber;
    printf("Enter first number: ");
    scanf("%d", &firstNumber);

    printf("Enter second number: ");
    scanf("%d", &secondNumber);

    print_math(firstNumber, secondNumber);

    return 0;
}