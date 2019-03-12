package programs;

class Class_Test {

    public static int myIndexOf(char[] str, char[] substr) {
        int len = str.length;
        int sublen = substr.length;
        int count = 0;
        if (sublen > len) {
            return -1;
        }
        for (int i = 0; i < len - sublen + 1; i++) {
            for (int j = 0; j < sublen; j++) {
                if (str[j+i] == substr[j]) {
                    count++;
                    if (count == sublen) {
                        return i;
                    }
                } else {
                    count = 0;
                    break;
                }
            }
        }
        return -1;
    }

    public static void compareFunc(String s1, String s2)
    {
        
        int index = myIndexOf(s1.toCharArray(), s2.toCharArray());
        
        System.out.println(index);
       
    }

    public static void main (String[] args)
    {
        compareFunc("fffg","ffg");
    }
}
