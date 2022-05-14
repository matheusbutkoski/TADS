#include <stdio.h>

int main() {
  int n1, n2, n3;       /* dados de entrada */

  printf("Digite três números: ");
  scanf("%i", &n1);
  scanf("%i", &n2);
  scanf("%i", &n3);

  if (n3 >= n1)
    if (n1 > n2)
      printf("A ordem crescente: %d %d %d\n", n2, n1, n3);
    else if (n2 < n3)
      printf("A ordem crescente: %d %d %d\n", n1, n2, n3);
  if (n1 >= n2)
    if (n2 > n3)
      printf("A ordem crescente: %d %d %d\n", n3, n2, n1);
    else if (n3 < n1)
      printf("A ordem crescente: %d %d %d\n", n2, n3, n1);
  if (n1 < n2)
    if (n3 < n1)
      printf("A ordem crescente: %d %d %d\n", n3, n1, n2);
    else if (n3 < n2)
      printf("A ordem crescente: %d %d %d\n", n1, n2, n3);

  return 0;
}
