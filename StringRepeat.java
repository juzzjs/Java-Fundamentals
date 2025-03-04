public class StringRepeat {
    public static void main(String[] args) {
        String input = "t6hj7ui";
                StringBuilder output = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
                    if (Character.isLetter(ch)) {
                output.append(ch);
            }
            else if (Character.isDigit(ch)) {
                int repeatCount = Character.getNumericValue(ch);
                if (output.length() >= 2 && output.substring(output.length() - 2).equals("hj")) {
                    for (int j = 1; j < repeatCount; j++) {
                        output.append("hj");
                    }
                } else {
                    char lastChar = output.charAt(output.length() - 1);
                    for (int j = 1; j < repeatCount; j++) {
                        output.append(lastChar);
                    }
                }
            }
        }
                System.out.println(output.toString());
    }
}        