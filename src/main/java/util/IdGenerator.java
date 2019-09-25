package util;

import java.util.UUID;

public class IdGenerator {
        public static String generateRandomGivenSuffix(String suffix) {
            return suffix + "-" + UUID.randomUUID().toString();
        }

        public static String getClassName(Class<?>  aClass) {
            return aClass.getSimpleName();
        }

        public static String getSuffixFromClassName(Class<?> aClass) {
            String upperLetter="";
            String className = getClassName(aClass);

            for(int i=0;i<className.length();i++){
                if(Character.isUpperCase(className.charAt(i)))
                {
                    upperLetter+=""+className.charAt(i);
                }
            }
            return generateRandomGivenSuffix(upperLetter);
            /**
             * Your implementation goes here
             *
             * INSTRUCTION
             * 1. Remove line 17 [throw new UnsupportedOperationException("Not yet supported!");]
             * 2. Get the capitalized letter(s) from the className and return it.
             */
        }

}
