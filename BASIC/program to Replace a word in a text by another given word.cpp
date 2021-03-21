#include <stdio.h>
#include <string.h>
#include <stdlib.h>
void replaceWordInText(const char *text, const char *oldWord, const char *newWord) {
   int i = 0, cnt = 0;
   int len1 = strlen(newWord);
   int len2 = strlen(oldWord);
   for (i = 0; text[i] != '\0'; i++) {
      if (strstr(&text[i], oldWord) == &text[i]) {
         cnt++;
         i += len2 - 1;
      }
   }
   char *newString = (char *)malloc(i + cnt * (len1 - len2) + 1);
   i = 0;
   while (*text) {
      if (strstr(text, oldWord) == text) {
         strcpy(&newString[i], newWord);
         i += len1;
         text += len2;
      }
      else
      newString[i++] = *text++;
   }
   printf("%s\n", newString);
}

int main(void) {
		int t;
	scanf("%d",&t);
	while(t--){
	   // declaring string 
    char str[50]; 
      
    // reading string 
    scanf("%s",str); 
      
    char chngwrd[] = "party";
    char wrd[] = "pawri";
    
    replaceWordInText(str,chngwrd,wrd);
    
    
	}
	return 0;
}


