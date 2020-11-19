package org.example.StringClass;


//program to count occurrences of a substring tn a given string


    class SubStringOccurance {


            static int countsubstring(String pattern, String orginal) {
                int len1 = orginal.length();
                int len2 = pattern.length();

                int count = 0;
                int i,j;
                for ( i = 0; i <= len1 - len2; i++) { // outer loop for the original string
                    for (j = 0; j < len2; j++) {
                        if (pattern.charAt(j)  !=  orginal.charAt(i + j)) {
                            break; // counts how many number of character in the pattern is same as the orginal string
                        }
                    }
                    if (j == len2) { // if the number of occurance is same as the pattern's length ?
                        j = 0;    // reset the value of j to 0 for calculating thr second occurance
                        count++;
                    }
                }
                return count;
            }
            static public void main(String[] args) {
                String orginal = "abcabcabdefabcgafafhjabcfr";
                String pattern = "abc";
                System.out.println("the occurance of abc in the string '"+orginal+"' is = "+countsubstring(pattern, orginal));
            }
        }
