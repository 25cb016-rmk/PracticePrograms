#include <stdio.h>
#include <string.h>
int main() {
    char s[100];
    scanf("%s", s);
    int n = strlen(s);
    for(int i = 1; i < (1 << n); i++) {
        for(int j = 0; j < n; j++) {
            if(i & (1 << j)) {
                printf("%c", s[j]);
            }
        }
        printf("\n");
    }
    return 0;
}
