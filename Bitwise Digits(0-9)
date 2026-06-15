#include <stdio.h>
#include <ctype.h>

int main() {
    char str[1000001];

    scanf("%s", str);

    int digit[10] = {0};

    for(int i = 0; str[i]; i++) {
        if(isdigit(str[i])) {
            digit[str[i] - '0'] = 1;
        }
    }

    int allPresent = 1;

    for(int i = 0; i < 10; i++) {
        if(digit[i] == 0) {
            allPresent = 0;
            break;
        }
    }

    if(allPresent)
        printf("Yes");
    else
        printf("No");

    return 0;
}
